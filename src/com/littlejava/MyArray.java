package com.littlejava;

public class MyArray {
    private int[] ary = new int[20];
    private int length = 0;
    private int index = 0;

    public void add(int x) {
        ary[index++] = x;
        length++;
    }

    public void sort() {
        for (int i = 0; i < length; i++) {
            boolean tag = false;
            for (int j = 0; j < length - i - 1; j++) {
                int temp;
                if (ary[j] > ary[j + 1]) {
                    temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                    tag = true;
                }
            }
            if (!tag) {
                break;
            }
        }
    }

    public int max() {
        int maxnum = ary[0];
        for (int i = 1; i < length; i++) {
            if (ary[i] > maxnum) {
                maxnum = ary[i];
            }
        }
        return maxnum;
    }

    public int[] output() {
        int[] ary2return = new int[length];
        for (int i = 0; i < length; i++) {
            ary2return[i] = ary[i];
        }
        return ary2return;
    }

    public int length() {
        return length;
    }
}