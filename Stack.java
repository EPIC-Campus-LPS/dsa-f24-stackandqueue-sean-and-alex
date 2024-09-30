public class Stack {
    private int[] arr;

    /**
     * creating a new array with a length of zero runtime:1
     */
    public Stack () {
        arr = new int[0];
    }

    /**
     * adds an element to the top of the stack runtime:n
     * @param element the element being added to the array
     */
    public void push (int element){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }

    /**
     * prints the element on the top of the stack then removes it runtime:n
     * @return returns the number removed from the array or returns nothing if the length of the array is 0
     */
    public int pop (){
        System.out.println(arr[arr.length-1]);
        int[] newArr;
        if (arr.length > 0) {
            newArr = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i ++){
                newArr[i] = arr[i];
            }
        }
        else {
            return(-1);
        }
        int temp = arr[arr.length - 1];
        arr = newArr;
        return temp;
    }

    /**
     * Prints the top element on the stack runtime:1
     * @return returns the top element on the stack unless there is nothing in the array then it will return nothing
     */
    public int peek (){
        if (arr.length > 0){
            System.out.println(arr[arr.length-1]);
            return (arr[arr.length-1]);
        }
        else{
            return(-1);
        }
    }

    /**
     * prints the amount of elements in the array runtime:1
     * @return returns the amount of elements in the array
     */
    public int size (){
        System.out.println(arr.length);
        return (arr.length);
    }

    /**
     * prints true if there are no elements in the array and prints false if there are runtime:1
     * @return returns true if there are no elements in the list and false if there are elements
     */
    public boolean isEmpty (){
        if (arr.length == 0){
            System.out.println("Empty? true");
            return (true);
        }
        else {
            System.out.println("Empty? false");
            return false;
        }
    }
    //What is the fundamental principle behind a stack?
    //The last element added is the next element to be removed
    //In what situations would using a stack be beneficial?
    //When you are trying to make something like an undo button where you only want to affect the most recent thing
}
