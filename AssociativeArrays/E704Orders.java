package Excercise7_AssotiativeArrays;

import java.util.*;

public class E704Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<Double>> products = new LinkedHashMap<>();
      //  Map<String, Product> products = new LinkedHashMap<>();

        while(!line.equals("buy")){
           String[] data = line.split("\\s+");
           String name = data[0];
           double price = Double.parseDouble(data[1]);
           double quantity = Double.parseDouble(data[2]);
           if(products.containsKey(name)){
               products.get(name).set(0, price);


               products.get(name).set(1, products.get(name).get(1) + quantity);
           }else {
               products.put(name, new ArrayList<>());
               products.get(name).add(price);
               products.get(name).add(quantity);
           }

            line = scanner.nextLine();

        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n",k,v.get(0) * v.get(1)));
    }

    static class Product{
        String name;
        double price;
        double quantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        public Product(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

}
