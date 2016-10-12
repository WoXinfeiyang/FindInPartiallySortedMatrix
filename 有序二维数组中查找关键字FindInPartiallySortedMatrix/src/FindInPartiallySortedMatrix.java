import java.util.Scanner;

/*
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题3：二维数组中的查找——有序二维数组中查找关键字FindInPartiallySortedMatrix
 * 时间：2016-8-11 10:46
 * 说明：1、题目：在一个二维数组中每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序
 * 排序。输入一个这样的二维数组和一个整数，判断数组中是否含有该整数。
 * */

public class FindInPartiallySortedMatrix {
	
	public static boolean Find(int [][]matrix,int number){
		boolean found=false;
		int rowLength=matrix.length;
		int coumnLength=matrix[0].length;
		int row=0;
		int column=coumnLength-1;
		while((row<rowLength)&&(column>=0)){
			if(number==matrix[row][column]){
				found=true;
				break;
			}else if(number<matrix[row][column]){
				column--;
			}else{
				row++;
			}
		}
		return found;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int row=in.nextInt();
			int column=in.nextInt();
			int [][]matrix=new int[row][column];
			for(int i=0;i<row;i++){
				for(int j=0;j<column;j++){
					matrix[i][j]=in.nextInt();
				}
			}
			int number=in.nextInt();
			System.out.println(Find(matrix, number));
		}
	}

}
