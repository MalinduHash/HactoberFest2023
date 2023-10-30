public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5,34,1,6,2,4 };

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ",");
        }

    }
}


//arr.length-i means that when i=0 and the end of the inner loop is reached,the largest element is at the end of the array(in the correct position)
//so when i=1 in the next iteration we don't need to compare adjacent elements till the end of the array since the element at the last is already sorted.
