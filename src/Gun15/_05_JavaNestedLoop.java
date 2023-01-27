package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        //asagdaki goruntuyu veren programi yaziniz (yalnizca 1 yildiz ile yapiniz)
        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*

        int i = 0;
        for (int j = 1; j <=5; j++) {
            for (i = 0; i < j; i++) {
                System.out.print("*");}
            System.out.println();}

        for (int j = 5; j >0; j--) {
            for (i = 0; i < j; i++) {
                System.out.print("*");}
            System.out.println();}
    }
}
