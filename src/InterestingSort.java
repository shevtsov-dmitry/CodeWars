public class InterestingSort {
    // Sort the odd

    //public static int[] sortArray(int[] array) {
    //    return array;
    //  }
    public static void sortArray(int[] arr){
        for(int h:arr){
            if(h % 2 == 1){
                for (int i = 0; i < arr.length - 1; i++) {
                    int xMin = arr[i];
                    int index = 0;
                    for (int j = i + 1; j < arr.length; j++)
                        if (xMin > arr[j]) {
                            xMin = arr[j];
                            index = j;
                        }
                    int currentArrayVariable = arr[i];
                    arr[index] = currentArrayVariable;
                    arr[i] = xMin;

                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
