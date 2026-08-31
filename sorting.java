//Bubble sorting array in ascending order


import java.util.Scanner;


    public class sorting{
        public static void sorting(int[] array){
            for(int i=0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter array elements");
        
            for(int i=0; i<size; i++){
                array[i] = sc.nextInt();
            }

            for(int i=0; i<size; i++){
                System.out.print(array[i]+ " ");
            }
System.out.println();
            //bubble sorting
            for(int i=0; i<size-1; i++){
                for(int j=0; j<size-i-1; j++){
                    if(array[j]>array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

sorting(array);
                
            }
        }







//Bubble sorting array  in descending order withount using function


public class sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements");
        for(int i=0; i<size; i++){
        array[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();

        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("sorted");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}







//Bubble sort array in ascendind order and count swaps

public class sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
       
            int[] array = new int[size];
             System.out.println("Enter elements");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //sorting and count swpas
int swaps = 0;
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swaps++;
                }
            }
        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
        System.out.println("total swaps : " + swaps);
    }
}

        





/*Takes array input from the user
Sorts using Bubble Sort
Prints the array after every pass
Prints the final sorted array
Prints total swaps */


import java.util.Scanner;

public class sorting{
        public static void sorting(int[] array, int size){
              //sorting 
              int swaps = 0;
              for(int i=0; i<size-1; i++){
                for(int j=0; j<size-i-1; j++){
                    if(array[j]>array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                       
                        swaps++;
                        //print array after every swap
                        for(int k=0; k<size; k++){
                            System.out.print(array[k]+" ");
                        }
                        System.out.println();
                    }
                    
                }
                
              }
              //print final sorted array
                for(int i=0; i<size; i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                System.out.println("total Swaps: "+ swaps);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("output: ");
        sorting(array, size);
    }
}








//Count the number of comparisons performed by Bubble Sort

import java.util.Scanner;
public class sorting{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size");
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("enter elements");
             for(int i=0; i<n; i++){
              array[i] = sc.nextInt();
             }
//swaping+count comaparisons
             int comparisons = 0;
             for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                    if(array[j]>array[j+1]){
                        int temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                        comparisons++;
                    }
                }
             }
             System.out.print("output: ");
             for(int i=0; i<n; i++){
                System.out.print(array[i]+" ");
             }
             System.out.println();
             System.out.println("total comparison: "+ comparisons);
        }
    }







//Find the second largest element using Bubble Sort

import java.util.Scanner;
public class sorting{
        public static void SecondLargest(int[] arr, int n){
            Scanner sc = new Scanner(System.in);
            //array element 
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            //sorting 
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;}
                }
            } //print array
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            System.out.println("Second largest number: "+ arr[n-2]);
        
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
           System.out.println("enter size");
           int n = sc.nextInt();
           System.out.println("enter element");
           int[] arr = new int[n];
         SecondLargest(arr, n);
        }
    }

