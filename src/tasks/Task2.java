package tasks;

public class Task2 {

    public static void main(String[] args) {

        int[] myArray = new int[100];

        int arrayIndex = 0;
        for(int i = 1; arrayIndex < myArray.length ;  i++){
            if (i % 13 == 0 || i % 17 == 0) {
                myArray[arrayIndex] = i;
                arrayIndex++;
            }
        }
        Task1.printArray(myArray);
    }
}
