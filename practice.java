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





 //Take two Strings and check whether they are equal.
                                import java.util.Scanner;
                                public class practice{
                                    public static void checkTwoStrings(String word1, String word2){
                                      System.out.println(word1.equals(word2));
                                    }
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("enter words");
                                        String word1 = sc.next();
                                        String word2 = sc.next();
                                        checkTwoStrings(word1, word2);
                                     }
                                }



//Create a method to check even/odd length
                                        import java.util.Scanner;
                                        public class practice{
                                            public static void checkEvenOddLength(String m){
                                               
                                                if(m.length()%2 !=0){
                                                    System.out.println("odd");
                                                } else {
                                                    System.out.println("even");
                                                }
                                                    
                                                
                                            }
                                            public static void main(String[] args) {
                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Enter String");
                                                String m = sc.next();
                                                checkEvenOddLength(m);
                                            }
                                        }









//Count a particular character

//Take a String and a character.

//String = banana
//Character = a
//Output:
//a occurs 3 times

                       import java.util.Scanner;
                                        public class practice{
                                            public static void stringCharacter(String name, char target ) {
                                                Scanner sc = new Scanner(System.in);
                                                int count = 0;
                                                for(int i=0; i<name.length(); i++){
                                                if(name.charAt(i)==target){
                                                    count++;
                                                }
                                                }
                                                System.out.println(name);
                                                System.out.println(target+" "+"occurs"+" "+count);
                                            }
                                            public static void main(String[] args) {
                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Enter name");
                                                String name = sc.next();
                                                 System.out.println("Enter character");
                                                 char target = sc.next().charAt(0);
                                                 stringCharacter(name, target);
                                            }
                                        }





//count spaces

import java.util.Scanner;
                                            public class practice{
                                                public static void countGap(String Sentence){
                                                    int count = 0;
                                                    for(int i=0; i<Sentence.length(); i++){
                                                       if(Sentence.charAt(i)==' '){
                                                         count++;
                                                       }
                                                    }
                                                    System.out.println("total gap: "+count);
                                                }
                                                public static void main(String[] args) {
                                                    Scanner sc = new Scanner(System.in);
                                                    System.out.println("Enter a sentence");
                                                    String Sentence = sc.nextLine();
                                                          countGap(Sentence);

                                                }
                                            }



 //find dublicate number inside array

import java.util.Scanner;

public class practice{
    public static void duplicateNumber(int[] array, int m){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m; i++){
           for(int j=i+1; j<m; j++){
            if(array[i]==array[j]){
                System.out.print(array[i]+" duplicate number");
            }
           }
        }

    }
                                                    public static void main(String[] args) {
                                                        Scanner sc = new Scanner(System.in);
                                                        System.out.println("enter array size");
                                                        int m = sc.nextInt();
                                                        int[] array = new int[m];
                                                       System.out.println("enter array elements");
                                                       for(int i=0; i<array.length; i++){
                                                        array[i] = sc.nextInt();
                                                        
                                                       }
                                                       duplicateNumber(array, m);
                                                    }
                                                }








                                           //2D array
import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and coloumns");
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        int[][] arrays = new int[row][coloumn];
        System.out.println("Enter array elements");
        for(int i=0; i<row; i++){
            for(int j=0; j<coloumn; j++){
                arrays[i][j] = sc.nextInt();
            }
        }
        //print array
        for(int i=0; i<row; i++){
            for(int j=0; j<coloumn; j++){
                System.out.print(arrays[i][j]+" ");
            }
              System.out.println();
        }
        

    }
}





//Find the sum of all elements
import java.util.Scanner;
public class practice{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter row and coloumn");
int row = sc.nextInt();
int coloumn = sc.nextInt();
int sum = 0;
int[][] array = new int[row][coloumn];
//taking input from the user
 for(int i=0; i<row; i++){
    for(int j=0; j<coloumn; j++){
    array[i][j] = sc.nextInt();
    }
 }
 //print array
 for(int i=0; i<row; i++){
    for(int j=0; j<coloumn; j++){
        System.out.print(array[i][j]+" ");
    }
    System.out.println();
 }
 //add elements
 for(int i=0; i<row; i++){
    for(int j=0; j<coloumn; j++){
        sum = sum+array[i][j];
    }
 }
 System.out.println(sum);
    }
}






 //count vowels and consonants

    import java.util.Scanner;
    public class practice{
        public static void checkVowels(String Name){
            int count = 0;
            int count2 = 0;
            Name = Name.toLowerCase();
            for(int i=0; i<Name.length(); i++){
                char ch = Name.charAt(i);
            if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
count++;
            } else if(ch >='a' && ch<='z'){
                count2++;
            }
        }
        System.out.println("vowels"+count);
        System.out.println("consonants"+count2);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string");
            String Name = sc.next();
            checkVowels(Name);

        }
    }





    //find the smallest element in array
    import java.util.Scanner;
 public class practice{
 public static void smallestElement(int array[],int m){
 //print array
 for(int i=0; i<array.length; i++){
    System.out.print(array[i]+" ");
 }
 System.out.println();

 int smallest = array[0];
 for(int i=1; i<array.length; i++){
    if(array[i]<smallest){
        smallest = array[i];
    }
 }
 System.out.println("smallest element is: "+smallest);
 }
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter array size");
 int m = sc.nextInt();
 int[] array = new int[m];
 System.out.println("Enter elements");
 for(int i=0; i<array.length; i++){
 array[i] = sc.nextInt();
 }
smallestElement(array, m);

 }
 }




//Reverse a number 
 import java.util.Scanner;
 public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int numbers = sc.nextInt();
        System.out.println(numbers);
        // reverse
        int reverse = 0;
        while(numbers>0){
            int digit = numbers % 10;
            reverse = reverse * 10 + digit;
            numbers = numbers / 10;
        }
        System.out.println("Reverse: "+reverse);
    }
 }




 //merge two arrays
    import java.util.Scanner;
    public class practice{
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);   
         System.out.println("enter array size 1");
         int size1 = sc.nextInt();
          System.out.println("enter array size 2");
         int size2 = sc.nextInt();
          int[] array = new int[size1];
          int[]arrray = new int[size2];
          System.out.println("enter array elements");
          for(int i=0; i<array.length; i++){
             array[i] = sc.nextInt();
          }
           System.out.println("enter array2 elements");
          for(int i=0; i<arrray.length; i++){
             arrray[i] = sc.nextInt();
          }

          //ptint array 
          for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
          }
           for(int i=0; i<arrray.length; i++){
            System.out.print(arrray[i]);
          }
        }
    }



 //reverse string 
        import java.util.Scanner;
        public class pracice{
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter string");
                String anything = sc.nextLine();
                for(int i=anything.length()-1; i>0; i--){
                    System.out.print(anything.charAt(i));
                }
            }
        }

 //max of three number
            public class practice{
                public static void main(String[] args) {
                   
                    int a = 44;
                    int b = 49;
                    int c = 99;
                   if(a>b){
                    System.out.println("a is max number");
                   }else if(b>c){
                    System.out.println("b is max number");
                   }else if(a>c){
                    System.out.println("a is max number");
                   }else{
                    System.out.println("c is max number");
                   }
                }
            }




                //fibbonaci series
                public class practice{
                    public static void main(String[] args) {
                        int a = 0;
                        int b=1;
                        for (int i = 0; i < 10; i++) {
                         int c = a + b;
                         a=b;
                         b=c;
                         System.out.print(c+" ");
                        }
                       
                    }
                    }




  //prime number
                    import java.util.Scanner;
                    public class practice{
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            int n = sc.nextInt();
                            for(int i=0; i<n; i++){
                            int t = sc.nextInt();
                            int count = 0;
                            
                            for(int j=1; j<=t; j++){
                                if(t%j==0){
                                    count++;
                                }
                            }
                            if(count==2){
                                System.out.println("prime number");
                            }else{
                                System.out.println("not a prime number");
                            }
                        }
                        }
                    }



 //Count the digits in a given number
                            import java.util.Scanner;
                            public class practice{
                                public static void countdigits(int count, int i){
                                    System.out.println("total digit: "+count);
                                }
                                public static void main(String[] args) {
                                    Scanner sc = new Scanner(System.in);
                                    System.out.println("Enter a number");
                                    int number = sc.nextInt();
                                    int count = 0;
                                    int i = 0;
                                    while(0<number){
                                        count++;
                                        number = number/10;
                                    }
                                    countdigits(count, i);
                                   
                                }
                            }





//Inverse Number

import java.util.Scanner;

public class practice{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
 int temp = number;
 int totaldigit = 0;
 while(temp != 0){
  totaldigit++;
  temp = temp/10;
 }
 
    int inverse = 0;
    int originalPosition = totaldigit;

    while(number != 0){
        int originalDigit = number % 10;
        int inverseDigit = originalPosition;
        int inversePosition = originalDigit;
        inverse = inverse + inverseDigit*(int)Math.pow(10 ,totaldigit-inversePosition);
        number = number/10;
        originalPosition++;
    }
    System.out.println(inverse);
}
}







// frequency of a digit


            import java.util.Scanner;
            public class practice{
                public static int fre(int number, int d){
                        int count = 0;
                         

                        while(number > 0){
                            int digit = number % 10;
                            number = number / 10;

                            if(digit == d){
                             count++;
                            }
                        }
                        return count;
                    } 
            
                public static void main(String[] args) {
                    Scanner Sc = new Scanner(System.in);
                    System.out.println("ENter a number");
                   int number = Sc.nextInt();
                   int d = Sc.nextInt();

                    System.out.println(fre(number, d));
                }
            }








                // find the sum of all digit number
                import java.util.Scanner;
                public class practice{
                    public static int sum(int number){
                        int total = 0;
                     while(number>0){
                        int digit = number%10;
                        number = number/10;
                         total = total + digit;
                     }
                     return total;
                    }
                    public static void main(String[] args){
                        Scanner sc = new Scanner(System.in);
                        System.out.println("enter a number");
                        int number = sc.nextInt();
                        System.out.println(sum(number));
                    }
                }




 //find largest digit

                    import java.util.Scanner;
                    public class practice{
                        public static int largest(int number){
                            int count = 0;
                            while(number>0){
                                int digit = number%10;
                                number = number/10;
                                if(digit>count){
                                    count = digit;
                                }
                            }
                            return count;
                        }
                        public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter a number");
                            int number = sc.nextInt();
                            System.out.println("largest digit is : "+largest(number));
                        }
                    }





//reverse a number
                        import java.util.Scanner;
                        public class practice{
                            public static void reverse(int number){
                               int r = 0;
                               while(number>0){
                            int digit = number%10;
                            r = r*10+digit;
                            number = number/10;
                               }
                            }
                            public static void main(String[] args){
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number");
                        int number = sc.nextInt();
                        reverse(number);
                            }
                        }



// conversion
                            import java.util.Scanner;
                            public class practice{
                                public static int conversion(int number, int base){
                                int count = 0;
                                int multiplier = 1;
                                while(number>0){
                                    int digit = number%base;
                                    count = count+digit*multiplier;
                                    multiplier = 10*multiplier;
                                    number = number/base;
                                    
                                }
                                return count;
                            }
                                public static void main(String[] args){
                                    Scanner sc = new Scanner(System.in);
                                    System.out.println("Enter a number");
                                   
                                    int number = sc.nextInt();

                                     System.out.println("Enter a base");
                                      int base = sc.nextInt();
                                      System.out.println("converion of number is: "+conversion(number, base));
                                }
                            }



 //Anybase to decimal/anybase                               

import java.util.Scanner;
public class practice{
    public static int conversion(int number, int base){
        int count = 0;
        int multiplier = 1;
        while(number>0){
            int digit = number%10;
            number = number/10;
            count = count+digit*multiplier;
            multiplier = base*multiplier;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter a base");
        int base = sc.nextInt();
        System.out.println(conversion(number, base));
    }
}




//find index 
    public class practice{
        public static void main(String[] args) {
            int[] array = new int[6];
            array[0] = 15;
            array[1] = 20;
            array[2] = 30;
            array[3] = 10;
            array[5] = 8;
            int idx = -1;
            for(int i=0; i<array.length; i++){
                if(array[i] == 10){
            idx = i;
            break;
                }
            }
            System.out.println(idx);
        }
    }



//Second largest element

import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int[] array = new int[size];
        for(int i=0; i<array.length; i++){
        array[i] = sc.nextInt();
        }
        //print array elemen
      for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
        
      }
     System.out.println();
      //bublle sort
      for(int i=0; i<array.length-1; i++){
        for(int j=0; j<array.length-i-1; j++){
            if(array[j]>array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
      }
      //print sorted array
      for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
      }
System.out.println();
//find second largest element
int largest = array[size-1];
int secondLargest = 0;
boolean found = false;
for(int i=size-2; i>=0; i--){
    if(array[i] != largest){
     secondLargest = array[i];
     found = true;
    }
}
if(found){
    System.out.println(secondLargest);
}else{
    System.out.println("no distnct element");
}

    }
}        



 //Swapping array[0] with array[2]

import java.util.Scanner;

public class practice{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a size");
            int size = sc.nextInt();
            System.out.println("Enter a elements");
            int[] array = new int[size];
            for(int i=0; i<array.length; i++){
                array[i] = sc.nextInt();
            }
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            //swapping
            int temp = array[0];
            array[0] = array[2];
            array[2] = temp;

            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }




//Write code to swap the last two elements.

import java.util.Scanner;

public class practice{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a size");
            int size = sc.nextInt();
            System.out.println("Enter a elements");
            int[] array = new int[size];
            for(int i=0; i<array.length; i++){
                array[i] = sc.nextInt();
            }
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
            //swapping
            int temp = array[size-1];
            array[size-1] = array[size-2];
            array[size-2] = temp;

            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }

