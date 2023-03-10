package Gun21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _5_Odev {
    public static void main(String[] args) {
//        1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
//        Bütün 2'leri 6'yla değiştirin.
//        Array'i yazdırınız.
        int[][] arry2d={{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i < arry2d.length; i++) {
            for (int j = 0; j < arry2d[i].length; j++) {
                if (arry2d[i][j] == 2) {
                    arry2d[i][j] = 6;
                }
                System.out.print(arry2d[i][j] + " ");
            }
            System.out.println();
        }



//        2-Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
//        2D array'de olan elemanları toplayınız.
//        toplamı yazdırınız.
//        Sonuç 32 olmalıdır.
        int[][] arry012d={{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam=0;
        for (int i = 0; i < arry012d.length; i++) {
            for (int j = 0; j < arry012d[i].length; j++) {
                toplam+=arry012d[i][j];
            }
        }
        System.out.println("toplam = " + toplam);





//        3-Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
//        [{"new jersey","atlanta","ohio"} ,
//        {"Pittsburgh" ,"ohio","new york","ohio"} ,
//        {"ohio","new york"}]
//        Bütün ohio'ları Florida'yla değiştiriniz.
//        Array'i yazdırınız.
        String[][] arry022D={{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};

        for (int i = 0; i < arry022D.length; i++) {
            for (int j = 0; j < arry022D[i].length; j++) {
                if (arry022D[i][j].equals("ohio"))
                    arry022D[i][j]="Florida";
                System.out.print(arry022D[i][j]+"  ");
            }
            System.out.println();
        }



//        4-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ] 
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                **Örnek:**
//        **Girdi:**
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//                  ]
//        **Çıktı:** [1,2,3,4,5,6,7,8,9]
//        ```
        int[][] arry032d= {{1, 2, 3 },  { 4, 5, 6 },  { 7, 8 ,9}};
        int elaman=0;
        for (int[] satir: arry032d) {
            for (int a: satir) {
                elaman++;
            }
        }
        System.out.println("elaman = " + elaman);
        int[] tumu=new int[elaman];
        int sayac=0;
        for (int i = 0; i < arry032d.length; i++) {
            for (int j = 0; j < arry032d[i].length; j++) {
                tumu[sayac]=arry032d[i][j];
                sayac++;
            }
        }
        System.out.println("tumu = " + Arrays.toString(tumu));


//        5- ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArayList  ve  bir tane String
//        Return tipi int olmalı.
//        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//        Örneğin;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)
        ArrayList<String> arryList1 = new ArrayList<>();
        arryList1.add("Orange");
        arryList1.add("Kiwi");
        arryList1.add("Peach");
        arryList1.add("Banana");
        arryList1.add("Orange");

        String str="Orange";
        System.out.println("Count ="+getCount(arryList1,str));





//        6-getSum() isminde bir method oluşturun.
//        Parametresi ArrayList olmalı
//        Return tipi int olmalı
//        ArrayList teki tüm sayıları birbiri ile toplayın.
//        return olarak toplam sonucu döndürün.
//                Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı
        ArrayList<Integer> arrylistInt=new ArrayList<>();
        arrylistInt.add(1);
        arrylistInt.add(2);
        arrylistInt.add(3);
        arrylistInt.add(4);
        arrylistInt.add(5);
        System.out.println("Toplam="+getSum(arrylistInt));




//        7-getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//        Tüm elementlerin uzunluğunu döndürün
//                Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
        ArrayList<String> aryStr=new ArrayList<>();
        aryStr.add("New jersey");
        aryStr.add("New york");
        aryStr.add("Ohio");
        aryStr.add("Florida");
        aryStr.add("Boston");

        System.out.println(getLength(aryStr).toString());




//        8-İsmi changelnArraylist() olan bir method oluşturun.
//        Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin
//        Return String arrayList
//                Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
        ArrayList<String> arryStr2=new ArrayList<>();
        arryStr2.add("yellow");
        arryStr2.add("red");
        arryStr2.add("blue");
        arryStr2.add("red");
        arryStr2.add("blue");
        changelnArraylist(arryStr2,"blue","yellow");
        System.out.println(arryStr2.toString());


    }
    public static int getCount(ArrayList<String> arryList1,String str){
        int Count=0;
        for (String a:arryList1) {
            if (a.equals(str))
                Count++;
        }
        return Count;
    }
    public static int getSum(ArrayList<Integer> arrylistInt){
        int arryListToplam=0;
        for (int i = 0; i < arrylistInt.size(); i++) {
            arryListToplam+=arrylistInt.get(i);
        }
        return arryListToplam;
    }

    public static ArrayList<Integer> getLength(ArrayList<String> aryStr){
        ArrayList<Integer> uzunluk=new ArrayList<>();
        for (int i = 0; i < aryStr.size(); i++) {
            uzunluk.add(aryStr.get(i).length());
        }
        return uzunluk;
    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> arryStr2,String s1,String s2){
        for (int i = 0; i < arryStr2.size(); i++) {
            if (arryStr2.get(i).equals(s1)) {
                arryStr2.set(i,s2);
            }
        }
        return arryStr2;
    }
}
