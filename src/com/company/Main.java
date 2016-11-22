package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<InventoryItem> onhand = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


//
        while (true) {
            System.out.println("Inventory Listing:\n");
            int i =1;
            for (InventoryItem inventory : onhand) {
                String qty =  " : " + inventory.quantity;
                System.out.println("[" + i + "] " + inventory.inventory +  qty + "\n");
                i=i+1;
            }
            System.out.println("\nInventory Options:\n\n[1] Add a new item for inventory\n[2] Remove an inventory item\n[3] Add quantity to inventory item\n[4] Remove quantity inventory item\n");
            String option = scanner.nextLine();


//Add an item to inventory
// * after - System.out.println("\nWhat will be the initial quantity: \n"); - if invalid qty, loop around to question
            if (option.equals("1")) {
                System.out.println("\nWhat item would you like to add to inventory\n");
                String inventory = scanner.nextLine();
                System.out.println("\nWhat will be the initial quantity: \n");
                int add = Integer.parseInt(scanner.nextLine());
                InventoryItem item = new InventoryItem(inventory, add);
                onhand.add(item);
//

//Remove an item from inventory
            } else if (option.equals("2")) {
                System.out.println("\nWhich item number would you like to remove from inventory:\n");
                int remove = Integer.parseInt(scanner.nextLine());
                onhand.remove(remove -1);
//

//Receive quantity
            } else if (option.equals("3")) {
                System.out.println("\nWhich item number would you like to change?\n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list-1);
                System.out.println("\nAmount to be added:\n");
                int receive = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity + receive;
//

//Issue quantity
//*negative quantity
            } else if (option.equals("4")) {
                System.out.println("\nWhich item number would you like to remove: \n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list-1);
                System.out.println("\nAmount to be removed:\n");
                int issue = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity - issue;
//


//invalid entry
            } else {
                    System.out.println("\nInvalid Entry\n");
                }
//COMPLETE
            }
        }
    }