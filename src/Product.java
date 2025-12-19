class OutOfStockException extends Exception{
    public OutOfStockException(String message){
        super(message);
    }

}

public class Product {

    String name;
    int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }


    public void sifarisVer(int say) throws OutOfStockException{
        if(say <= 0){
            throw new IllegalArgumentException("Sifaris sayi musbet olmalidir.");
        }

        if(say > stock){
            throw new OutOfStockException("ambarda kifayet qeder mehsul yoxudur");
        }

        stock-= say;
        System.out.println("sifarisiniz verildi.");
        System.out.println("qalan stock sayi:" + stock);

    }

}
