public class intruder {
    public static void main(String []args) {
        int w=Integer.parseInt(args[0]);
        double p=Double.parseDouble(args[1]);
        // int w=20;
        // double p=0.5;
        int count=0;
        int [][] boundary = new int[w][1000];
        int m=0,n=500;
        while(1>0)
        {
            if(count%10==0)
            {
                Border.bo(boundary,w,p);
                if(boundary[m+1][n-1]==0)
                {
                    m=m+1;
                    n=n-1;
                }
                else if(boundary[m+1][n]==0)
                {
                    m=m+1;
                }
                else if(boundary[m+1][n+1]==0)
                {
                    m=m+1;
                    n=n+1;
                }
                if(m==w-1)
                {
                    System.out.println(count);
                    break;
                }
            }
            count++;
        }
}}
