package com.rohith.prac;

public class Sorting {

    public static void main(String args[]) {
        int a[] = {2, 6, 1, 6, 8, 9, 0};
        quickSort(a, 0, a.length - 1);
        for (int e : a) {
            System.out.println(e);
        }
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a,low, pivotIndex-1);
            quickSort(a, pivotIndex+1, high);
        }

    }

    public static int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int j = low;
        for(int i=low; i<high; i++) {
            if (a[i] <= pivot) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                j++;
            }
        }

        int t = a[j];
        a[j] = a[high];
        a[high] = t;
        return j;
    }


    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);
            merge(a, left, middle, right);
        }
    }

    public static void merge(int[] a, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int l[] = new int[n1];
        int r[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = a[middle + i + 1];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (l[i] >= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        System.arraycopy(l, i, a, k, n1 - i);
        System.arraycopy(r, j, a, k, n2 - j);
    }

    public static void simpleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void bubbleSort(int[] a) {
        boolean swapped = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        /*boolean swapped = false;
        for (int i=0; i<a.length-1; i++ ) {
            for (int j=a.length-1-i; j>0; j--) {
                if (a[j-1] > a[j]) {
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }*/
    }

    public static void recursiveBubbleSort(int[] a, int length) {

        if (length == 0) {
            return;
        }

        for (int i = 0; i < length; i++) {
            if (a[i] > a[i + 1]) {

                a[i] = a[i] ^ a[i + 1] ^ (a[i + 1] = a[i]);

                /*int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;*/
            }
            recursiveBubbleSort(a, length - 1);
        }
    }



    public static void insertionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            //int j = i-1;
            int j;

            for (j = i - 1; j >= 0 && a[j] < e; j--) {
                a[j + 1] = a[j];
            }
/*
            while (j>=0 && a[j] > e) {
                a[j+1] = a[j];

                j--;
            }
*/
            a[j + 1] = e;
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int j;
            int min_index = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) min_index = j;
            }
            int t = a[i];
            a[i] = a[min_index];
            a[min_index] = t;
        }
    }


}
