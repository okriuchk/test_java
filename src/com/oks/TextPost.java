package com.oks;

import java.io.UnsupportedEncodingException;

public class TextPost extends AbstractPost implements Print {
    String text = "hello";

    public void SizeByte() { //преобразование строки в байтовое значение
        byte[] utf8 = null;
        int byteCount = 0;
        try {
            utf8 = text.getBytes("UTF-8");
            byteCount = utf8.length;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        System.out.printf("Byte Count: %d\n", byteCount); // вывод в Byte
    }

    @Override
    public int maxSize(int size) {
        return size;
    }

    @Override
    public void print_out() {
        System.out.printf("Chat: The message from Alex is '%s'\n", text);
    }
}
