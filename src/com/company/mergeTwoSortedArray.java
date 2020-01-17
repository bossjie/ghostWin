package com.company;

import java.util.Arrays;

class mergeTwoSortedArray {
    /*
    *
    * 输入:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6],       n = 3
      输出: [1,2,2,3,5,6]
    *
    * 思路1: nums2的头去compare nums每个位置, 如果较小, nums1元素后移, nums1完毕后, 直接复制nums2到后排位置(e.g. 要比较临界位置此处 2 3的值)
    * 思路2: 直接复制,然后用最快的方式排序
    * */
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 ={2,3,4};
        int n=3;
        new mergeTwoSortedArray().merge(nums1,m,nums2,n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }

    public void mergeS1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1); //快排
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0){
            return;
        }
        if(nums1.length==0){
            nums1 = (int[])nums2.clone();
            return;
        }

        int j = 0;
        for (int i = 0; i < m; i++) {
            if(nums1[i]>nums2[j]){
                moveRight(nums1,i,m+i-1);
                nums1[i] = nums2[j];
                j++;
            }
        }
        //append rest
        if(j<n){
            int cacheJ = j;
            for (int k = m+j; k < m+n; k++) {
                nums1[k] = nums2[j++];
            }
            j = cacheJ;
            if(nums1[m+j]<nums1[m+j-1]){
                int temp = nums1[m+j];
                nums1[m+j] = nums1[m+j-1];
                nums1[m+j-1] = temp;
            }
        }

    }

    public void moveRight(int[] nums,int startPosition,int lastPosition){
        for (int i = lastPosition; i >=startPosition ; i--) {
            nums[i+1] = nums[i];
        }
    }
}
