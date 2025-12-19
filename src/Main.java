public class Main{
    public static void main(String[] args) {


        Product product = new Product("asus", 8);

        try{
            product.sifarisVer(9);
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}