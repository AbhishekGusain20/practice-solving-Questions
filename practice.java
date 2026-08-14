import java.util.Scanner;

public class practice {

    public static void reverseString(int size) {

        Scanner sc = new Scanner(System.in);

        String[] array = new String[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        System.out.println("Original array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Reverse array:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();


        reverseString(size);
    }
}