class Solution {
    static long reverse(long temp)
    {
        long rev=0, ld;
        while(temp!=0)
        {
            ld = temp %10;
            rev = (rev*10)+ld;
            temp= temp/10;
        }
        return rev;
    }
    static boolean isPalindrome(long temp)
    {
        if(temp==reverse(temp))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static long isSumPalindrome(long n){
        // code here
        long temp = n;
        for(long i=0;i<5;i++){
        if(isPalindrome(temp))
        {
            return temp;
        }
        else
        {
            temp+=reverse(temp);
            if(isPalindrome(temp))
            {
                return temp;
            }
        }
        
    }
    return -1; //after for loop 
    }
}
