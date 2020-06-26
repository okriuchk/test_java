package com.oks;

public class Audio extends Media implements Play {
    String song = "California";
    String performer = "RHCP";
    String format;

    public Audio() { format = "MP3"; }
    public void getFormat(String Format){
        System.out.println(this.format); }

    public void play() {
         System.out.printf("Radio: Now the song '%s' from '%s' is playing in format %s\n", song, performer, format);
    }
}

