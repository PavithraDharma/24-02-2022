
public class CharToString {
	//Converting character to string
	public static void main(String[] args) {
		//Method 1
		char ch[]={'E','d','u','b','r','i','d','g','e'};
		String str=new String(ch);
		System.out.println(str); 

		//Method 2
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			str1+=ch[i];
		}
		System.out.println(str1);
	}
}
