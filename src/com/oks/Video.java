package com.oks;

public class Video extends Media implements Play {
    String name = "Baikal";
    String nickname = "@OKSS";
    String resolutionScreen;

    public Video (){resolutionScreen = "1280×720";};

    public void getResolutionScreen(String resolutionScreen){
        System.out.println(this.resolutionScreen); }

    public void play ( ) {
        System.out.printf("YouTube: The video about %s was published by user %s; resolution screen is %s\n\n", name, nickname, resolutionScreen );
    }
}
