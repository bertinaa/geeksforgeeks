
class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        // Code 
        double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) );
        d = Math.round(d);
        return (int)d;
    }
}
