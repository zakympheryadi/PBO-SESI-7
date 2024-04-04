import java.util.ArrayList;
import java.util.List;

public class main<T> {
    private T data;

    public main(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    // Generic method untuk mencetak elemen-elemen dari sebuah list
    public static <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Contoh penggunaan dengan tipe data String
        main<String> stringExample = new main<>("Hello, Generic!");
        System.out.println("Data: " + stringExample.getData());

        // Contoh penggunaan dengan tipe data Integer
        main<Integer> integerExample = new main<>(42);
        System.out.println("Data: " + integerExample.getData());

        // Contoh penggunaan generic method dengan ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        System.out.print("String List: ");
        main.printList(stringList);

        // Contoh penggunaan generic method dengan ArrayList
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.print("Integer List: ");
        main.printList(integerList);
    }
}
