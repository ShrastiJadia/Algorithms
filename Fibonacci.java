package Questions;


public class Fibonacci 
{
   public static int q1(int n)
   {
	   if(n==0 || n==1)
	   {
		   return n;
	   }
		 
	   return q1(n-1)+q1(n-2);
   }
   public static int q1Memoized(int n,int []qb)
   {
	   if(n==0 || n==1)
	   {
		   return n;
	   }
	   if(qb[n]!=0)
	   {
          return qb[n];
	   }
	   int x=q1Memoized(n-1, qb);
	   int y=q1Memoized(n-2, qb);
	   int sum=x+y;
		 qb[n]=sum;
	   return sum;
   }
   public static void q1tabulation()
   {
	   int n=6;
	   if(n<=0)
	   {
		   System.out.println(n);
	   }
	   int first=0;int sec=1;
	   
	   for(int i=2;i<=n;i++)
	   {
		   int next=first+sec;
		   first=sec;
		   sec=next;
		   
	   }
	   System.out.println(sec);
   }
	public static void main(String[] args) 
	{
	 int n=6;
	 int []arr=new int[n+1];
	 System.out.println(q1(n));
	 System.out.println(q1Memoized(n, arr));
	 q1tabulation();
	}

}
