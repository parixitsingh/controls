//Factory Pattern creating different liquors of different configuration

/**
@author : Parixit Singh
*/

package creational;

import java.util.*;


public class LiquorFactory{
    public static ILiquor getLiqour(String brand){
        ILiquor liquor = null;
        switch(brand){
            case "Chivas":
                liquor = new Chivas();
                break;
            case "Teachers":
                liquor = new Teachers();
                break;
            case "Beera":
                liquor = new Beera();
                break;
        }
        return liquor;
    }
    
    public static void main(String args[]){
        ILiquor liquor = LiquorFactory.getLiqour("Chivas");
        System.out.println("Name : " + liquor.getName());
        System.out.println("Type : " + liquor.getType());
        System.out.println("Cost : " + liquor.getCost());
        System.out.println("Quantity : " + liquor.getQuantity());
        
        liquor = LiquorFactory.getLiqour("Teachers");
        System.out.println("Name : " + liquor.getName());
        System.out.println("Type : " + liquor.getType());
        System.out.println("Cost : " + liquor.getCost());
        System.out.println("Quantity : " + liquor.getQuantity());
        
        liquor = LiquorFactory.getLiqour("Beera");
        System.out.println("Name : " + liquor.getName());
        System.out.println("Type : " + liquor.getType());
        System.out.println("Cost : " + liquor.getCost());
        System.out.println("Quantity : " + liquor.getQuantity());
    }
}


//
interface ILiquor {
    public String getName();
    public String getType();
    public int getCost();
    public String getQuantity();
}

class Chivas implements ILiquor {
    @Override
    public String getName(){
      return "Chivas";   
    }
    
    @Override
    public String getType(){
        return "Whiskey";
    }
    
    @Override
    public int getCost(){
        return 1200;
    }
    
    @Override
    public String getQuantity(){
        return "300ml";
    }
}


class Teachers implements ILiquor {
    @Override
    public String getName(){
      return "Teachers";   
    }
    
    @Override
    public String getType(){
        return "Brandy";
    }
    
    @Override
    public int getCost(){
        return 900;
    }
    
    @Override
    public String getQuantity(){
        return "300ml";
    }
}

class Beera implements ILiquor {
    @Override
    public String getName(){
      return "Beera";   
    }
    
    @Override
    public String getType(){
        return "Beer";
    }
    
    @Override
    public int getCost(){
        return 400;
    }
    
    @Override
    public String getQuantity(){
        return "350ml";
    }
}