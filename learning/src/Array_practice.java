import java.util.Scanner;

public class Array_practice {

    public static int[] getIntger(int n) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("enter the values \n");
        for(int i=0; i <array.length;i++){
            array[i]= scanner.nextInt();
        }
        return array;

    }
    public static int[] sortArray(int[] array){
        if(array == null){
            return null;
        }
        int i =0;
        int j = array.length-1;
        int tmp;
        while(j>i){
            tmp = array[j];
            array[j]=array[i];
            array[i]=tmp;
            j--;
            i++;
        }
    return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

       int[] array = getIntger(size);
       int[] array1 = sortArray(array);
        System.out.println("the sorted list is :");
        for (int i=0;i<array1.length;i++) {
            System.out.println(array1[i]);

        }

    }


}
