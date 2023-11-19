public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 6, 5, 0};
        bubbleSort(arr);
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        long stastTime = System.nanoTime();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - stastTime);
        System.out.printf("insertSort завершил работу за %d\n", duration);

    }

    public static void bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.printf("bubbleSort завершил работу за %d\n", duration);

    }


}
