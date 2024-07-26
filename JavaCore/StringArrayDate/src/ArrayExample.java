import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Single Dimensional Array
         int[] Arr1 = new int[2];
         Arr1[0] = 10;
         Arr1[1] = 20;
         //Or
         int[] Arr2 = {10, 20};

        double[] myList = {6.5, 2.9, 3.4, 3.5, 4.9};
        // Print all the array elements
        for (double element: myList) {
            System.out.println(element);
        }
        //Or
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Two Dimensional Array
         int[][] Arr3 = new int[2][2];
         Arr3[0][0] = 2;
         Arr3[0][1] = 3;
         Arr3[1][0] = 4;
         Arr3[1][1] = 5;
         //Or
         int[][] Arr4 = {{2,3}, {4,5}};
         //Or
         int[][] Arr5 = new int[][]{{2,3}, {4,5}};
         for (int i = 0; i < Arr5.length; i++) {
             for (int j = 0; j < Arr5[i].length; j++) {
                 System.out.println("index [" + i + "," + j + "]: " +Arr5[i][j]);
             }
         }

         double[] grades = {92.2, 80.5, 69.5, 72.0};
         double[] percentages = grades;
         percentages[3] = 70.0;
         System.out.println(grades[3]);

         double[] percentages1 = Arrays.copyOf(grades, grades.length);
         percentages[3] = 71.0;
         System.out.println(grades[3]);

         Arrays.sort(grades);
         double[] lowestGrades = Arrays.copyOfRange(grades, 0, 2);
         for (double element: lowestGrades) {
                System.out.println(element);
         }

         // Compare two arrays
         int[] intA1 = {0,2,4,6};
         int[] intA2 = {0,2,4,6};
         int[] intA3 = {10,8,6,4};

         System.out.println(intA1 == intA2); // false
         System.out.println(Arrays.equals(intA1, intA2)); // true
         System.out.println(Arrays.equals(intA1, intA3)); // false
    }
}
