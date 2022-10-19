public class SortByMin {
    //System.out.print("Type array length: ");
//        Scanner n = new Scanner(System.in);
//        int length = n.nextInt();
//        int[] arr = new int[length];
    void sort() {
        int[] arr = new int[20];
        System.out.print("Initial array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 20);
        }
        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Sorted array: ");
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
