package debug;

public class debug_demo1 {
	public static int add(int a, int b)
	{
		System.out.println("called stmt add");
		return a+b;
	}
	
	public static int sub(int c, int d)
	{
		System.out.println("called stmt sub");
		return c-d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		int res1=add(10,20);
		int res2=sub(30,30);
		System.out.println("add result :"+res1);
		System.out.println("sub result :"+res2);
		System.out.println("main ends");
		
	}

}
