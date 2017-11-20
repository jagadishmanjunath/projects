package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static ToDoFunction mytodoList = new ToDoFunction();

    public static void main(String[] args) {

        int command = 0;
        boolean exit = false;


        printCommand();
         while (!exit)
         {
             System.out.println("Enter your command/choices:");
             command = in.nextInt();

             switch (command)
             {
                 case 0:
                     printCommand();
                     break;
                 case 1:
                     mytodoList.printTodoList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     updateList();
                     break;
                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchItem();
                     break;
                 case 6:
                     exit = true;
                     break;

                     default:
                         System.out.println("Please pick only from given command");
             }

         }


    }
    public static void printCommand ()
    {
        System.out.println( " \n Commands:" +
                "\n Press 0 : To print instructions" +
                "\n Press 1 : To print all List"  +
                "\n Press 2 : To add list in ToDo" +
                "\n Press 3 : To modify the list" +
                "\n Press 4 : To remove item from the list" +
                "\n Press 5 : To search for the list"+
                "\n Press 6 : To exit an app");
    }

    public static void addItem()
    {
        System.out.println("Enter item to be added in todo list:");
        mytodoList.addItem(in.nextLine());
    }

    public static void updateList()
    {
        System.out.println("Enter the item number");
        int index = in.nextInt();
        in.nextLine();
        System.out.println("Enter new item to be added: ");
        String myNewItem = in.nextLine();
        mytodoList.updateList( index - 1 , myNewItem);
    }

    public static void removeItem()
    {
        System.out.println("Enter the item number to be deleted");
        int index = in.nextInt();
        in.nextLine();
        mytodoList.removeItem(index -1);
    }

    public static void searchItem()
    {
        System.out.println("Enter a string to be searched");
        String searchItem = in.nextLine();

        if (mytodoList.findItem(searchItem) == null)
        {
            System.out.println("Item not found in your TODO list");
        }
        else
            {
                System.out.println(searchItem + "was found in the item");
            }
    }

}
