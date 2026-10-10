package sorting;

public class MergeArrays {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {1,2,2,3,5,6};

        int[] mergedArray = mergeArray(arr1, arr2);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeArray(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1 + n2];

        int i = 0;
        int j=0;
        int k=0;
        while(i<n1&& j<n2) {
        		if(arr1[i]<arr2[j]) {
        			mergedArray[k++]=arr1[i++];
        		}
        		else {
        			mergedArray[k++]=arr2[j++];
        		}

        }
        //copy remaining from 1st array
        while(i<n1) {
        		mergedArray[k++]=arr1[i++];
        }
        while(j<n2) {
    			mergedArray[k++]=arr2[j++];
        }

        return mergedArray;
    }
}