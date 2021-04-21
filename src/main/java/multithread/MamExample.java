package multithread;

import java.util.*;

public class MamExample {
    public static void main(String[] args) {
        Map<Integer,String> tempMap = new HashMap<Integer, String>();
        //Iterator<String> iter = Iterator<String>(tempMap);
        tempMap.put(1, "azazazazazaza");
        tempMap.put(2, "azazazazazaza");
        tempMap.put(3, "azazazazazaza");
        for (Map.Entry entry : tempMap.entrySet() ){
            //entry.setValue("qweqweqwe");
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        Iterator iterator = tempMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Integer key = (Integer) entry.getKey();
            String value = (String) entry.getValue();
        }

        List entryList = new ArrayList(tempMap.entrySet());
        List keyList = new ArrayList(tempMap.keySet());
        List valuesList = new ArrayList(tempMap.values());

//        Collections.sort(valuesList, new Comparator() {
//
//            @Override
//            public int compare(Map.Entry e1, Map.Entry e2) {
//                return e1.getValue().compareTo(e2.getValue());
//            }
//
//        });
//        SortedMap sortedMap = new TreeMap(new Comparator() {
//
//            @Override
//            public int compare(K k1, K k2) {
//                return k1.compareTo(k2);
//            }
//
//        });
//        sortedMap.putAll(tempMap);

        System.out.println(valuesList);
    }
}
