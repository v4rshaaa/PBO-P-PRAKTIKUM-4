package id.ac.polban.service;

import id.ac.polban.model.*;
import java.util.Scanner;

public class SistemKoperasi {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      Barang[] daftar = {
         new BarangATK("Pulpen", 2000, 7, "Joyko"),
         new BarangATK("Pulpen", 2000, 7, "Kenko"),
         new BarangMakanan("Roti", 5000, 12, "Cokelat"),
         new BarangMakanan("Roti", 5000, 12, "Keju"),
         new BarangMinuman("Aqua", 3000, 12, "350ml"),
         new BarangMinuman("Aqua", 5000, 12, "600ml")
      };

      boolean lanjut = true;
      while(lanjut){
         System.out.println("=========LIST BARANG YANG TERSEDIA=========");
         System.out.println("        NAMA        |      HARGA      |    STOCK    ");
         System.out.println("1. Pulpen Joyko             Rp2.000         " + daftar[0].getStock());
         System.out.println("2. Pulpen Kenko             Rp2.000         " + daftar[1].getStock());
         System.out.println("3. Roti Cokelat             Rp5.000         " + daftar[2].getStock());
         System.out.println("4. Roti Keju                Rp5.000         " + daftar[3].getStock());
         System.out.println("5. Aqua 350ml               Rp3.000         " + daftar[4].getStock());
         System.out.println("6. Aqua 600ml               Rp5.000         " + daftar[5].getStock());

         int pilihan;
         do {
            System.out.print("Pilih Barang (1-6) Yang Ingin Anda Beli: ");
            pilihan = input.nextInt();

            if(pilihan < 1 || pilihan > 6){
               System.out.println("Barang Tidak Tersedia");
            }
         } while(pilihan < 1 || pilihan > 6);

         System.out.print("Jumlah yang ingin anda pesan: ");
         int jumlah = input.nextInt();

         Barang dipilih = daftar[pilihan - 1];

         if(jumlah > dipilih.getStock()){
            System.out.println("Stok tidak mencukupi. Pesanan dibatalkan.");
            return;
         }     

         Pesanan order = new Pesanan(jumlah, dipilih);
         dipilih.kurangiStock(jumlah);

         System.out.println("\n=====STRUK PESANAN=====");
         System.out.println("Barang: " + order.getItem().getNama());
         System.out.println("Jumlah: " + order.getJumlah());
         System.out.println("Total: " + order.getTotalHarga());
         System.out.println("Jenis: " + order.getItem().getJenis());

         System.out.print("\nApakah ingin pesan lagi? (y/n): ");
         String jawab = input.next();
         if (jawab.equalsIgnoreCase("n")) {
            lanjut = false;
         }
      }
      input.close();
   }
}
