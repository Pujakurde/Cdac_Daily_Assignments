package sorting;

import java.util.Arrays;

public class MergeSort {
	private static void mergeSort(int[] arr,int left,int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid +1,right);
			mergeArray(arr,left,mid,right);
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,2,3,9,8,0,1};
        int left=0;
        int right=arr.length-1;
        mergeSort(arr,left,right);
        System.out.println(Arrays.toString(arr));

		

	}
	private static void mergeArray(int arr[], int left,int mid,int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        
        //int[] mergedArray = new int[n1 + n2];

        
        for(int i=0;i<n1;i++) {
        		arr1[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++) {
    			arr2[j]=arr[mid+1+j];
        }
        int i = 0;
        int j=0;
        int k=left;
        while(i<n1&& j<n2) {
        		if(arr1[i]<arr2[j]) {
        			arr[k++]=arr1[i++];
        		}
        		else {
        			arr[k++]=arr2[j++];
        		}

        }
        //copy remaining from 1st array
        while(i<n1) {
        		arr[k++]=arr1[i++];
        }
        while(j<n2) {
    			arr[k++]=arr2[j++];
        }

        //return arr;
    }

	

}
