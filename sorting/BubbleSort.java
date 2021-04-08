package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    // method to perform the bubble sort
   private static void bubbleSort(int array[])  {
       // loop to access each array element
       for(int i=0;i< array.length-1;i++) {

           // to check if swapping occurs
           boolean swapped = false;

           // loop to compare adjacent elements
           for(int j=0;j< array.length-i-1;j++) {

               // compare two array elements
               // change > to < to sort in descending order
               if(array[j]>array[j+1]) {

                   // swapping occurs if
                   // the first element is greater than second
                   int temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;

                   swapped = true;
               }
           }

           // no swapping occurs means the array is already sorted
           // so no need of further comparison
           if(!swapped)
               break;

       }
   }

   // main method
   public static void main(String[] args) {

       int[] array = {-3, 2, -5, 12};

       // call the method using the class name BubbleSort
       BubbleSort.bubbleSort(array);
       System.out.println(Arrays.toString(array));
   }
}
