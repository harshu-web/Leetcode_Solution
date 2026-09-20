class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int L=0;
        int R=n-1;
        int maxArea=0;
        while(L<R){
            int max;
            if(height[L]<height[R]){
                max=height[L]*(R-L);
                L++;
            }
            else{
                max=height[R]*(R-L);
                R--;
            }
            if(max>maxArea){
                maxArea=max;
            }
        }
        return maxArea;
    }
}