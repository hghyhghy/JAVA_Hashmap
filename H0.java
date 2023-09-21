
import java.util.*;

import java.util.HashMap;

public class H0 

{
       
     public static void main(String[] args)
     
     {
       
               // creating an object hm in class hashmap

               HashMap<Integer,String> hm= new HashMap<Integer,String>();

               

              // adding  element in the hm 

              hm.put(100, "SUBHAM");

                            hm.put(101, "SAYAK");

                                          hm.put(102, "SAYANTAN");

                                                        hm.put(104, "SAYAN");

                     // printing the element 
                     
                     System.out.println("Printing the element in the hashmap");

                     // using advance for loop

                     for(Map.Entry m: hm.entrySet())
                     {

                            System.out.println(m.getKey() + ">>" + m.getValue());
                     }

                     hm.putIfAbsent(105, "SOVON");


                     System.out.println("After entering the new element it becomes ");


                     for(Map.Entry m: hm.entrySet())
                     {

                            System.out.println(m.getKey() + ">>" + m.getValue());
                     }

                     HashMap<Integer,String> hm1= new HashMap<Integer,String>();


                     hm1.put(106, "SOUNAK");

                            hm1.putAll(hm);

                       System.out.println("Now the final list becomes ");   
                       
                       
                       for(Map.Entry m:hm1.entrySet())
                       {
                            System.out.println(m.getKey() + " "+ m.getValue());
                       }

                       










     }

}
