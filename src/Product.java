public class Product {
    String name;
    int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void Order(int number) throws OutOfStockException{
        if(number < 0){
            throw new IllegalArgumentException("Zəhmət olmasa müsbət rəqəm daxil edin");

        }if(number > stock || stock == 0){
            throw new OutOfStockException("Stock da kifayət qədər məhsul yoxudr!");

        }else{
            stock -= number;
        System.out.println("sifarisiniz qəbul edildi.");
        System.out.println("qalan məhsul sayi:" + stock);

        }

    }


}
