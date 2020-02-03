package com.company;

public class MoveZeros {

    public static void main(String[] args) {
        MoveZeros t = new MoveZeros();
        int[] array ={0,1,0,0,3,12};;//{0,1,0,3,12};

        t.move(array);
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void move(int[] array){
        System.out.println("fuck");
        int zeroCount=0;
        int zeroIndex;
        int nextZeroIndex=0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0) {
                zeroCount++;
                if (zeroCount == 1) nextZeroIndex = i;
            }
        }
        for (int j = 0; j < zeroCount; j++) {
            zeroIndex = nextZeroIndex;
            for (int q = zeroIndex; q < array.length-1; q++) {
                if(array[q]==0){
                    if(array[q+1]!=0){
                        //swap
                        temp = array[q];
                        array[q] = array[q+1];
                        array[q+1] = temp;
                    }else{
                        nextZeroIndex=q;
                    }
                }
            }
        }
    }

}
