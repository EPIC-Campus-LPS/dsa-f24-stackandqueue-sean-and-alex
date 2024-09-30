public class Queue {
    private int[] arr;

    /**
     * Constructor of the queue object
     * instantiates arr with an empty array
     */
    public Queue () {
        arr = new int[0];
    }

    /**
     * creates a new array that's one greater than the previous
     * adds the contents of the previous array to the end of the new one
     * adds the new number to the beginning of the array
     * sets the old array equal to the new one
     * O(n)
     * @param num the number added to the queue
     */
    public void add(int num) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        newArr[0] = num;
        arr = newArr;
    }

    /**
     * creates a new array
     * checks that there is an element to remove from the array
     * if yes, make new array that is one smaller than the old one
     * add the contents of the old array to the new one, excluding the last element
     * save last element, set old array equal to new one
     * O(n - 1)
     * @return the removed element of the array
     */
    public int remove() {
        int[] newArr;
        if (arr.length > 0) {
            newArr = new int[arr.length - 1];
            for(int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
        } else {
            return -1;
        }
        int temp = arr[arr.length - 1];
        arr = newArr;
        return temp;
    }

    /**
     * checks if there is an element to look at
     * if not, return -1
     * O(1)
     * @return the element at the head of the queue
     */
    public int peek() {
        if (arr.length > 0) {
            return arr[arr.length - 1];
        }
        return -1;
    }

    /**
     * checks the array's length
     * O(1)
     * @return boolean representing if the array is empty or not
     */
    public boolean isEmpty() {
        if (arr.length == 0) {
            return true;
        }
        return false;
    }

    /**
     * O(1)
     * @return the length of the array
     */
    public int size() {
        return arr.length;
    }
}
