package collections;
import java.util.Map;
import java.util.HashMap;




public class MapSet {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<String,Integer>();
        map.put(" a ",1);
        map.put(" b ",2);
        map.put(" c ",3);
        map.put(null,4);
        map.put(null,5);
        System.out.println(map);
        if(map.containsKey("a")){
            System.out.println(map.get("a"));
        }
        for(String data:map.keySet()){
            System.out.println(" key "+data+" <--->value "+map.get(data));
        }

        for(Integer data:map.values()){
            System.out.println(" value "+ data );
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(" key "+entry.getKey() +" <--->value "+entry.getValue());
        }
        map.forEach((key,value)->{
            System.out.println(" key "+key+" <--->value "+value);
        });

    }
}
