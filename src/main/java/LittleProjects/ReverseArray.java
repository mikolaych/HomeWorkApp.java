package LittleProjects;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] array2 = new int[array.length];

        int j = array.length -1;
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[j];
            j--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
        //напишите тут ваш код
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
