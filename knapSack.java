// Recursion
// T=O(2^N) S=O(N)
class knapSack {
    static int knapSack(int W, int wt[], int val[], int n)
    {
       if (n == 0 || W == 0)
           return 0;
        
        if (wt[n-1] > W)
            return knapSack(W, wt, val, n-1);
        else 
            return Math.max(knapSack(W, wt, val, n-1), val[n-1]+knapSack(W-wt[n-1], wt, val, n-1));
    }
    
    public static void main(String args[]) 
   { 
    int val[] = new int[]{60, 100, 120}; 
    int wt[] = new int[]{10, 20, 30}; 
    int  W = 50; 
    int n = val.length; 
    System.out.println(knapSack(W, wt, val, n)); 
    } 
}

// Dynamic Programming
// T=O(N*W) S=O(N*W)

class knapSack {
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int K[][]= new int[n+1][W+1];
        
        for (int i=0;i<=n;i++)
        {
            for(int w=0;w<=W;w++)
            {
                if (w==0 || i==0)
                    K[i][w]=0;
                else if (wt[i-1] > w)
                    K[i][w]=K[i-1][w];
                else
                    K[i][w]=Math.max(K[i-1][w], val[i-1]+K[i-1][w-wt[i-1]]);
                    
            }
        }
        return K[n][W];
    }
    public static void main(String args[]) 
   { 
    int val[] = new int[]{60, 100, 120}; 
    int wt[] = new int[]{10, 20, 30}; 
    int  W = 50; 
    int n = val.length; 
    System.out.println(knapSack(W, wt, val, n)); 
    } 
}
