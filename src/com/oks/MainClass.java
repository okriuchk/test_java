package com.oks;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {

        TextPost t = new TextPost();
        t.author = "Иван";
        t.date = new Date();
        t.message = "Привет!";
        t.type_message = AbstractPost.Type.post;
        t.print_out();

        Picture p = new Picture();
        p.author = "Sidorov";
        p.date = new Date();
        p.message = "LOKOMOTIV";
        p.type_message = AbstractPost.Type.repost;
        p.print_out();

        Audio a = new Audio();
        a.author = "RHCP";
        a.date = new Date();
        a.message = "Californication";
        a.type_message = AbstractPost.Type.comment;
        a.play();

        Video v = new Video();
        v.author = "user @OKSSS";
        v.date = new Date();
        v.message = "Baikal";
        v.type_message = AbstractPost.Type.post;
        v.play();

        AbstractPost[] array = new AbstractPost[4];
        array[0] = t;
        array[1] = p;
        array[2] = a;
        array[3] = v;

        for (AbstractPost element : array)
            element.printContent();
    }
}







