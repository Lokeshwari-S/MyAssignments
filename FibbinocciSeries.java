package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0,secNum=1,sum=0,i,count=11;
		System.out.println(firstNum+" "+secNum);
		for(i=0;i<count;i++)
		{
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
		}
		
	}

}
