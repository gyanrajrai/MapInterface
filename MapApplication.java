package kist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapApplication {

	public static void main(String[] args) {
		


		/*
		   //declare a Map using country name as value and country dial code as Key
     
     
     //insert below key value pair in myCountryMap
     //1, United States
     //91, India
     //977, Nepal
     //86, China
     //6, Russia
      */
		Map<Integer,String>mycountrymap=new HashMap<Integer,String>();
		mycountrymap.put(1, "United States");
		mycountrymap.put(91,"India");
		mycountrymap.put(977,"Nepal");
		mycountrymap.put(86,"China");
		mycountrymap.put(6,"Russia");
     
     //run an enhanced for loop to print all the keys from the Map
		System.out.println("keys are:");
		for(Integer key : mycountrymap.keySet()) {
			
			System.out.println(key);
			
			
			
		}
     
     //run an enhanced for loop to print all the values from the Map
		System.out.println("values are:");
		for(String  key:mycountrymap.values()){
			//String str=mymap.get(key);
			System.out.println(key);
		}
     
     //extract value of key 977 from the map and assign it to a variable
		
		String value=mycountrymap.get(977);
		System.out.println(value);
     
     //check and see if key 351(Portugal) is in your map, if not add that to your map
	if(mycountrymap.get(351)==null){
		mycountrymap.put(351 ,"portugal");
			
		}
		
     
     //try adding key=1, value = United Kingdom in the Map
		mycountrymap.put(1, "United Kindom");
     
     //print only values of map using .values() function in the map
		System.out.println(mycountrymap.values());
		
		//Collection<String>values=mymap.values();
		//System.out.println(values);
		
		
     
     //try removing China from the map
		System.out.println("After removing china");
		mycountrymap.remove(86);
		//System.out.println(mymap);
     //try removing Nepal from the map but assume that you do not know the key
		
		Integer nepalkey=null;
		
		
		for(Entry<Integer,String>entry:mycountrymap.entrySet()){
			//Entry can hold and cary both key and value
			if(entry.getValue().equalsIgnoreCase("Nepal")){
				
					nepalkey=entry.getKey();
					break;
				
			}
			
			
			}
					
			mycountrymap.remove(nepalkey);
		
     //you need to first find the key for "Nepal" and then remove "Nepal"
     //using the key
 
     //do above task using Iterator interface
	/*	System.out.println("Afetr Iterator()");
		
		Iterator entries = mymap.entrySet().iterator();
		while (entries.hasNext()) {
		    Object ob=entries.next();
		    System.out.println(ob);
		  
		}
		   */


		
		
		

	
	}	
		}

