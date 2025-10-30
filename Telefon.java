package OOP;

public class Telefon {

    String marka;
    String model;
    int sarjYuzdesi; // sarj aralığı olmalı 0 100

    public Telefon(String marka, String model, int sarjYuzdesi) {
        this.marka = marka;
        this.model = model;
        this.sarjYuzdesi = clamp(sarjYuzdesi);
     
        System.out.println("Yeni telefon oluşturuldu: " + marka + " " + model);
        System.out.println("==============================");
    }
    //alınacak değeri 0 100 arasına sıkıştırır
    private int clamp(int v) {
        return Math.max(0, Math.min(100, v));
    }

    public void hakkindaGoster() {
        System.out.println("\n----- TELEFON BİLGİLERİ -----");
        System.out.println("Marka : " + marka);
        System.out.println("Model : " + model);
        System.out.println("Anlık Şarj : %" + sarjYuzdesi);
    }

    public int sarjEt(int miktar) {
        int once = sarjYuzdesi;
        sarjYuzdesi = clamp(sarjYuzdesi + miktar);

        if (once == 100) {
            System.out.println("🔋 Şarj zaten %100, dolum yapılmadı.");
        } else if (sarjYuzdesi == 100) {
            System.out.println("🔋 Şarj tamamen doldu! (%" + sarjYuzdesi + ")");
        } else {
            System.out.println("Şarj arttı: %" + once + " → %" + sarjYuzdesi);
        }

        return sarjYuzdesi;
    }

    public int sarjAzalt(int miktar) {
        int once = sarjYuzdesi;
        sarjYuzdesi = clamp(sarjYuzdesi - miktar);

        if (sarjYuzdesi == 0 && once != 0) {
            System.out.println("⚠️  Şarj bitti, telefon kapandı.");
        } else {
            System.out.println("Şarj azaldı: %" + once + " → %" + sarjYuzdesi);
        }

        return sarjYuzdesi;
    }

    public void pilDurumu() {
        int p = sarjYuzdesi;
        System.out.print("Pil durumu: ");
        if (p == 0) System.out.println("Bitti (%0)");
        else if (p <= 20) System.out.println("Düşük (%" + p + ")");
        else if (p <= 40) System.out.println("İdare eder (%" + p + ")");
        else if (p <= 60) System.out.println("Orta (%" + p + ")");
        else if (p <= 80) System.out.println("İyi (%" + p + ")");
        else System.out.println("Yüksek (%" + p + ")");
    }
}


	


