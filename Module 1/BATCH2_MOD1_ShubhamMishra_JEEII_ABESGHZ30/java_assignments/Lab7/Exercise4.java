package Lab7;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
public class Exercise4 {
	
	public static void main(String[] args) {
		 Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 91);
		map.put(2, 72);
		map.put(3, 95);
		map.put(4, 82);
		map.put(5, 65);
		Exercise4 ex=new Exercise4();
		Map<Integer,String> map1=new HashMap<>();
		map1=ex.getStudents(map);
		System.out.println("Students eligible for scholarship");
		System.out.println(map1);
	}
	
	Map<Integer,String> getStudents(Map<Integer,Integer> map){
		Map<Integer,String> map1=new HashMap<>();
		Collection<Integer> list=map.values();
		for(Integer i:list) {
			if(i>=90)
				map1.put(i,"Gold");
			else if(i>=80)
				map1.put(i,"Silver");
			else if(i>=70)
				map1.put(i,"Bronze");
		}
		return map1;
	}
	
}
