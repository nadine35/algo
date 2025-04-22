package fr.afpa;



public class IndiceMinMaxTab {
    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 1 };

        // int res = indiceMinMaxTab(array, 1, 3);
       // int[] arrayResult = new int[2];
     //   System.out.println(arrayResult);
        findMinMax(array);

        int[] array2 = { 42, 36, 42, 31 };
        findMinMax(array2);
    }

    public static int[] findMinMax(int[] arrayToProcess) {

        int max = 0;
        int min = 0;
        //int i = 1;

        for (int i = 0; i < arrayToProcess.length; i++) {
            if (arrayToProcess[i] > arrayToProcess[max]) { // 4 > array[0] => 4 > 4
                max = i; //0
            }
            if (arrayToProcess[i] < arrayToProcess[min]) { // 4 < array[0] => 4 > 4
                min = i; //0
            }
        }
        // System.out.println("Valeur maximale : " + max);
        // System.out.println("Valeur minimale : " + min);
        int[] arrayResult = {min, max};
        return arrayResult;
    }

}
