package com.oks;

public class Picture extends Media implements Print{
    int width = 100;
    int height = 100;
    public static int calcSizePX(int width ,int height) {
        return width * height;
    }

    @Override
    public void print_out() {
        System.out.printf("Image: The quality of this image = %s px\n" , width * height);
    }
}

