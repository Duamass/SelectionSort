package com.dumas;

import java.util.Arrays;
//算法每一轮选出最小值，再交换到左侧的时间复杂度是o(n),一共迭代n-1轮，所以总的时间复杂度是o(n^2)
//至于空间复杂度，由于算法所做的是原地排序，并没有利用到额外的数据结构，所以排序的空间复杂度是o(1)
//选择排序有着交换次数更少的优点，但是不能完全取代冒泡排序，因为它存在一个明显的问题：不稳定性。
// 即当数列包含多个值相等的元素时，选择排序有可能打乱它们的原有顺序。

public class SelectionSort {
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                minIndex = array[minIndex] < array[j] ? minIndex : j;
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,2,1,5,6,7,8,30,50,1,33,24,5,-4,7,0};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
