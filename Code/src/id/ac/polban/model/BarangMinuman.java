package id.ac.polban.model;

public class BarangMinuman extends Barang {
    private String ukuran;

    //Constructor
   public BarangMinuman(String nama, int harga, int stock, String ukuran) {
      super(nama, harga, stock);
      this.ukuran = ukuran;
   }

    public String getUkuran() {
      return ukuran;
    }

    @Override
    public String getJenis() {
        return ukuran;
    }
}

