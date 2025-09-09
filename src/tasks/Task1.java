package tasks;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6};
        printArray(myArray);
        reverse(myArray);

    }

    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] values){
        for (int i = values.length-1; i >= 0; i--){
            System.out.print(values[i] + " ");
        }
    }
}
