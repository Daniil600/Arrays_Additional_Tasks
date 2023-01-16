import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();
        System.out.println();

        task6();

    }

    public static void task1() {
        System.out.println("Задача #1");

        int[] array = new int[12];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Всего чётных чисел " + result);
    }

    public static void task2() {
        System.out.println("Задача #2");

        int count = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
                count++;
            }
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.println();
        System.out.println("Всего нечетных чисел " + count);
    }

    public static void task3(){
        System.out.println("Задача #3");
        int arrayFirst[] = new int[5];
        int arraySecond[] = new int[5];
        int sumFirst = 0;
        int sumSecond = 0;
        int avgFirst = 0;
        int avgSecond = 0;

        for (int i = 0; i < arrayFirst.length; i++){
            arrayFirst[i] = (int)(Math.random()*5);
            System.out.print(arrayFirst[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arraySecond.length; i++){
            arraySecond[i] = (int)(Math.random()*5);
            System.out.print(arraySecond[i] + " ");
        }
        for (int i = 0; i < arrayFirst.length; i++){
            sumFirst += arrayFirst[i];
            sumSecond += arraySecond[i];
        }
        avgFirst = sumFirst / arrayFirst.length;
        avgSecond = sumSecond / arraySecond.length;

        System.out.println();

        if (avgFirst > avgSecond){
            System.out.println("Среднее арифметическое число у первого массива больше");
        } if(avgFirst < avgSecond){
            System.out.println("Среднее арифметическое число у второго массива больше");
        }else{
            System.out.println("Они равны");
        }
    }
    public static void task4(){
        System.out.println("Задача #4");
        int[] array = new int[4];
        for (int i = 0; i < array.length;i++){
            array[i] = ((int)(Math.random() * 89)+10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= 0; i++){
            if(array[i] < array[i + 1] && array[i + 1] < array[i + 2] && array[i + 2] < array[i + 3]){
                System.out.println("Строго возрастающая последовательность");
            }else{
                System.out.println("Последовательность не возрастающая");
            }
        }
    }
    public static void task5(){
        System.out.println("Задача #5");
        int[] fiboArray = new int[20];
        int num = 1;
        for (int i = 1; i < fiboArray.length; i++){
            fiboArray[i] = num;
            num += fiboArray[i - 1];
        }
        for(int i = 0; i < fiboArray.length; i++){
            System.out.print(fiboArray[i] + " ");
        }
    }
    public static void task6() {
        int[] nums = new int[10];

        // 1 sequence
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * (i + 1);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 0);

        // 2 sequence
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * (i + 1);
            if (i % 2 != 0) {
                nums[i] = -nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 0);

        // 3 sequence
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = -nums[i - 1];
        }
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums, 0);

        // 4 sequence
        int counter = 1;
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = counter++;
        }
        System.out.println(Arrays.toString(nums));
    }
}




