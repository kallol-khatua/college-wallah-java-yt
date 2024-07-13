import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JAVA_24_ArrayList {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(3);
//        Integer i = 3;
//        System.out.println(i);

        Float f = 20.3f;
//        System.out.println(f);

//        ArrayList - import first
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Boolean> al2 = new ArrayList<>();
        ArrayList<Float> al3 = new ArrayList<>();

//        adding value to arraylist
        ArrayList<Integer> a = new ArrayList<>();
//        listName.add() - add at the last
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(8);

//        getting element of index i
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
//        System.out.println(a.get(2));

//        print using loop
//        for(int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }

//        printing directly
//        System.out.println(a); // [2, 4, 4, 8]


//        adding at the index
        a.add(1, 9);
//        System.out.println(a); // [2, 9, 4, 4, 8]

//        modifying at index i
        a.set(1, 7);
//        System.out.println(a); // [2, 7, 4, 4, 8]

//        removing an element
        a.remove(Integer.valueOf(4)); // if element exist only then remove it otherwise not - and remove the first occurrence
//        it returns true if the value exists and return false if not exists
//        System.out.println(a); // [2, 7, 4, 8]

        a.remove(1); // remove the element of index i - index must be in range
//        System.out.println(a);

//        checking element exist or not
        boolean check = a.contains(10);  // return true if exists else returns false
//        System.out.println(check);

//        if type not specified then we can store multiple type of value
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("kallol");
//        System.out.println(l);

//        reverse an arraylist
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 6, 2, 9));
        System.out.println(arrayList);
//        int i = 0;
//        int j = arrayList.size() - 1;
//        while (i < j) {
//            int temp = arrayList.get(i);
//            arrayList.set(i, arrayList.get(j));
//            arrayList.set(j, temp);
//            i++;
//            j--;
//        }

//        reverse using collections method
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);

//        sorting - ascending
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

//        sort in reverse order - descending
//        Collections.sort(arrayList, Collections.reverseOrder());
//        System.out.println(arrayList);
//        arrayList.sort(Collections.reverseOrder());
//        System.out.println(arrayList);

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("kallol", "khatua"));
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);

    }
}
