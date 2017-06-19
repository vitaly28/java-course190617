package ru.job4j.max;

public class Max{
    public int max(int first, int second){
        int result;
        if(first > second){result = first;}
        else result = second;
        return result;
    }
}