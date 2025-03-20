package LatihanSoal;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    
    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    // Main method to test sorting algorithms
    public static void main(String[] args) {
        int n = 100000; // Panjang array
        int[] arr = new Random().ints(n, 0, 10000).toArray();
        
        System.out.println("Original Array Generated");
        
        // Testing Bubble Sort
        int[] arr1 = arr.clone();
        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) + " ns (" + (end - start) / 1e6 + " ms / " + (end - start) / 1e9 + " s)");
        
        // Testing Selection Sort
        int[] arr2 = arr.clone();
        start = System.nanoTime();
        selectionSort(arr2);
        end = System.nanoTime();
        System.out.println("Selection Sort Time: " + (end - start) + " ns (" + (end - start) / 1e6 + " ms / " + (end - start) / 1e9 + " s)");
        
        // Testing Insertion Sort
        int[] arr3 = arr.clone();
        start = System.nanoTime();
        insertionSort(arr3);
        end = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (end - start) + " ns (" + (end - start) / 1e6 + " ms / " + (end - start) / 1e9 + " s)");
        
        // Testing Merge Sort
        int[] arr4 = arr.clone();
        start = System.nanoTime();
        mergeSort(arr4, 0, arr4.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) + " ns (" + (end - start) / 1e6 + " ms / " + (end - start) / 1e9 + " s)");
        
        // Testing Quick Sort
        int[] arr5 = arr.clone();
        start = System.nanoTime();
        quickSort(arr5, 0, arr5.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) + " ns (" + (end - start) / 1e6 + " ms / " + (end - start) / 1e9 + " s)");
    }
}
