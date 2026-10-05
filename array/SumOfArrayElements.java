package array;

public class SumOfArrayElements {

    public static int sum(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,1,1,5,1};

        int n = arr.length;

        System.out.println(sum(arr, n));
    }
}