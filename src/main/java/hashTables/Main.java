package hashTables;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);
        hashMap.put("End", billEnd);
//        Employee employee = hashMap.put("Doe", mikeWilson);
        Employee employee= hashMap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

        System.out.println(hashMap.getOrDefault("someone", mikeWilson));
        System.out.println(hashMap.remove("Jones"));

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsValue(janeJones));

        hashMap.forEach((k,v) -> System.out.println("Key = " + k+" , Employee = "+v));

//        SimpleHashTable ht = new SimpleHashTable();
//        ChainedHashTable ht = new ChainedHashTable();
//        ht.put("Jones", janeJones);
//        ht.put("Doe", johnDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        ht.printHashTable();
//        System.out.println("Retrieve key Wilson :"+ ht.get("Wilson"));
//        System.out.println("Retrieve key Smith :"+ ht.get("Smith"));
//
//        ht.remove("Doe");
//        ht.remove("Jones");
//
//        System.out.println("Retrieve key Smith :"+ ht.get("Smith"));

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for( int i =0; i < buckets.length; i++){
            //using LinkedList for the buckets
//            buckets[i] = new LinkedList<Integer>();

            //using ArrayList for the buckets
            buckets[i] = new LinkedList<Integer>();
        }

        for(int i=0; i<input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets){
            Collections.sort(bucket);
        }

        int j =0;
        for (int i=0; i < buckets.length; i++){
            for( int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){
        return value/ (int) 10 ;
    }
}
