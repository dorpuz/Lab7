import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList();

        myList.add(17);
        myList.add(171);
        myList.add(1717);

        System.out.println(myList.size());
        System.out.println(myList.indexOf(1717));
        myList.remove(1);
        System.out.println(myList.size());
        myList.add(90);
        System.out.println(myList.get(1));

        //myList.clear();
        //System.out.println(myList.size());

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("dwa");
        System.out.println();
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
          /*  if (iterator.next() == 1717){
                iterator.remove();
            }*/
            System.out.println("Liczba: " + iterator.next());
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        System.out.println("\n--------------");

        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Liczba: " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println("Liczba " + value + " ma indeks " + index);
        }


        //Kopiowanie arraylisty do array
        System.out.println("\n\n");
        Object[] arr1 = myList.toArray();


        Integer[] arr2 = new Integer[myList.size()];
        arr2 = myList.toArray(arr2);

        Integer[] arr3 = myList.toArray(new Integer[myList.size()]);

        for (Integer i : arr3) {
            System.out.println(i);
        }

        List<Integer> myList2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList2.add(i * i);
        }
        System.out.println();
        System.out.println(myList.size());
        System.out.println(myList2.size());

        List<Integer> nums = new ArrayList<>();
        nums.addAll(myList);
        nums.addAll(myList2);
        System.out.println(nums.size());

        /*for (Integer i : nums
             ) {
            System.out.println(i);
        }*/
        System.out.println(nums.lastIndexOf(2401));

        // PODMIANA WARTOSCI - SET
        nums.set(52,2400);

        System.out.println(nums);


        for (Integer i : nums
             ) {
            System.out.println(i);
        }
    }
}
