import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++)
            arr.add(i);
        System.out.println(arr);

        arr.remove(3);
        System.out.println(arr);

        for (int i = 0; i< arr.size(); i++)
            System.out.println(arr.get(i) + " ");


    }

}

