 package collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);   nums.add(10);
        System.out.println(nums);
        System.out.println( nums.get(2));

    }
}
