
public class Appendzero {

	// Append 0s if number of digits is less than 3
	public static void main(String[] args) {
		int a[]={100,2,35};
		for(int i=0;i<3;i++)
		{
			int count=0;int zero=0;
			String num=Integer.toString(a[i]);
			for(int j=0;j<num.length();j++)
			{
				count++;
			}
			if(count==1)
			{
				System.out.println("00"+num);
			}
			if(count==2)
			{
				System.out.println("0"+num);
			}
		}
	}
}
