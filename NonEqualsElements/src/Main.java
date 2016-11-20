/**
 * Created by Dyvak on 20.11.2016.
 */

public class Main {
    public static void main(String[] args) {
        /* Input data */
        int[] array1 = {0, 2, 4, 6, 0, 5};
        int[] array2 = {21, 41, 1, 2, 4};

        /* Initialize Util class */
        Util arrUtil = new Util();

        /* Show result of our operation */
        System.out.println(arrUtil.findSortedNonEquals(array1, array2));
    }
}

