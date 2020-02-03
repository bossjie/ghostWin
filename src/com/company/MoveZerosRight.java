package com.company;

public class MoveZerosRight {

    public static void main(String[] args) {
        MoveZerosRight t = new MoveZerosRight();
        int[] array ={};//{0,1,0,3,12};//{0,1,0,0,3,12};;//{0,1,0,3,12};

       // t.move(array);
        t.move2(array);

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

    }
    //把非0元素往前赋值,遍历给非零赋值, 一遍后, index及index后的值都设为0    只需一个指针变量insertPos即可
    public void move2(int[] nums){
        if(nums==null || nums.length==0) return;

        int insertPos = 0;
        for (int num : nums) {
            if(num!=0){
               nums[insertPos++] = num;
            }
        }
        while(insertPos<nums.length){
            nums[insertPos++] = 0;
        }
    }
    //可忽略
    //利用两个变量来记录两种数据的位置, 专注非0, 和0的位置去对调
    //不必担心漏掉中间连续0,因为只要确保后面的非零元素都和前面的0元素交换位置就可以了 中间连续0会往后爬
    public void move(int[] nums){
        int firstZeroIndex = 0;//记录最前面的0的位置以供swap
        for (int i : nums) {  //i用于记录非0位置,与j做交换
            if(nums[i]!=0){//专注非0, 和0的位置去对调
                if(i!=firstZeroIndex){ //两重作用: 1. 相同位置不必操作  2.针对无0的数组,起到保护作用(i和j保持了相同步调,所以一直不会进来)
                    nums[firstZeroIndex]=nums[i];
                    nums[i]=0; //这里没有用临时变量做交换==>省空间
                }
                firstZeroIndex++;
            }
        }
    }


}
