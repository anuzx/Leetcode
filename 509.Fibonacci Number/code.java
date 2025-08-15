class Solution {
    public int fib(int n) {
        if (n ==0) return 0;
        if (n ==1) return 1;
        int ans = 1;
        int a =  0;
        int b = 1;
   //     0 -> 0     // go from 0 till 3 to understand the iterative approach
   //     1-> 1
   //     2-> 1 + 0 = 1
   //     3 -> 1 + 1 = 2
   //     4-> 2 +1 = 3 


        for (int i = 2 ; i <= n ; i++  ) {
           ans  = a+ b;  //main ans
           a = b;  //prepraring for next iterarion , you dont need a value in next iteration 
           b =  ans;  //prepraring for next iterarion , old ans is f(n-2) and new ans will be f(n-1)
        }
        return b;
    }
}
