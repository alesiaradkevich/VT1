package by.bsuir.wt.lab1;

import by.bsuir.wt.lab1.tasks.Tasks;
public class Main {
    public static void main (String args[]){
        Tasks tasks = new Tasks();
        tasks.executeTask1(2, 3);
        tasks.executeTask2(3, 7);
        tasks.executeTask3(-6, 19.44, 0.54);
        int[] arr = new int[] {23, 7, 89, 99, 76, 34, 68};
        tasks.executeTask4(arr);
        arr = new int[] {89, 24, 9, 78, 89, 2, 3, 99, 567};
        tasks.executeTask5(arr);
        arr = new int[] {5, 24, 9, 78, 6, 2, 99};
        tasks.executeTask6(arr);
        double[] arrD = new double[] {1.3, 3.2, -0.67, 98.3, 4.3, 0.798, 1.33};
        tasks.executeTask7(arrD);
        double[] arrA = new double[] {1.3, 3.2, 77.5, 98.3, 444.3, 670.798};
        double[] arrB = new double[] {1.9, 4.2, 6.4, 56.999, 65, 79.90};
        tasks.executeTask8(arrA, arrB);
    }
}
