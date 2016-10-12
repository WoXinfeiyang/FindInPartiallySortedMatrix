import java.util.Scanner;

/*
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������3����ά�����еĲ��ҡ��������ά�����в��ҹؼ���FindInPartiallySortedMatrix
 * ʱ�䣺2016-8-11 10:46
 * ˵����1����Ŀ����һ����ά������ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳��
 * ��������һ�������Ķ�ά�����һ���������ж��������Ƿ��и�������
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
