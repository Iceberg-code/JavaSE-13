package cn.itcast.day13.demo01;
/*
* 异常的产生过程解析（分析异常是怎么产生的，如何处理异常）
* */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 0);
//        int e = getElement(arr, 3); //ArrayIndexOutOfBoundsException - 数组索引越界异常
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }
}