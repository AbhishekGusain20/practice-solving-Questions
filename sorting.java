
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


//sort array 
import java.util.Scanner;
public class sorting{
    public static void sorting(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
 
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[]array = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        //apply bublle sort
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        sorting(array);
    }
}



 //find the second largest element in array
    import java.util.Scanner;
    public class sorting{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }  
        //print array
       for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        } System.out.println();
        //sorting
        for(int i=0; i<array.length-i; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                    
                }
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        } 
        System.out.println();
        System.out.println("Second largest element: "+array[size-2]);

        }
    }








import java.util.Scanner;
        public class sorting{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter array1 size");
                int size1 = sc.nextInt();
                System.out.println("enter array2 size");
                int size2 = sc.nextInt();
                int[] array1 = new int[size1];
                 int[] array2 = new int[size2];
                  System.out.println("enter array1 elements");
                  for(int i=0; i<array1.length; i++){
                    array1[i] = sc.nextInt();
                  }
                   System.out.println("enter array2 elements");
                  for(int i=0; i<array2.length; i++){
                    array2[i] = sc.nextInt();
                  }

                  for(int i=0; i<array1.length-1; i++){
                    for(int j=0; j<array1.length-1-i; j++){
                        if(array1[j]>array1[j+1]){
                            int temp = array1[j];
                            array1[j] = array1[j+1];
                            array1[j+1] = temp;
                            
                        }
                    }
                  }
for(int i=0; i<array1.length; i++){
    System.out.print(array1[i]+" ");
}System.out.println();

                  for(int i=0; i<array2.length-1; i++){
                    for(int j=0; j<array2.length-1-i; j++){
                        if(array2[j]>array2[j+1]){
                            int temp = array2[j];
                            array2[j] = array2[j+1];
                            array2[j+1] = temp;
                            
                        }
                    }
                  }
                  for(int i=0; i<array2.length; i++){
    System.out.print(array2[i]+" ");
}System.out.println(); 
                   

int[] array3 = new int[size1+size2];
int i=0, j=0, k=0;
while(i<size1 && j<size2){
    if(array1[i]<array2[j]){
        array3[k] = array1[i];
        i++;
    }else{
        array3[k] = array2[j];
        j++;
    }
    k++;
}
 while(i<size1){
    array3[k] = array1[i];
    i++;
    k++;
 }
 while(j<size2){
    array3[k] = array2[j];
    j++;
    k++;
 }
 for(int x=0; x<array3.length; x++){
System.out.print(array3[x]+" ");
 }
 System.out.println();
                }
            }






//count the total number of comparision
                import java.util.Scanner;
                public class sorting{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("enter array size");
                        int n = sc.nextInt();
                        int[] array = new int[n];
                        for(int i=0; i<n; i++){
                            array[i] = sc.nextInt();
                        }
                        int count = 0;
                        for(int i=0; i<array.length-1; i++){
                            for(int j=0; j<array.length-i-1; j++){
                                count++;
                                if(array[j]>array[j+1]){
                                    int temp = array[j];
                                    array[j] = array[j+1];
                                    array[j+1] = temp;
                                
                                }
                            }
                        }
                        for(int i=0; i<array.length; i++){
                            System.out.print(array[i]+" ");
                        }
                        System.out.println();
                    System.out.println("comparison: "+count);    
                    
                    }
                }






//check whether an array is sorted or not
                import java.util.Scanner;
                public class sorting{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("enter array size");
                        int n = sc.nextInt();
                        int[] array = new int[n];
                        System.out.println("enter array elements");
                        for(int i=0; i<n; i++){
                            array[i] = sc.nextInt();
                        }
                        for(int i=0; i<array.length; i++){
                            System.out.print(array[i]+" ");
                        }
                        System.out.println();
                        //check
                        boolean sorted = true;
                        for(int i=0; i<n-1; i++){
                          if(array[i]>array[i+1]){
                            sorted = false;
                            break;
                          }
                        }
                        if(sorted){
                            System.out.println("array is sorted");
                        }else {
                            System.out.println("array is not sorted");
                        }






                        //sort array and remove duplicate elements
                import java.util.Scanner;
                public class sorting{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("enter array size");
                        int n = sc.nextInt();
                        int[] array = new int[n];
                        System.out.println("enter array elements");
                        for(int i=0; i<n; i++){
                            array[i] = sc.nextInt();
                        }
for(int i=0; i<array.length-1; i++){
    for(int j=0; j<n-i-1; j++){
        if(array[j]>array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }
    }

}
 for(int i=0; i<array.length; i++){
                            System.out.print(array[i]+" ");
                        }
                        System.out.println();


                        int j=0;
                        for(int i=0; i<n-1; i++){
                            if(array[i]!=array[i+1]){
                                array[j]=array[i];
                                j++;

                            }
                        }
                        array[j]=array[n-1];
                        j++;
                        System.out.println("remove duplicate element");
                        for(int i=0; i<j; i++){
                            System.out.print(array[i]+" ");
                        }
                    }
                }

                    }
                }






  //sort only even number  
                    import java.util.Scanner;
                    public class sorting{
                        public static void main(String[] args){
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter array size");
                            int size = sc.nextInt();
                            int[] array = new int[size];
                            System.out.println("enter array elements");
                            for(int i=0; i<array.length; i++){
                                array[i] = sc.nextInt();
                            }

                            for(int i=0; i<array.length-1; i++){
                                for(int j=0; j<array.length-i-1; j++){
                                    if(array[j] % 2 == 0 && array[j+1] % 2 == 0){
                                        if(array[j]>array[j+1]){
                                            int temp = array[j];
                                            array[j] = array[j+1];
                                            array[j+1]=temp;
                                        }
                                    }
                                }
                            }
                            for(int i=0; i<array.length; i++){
                            System.out.print(array[i]+" ");
                        }
                    }
                }









  //sort array using selection sort
                    import java.util.Scanner;
                    public class sorting{
                        public static void selectionsort(int array[]){
                            for(int i=0; i<array.length; i++){
                         System.out.print(array[i]+" ");
                            }
                
                        }
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("enter array size");
                            int size = sc.nextInt();
                            System.out.println("enter array elements");
                            int[] array = new int[size];
                            for(int i=0; i<size; i++){
                                array[i] = sc.nextInt();
                            }
                            for(int i=0; i<size-1; i++){
                                int smallest=i;
                                for(int j=i+1; j<size; j++){
                                    if(array[smallest]>array[j]){
                                        smallest=j;
                                    }
                                }
                                int temp = array[smallest];
                                array[smallest] = array[i];
                                array[i] = temp;
                            }
                         selectionsort(array);
                        }
                    }











 //find second smallest element using selectionsort 
import java.util.Scanner;
                        public class sorting{
                            public static void selectionsort(int array[]){
                                for(int i=0; i<array.length; i++){
                                    System.out.print(array[i]+" ");
                                    
                                }
                                System.out.println();
                                System.out.println(" smallest element"+array[1]);
                            }
                            public static void main(String[] args) {
                                Scanner sc = new Scanner(System.in);
                                System.out.println("enter array size");
                                int size = sc.nextInt();
                                int[] array = new int[size];
                                System.out.println("enter array elements");
                                for (int i=0; i<size; i++){
                                    array[i] = sc.nextInt();
                                }
                                for(int i=0; i<size-1; i++){
                                    int smallest = i; 
                                    for(int j=i+1; j<size; j++){
                                        if(array[smallest]>array[j]){
                                            smallest=j;
                                        }
                                    }
                                    int temp = array[smallest];
                                            array[smallest] = array[i];
                                            array[i]= temp;

                                }

                                selectionsort(array);
                                }
                            }








 //sort array in descending order
                                import java.util.Scanner;
                                
                                public class sorting{
                                    public static void selectionsort(int array[]){
                                        for(int i=0; i<array.length; i++){
                                    System.out.print(array[i]+" ");
                                        }
                                }
                                    public static void main(String[] args) {
                                     Scanner sc = new Scanner(System.in);   
                                     System.out.println("enter array size");
                                     int size = sc.nextInt();
                                     int[] array = new int[size];
                                     System.out.println("enter array elements");
                                     for(int i=0; i<array.length; i++){
                                        array[i] = sc.nextInt();
                                     }
                                     //selection sort apply
                                     for(int i=0; i<array.length-1; i++){
                                        int largest = i; 
                                        for(int j=i+1; j<array.length; j++){
                                            if(array[largest]<array[j]){
                                            largest=j;
                                            }
                                        }
                                        //swaping
                                        int temp = array[largest];
                                        array[largest] = array[i];
                                        array[i]= temp;
                                     }

                                     //call function
                                      selectionsort(array);
                                    }
                                }





//sort only odd numbers in ascending order and keep even number in their original position
                                    import java.util.Scanner;
                                    public class sorting{
                                        public static void selectionsort(int array[]){
                                            for(int i=0; i<array.length; i++){
                                                System.out.print(array[i]+" ");
                                            }
                                        }
                                        public static void main(String[] args) {
                                            Scanner sc = new Scanner(System.in);
                                            System.out.println("enter elements");
                                            int size = sc.nextInt();
                                            int[] array = new int[size];
                                            System.out.println("enter array elements");
                                            for(int i=0; i<array.length; i++){
                                                array[i] = sc.nextInt();
                                            }
                                            //selection sort
                                            for(int i=0; i<size-1; i++){
                                                int smallest = i;
                                                if(array[i]%2!=0){
                                                 smallest = i;
                                                }
                                                for(int j=i+1; j<array.length; j++){
                                                    if(array[j]%2!=0 && array[smallest]>array[j]){
                                                        smallest=j;
                                                    
                                                    }
                                                }
                                                int temp = array[smallest];
                                                array[smallest] = array[i];
                                                array[i] = temp;
                                            }
                                            selectionsort(array);
                                        }
                                    }






                                        //sort only even numbers in ascending order and keep odd number in their original position
                                    import java.util.Scanner;
                                    public class sorting{
                                        public static void selectionsort(int array[]){
                                            for(int i=0; i<array.length; i++){
                                                System.out.print(array[i]+" ");
                                            }
                                        }
                                        public static void main(String[] args) {
                                            Scanner sc = new Scanner(System.in);
                                            System.out.println("enter elements");
                                            int size = sc.nextInt();
                                            int[] array = new int[size];
                                            System.out.println("enter array elements");
                                            for(int i=0; i<array.length; i++){
                                                array[i] = sc.nextInt();
                                            }
                                            //selection sort
                                            for(int i=0; i<size-1; i++){
                                            
                                                if(array[i]%2==0){
                                                int smallest = i;
                                                
                                                for(int j=i+1; j<array.length; j++){
                                                    if(array[j]%2==0 && array[smallest]>array[j]){
                                                        smallest=j;
                                                    
                                                    }
                                                }
                                                
                                                int temp = array[smallest];
                                                array[smallest] = array[i];
                                                array[i] = temp;
                                            }
                                        }
                                        
                                            selectionsort(array);
                                        }
                                    
                                }





  // Sort an array in ascending order using Bubble Sort and then descending order using Selection Sort.
                                import java.util.Scanner;
                                public class sorting{
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("enter array size");
                                        int size = sc.nextInt();
                                        int[] array = new int[size];
                                        for(int i=0; i<array.length; i++){
                                            array[i] = sc.nextInt();
                                        }
                                        for(int i=0; i<array.length-1; i++){
                                            for(int j=0; j<array.length-1-i; j++){
                                                if(array[j]>array[j+1]){
                                                    int temp = array[j];
                                                    array[j] = array[j+1];
                                                    array[j+1] = temp;
                                                }
                                            }
                                        }
                                        //asscending
                                        for(int i=0; i<array.length; i++){
                                            System.out.print(array[i]+" ");
                                        }
                                        System.out.println();

                                        for(int i=0; i<array.length-1; i++){
                                            int largest = i;
                                            for(int j=i+1; j<array.length; j++){
                                        if(array[largest]<array[j]){
                                            largest =j;
                                        }
                                            
                                            }
                                            int temp = array[largest];
                                            array[largest] = array[i];
                                            array[i] = temp;
                                        }
                                        //descending
                                        for(int i=0; i<array.length; i++){
                                            System.out.print(array[i]+" ");
                                        }
                                    }
                                }
                                
