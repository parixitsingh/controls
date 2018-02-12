//Singleton pattern using Bill Pugh Singleton Method
//Only single object of class is shared in the entire code.

/**
@author : Parixit Singh
*/

package creational;

import java.util.*;


public class Singleton {
    private Singleton(){
        //private constructor
    }

    //Inner class provides singleton instance
    private static class InnerClass {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton GetInstance(){
        return InnerClass.INSTANCE;
    }
}

/*
//Simple private static member keeping the object and returning it through static method
public class Singleton {
    private static Singleton Instance = new Singleton();
    private Singleton(){
        //private constructor
    }
    public static Singleton GetInstance(){
        return Instance;
    }
}


//On demand initializing a private member with Singleton object and returning it through static method
public class Singleton {
    private static Singleton Instance;
    private Singleton(){
        //private constructor
    }
    public static Singleton GetInstance(){
        if(Instance == null){
            Instance = new Singleton();
        }
        return Instance;
    }
}


//Thread safe Singleton implementation
public class Singleton {
    private static Singleton Instance;
    private Singleton(){
        //private constructor
    }
    public static Singleton GetInstance(){
        if(Instance == null){
            synchronized(Singleton.class){
                if(Instance == null){
                    Instance = new Singleton();
                }
            }
        }
        return Instance;
    }
}

*/