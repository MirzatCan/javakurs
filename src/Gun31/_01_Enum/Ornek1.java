package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        //verilen bir ay noya gore, ayin gun sayisini veren program yaziniz

        int ayNo=5;
        switch (ayNo){
            case 2:System.out.println(28);break;
            case 1:// Ocak
            case 3:// Mart
            case 5:// Mayis
            case 7://...
            case 8:
            case 10:
            case 12:System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;
        }
        //okunabilirlik ve kontrollu yazilim yok, tanimlama yetersiz
        //numaradan gitmeye calistik, zorluklarla karsilastik
        //bunun yerine isinden gitmeye calisalim

        String ayAd="Mayis";
        switch (ayAd) {
            case "subat":System.out.println(28);break;
            case "ocak":// Ocak
            case "mart":// Mart
            case "Mayis":// Mayis
            case "temuz"://...
            case "austos":
            case "ekim":
            case "aralik":System.out.println(31);break;
            case "nissan":
            case "haziran":
            case "eyluk":
            case "kasim":System.out.println(30);break;
        }
        // kontrol zor hataya acik
        // Boolean True 1 , false 0
    }
}

//        Kullanıcı Tipi : Role :
//        Student,Teacher, Admin, Mentor
//
//        if (kullanici == Role.Student)
//        {
//
//        }
//        else
//        {
//
//        }