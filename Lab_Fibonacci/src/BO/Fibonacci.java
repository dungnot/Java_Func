
package BO;

import java.util.ArrayList;


public class Fibonacci {
   
    private static ArrayList<Long> list = new ArrayList<>();
    private static final long FIRST = 0;
    private static final long SECOND = 1;

   public static ArrayList getList(int length){
       if(list.isEmpty()){
           list.add(FIRST);
           list.add(SECOND);
       }
       if(length > list.size()){
           for (int i = list.size(); i < length; i++) {
               list.add(list.get(i - 1) + list.get(i - 2));
           }
       }
       return list;
   }
    
    public static long getNumber(int index){  
        return (long) getList(index + 1).get(index);   // phải lấy hơn vị trí mặc định vì bắt đầu bằng ở vị trí 0
    }
    
    /*
    public class Fibonacci {

    private static ArrayList<Long> list = new ArrayList<>();
    private static final long FIRST = 0;
    private static final long SECOND = 1;

    public static long getNumber(int index) {
        if (list.isEmpty()) {
            list.add(FIRST);
            list.add(SECOND);
        }
        if (index > list.size() - 1) {
            for (int i = list.size(); i <= index; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        return list.get(index);
    }

    public static List getList(int length) {
        if(list.size() < length) getNumber(length);
        return list.subList(0, length);
    }

}
    */
}
