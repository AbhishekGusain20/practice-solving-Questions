
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

        
    