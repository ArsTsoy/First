package com.company.home_works.file.task2;

public class Line {

    private String lineText;

    public Line(String lineText) {
        this.lineText = lineText;
    }

    public String getLineText() {
        return lineText;
    }

    public void setLineText(String lineText) {
        this.lineText = lineText;
    }

    public int getSymbolAmount() {
        return lineText.length();
    }

    public int getWordsAmount() {
        String[] words = lineText.split(" ");
        return words.length;
    }
}
