package array2D;

import java.util.Arrays;

public class Transpose {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6}};
		transpose(arr);

	}
	public static void transpose(int[][] matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			 System.out.println("Before: "+Arrays.toString(matrix[i]));
		 }
		/*for(int i=0;i<matrix.length;i++) {
			for(int j=i+1;j<matrix[i].length;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
				
				
			}
			System.out.println();
			
		
		 }*/
		int row=matrix.length;
		int col=matrix[0].length;
		for(int i=0;i<Math.min(row,col);i++) {
			for(int j=i+1;j<Math.min(row,col);j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
				
				
			}
			System.out.println();
			
		
		 }
		for(int i=0;i<matrix.length;i++) {
			 System.out.println("After:"+Arrays.toString(matrix[i]));
		 }
		
		
	}
	

}
