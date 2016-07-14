public class Numbers {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Enter integer value");
		} 
		else
		{
		 int num=Integer.parseInt(args[0]);
		 if(num%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		}
		

	}

}
