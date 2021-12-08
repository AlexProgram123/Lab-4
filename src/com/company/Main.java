package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int numberChar = 0;
        String file="nothing";

        try(FileInputStream fin=new FileInputStream("C://Project//notes.txt"))
        {
            int i=-1;
            while((i=fin.read())!=-1){
                count = count+1;
            }
        }
        catch(IOException ex){
        }

        try(FileInputStream fin=new FileInputStream("C://Project//notes.txt"))
        {
            int i=-1;
            char [] fileChar =new char [count];
            while((i=fin.read())!=-1){
                fileChar [numberChar] = (char)i;
                numberChar = numberChar+1;
            }
            file = new String(fileChar);
        }
        catch(IOException ex){
        }



        String [] numbers =new String [3];
        int i = 0;
        int a = 0;
        int b = 0;
        double c = 0;

        Pattern p = Pattern.compile("\\+|/|-|\\*|\\d+");
        Matcher m = p.matcher(file);

        while (m.find()) {
            numbers [i] = m.group();
            i = i + 1;
            }
        a= Integer.parseInt (numbers [0]);
        b= Integer.parseInt (numbers [2]);

        if (numbers [1].equals("-")){
            c = a - b;
        }
        if (numbers [1].equals("+")){
            c = a + b;
        }
        if (numbers [1].equals("/")){
            double aa = a;
            double bb = b;
            c = aa / bb;

        }
        if (numbers [1].equals("*")){
            c = a * b;
        }
        System.out.println(numbers [0] + numbers [1] + numbers [2] + "=" +c);
    }
}



