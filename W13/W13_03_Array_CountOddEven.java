package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        //ให้นับเลขคู่เลขคี่ใน Array ด้านล่าง
        int[] numbers = {1, 5, 8, 13, 17, 21, 25, 34, 46, 52, 65, 70, 73, 78};

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                countEven++;

            } else {
                countOdd++;
            }

        }
        System.out.println("\n Amount of all Number :" + numbers.length);
        System.out.println("\n Amount of Odd number :" + countOdd);
        System.out.println("\n Amount of Even number :" + countEven);
    }
}
