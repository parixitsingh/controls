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

           //Gets an object as an object
           //Returns the typeof object provided
	   getTypeOf: function(obj){
	   	if(!obj && obj !=="" && obj !== false && obj!== 0){ 
	   		return (new String(obj)).toLowerCase();
	   	} else {
	   		return obj.constructor.name.toLowerCase();
	   	}
	   },

           //Gets an object as an input
           //Returns an array of all the keys of the object.
	   getKeys: function(obj){
	   	if(obj === undefined || obj === null){
	   		return obj;
	   	} else {
	   		return Object.keys(obj);
	   	}
	   },

           //Gets an object as an input 
           //Returns an array of values containing all the values of all keys in object provided.
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

           //Returns the tag required 
	   getTag: function(tag){
	   	return `<${tag}></${tag}>`;
	   },
           
           //Converts a decimal number (base 10) into binary number(base 2)
           //Returns null if wrong input provided
           convertDecimalToBinary: function(num){
                var isNum = isNaN(num);
                if(isNum || (num % 2 > 1)){
                    return null;
                } 
                if(num === 0){
                  return num;
                } else {
                    let b = parseInt(num / 2), c = num % 2;
                    return convertDecimalToBinary(b) + c + ""; 
                }
           },
           
           //Pass the num in string format...
           //After 21 character number format start providing in exponential format causing null as result
           //Implemented in Iterative fashion
           //2 exponential is calculated using recusrion
           //Memoization is used to make calculation fast
           convertBinaryToDecimal: function(num){
                num = num + "";
                var len = num.length,
                    twoExponentialValues = [],
                    getTwoExponentialValue = (pow)=>{
                        if(pow === 0){
                            return 1;
                        } else {
                            if(!twoExponentialValues[pow]){
                                twoExponentialValues[pow] = 2 * getTwoExponentialValue(pow - 1);
                            }
                            return twoExponentialValues[pow];
                        }
                    },
                    result = 0;
                if(len === 0){
                    return null;
                } 
                for(var i = 0; i < num.length ; i++){
                    let numPos = parseInt(num[i]);
                    if(numPos > 1){
                        result = null;
                        break;
                    } else {
                        result = result + (numPos * getTwoExponentialValue(num.length - i - 1));
                    }
                }
                return result;
           }
	}

   Object.keys(mds).forEach((key)=>{
   	context[key] = mds[key];
   });

})(this);