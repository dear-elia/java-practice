package tasks;

public class Task3 {
    public static void main(String[] args) {
        int[][] firstArray = {
                {12,21,32},
                {43,54,65},
        };

        int[][] secondArray = {
                {12,21,32},
                {43,54},
        };

        if(compareElements(firstArray, secondArray)){
            System.out.println("Arrays are equal!");
        }
        else{
            System.out.println("Not equal!");
        }
    }

    public static boolean compareElements(int[][] first, int[][] second){

        if(first.length != second.length){
            return false;
        }

        for(int i = 0; i < first.length; i++){
            int[] rowFirstArray = first[i];
            int[] rowSecondArray = second[i];

            if(rowFirstArray.length != rowSecondArray.length){
                return false;
            }
            for(int j = 0; j < rowFirstArray.length; j++){
                if(rowFirstArray[j] != rowSecondArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
