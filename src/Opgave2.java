public class Opgave2 {

    public int returnSmallest(int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }

    public int returnLargest(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public int returnSmallestOf3(int x, int y, int v) {
        if (x < y && x < v)
            return x;
        else if (y < x && y < v)
            return y;
        else
            return v;
    }

    public int returnLargestOf3(int x, int y, int v) {
        if (x > y && x > v)
            return x;
        else if (y > x && y > v)
            return y;
        else
            return v;
    }

    public int returnSmallestInArray(int[] array, int antal) {
        int min = array[0];

        for (int i = 0; i < antal; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public int returnLargestInArray(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public int returnSumOfArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int returnAverageOfArray(int[] array) {
        int sum = 0;
        int numberCount = array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/numberCount;
    }
}
