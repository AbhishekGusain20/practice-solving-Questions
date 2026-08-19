import java.util.Scanner;
// reverse string 
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





//  toLowerCase String

public class practice{
    public static  String toLowerCase(String name){
        System.out.println(name.toLowerCase());
        return name.toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String name = sc.next();
        toLowerCase(name);
    }
}






//Count vowels

public class practice{
    public static void countVowels(String word){
        int count = 0;
        for(int i=0; i<word.length(); i++){
     if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
     count++;
     }

        }
        System.out.println("total vowels is: "+ " "+ count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        String word = sc.nextLine();
        countVowels(word);
    }
}







//reverse String using StringBuilder

 public class practice{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String");
            String hnjii = sc.next();
            StringBuilder sb = new StringBuilder(hnjii);
            System.out.println(sb);
            sb.reverse();
            System.out.println("reverse : " + sb);
        }
    }








        // palindrome
        public class practice{
            public static void palindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String reverse = sb.toString();
        System.out.println(reverse);
        if(word.equals(reverse)){
        System.out.println(" palindrome");
        }else{
            System.out.println("not palindrome");
        }
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter String");
             String word = sc.next();
             System.out.println(word);
             palindrome(word);
            }
        }
