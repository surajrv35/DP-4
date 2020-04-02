// Recursion
// T=O(2^N) S=O(N)
// class Solution {
//     public int fib(int N) {
//         if (N == 0 || N == 1)
//             return N;
        
//         return fib(N-1)+fib(N-2);
//     }
// }

// Dynamic Programming 
// T=O(N) S=O(N)
class Solution {
    public int fib(int N) {
        if (N<=1)
            return N;
        
        int[] f=new int[N+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=N;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        return f[N];
    }
}
