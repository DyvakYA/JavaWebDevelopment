import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class for finding different numbers in two arrays.
 * algorithm with sorting arrays
 */
public class Util {

    /**
     * Find symmetric difference with using sorting
     *
     * @param array1 first array;
     * @param array2 second array;
     * @return array with difference of
     * array1 and array2;
     */
    public List<Integer> findSortedNonEquals(int[] array1, int[] array2) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(array1);
        Arrays.sort(array2);

        int first = 0;
        int second = 0;

        while ((first < array1.length) && (second < array2.length)) {
            while (second < array2.length - 1 && array2[second] == array2[second + 1]) {
                second++;
            }
            while (first < array1.length - 1 && array1[first] == array1[first + 1]) {
                first++;
            }
            if ((array1[first] != array2[second])) {
                res.add(array1[first++]);
                res.add(array2[second++]);
            } else {
                first++;
                second++;
            }

            if (first >= array1.length) {
                while (second < array2.length) {
                    res.add(array2[second++]);
                }
            } else if (second >= array2.length) {
                while (first < array1.length) {
                    res.add(array1[first++]);
                }
            }

        }
        return res;
    }
}
