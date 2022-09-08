public class ProductManager {

    public void add(Product product){
        System.out.println("Ürünün adı eklendi: " +product.name);
        System.out.println("Ürünün fiyatı eklendi: " + product.price);
        System.out.println("Ürünün stoğu eklendi: "+ product.stok);
        System.out.println("Ürünün açıklaması eklendi: " + product.description);
        System.out.println("Ürünün rengi eklendi: " + product.color);

    }

}
