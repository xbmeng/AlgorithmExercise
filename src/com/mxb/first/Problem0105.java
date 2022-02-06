package com.mxb.first;

import java.util.Scanner;

public class Problem0105 {
    //计算需要几个油漆工，按照顺序遍历数组累和,如果超过桶容量证明装不下了,桶数量+1,重新换一个新桶
    static int getPainters(int[] data, int bucket) {
        int temp = 0;//当前总量
        int painers = 1;
        for(int i = 0;i < data.length;i++)
        {
            temp += data[i];
            if(temp > bucket)
            {
                temp = data[i];
                painers++;
            }
        }
        return painers;
    }

    public static int binarySearch(int[] data, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            max = Math.max(data[i], max);
        }
        int left = max, right = sum;
        while (left < right) {
            int mid = (left + right) / 2;
            if (getPainters(data, mid) > k)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        while (T > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }
            System.out.println(binarySearch(data, k));
            T--;
        }
    }
}
