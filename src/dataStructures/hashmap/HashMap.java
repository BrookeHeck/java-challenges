import java.util.LinkedList;

public class HashTable {
    int size;
    ArrayList table;
    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList<LinkedList>();
    }

    private int hash(String key) {
        try {
            int sum = 0;
            for(int i = 0; i < key.length(); i++) {
                sum += key.codePointAt(key.charAt(i));
            }
            return (sum * 599 % this.size);
        } catch(e) {
            System.out.println(e);
            return null;
        }
    }

    public void set(Stirng key, String value) {
        int hash = this.hash(key);

        if(hash != null) {
            LinkedList keyList = this.table.get(hash);
            if(list != null) {
                keyList.add(key + ':' + value);
            } else {
                LinkedList ll = new LinkedList<String>();
                this.table.set(hash, ll);
            }
        }
    }

    public String get(String key) {
        int hash = this.hash(key);
        LinkedList keyList = this.table.get(hash);

        if(keyList == null) return null;
        else {
            for(String s : keyList) {
                String[] arr = s.split(':');
                if(arr[0].equals(key)) return arr[1];
            }
            return null;
        }
    }
}