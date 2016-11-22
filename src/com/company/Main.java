package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<InventoryItem> onhand = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


//
        while (true) {
            System.out.println("Inventory List:\n");
            int i =1;
            for (InventoryItem inventory : onhand) {
                String qty =  " : " + inventory.quantity;
                System.out.println(i + ") " + inventory.inventory +  qty + "\n");
                i=i+1;
            }
            System.out.println("\nInventory Options:\n\n[1] Add a new item for inventory\n[2] Receive inventory\n[3] Issue inventory\n[4] Remove an inventory item\n");
            String option = scanner.nextLine();


//Add an item to inventory
// 
            if (option.equals("1")) {
                System.out.println("\nWhat item would you like to add to inventory\n");
                String inventory = scanner.nextLine();
                System.out.println("\nWhat will be the initial quantity: \n");
                int add = Integer.parseInt(scanner.nextLine());
                InventoryItem item = new InventoryItem(inventory, add);
                onhand.add(item);
//

//Receive quantity
//
            } else if (option.equals("2")) {
                System.out.println("\nWhich item would you like to change?\n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list-1);
                System.out.println("\nQuantity to be received:\n");
                int receive = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity + receive;
//

//Issue quantity
//
            } else if (option.equals("3")) {
                System.out.println("\nWhich item would you like to issued: \n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list-1);
                System.out.println("\nQuantity to be issued:\n");
                int issue = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity - issue;
//

//Remove an item from inventory
//
            } else if (option.equals("4")) {
                System.out.println("\nWhich item would you like to remove from inventory:\n");
                String inventory = scanner.nextLine();

                int remove = Integer.parseInt(scanner.nextLine());

                InventoryItem item = new InventoryItem(inventory, remove);
                onhand.remove(item);
//

//invalid entry
            } else {
                    System.out.println("\nInvalid Entry\n");
                }
//COMPLETE
            }
        }
    }