import java.util.Map;

import java.util.HashMap;

import java.util.TreeMap;

import javax.sound.sampled.SourceDataLine;

import java.util.Iterator;


public class H5

{
       
    public static void main(String[] args) 
    
    
    {
       

       // creating an object  hm in class Hashmap


       HashMap<Integer, String> hm= new HashMap<Integer,String>();

              hm.put(12303, "HOWRAH RAJDHANI EXPRESS");


       hm.put(22406, "VANDE BHARAT EXPRESS");

              hm.put(13186, "HOWRAH-PURI EXPRESS");

                     hm.put(12308, "SEALDAH RAJDHANI EXPRESS");

                            hm.put(14123, "HOWRAH-NJP SHATABDI EXPRESS");


              Iterator<Integer> it= hm.keySet().iterator();

              System.out.println("Before sorting ");

              while(it.hasNext())

              {

                     int key=(int)  it.next();

                     System.out.println("Train Number" + ": " + key  + ":" + "name" + ": " + hm.get(key));
              }


              TreeMap<Integer,String>tm= new TreeMap<Integer,String>(hm);

              Iterator itr= tm.keySet().iterator;

              while(itr.hasNext())
              {
                     int key=(int) itr.next();

                    System.out.println("Train Number" + ": " + key  + ":" + "name" + ": " + hm.get(key));
              }

    }

}
