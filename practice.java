import java.util.Scanner;

 //reverse string 
public class practice {


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

} 

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

        } 




 //Count even and odd numbers in an array.

             public class practice{
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter array size");
                    int m = sc.nextInt();
                    int[] array = new int[m];
                    System.out.println("enter array elements");
                    for(int i=0; i<m; i++){
                        array[i] = sc.nextInt();
                    }
                    for(int i=0; i<m; i++){
                        System.out.print(array[i]+" ");
                    }
                    System.out.println();
                    int evencount = 0;
                     int oddcount = 0;
                    for(int i=0; i<m; i++){
                        if(array[i]%2==0){
                    evencount++;
                        }else {
                            oddcount++;
                        }
                    }
                    System.out.println("even count" + " "+evencount);
                    System.out.println("odd count" + " "+oddcount);

                }
            }
            
        




//Search an element    Take a number from the user and check whether it exists in the array.
 public class practice{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number");
                        int a = sc.nextInt();
                        System.out.println("Enter a size");
                        int m = sc.nextInt();
                        int[] array = new int[m];
                        System.out.println("enter elements");
                        for(int i=0; i<m; i++){
                            array[i] = sc.nextInt();
                        }
                         for(int i=0; i<m; i++){
                            System.out.print(array[i]+" ");
                        }
                        System.err.println();

                        boolean found = false;
                        for(int i=0; i<m; i++){

                        if(a==array[i]){
                         found = true;
                         break;
                        }
                    }
                    if(found){
                        System.out.println(a+" present in array");
                    }else{
                        System.out.println(a+" not present in array");
                    }

                    }
                }




//Print elements at even indexes
 public class practice{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number");
                        int a = sc.nextInt();
                       int[] array = new int[a];
                       System.out.println("Enter elements");
                       for (int i = 0; i < a; i++) {
                           array[i] = sc.nextInt();
                       }
                         for (int i =0; i<a; i++) {
                           System.out.print(array[i]+" ");
                       }
System.out.println();

                        for (int i =0; i<a; i++){
                            if(i%2==0){
                          System.out.print(array[i]+" ");
                            }
                        }
                        System.out.println();
                    }
                }





// find largest and smallest element and second largest , second smallest element in array
 public class practice{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number");
                        int a = sc.nextInt();
                       int[] array = new int[a];
                       System.out.println("Enter elements");
                       for (int i = 0; i < a; i++) {
                           array[i] = sc.nextInt();
                       }
                         for (int i =0; i<a; i++) {
                           System.out.print(array[i]+" ");
                       }
System.out.println();

int largest = array[0];
int smallest = array[0];

                        for (int i =0; i<a; i++){
                          if(array[i]>largest-1){
                          largest = array[i];
                          }else if(array[i]<smallest){
                           smallest = array[i];
                          }
                        }
                        System.out.println(largest);
                        System.out.println(smallest);
                        
                        int secondLargest = Integer.MIN_VALUE;
                        int secondSmallest = Integer.MAX_VALUE;

                        for(int i=0; i<array.length; i++){
                            if(array[i]>secondLargest && array[i]!=largest){
                                secondLargest = array[i];
                            }
                             if (array[i]< secondSmallest && array[i]!= smallest){
                                      secondSmallest = array[i];
                            }
                        }
                         System.out.println(secondLargest);
                        System.out.println(secondSmallest);
                    }
                }

