public class Main{
    public static void main(String[] args){

        Product products = new Product("Phone",13);

        try{
            products.Order(19);

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }catch(OutOfStockException e){
        System.out.println(e.getMessage());
        }








    }
}