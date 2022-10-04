package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 5, 6, 8, 4};
        System.out.println(uniques(a));
    }

    static boolean uniques(int[] numbers)
    {
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] == numbers[j])
                    return false;
        return true;
    }
}
