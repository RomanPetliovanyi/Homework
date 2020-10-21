package AddTask01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Winter");
        arrayList.add("Spring");
        arrayList.add("Summer");
        arrayList.add("Autumn");
        int last = arrayList.size() ;
        int random = (int)(Math.random()*last);
        String winner = arrayList.get(random);
        System.out.println("And the winner is "+ winner);
    }
}
