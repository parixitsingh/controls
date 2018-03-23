var express = require('express');
var app = express();
var server = require('http').createServer(app);
var io = require('socket.io').listen(server);
users = [];
connections = [];

server.listen(process.env.PORT || 3000);

console.log("Server running");
app.get('/', (request, response)=>{
    response.sendFile(__dirname + '/index.html');
});

io.sockets.on('connection', (socket)=>{
    connections.push(socket);
    console.log('Connections %s', connections.length);

    //Disconnect
    socket.on('disconnect', (data)=>{
        users.splice(users.indexOf(socket.username), 1);
        updateUsernames();
        connections.splice(connections.indexOf(socket), 1);
        console.log('disconnected');
    });

    //Send message
    socket.on('send message', (data)=>{
        io.sockets.emit('new message', {msg: data, user: socket.username});
    });

    //New user
    socket.on('new user', (data, callback)=>{
        callback(true);
        socket.username = data;
        users.push(socket.username);
        updateUsernames();
    });

    function updateUsernames(){
        io.sockets.emit('get users', users);
    }
    
;})