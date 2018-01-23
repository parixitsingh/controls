/*
Attach methods to window object
Methods:

	copy(object) : copy method expects a object as a argument
				   and returns a deep copy of the object.
*/
((context)=>{
   //Deep cloning of a object of primitive or non-primitive type
   function c(obj){
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
   					ar[i] = c(obj[i]);
   				}
   				return ar;
   				break;
   			case "Object":
   				let obj1 = {};
   				Object.keys(obj).forEach((key)=>{
   					obj1[key] = c(obj[key]);
   				});
   				return obj1;
   		}
   	}
   }
   context.copy = c;
})(this);