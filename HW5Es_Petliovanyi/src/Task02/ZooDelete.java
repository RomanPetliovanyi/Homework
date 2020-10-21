package Task02;
import java.util.ArrayList;

public class ZooDelete {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("parrot");
        arrayList.add("hamster");
        arrayList.add("guinea pig");
        arrayList.add("chicken");
        arrayList.add("cow");
        arrayList.add("penguin");
        System.out.println("Размер массива до удаления: "+ arrayList.size());
        arrayList.remove(7);
        arrayList.remove(5);
        arrayList.remove(3);
        System.out.println("Размер массива после удаления: "+ arrayList.size());
    }
}