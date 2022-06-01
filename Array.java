public class Array {
    public static void main(String[] args) {
        int[] array = {4, 8, 9, 7, 1};
        int compare = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    compare = array[i];
                    array[i] = array[j];
                    array[j] = compare;
                }
            }
        }
        System.out.println("THE ARRAY ORDER IS");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("THE SECOND LARGEST NUMBER: " + array[3]);
        System.out.println("THE SECOND SMALLEST NUMBER: " + array[1]);
    }
}

