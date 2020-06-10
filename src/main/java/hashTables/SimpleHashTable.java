package hashTables;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(isOccupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashTable.length-1) hashedKey = 0;
            else hashedKey++;
            while(isOccupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey +1) % hashTable.length;
            }
        }
        if(isOccupied(hashedKey)) System.out.println("Sorry, there's already an employee at position " +hashedKey);
        else hashTable[hashedKey] = new StoredEmployee(key, employee);
    }

    public StoredEmployee get(String key){
        return hashTable[findKey(key)];
    }

    private int hashKey(String key){
        return key.length() % hashTable.length;
    }

    public void printHashTable(){
        for( int i = 0; i < hashTable.length; i++){
            System.out.println(hashTable[i]);
        }
    }

    private boolean isOccupied(int index){
        return hashTable[index] != null;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) return hashedKey;

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) hashedKey = 0;
        else hashedKey++;
        while (hashedKey != stopIndex &&
                hashTable[hashedKey] != null &&
                !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if(stopIndex == hashedKey) return -1;
        else return hashedKey;

    }
}
