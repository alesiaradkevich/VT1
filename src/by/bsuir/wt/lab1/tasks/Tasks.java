package by.bsuir.wt.lab1.tasks;

public class Tasks {
    public void executeTask1(double x, double y) {
        System.out.println("TASK1");
        double z = (1.0D + Math.pow(Math.sin(x + y), 2.0D))
                / (2.0D + Math.abs(x - 2.0D * x / (1.0D + x * x * y * y))) + x;
        System.out.println(z);
    }

    public void executeTask2(double x, double y) {
        System.out.println("TASK2");

        if (y < 0.0D) {
            if (y > -3.0D && Math.abs(x) < 6.0D) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (y < 5.0D && Math.abs(x) < 4.0D) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void executeTask3(double a, double b, double h) {
        System.out.println("TASK3");

        for(double x = a; x < b; x += h) {
            String str = String.format("%.5f", x);
            System.out.print(str);
            System.out.print(" | ");
            str = String.format("%.5f", Math.tan(x));
            System.out.print(str);
            System.out.println(" ");
        }

    }

    public void executeTask4(int[] arr){
        System.out.println("TASK4");

        for (int i = 0; i < arr.length; i++) {
            boolean isSimple = true;

            for (int j = 2; j < Math.round(Math.sqrt(arr[i])) + 1; j++) {
                if (arr[i] % j == 0) {
                    isSimple = false;
                }
            }

            if (isSimple) {
                System.out.println(i + " ");
            }
        }
    }

    public void executeTask5(int[] arr) {
        System.out.println("TASK5");
        boolean isUp;
        int currPos;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            isUp = true;
            currPos = 1;
            for (int j = i + 1; (j < arr.length) && isUp; j++) {
                if (arr[j - 1] < arr[j]) {
                    currPos++;
                } else {
                    isUp = false;
                }
            }
            maxLen = Math.max(maxLen, currPos);
        }
        System.out.println(maxLen);
    }

    public void executeTask6(int[] arr) {
        System.out.println("TASK6");
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[(j+pos) % arr.length] + " ");
            }
            pos++;
            System.out.println();
        }
    }

    public void executeTask7(double[] arr) {
        System.out.println("TASK7");

        int i = 0;
        while (i < arr.length-1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                if (i != 0) {
                    i--;
                }
            }
        }

        for (double x: arr) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public void executeTask8(double[] arrA, double[] arrB) {
        System.out.println("TASK8");

        int posA = 0;
        int posB = 0;
        int index = 0;

        while ((posA < arrA.length) && (posB < arrB.length)) {
            if (arrB[posB] < arrA[posA]) {
                System.out.print(index + " ");
                posB++;
            } else {
                posA++;
                index++;
            }
        }

        while (posB != arrB.length) {
            System.out.print(index + " ");
            posB++;
        }
        System.out.println();
    }
}
