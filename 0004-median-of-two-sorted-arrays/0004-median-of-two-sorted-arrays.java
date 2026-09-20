class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int p=m+n;
        int[] temp=new int[p];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]>nums2[j]){
                temp[k]=nums2[j];
                k++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                k++;
                i++;
            }
            else{
                temp[k]=nums1[i];
                k++;
                i++;
                temp[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            temp[k]=nums1[i];
            k++;
            i++;
        }
        while(j<m){
            temp[k]=nums2[j];
            k++;
            j++;
        }
        int mid=p/2;
        if(p%2!=0){
            return temp[mid];
        }
        else{
            return (temp[mid-1]+temp[mid])/2.0;
        }
    }
}