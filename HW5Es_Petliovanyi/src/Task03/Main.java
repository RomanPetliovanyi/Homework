package Task03;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
        public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, i + 1);
        }
        ListIterator<Integer> iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            arrayList.set(iterator.nextIndex(), iterator.nextIndex()+ 1);
            System.out.println(iterator.next());
        }
    }
}
