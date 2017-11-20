package com.company;

import java.util.ArrayList;

public class ToDoFunction
{
    private ArrayList<String> todoList = new ArrayList<>();

//   Add list item

    public void addItem (String item)
    {
        todoList.add(item);
    }

//    remove list item


    public void removeItem (int index)
    {
        String myList = todoList.get(index);
        todoList.remove(index);
    }

//    print the entire list


    public void printTodoList()
    {
        System.out.println("ToDo list contains of :" + todoList.size()+"items");
        for (int i = 0 ; i < todoList.size(); i++)
        {
            System.out.println("Item at position " + (i + 1) + todoList.get(i));
        }
    }

    public void updateList ( int index , String list)
    {
        todoList.set(index , list);
        System.out.println("updation completed at postion" + index + 1);
    }
//    Search feature for user

    public String findItem ( String searchItem)
    {
        int index = todoList.indexOf(searchItem);
        if (index == -1)
        {
            return null;
        }
        else
            {
                return todoList.get(index);
            }
    }





}
