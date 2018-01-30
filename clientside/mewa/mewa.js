/*
Attach methods to window object
Methods:

	copy(object) : copy method expects a object as a argument
				   and returns a deep copy of the object.
*/
((context)=>{
	var mds = {
   //Deep cloning of a object of primitive or non-primitive type
	   copy: function (obj){
	   	if(!obj){
	   		return obj;
	   	} else {
	   		let cn = obj.constructor.name;
	   		switch(cn){
	   			case "Boolean":
	   			case "String":
	   			case "Number":
	   			case "Function":
	   			case "RegExp":
	   				return obj;
	   				break;
	   			case "Date":
	   				return new Date(obj);
	   				break;
	   			case "Error":
	   				return new Error(obj);
	   				break;
	   			case "Array":
	   				let ar = [];
	   				for(let i = 0; i < obj.length; i++){
	   					ar[i] = copy(obj[i]);
	   				}
	   				return ar;
	   				break;
	   			case "Object":
	   				let obj1 = {};
	   				Object.keys(obj).forEach((key)=>{
	   					obj1[key] = copy(obj[key]);
	   				});
	   				return obj1;
	   		}
	   	}
	   },

	   getTypeOf: function(obj){
	   	if(!obj && obj !=="" && obj !== false && obj!== 0){ 
	   		return (new String(obj)).toLowerCase();
	   	} else {
	   		return obj.constructor.name.toLowerCase();
	   	}
	   },

	   getKeys: function(obj){
	   	if(obj === undefined || obj === null){
	   		return obj;
	   	} else {
	   		return Object.keys(obj);
	   	}
	   },

	   getValues: function(obj){
	   	if(obj === undefined || obj === null){
	   		return obj;
	   	} else if(Object.values){
   			return Object.values(obj);
   		} else {
   			let values = [];
   			Object.keys(obj).forEach((key)=>{
   				values.push(obj[key]);
   			});
   			return values;
   		}
	   },

	   getTag: function(tag){
	   	return `<${tag}></${tag}>`;
	   }
	}

   Object.keys(mds).forEach((key)=>{
   	context[key] = mds[key];
   });

})(this);