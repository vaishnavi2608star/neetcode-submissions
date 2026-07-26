class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int temp[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }else{
                temp[k++]=nums2[j];
                j++;
            }
           
        }
        while(i<n){
            temp[k++]=nums1[i];
            i++;
        }
        while(j<m){
            temp[k++]=nums2[j];
            j++;
        }
        int l=temp.length;
        if(l%2 != 0){
            return (double)temp[l/2];
        }else{
            return (double)(temp[l/2-1] + temp[l/2])/2;
        }
    }
}