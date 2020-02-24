package Lab7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Exercise6 {
	public static void main(String[] args) {
		 Map<Integer,LocalDate> map=new HashMap<>();
		 List<Integer> list=new ArrayList<>();
		map.put(1,LocalDate.of(1997, 3, 10));
		map.put(2,LocalDate.of(1999, 2, 1));
		map.put(3,LocalDate.of(2017, 4, 4));
		map.put(4,LocalDate.of(1997, 5, 26));
		map.put(5,LocalDate.of(1997, 7, 24));
		Exercise6 ex=new Exercise6();
		list=ex.votersList(map);
		System.out.println("People eligible for voting");
		System.out.println(list);
	}
	List<Integer> votersList(Map<Integer,LocalDate> map){
		List<Integer> list=new ArrayList<>();
		Set<Entry<Integer,LocalDate>> key1=map.entrySet();
		LocalDate l=LocalDate.now();
		for(Entry<Integer,LocalDate> i:key1) {
			Period diff=Period.between(i.getValue(),l);
			 if(diff.getYears()>18){
				   list.add(i.getKey());
				   }
		 }
		  
		 
		return list;
	}
}
