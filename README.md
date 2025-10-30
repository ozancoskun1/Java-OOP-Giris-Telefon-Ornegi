
# 📱 Telefon – Java OOP Uygulaması

Bu proje, **Java'da OOP (Nesne Yönelimli Programlama)** mantığını anlamak için yapılmış sade bir örnektir.  
`Telefon` sınıfı üzerinden **constructor**, **this**, **metotlar**, **nesne kullanımı** gibi temel OOP kavramlarını gösterir.

---

## 🔧 Özellikler

- `Telefon` sınıfı:
  - Marka, model ve pil yüzdesi (0–100)
  - `sarjEt()` → Belirtilen miktarda şarj artırır (maksimum %100)
  - `sarjAzalt()` → Belirtilen miktarda şarj azaltır (minimum %0)
  - `pilDurumu()` → Pil seviyesine göre durumu gösterir  
    *(Bitti / Düşük / İdare eder / Orta / İyi / Yüksek)*
  - `hakkindaGoster()` → Telefon bilgilerini ekrana yazdırır

---

## 🧠 Öğrenilen Konular
- `constructor` kullanımı  
- `this` anahtar kelimesiyle değişken atama  
- Metot oluşturma ve çağırma  
- Nesne oluşturma (`new`)  
- Basit if/else yapıları  
- Konsol çıktısı düzenleme

---

## ▶️ Çalıştırma
```bash
javac Telefon.java Main.java
java Main
## 🖥️ Örnek Çıktı
==============================
Yeni telefon oluşturuldu: Apple iPhone 15

Şarj arttı: %10 → %100
Şarj azaldı: %100 → %90

----- TELEFON BİLGİLERİ -----
Marka : Apple
Model : iPhone 15
Anlık Şarj : %90
Pil Durumu : Yüksek

Yeni telefon oluşturuldu: Xiaomi Redmi Note 11s

Şarj arttı: %10 → %60
Şarj azaldı: %60 → %0
⚠️ Şarj bitti, telefon kapandı.

----- TELEFON BİLGİLERİ -----
Marka : Xiaomi
Model : Redmi Note 11s
Anlık Şarj : %0
Pil Durumu : Bitti

Yeni telefon oluşturuldu: Samsung A50s

Şarj azaldı: %100 → %14
Şarj arttı: %14 → %17

----- TELEFON BİLGİLERİ -----
Marka : Samsung
Model : A50s
Anlık Şarj : %17
Pil Durumu : Düşük
