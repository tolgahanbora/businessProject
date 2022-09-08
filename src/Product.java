public class Product {

    int price;
    private int ıd;
    String color;
    String name;
    String description;
   private String serial;
    int stok;



    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }


    public String getSerial() {
       return this.name.substring(0,1)+ ıd;
    }
}
