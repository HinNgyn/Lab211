package Common;
public class Algorithm {

    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public int partition(int[] array, int left, int right) {
        int i = left, j = right;
        int pivot = array[(left + right) / 2];
        //Create a temp variable
        int tmp;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                //Execute swap between value of index [i] and value of index [j]
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        };
        return i;
    }

    public void quickSort(int[] array, int left, int right) {
        //Search index of array - vách ngăn
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // target not found
    }
    
        public int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                return i;
            }
        }
        return -1;
    }
    
}