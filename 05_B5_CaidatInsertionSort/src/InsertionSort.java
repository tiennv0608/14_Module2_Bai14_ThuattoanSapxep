public class InsertionSort {

    static void insertionSort(int[] array) {
        int position, value;
        for (int i = 1; i < array.length; i++) {
            value = array[i];
            position = i;

            while (position > 0 && value < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = value;
        }
    }

    static void display(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {12, 6, 3, 19, 5, 2, 1, 14};
        System.out.println("Before sorting");
        display(list);
        insertionSort(list);
        System.out.println("After sorting");
        display(list);
    }
}
