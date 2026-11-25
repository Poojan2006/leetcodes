class Solution {
    public int fib(int n) {
         return fibo(n);
    }
    public int fibo(int a)
        {   if(a==1)
                return 1;
            if(a==0)
                return 0;
            return fibo(a-1)+fibo(a-2);
        }
}