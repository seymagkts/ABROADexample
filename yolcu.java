import java.util.Scanner;
public class yolcu implements yurtDisi {
    private int harc;
    private boolean siyasiYasak;
    private boolean vize;

    public yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdıgınız harc bedeli: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasagınız bulunuyor mu? (evet ya da hayır): ");
        String cevap=scanner.nextLine();

        if(cevap.equals("evet")) {
            this.siyasiYasak = true;
        }else{
            this.siyasiYasak=false;
        }

        System.out.print("Vizeniz bulunuyor mu? (evet ya da hayır): ");
        String cevap2=scanner.nextLine();

        if(cevap.equals("evet")) {
            this.vize = true;
        }else{
            this.vize=false;
        }
    }

    @Override
    public boolean yurtDisiHarci() {
        if(this.harc<15){
            System.out.println("HARÇ EKSİK YATIRILMISTIR");
            return false;
        }else{
            System.out.println("HARÇ İSLEMİ TAMAMLANMISTIR");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){
            System.out.println("SİYASİ YASAGINIZ VARDIR");
            return false;
        }else{
            System.out.println("SİYASİ YASAGINIZ BULUNMAMAKTADIR");
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if(this.vize==false){
            System.out.println("VİZE İŞLEMLERİ TAMAMLANMISTIR");
            return true;
        }else{
            System.out.println("İZNİNİZ BULUNMAMAKTADIR");
            return false;
        }
    }
}
