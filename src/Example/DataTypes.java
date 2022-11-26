package Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DataTypes {

	public static void main(String[] args) {
	
//		 TODO Auto-generated method stub
//		Integer num = 115;
//		Integer num2 = 20;
//		Integer sum = num + num2;
//
//		System.out.println(sum);

		Integer averageJoy = 15;
		Integer haleyAverage = 25;
		
		//Arraylist to store multiple INteger
		ArrayList<Integer> averages = new ArrayList<Integer>(); //initialize
		averages.add(averageJoy);
		averages.add(haleyAverage);
		for(int i =0; i< averages.size(); i++) {
			System.out.println(averages.get(i));
		}
		
		
		
		//
		HashMap<String, Integer> averagesHashmap = new HashMap<String, Integer>();
		averagesHashmap.put("Joy", averageJoy);
		//loop through the hash map and return each key/value pair
		for (Map.Entry<String, Integer> entry : averagesHashmap.entrySet()){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
			}
		
		
	}

}
