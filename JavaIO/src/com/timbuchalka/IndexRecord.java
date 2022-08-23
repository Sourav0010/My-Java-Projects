package com.timbuchalka;

public class IndexRecord {
    private int startByte;
    private int Lingth;

    public IndexRecord(int startByte, int lingth) {
        this.startByte = startByte;
        Lingth = lingth;
    }

    public int getStartByte() {
        return startByte;
    }

    public void setStartByte(int startByte) {
        this.startByte = startByte;
    }

    public int getLingth() {
        return Lingth;
    }

    public void setLingth(int lingth) {
        Lingth = lingth;
    }
}
