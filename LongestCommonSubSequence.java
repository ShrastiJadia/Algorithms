package Questions;


import java.util.Scanner;
//LENGTH OF LCS
public class LongestCommonSubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        int m=str1.length();
        int n=str2.length();
        int[][] dp = new int[m+ 1][n+ 1];

        // Filling DP table
   
     
        for (int i =1; i<= m; i++) {
            for (int j =  1; j <=n; j++) {
            	
                if (str1.charAt(i-1) == str2.charAt(j-1)) 
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else 
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
              //  System.out.print(dp[i][j]);
               // count=count+1;
            }
            System.out.print(" ");
          //  System.out.println(count);
        }

        System.out.println("Length of Longest Common Subsequence: " + dp[m][n]);
    StringBuilder sb=new StringBuilder();
        int i=str1.length();
        int j=str2.length();
         while(i>0 && j>0)
         {
       	 if(str1.charAt(i-1)==str2.charAt(j-1))
       	 {
        		 sb.append(str1.charAt(i-1));
        		 i--;
        		 j--;
        	 }
        	 else if(dp[i-1][j]>dp[i][j-1])
        	 {
        		 i--;
        	 }
        	 else {
        		 j--;
        	 }
         }
         System.out.println(sb.reverse().toString());
    }
}
