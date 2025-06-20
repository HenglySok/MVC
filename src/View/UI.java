package View;

import Controller.ProductController;
import Model.Product;

import java.util.Scanner;
import java.util.UUID;

public class UI {
    private static void thumbnail() {
        System.out.println("""
               =========Choose one option===========
               1. Find All Product
               2. Find Product by UUID
               3. Delete Product by UUID
               4. Add New Product
               5. Edit Product by UUID
               6. Exit
               """);
    }
    public static void Home() {


        while (true) {
            UI.thumbnail();
            System.out.print("[+]: Enter option here: ");
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println("[+]: Find All Product");
                    System.out.println(ProductController.getAllProducts());
                }
                case 2 -> {
                    System.out.println("[+]: Find Product by UUID");
                    System.out.print("- Enter uuid: ");
                    System.out.println(
                            ProductController.getProductByUuid(new Scanner(System.in).nextLine())
                    );
                }
                case 3 -> {
                    System.out.println("[+]: Delete Product by UUID");
                    System.out.print("- Enter uuid: ");
                    ProductController.deleteProductByUuid(new Scanner(System.in).nextLine());
                }
                case 4 -> {
                    System.out.println("[+]: Add New Product");
                    System.out.println("[+] Add New Product");
                    System.out.print("- Enter name: ");
                    String name = (new Scanner(System.in).nextLine());

                    System.out.print("- Enter qty: ");
                    int qty = (new Scanner(System.in).nextInt());
                    ProductController.
                            addNewProduct(new Product(UUID.randomUUID().toString(),
                                    name,
                                    qty)
                            );
                }
                case 5 -> {
                    System.out.println("[+]: Edit Product by UUID");
                    System.out.print("- Enter uuid: ");
                    String uuid = (new Scanner(System.in).nextLine());
                    System.out.print("- Enter new name: ");
                    String newName = (new Scanner(System.in).nextLine());
                    System.out.print("- Enter new qty: ");
                    int newQty = (new Scanner(System.in).nextInt());
                    ProductController.updateProductByUuid(uuid, newName, newQty);
                }
                case 6 -> {
                    return;
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
