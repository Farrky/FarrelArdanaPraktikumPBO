import java.util.ArrayList;
public class ArrayListTest {
    public class ArrayListTest{
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add{"Praktikum");
        strings.add{"collections");
        strings.add{"dan generics");
        
        
        strings.remove("praktikum");
        
		for(String s: strings){
			System.out.print(s+" ");
        }
    
    }
}