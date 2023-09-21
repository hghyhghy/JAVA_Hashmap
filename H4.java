
import java.util.*;

import java.util.HashMap;


// creating a class book

class Film


{

     int id;

     String name, Storywriter, producer;

     String  quality;


     public Film(int id, String name, String Storywriter, String producer, String quality)

     {
             this.id=id;

             this.name=name;

             this.Storywriter=Storywriter;

             this.producer=producer;

             this.quality=quality;


     }

}


public class H4

{
       
    public static void main(String[] args) 
    
    {
       
                // creating an object map in the class Hasmap


                HashMap<Integer,Film> map= new HashMap<Integer,Film>();
                

                Film  f1= new Film(100, "The 5 Conditions:Beginning", "SUBHAM SARKAR", "Red Chillis Entertainment ", "2160-4K");

                 Film  f2= new Film(101, "The 5 Conditions: Exorcism", "SUBHAM SARKAR", "Red Chillis Entertainment ", "2160-4K");

                  Film  f3= new Film(100, "The 5 Conditions:Cursed Bunglow", "SUBHAM SARKAR", "Red Chillis Entertainment ", "2160-4K");

                   Film  f4= new Film(100, "The 5 Conditions:Conclusion ", "SUBHAM SARKAR", "Red Chillis Entertainment ", "2160-4K");


               map.put(1, f1);
               
                              map.put(2, f2);    

               map.put(3, f3);    

                              map.put(4, f4);    


                              // traversing through the map

                            for(Map.Entry<Integer,Film> m :map.entrySet())  

                            {

                                   int key=m.getKey();

                                   Film b= m.getValue();

                                   System.out.println(key+ " " +  "Details " );

                                   System.out.println(b.id+ ">>" + b.name+ ">>" + b.Storywriter + ">>" + b.producer+ ">>" + b.quality);
                            }







    }

}
