package id.ac.polban.model;

public class BarangMakanan extends Barang {
    private String rasa;

    //Constructor
   public BarangMakanan(String nama, int harga, int stock, String rasa) {
      super(nama, harga, stock);
      this.rasa = rasa;
   }

   public String getRasa() {
      return rasa;
   }

    @Override
    public String getJenis() {
        return rasa;
    }
}

