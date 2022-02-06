package com.mxb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            String[] nums = scanner.nextLine().split((" "));
            int sum = 0;
            for (int i = 0;i < nums.length;i++)
            {
                sum += Integer.parseInt(nums[i]);
            }
            System.out.println(sum);
        }
    }
}
