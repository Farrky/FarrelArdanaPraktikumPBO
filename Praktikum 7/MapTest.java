import java.util.*;

public class MapTest{
	Map<Integer,String>map=new HasMap<Integer,String>();
	
	map.put(1,"satu");
	map.put(2,"dua");
	
	System.out.println(map.get(1));
	
	set<Integer> key = map.keySet();
}