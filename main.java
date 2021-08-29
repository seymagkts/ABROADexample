public class main {
    public static void main(String [] args) throws InterruptedException {
        String sartlar="Yurtdısı cıkıs kuralları...\n"+
                       "1-Herhangi bir siyasi yasagınız bulunmamalı\n"+
                       "2-15 TL harc bedeli yatırılmalı\n" +
                       "3-Vizeniz bulunmalı";

        String message="Sartlardan hepsini sağlamanız gerekmektedir";


        while(true){
            System.out.println("--------------------------------");
            System.out.println(sartlar);

            yolcu yolcu = new yolcu();
            System.out.println("Harc bedeli kontrol ediliyor");

            Thread.sleep(3000); // 3 saniye bekler.

           if( yolcu.yurtDisiHarci()==false){
               System.out.println(message);
               continue;
           }
            System.out.println("Siyasi yasak kontrol ediliyor");

           Thread.sleep(3000);
            if( yolcu.siyasiYasakKontrol()==false){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");

            Thread.sleep(3000);
            if( yolcu.vizeDurumu()==false){
                System.out.println(message);
                continue;
            }

            System.out.println("İslem tamamlandı. Yurtdısına cıkabilirsiniz...");
             break;
        }

    }
}
