package Lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
private static Map<Integer,Integer> map=new HashMap<>();
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	Exercise1 ex=new Exercise1();
	map.put(1, 120);
	map.put(2, 72);
	map.put(3, 36);
	map.put(4, 52);
	map.put(5, 12);
	
	list=ex.getValues(map);
	System.out.println(list);
	
}
public List<Integer> getValues(Map<Integer,Integer> map){
	
	Collection<Integer> collection=map.values();
	List<Integer> list=new ArrayList<>(collection);
	Collections.sort(list);
	return list;
}
}
