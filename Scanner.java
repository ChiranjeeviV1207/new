import java.util.Scanner;
class Scanner
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String word,sentence;
		char c;
		System.out.println("enter c");
		c=s.next().charAt(0);//character
		System.out.println("enter word");
		word=s.next();//word
		System.out.println("enter sentence");
		s.nextLine();
		sentence=s.nextLine();//sentence
		System.out.println("enter b value");
		int a=64,b;
		double x=52.6,y;
		System.out.println("enter y value");
		b=s.nextInt();//integer
		y=s.nextDouble();//double
		System.out.println(c+" "+word+" "+sentence+" "+a+" "+b+" "+x+" "+y);
	}
}
		