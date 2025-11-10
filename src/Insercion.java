public class Insercion {
    public static void insercion(int[] arr) {
        System.out.println("\nInserción:");
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        mostrar(arr);
    }

    public static void mostrar(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}