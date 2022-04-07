package com.clancy.Test.algorithm;

import java.util.Objects;

/**
 * The beauty of Java programming
 *
 * @Auther: clancy
 * @Date: 2022/04/06  14:13
 * @Name: BaseSort
 * @Version: v1.0
 * @Description:
 */
public class BaseSort {

    public static void main(String[] args) {
        int[] arr = genRandomArray(20,100);
        insertSort(arr);
        printResult(arr);

    }

    /**
     * @Description: 选择排序
     * @MethodName: selectSort
     * @Param: [arr]
     * @return: void
     * @Author: clancy
     * @DateTime: 2022/4/6 14:15
     */
    public static void selectSort(int[] arr) {
        if (Objects.isNull(arr) || arr.length < 2) return;
        int N = arr.length;
        int index = 0;
        while (index < N - 1) {
            int small_index = index;
            for (int i = index; i < N; i++) {
                if (arr[small_index] > arr[i]) small_index = i;
            }
            swap(arr, index, small_index);
            index++;
        }
    }

    /**
     * @Description: 冒泡排序
     * @MethodName: bubbling
     * @Param: [arr]
     * @return: void
     * @Author: clancy
     * @DateTime: 2022/4/6 15:06
     */
    public static void bubbling(int[] arr) {
        if (Objects.isNull(arr) || arr.length < 2) return;
        int N = arr.length;
        int index = N;
        while (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
            }
            index--;
        }
    }

    /**
     * @Description: 插入排序（减少遍历次数）
     * @MethodName: insertSort
     * @Param: [arr]
     * @return: void
     * @Author: clancy
     * @DateTime: 2022/4/6 15:22
     */
    public static void insertSort(int[] arr) {
        if (Objects.isNull(arr) || arr.length < 2) return;
        int N = arr.length;
        int runTimes = 0;
        for (int end = 1; end < N; end++) {
            for (int i = end - 1; i >= 0; i--) {
                boolean flag = false;
                runTimes++;
                if (arr[i] > arr[i + 1]) {
                    flag = swap(arr, i, i + 1);
                }
                if (!flag) break;
            }
        }
        System.out.println("遍历了：" + runTimes + "次");
    }


    /*
    交换
     */
    private static boolean swap(int[] arr, int x, int y) {
        if (x != y) {
            arr[x] = arr[x] ^ arr[y];
            arr[y] = arr[x] ^ arr[y];
            arr[x] = arr[x] ^ arr[y];
        } else {
            int temp = arr[y];
            arr[y] = arr[x];
            arr[x] = temp;
        }
        return true;
    }

    /*
    输出结果
     */
    private static void printResult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
    随机生成整型数组
     */
    private static int[] genRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) (Math.random() * maxSize)+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue + 1) - (int) Math.random() * maxValue;
        }
        return arr;
    }
}
