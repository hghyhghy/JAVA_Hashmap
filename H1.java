
import java.util.*;

import java.util.HashMap;

public class H1 


{

     public static void main(String[] args) 
     
     {
       
              HashMap<Integer,String> h= new HashMap<Integer,String>();

               

              // adding  element in the hm 

              h.put(100, "SUBHAM");

                            h.put(101, "SAYAK");

                                          h.put(102, "SAYANTAN");

                                                        h.put(104, "SAYAN");
                                                        

         System.out.println("The list Becomes ");

         for(Map.Entry m1:h.entrySet())

         {

              System.out.println(m1.getKey() + " " + m1.getValue());


         }


         // removing element from hashmap

         // key based removal 

         h.remove(100);

         
           System.out.println("The list Becomes " + " " + h);

           // key value pair based removal 


           h.remove(104,"SAYAN");


           System.out.println("The list Becomes " + " " + h);



                                           


     }


       
}
