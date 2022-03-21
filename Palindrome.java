
class Solution
{
	public:
		string is_palindrome(int n)
		{
		    int temp = n;
		    int rev = 0;
		    while(n!=0){
		        int ld = n%10;
		        rev = (rev*10)+ld;
		        n=n/10;
		    }
		    if(temp==rev)
		    {
		        return "Yes";
		    }
		    else
		    {
		        return "No";
		    }
		}
};
