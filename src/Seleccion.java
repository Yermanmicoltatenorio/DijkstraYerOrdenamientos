public class Seleccion {
    public static void seleccion(int[] arr) {
        System.out.println("\nSelección:");
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        mostrar(arr);
    }

    public static void mostrar(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}