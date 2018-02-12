//Singleton pattern 
//Only single object of class is shared in the entire code.

/**
@author : Parixit Singh
*/

//Simple implementation of Singleton pattern in java script
var Singleton = (
    ()=>{
        var instance;
        function createInstance(){
            return {
                first : 1,
                second : 2
            };
        }

        return {
            getInstance: function(){
                if(!instance){
                    instance = createInstance();   
                }
                return instance;
            }
        }
    }
)();


//Singleton implementation using es6 classes

class Singleton1 {
    constructor(){
        if(!Singleton1.instance){
            Singleton1.instance = this;
        }
        return Singleton1.instance;
    }
}