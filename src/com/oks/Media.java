package com.oks;

class Media extends AbstractPost{

    @Override
    public int maxSize(int size) {
        return size;
    }

    String settings;
    public void checkSettings(){
        System.out.println("Settings are checked");
    }

    public void setSettings(String settings){
        this.settings = settings;
        System.out.println("Settings are updated");

    }
}
