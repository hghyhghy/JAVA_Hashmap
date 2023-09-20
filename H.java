
import java.util.*;

public class H 

{

       public static void main(String[] args) 
       
       {
             
              HashMap <Integer, String> h1= new HashMap<Integer,String>();

              h1.put(1, "Subham"); 

                            h1.put(2, "Saikat"); 


                                          h1.put(3, "Sayantan"); 


                                                        h1.put(4, "Souvik"); 


                                                                      h1.put(5, "Sayan"); 



                   System.out.println("Iterating through HashMap");                                                    


                   for(Map.Entry m: h1.entrySet())
                   {
                     System.out.println(m.getKey() + " " + m.getValue());
                   }



       }

}
