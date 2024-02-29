public class Search {
    public static boolean linearSearch(int item, int[] list) {
        for (var num : list) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int item, int[] sortedList) {
        return binarySearchHelper(item, 0, sortedList.length - 1, sortedList);
    }

    private static boolean binarySearchHelper(int item, int left, int right, int[] list) {
        int currentIdx = left + (right - 1) / 2;

        if (right < 1) {
            return false;
        }

        if (list[currentIdx] == item) {
            return true;
        } else if (list[currentIdx] > item) {
            return binarySearchHelper(item, left, currentIdx - 1, list);
        } else {
            return binarySearchHelper(item, currentIdx + 1, right, list);
        }
    }
}
