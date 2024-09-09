package W13;

public class W13_01_introArray {

    //ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
    public static void main(String[] args) {
        String[] color = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alphabets = {'A', 'E', 'I', 'O', 'U'};
        //แสดงผลลัพท์โดยใช้ index ของ Array
        System.out.println(" The first color is " + color[0]);
        System.out.println(" The Third alphabets is " + alphabets[2]);

        //แสดงผลลัพท์โดยใช้ Loop
        System.out.println("Color in the Array are :");
        for (int i = 0; i < 7; i++) {
            System.out.print(color[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
        for (int i = 6; i > 0; i--) {
            System.out.print(color[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
        for (int i = 0; i < banks.length; i++) {
            System.out.print(banks[i] + " ");
        }

    }

}
