package hashTables;

import sun.awt.image.ImageWatched;

import javax.naming.LinkLoopException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 5678);
        Employee marySmith = new Employee("Mary", "Smith", 5555);
        Employee mikeWilson = new Employee("Mike", "Wilson", 45);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);
        hashMap.put("End", billEnd);
//        Employee employee = hashMap.put("Doe", mikeWilson);
        Employee employee= hashMap.putIfAbsent("Doe", mikeWilson);
//        System.out.println(employee);
//
//        System.out.println(hashMap.getOrDefault("someone", mikeWilson));
//        System.out.println(hashMap.remove("Jones"));

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsValue(janeJones));

//        hashMap.forEach((k,v) -> System.out.println("Key = " + k+" , Employee = "+v));

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

//        int[] intArray = {54, 46, 83, 66, 95, 92, 43};
//
//        bucketSort(intArray);
//
//        for(int i =0; i < intArray.length; i++){
//            System.out.println(intArray[i]);
//        }



        /** The following is for the Hashtable Challenge 1
         * */

        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
        for(int i =0; i < numsToAdd.length; i++){
            nums[hash(numsToAdd[i])] =numsToAdd[i];
        }
        for(int i =0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        /**The following is for the Hashtable Challenge 2
         * 
         */

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane","Jones", 123));
        employees.add(new Employee("Jone","Doe", 5678));
        employees.add(new Employee("Mike","Wilson", 45));
        employees.add(new Employee("Mary","Smith", 5555));
        employees.add(new Employee("John","Doe", 5678));
        employees.add(new Employee("Bill","End", 3948));
        employees.add(new Employee("Jane","Jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext()){
            Employee employee1 = iterator.next();
            if(employeeTable.containsKey(employee1.getId())){
                remove.add(employee1);
            }
            else employeeTable.put(employee1.getId(), employee1);
        }

        for(Employee e: remove){
            employees.remove(e);
        }

        System.out.println("--------------");
        employees.forEach(e -> System.out.println(e));
    }

//    private static void bucketSort(int[] input) {
//        List<Integer>[] buckets = new List[10];
//
//        for( int i =0; i < buckets.length; i++){
//            //using LinkedList for the buckets
////            buckets[i] = new LinkedList<Integer>();
//
//            //using ArrayList for the buckets
//            buckets[i] = new LinkedList<Integer>();
//        }
//
//        for(int i=0; i<input.length; i++){
//            buckets[hash(input[i])].add(input[i]);
//        }
//
//        for(List bucket: buckets){
//            Collections.sort(bucket);
//        }
//
//        int j =0;
//        for (int i=0; i < buckets.length; i++){
//            for( int value: buckets[i]){
//                input[j++] = value;
//            }
//        }
//    }

    //hash function for bucketsort implementation
//    private static int hash(int value){
//        return value/ (int) 10 ;
//    }

    /** Hash function for HashTable Challenge 1
     * */
    private static int hash(int number){
        return Math.abs(number % 10);
    }
}
