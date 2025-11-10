public class Main {
    public static void main(String[] args) {
        int[] arreglo = { 5, 2, 9, 1, 5, 6 };

        System.out.println("=== ORDENAMIENTO ===");
        System.out.println("Arreglo original:");
        imprimir(arreglo);

        // Burbuja
        Burbuja.burbuja(arreglo.clone());

        // Inserción
        Insercion.insercion(arreglo.clone());

        // Selección
        Seleccion.seleccion(arreglo.clone());

        // QuickSort
        QuickSort.quickSort(arreglo.clone(), 0, arreglo.length - 1);

        // MergeSort
        MergeSort.mergeSort(arreglo.clone(), 0, arreglo.length - 1);

        System.out.println("\n=== DIJKSTRA ===");
        Dijkstra.ejecutarEjemplo();
    }

    public static void imprimir(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
}