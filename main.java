
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);
        Hakinda bilgi=new Hakinda();
        System.out.println("Idman Programına Hoşgeldiniz...");
        System.out.println("---------------------------------------------------");
        String bilgiler="Hareket bilgileri...\n"
                          +"Burpee\n"
                          +"Pushup(Şınav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println("---------------------------------------------------");
        System.out.println(bilgiler);
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        System.out.println("Burpee için burpee\n"
                + "Pushup için pushup\n"
                + "Situp için situp\n"
                + "Squat için squat \n"
                + "Tümü için kılavuz yazınız.\n"
                );
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("Bilgi almak istediğiniz bir hareket girin:");
        
        String hareket=scanner.nextLine();
        
       if(hareket.equals("burpee")){
           bilgi.burpee_bilgi();
        }
       else if(hareket.equals("pushup")){
           bilgi.pushup_bilgi();
       }
       else if(hareket.equals("situp")){
           bilgi.situp_bilgi();
       }
       else if(hareket.equals("squat")){
           bilgi.squat_bilgi();
       }
       else if(hareket.equals("kilavuz")){
           System.out.println("///////////////////////////////////////////////////");
           System.out.println("///////////////////////////////////////////////////");
             System.out.println("*******BURPEE*******");
            bilgi.burpee_bilgi();
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("");
             System.out.println("*******PUSHUP*******");
            bilgi.pushup_bilgi();
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("");
             System.out.println("*******SİTUP*******");
            bilgi.situp_bilgi();
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("");
             System.out.println("*******SQUAT*******");
            bilgi.squat_bilgi();
            System.out.println("///////////////////////////////////////////////////");
            System.out.println("///////////////////////////////////////////////////");
       }
       else {
           System.out.println(" ");
       }
        System.out.println("---------------------------------------------------");
        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Şınav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println("---------------------------------------------------");
        System.out.println(idmanlar);
        System.out.println("---------------------------------------------------");
        System.out.println("Bir idman oluşturun...");
        System.out.println("---------------------------------------------------");
        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
    
       Spor spor = new Spor(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor.....");
        
        System.out.println("---------------------------------------------------");
        while (spor.idmanBittiMi() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            spor.hareketYap(tur, sayi);
            
            
            
        }
        System.out.println("Idmanını başarıyla bitirdin....");
    
    
    }
}


