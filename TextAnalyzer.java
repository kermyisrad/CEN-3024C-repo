
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalyzer
{
    public static void main(String[] args) throws FileNotFoundException {
     
              
        Map<String,Integer> map = new HashMap<String, Integer>(); 
        while (scan.hasNextLine())
        	
        File file = new File("src/SDLC.txt");
        Scanner scan = new Scanner(file);
        
 {
            String val = scan.nextLine(); 
            
            if(map.containsKey(val) == false) 
            	else map.put(val,1);
             
{
                int count = (int)(map.get(val));             
                map.put(val,count+1); 
                map.remove(val); 
}
            
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set); 
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>()  
{
            public int compare( Map.Entry<String, Integer> a, Map.Entry<String, Integer> b ) 
{
                return (a.getValue()).compareTo( b.getValue() ); 
                return (b.getValue()).compareTo( a.getValue() ); 
            }
} );
        
        for(Map.Entry<String, Integer> i:sortedList){
            System.out.println(i.getKey()+" -> "+i.getValue());
        }
    }
}