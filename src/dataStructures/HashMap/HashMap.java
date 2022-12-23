import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap {
    int size;
    ArrayList<LinkedList<String>> table;

    public HashMap(int size) {
        this.size = size;
        this.table = new ArrayList<>();
    }

    private int hash(String key) {
        try {
            int sum = 0;
            for(int i = 0; i < key.length(); i++) {
                sum += key.codePointAt(key.charAt(i));
            }
            return (sum * 599 % this.size);
        } catch(Exception e) {
            System.out.println(e);
            return -1;
        }
    }

    public void set(String key, String value) {
        int hash = this.hash(key);

        if(hash != -1) {
            LinkedList<String> keyList = this.table.get(hash);
            if(keyList != null) {
                keyList.add(key + ':' + value);
            } else {
                LinkedList<String> ll = new LinkedList<>();
                this.table.add(hash, ll);
            }
        }
    }

    public String get(String key) {
        int hash = this.hash(key);
        LinkedList<String> keyList = this.table.get(hash);

        if(keyList == null) return null;
        else {
            for(String s : keyList) {
                String[] arr = s.split(":");
                if(arr[0].equals(key)) return arr[1];
            }
            return null;
        }
    }
}