package entityclassassignment2;
import java.util.Scanner;
   class Product {
	    int productId;
	    String name;
	    double price;
	    int quantity;

	
	    public Product(int productId, String name, double price, int quantity) {
	        this.productId = productId;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public void display() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Name: " + name);
	        System.out.println("Price: $" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("--------------------------");
	    }
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[4];

	        System.out.println("Enter details for 4 products:");

	        for (int i = 0; i < products.length; i++) {
	            System.out.println("Product " + (i + 1) + ":");
	            System.out.print("Enter Product ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            System.out.print("Enter Product Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter Price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Enter Quantity: ");
	            int quantity = scanner.nextInt();

	            products[i] = new Product(id, name, price, quantity);
	            System.out.println();
	        }

	        System.out.println("Displaying Product Details:");
	        for (Product p : products) {
	            p.display();
	        }

	        scanner.close();
	    }
	}
