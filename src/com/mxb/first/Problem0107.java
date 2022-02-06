package com.mxb.first;

import java.util.Arrays;
import java.util.Scanner;

public class Problem0107 {
    static void levelOrdor(int[] nums)
    {
        int n = nums.length;
        int cot = 1,index = 0;
        while(n >= cot)
        {
            int[] nodes = new int[cot];
            for(int i = 0;i < cot;i++)
                nodes[i] = nums[index++];
            print(nodes);
            n -= cot;
            cot *= 2;
        }
        if(n > 0)
        {
            int[] nodes = new int[n];
            for(int i = 0;i < n;i++)
                nodes[i] = nums[index++];
            print(nodes);
        }
    }

    static void print(int[] nums)
    {
        Arrays.sort(nums);
        String pri = "";
        for (int i = 0;i < nums.length;)
        {
            pri += nums[i] + " ";
            int temp = nums[i];
            while (i < nums.length && nums[i] == temp) i++;
        }
        pri = pri.substring(0,pri.length() - 1);
        System.out.println(pri);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0)
        {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for(int j = 0;j < n;j++)
                nums[j] = scanner.nextInt();
            levelOrdor(nums);
            T--;
        }
    }
}
