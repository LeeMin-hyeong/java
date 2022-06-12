import java.util.*;

public class MapSizeTest{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("meow", "meow");
        map.put("meow", "value");
        map.put("cat", "meow");
        System.out.println(map.size());
        Set<String> keys=map.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
    }
}
