import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public static String count_freq(String str) {
        Map<String,Integer> mp=new TreeMap<>();
        String arr[]=str.split(" ");
        String returned_string ="";
        for (String s : arr) {
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
            } else {
                mp.put(s, 1);
            }
        }
        int x=1;
        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            while(x!=10)
            {
                if(entry.getValue()<308){
                    System.out.println(entry.getKey()+ " - "+entry.getValue());
                    returned_string += entry.getKey()+" - "+entry.getValue()+"\n";
                    x++;
                }
                break;
            }
        }
        return returned_string;
    }
}