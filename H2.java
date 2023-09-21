
import java.util.*;

import java.util.HashMap;


public class H2 

{

       public static void main(String[] args)
       
       {
       
              HashMap<Integer,String> hm= new HashMap<Integer,String>();


                  hm.put(100, "SUBHAM");

                            hm.put(101, "SAYAK");

                                          hm.put(102, "SAYANTAN");

                 System.out.println("The list becomes ");                         


                 for(Map.Entry m:hm.entrySet())
                 {
                     System.out.println(m.getKey() + " >>" + m.getValue());
                 }

                 // replacing an element in the hasmap


                 hm.replace(102,"SANTANU");

                 for(Map.Entry m:hm.entrySet())
                 {
                     System.out.println(m.getKey() + " >>" + m.getValue());
                     
                 }


                 hm.replace(101,"SAYAK","SWARNODIP");


                 for(Map.Entry m:hm.entrySet())
                 {
                     System.out.println(m.getKey() + " >>" + m.getValue());
                 }


                 hm.replaceAll((k,v)->"SUBHAM");

                 for(Map.Entry m:hm.entrySet())
                 {
                     System.out.println(m.getKey() + " >>" + m.getValue());
                 }


       }

}
