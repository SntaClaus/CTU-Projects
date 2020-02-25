package com.bklindt;

public class Main {
    private String text;

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public Main(String text){
        //
        setText(text);
    }

    public static void main(String[] args) {
        // write your code here
        String test = "hallo";
        var obj = new Main(test);
        System.out.println(obj.getText());
    }
}