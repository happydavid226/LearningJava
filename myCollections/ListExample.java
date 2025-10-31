package myCollections;

import java.util.*;

public class ListExample {
    public static void main(String[] args){
        List items = new ArrayList();
        items.add("Rubavu");
        items.add(123);
        String dist = (String) items.get(0);
        int n = (Integer) items.get(1);
        System.out.println(items.get(0));
        System.out.println(items.get(1));

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        for(int m : nums){
            System.out.println(m);
        }
        List<String> districts = new ArrayList<String>();
        districts.add("Nyabihu");
        districts.add("Musanze");
        districts.add("Nyabihu");
        districts.add("Nyabihu");
        districts.add("Nyabihu");
        districts.add("Nyabihu");
        districts.add("Nyabihu");

        //using sets
        Set<String> distros = new TreeSet<String>();
        distros.add("yabihu");
        distros.add("Musanze");
        distros.add("Nyabihu");
        distros.add("Nyabihu");
        distros.add("Nyabihu");
        distros.add("Nyabihu");
        distros.add("Nyabihu");
        /*for(String dista : distros){
            System.out.println(dista);
        }*/

        //using Map
        Map<String,Integer> ages = new HashMap<String,Integer>();
        ages.put("Mugisha", 15);
        ages.put("Anitha", 11);
        System.out.println(ages.get("anitha"));
    }
}
