import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            System.out.println("giá trị để so sánh " + x);
            pos = i;
            System.out.println("index so sánh " + i);
            while (pos > 0 && x < arr[pos - 1]){
                System.out.println("gán index hiện tại " + i + " = giá trị phía trước " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];

                pos--;
                System.out.println("giảm index  " + pos);
            }
            if(pos != i){
                arr[pos] = x;
                System.out.println("gán giá trị tại index " + pos + " cho giá trị so sánh " + x);
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
