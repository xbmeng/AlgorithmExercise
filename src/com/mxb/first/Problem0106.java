package com.mxb.first;

import java.util.Scanner;

public class Problem0106 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0)
        {
            long sum = 0;
            long P = scanner.nextLong();
            long cot = 0;
            //long i = 1;
            while (sum <= P)
            {
                cot++;
                sum += (cot * cot);
//                cot++;
            }
            System.out.println(cot-1);
            n--;
        }
    }
}
