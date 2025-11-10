public class Burbuja {
    public static void burbuja(int[] arr) {
        System.out.println("\nBurbuja:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        mostrar(arr);
    }

    public static void mostrar(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}