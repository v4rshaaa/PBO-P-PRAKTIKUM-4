package id.ac.polban.model;

public class BarangATK extends Barang {
    private String merk;

    //Constructor
   public BarangATK(String nama, int harga, int stock, String merk) {
      super(nama, harga, stock);
      this.merk = merk;
   }

   public String getMerk() {
      return merk;
   }

    @Override
    public String getJenis() {
        return merk;
    }
}

