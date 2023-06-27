import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача  1");
        int[] salaryMounth = generateRandomArray();
        int sum = 0;
        for (int i : salaryMounth) {
            sum += i;
        }
        System.out.println("Сумма равна " + sum);
        System.out.println();


    }

    public static void task2() {
        System.out.println("Задача 2 ");
        int[] salaryMounth = generateRandomArray();
        int maxSalary = salaryMounth[0];
        int minSalary = -salaryMounth[0];
        for (int i : salaryMounth) {
            if (i < minSalary) {

                minSalary = i;
            }
            if (i < maxSalary) {
                maxSalary = i;
            }
        }
        System.out.println("Миинимум " + minSalary);
        System.out.println("Максимум " + maxSalary);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] salaryMounth = generateRandomArray();
        int sum = 0;
        int dayMounth = 30;
        for (int i : salaryMounth) {
            sum += i;
            sum = sum / dayMounth;

        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);

        }


        }


    }
