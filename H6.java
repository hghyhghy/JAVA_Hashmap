

import java.util.*;




public class H6 

{
       

       // linked hasmap 
        public static void main(String[] args) 
        
        {
              

              LinkedHashMap<Integer,String> lh= new LinkedHashMap<Integer,String>();


              lh.put(100, "The 5 Conditions ");

                            lh.put(101, "Evil Dead Rise ");

                                          lh.put(102, "The  Conjuring ");

                                                  lh.put(103, "Annabelle ");

                 // creating an advance for loop

                 for(Map.Entry m:lh.entrySet())

                 {

                     // System.out.println();

                      System.out.println("The Top 4 Global Horror Movies Are "+ ">> " + m.getKey() + " >>" +  m.getValue());
                 }

                 // now by using key-value pair


              LinkedHashMap<Integer,String> lh1= new LinkedHashMap<Integer,String>();

              lh1.put(20, "India");


                            lh1.put(21 ,"Pakistan");


                                          lh1.put(22, "Bangladesh");


                                                        lh1.put(23, "Srilanka");


                                                                      lh1.put(24, "Nepal");

               //Fetching the key 
               
               
               System.out.println("Keys" + " " + lh1.keySet());

               // Fetching the values

              System.out.println("Value are " + " " + lh1.values());

              // Fetching key-value pair 


              System.out.println("Key value pair is   " + " " + lh1.entrySet());


              // java treemap


              TreeMap<Integer,String> tm= new TreeMap<Integer,String>();

              tm.put(100,"Subham");


                            tm.put(101,"Saikat");


                                          tm.put(102,"Sourik");

                     for(Map.Entry m:tm.entrySet())

                     {

                            System.out.println(m.getKey()+ " " + m.getValue());
                     }



                     // java hashset

                     HashSet<String> set= new HashSet<String>();

                     set.add("SUBHAM");

                                          set.add("SAIKAT");

                                                               set.add("SURENDRA");

                                                                                    set.add("SOURIK");

                                                                                                         set.add("SUBHANKAR");


                     Iterator <String> itr= set.iterator();

                     while(itr.hasNext())

                     {
                            System.out.println(itr.next());
                     }


                     // removing an element from  the hashset 


                     set.remove("SOURIK");

                     System.out.println("Now The List Becomes " + " " + set);

                     set.add("SWARNODIP");

                     set.add("TONMOY");

                     Iterator<String> it=set.iterator();

                     while(it.hasNext())

                     {

                            System.out.println(it.next());
                     }



                     //deleting all items at once 

                     set.removeAll(set);

                     System.out.println(set);

                     // set.retainAll(set);

                     System.out.println(set);
        }



}
