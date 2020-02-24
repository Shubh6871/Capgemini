package Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise3 {
static List<Integer> list=new ArrayList<>();
public static void main(String[] args) {
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	Exercise3 ex=new Exercise3();
	Map<Integer,Integer> map=new HashMap<>();
	map=ex.getSquares(list);
	System.out.println(map);
}
Map<Integer,Integer> getSquares(List<Integer> list){
	Map<Integer,Integer> map=new HashMap<>();
	for(Integer i:list) {
		map.put(i, i*i);
	}
	return map;
}
}
