import java.util.Scanner;

public class minimum_element {
    public static int[] readInteger(int count){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of digits");
         count = scan.nextInt();
        int[] array = new int[count];
        System.out.println("enter the numbers");
       for(int i=0;i<count;i++)
       {
          array[i]=scan.nextInt();
         }

        return array;

    }
    public static int findMin(int[] array){
        int min=0;
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] >= array[j]) {

                }

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]array = readInteger(5);
        int minimum = findMin(array);
        System.out.println("minimum element is :" + minimum);

        }
}
