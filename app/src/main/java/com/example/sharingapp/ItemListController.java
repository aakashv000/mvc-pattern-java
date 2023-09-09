package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ItemListController {
    private ItemList itemList;

    public ItemListController(ItemList itemList) {
        this.itemList = itemList;
    }

    // Delegate Methods

    public void setItems(ArrayList<Item> item_list) {
        itemList.setItems(item_list);
    }

    public ArrayList<Item> getItems() {
        return itemList.getItems();
    }

    // [done] modify - use command
    public boolean addItem(Item item, Context context) {
        AddItemCommand add_item_command = new AddItemCommand(itemList, item, context);
        add_item_command.execute();
//        itemList.addItem(item);
        return add_item_command.isExecuted();
    }

    // [done] modify - use command
    public boolean deleteItem(Item item, Context context) {
//        itemList.deleteItem(item);
        DeleteItemCommand delete_item_command = new DeleteItemCommand(itemList, item, context);
        delete_item_command.execute();
        return delete_item_command.isExecuted();
    }

    // [done] add - edit item, using command
    public boolean editItem(Item item, Item updated_item, Context context) {
        EditItemCommand edit_item_command = new EditItemCommand(itemList, item, updated_item, context);
        edit_item_command.execute();
        return edit_item_command.isExecuted();
    }

    public Item getItem(int index) {
        return itemList.getItem(index);
    }

    public int getIndex(Item item) {
        return itemList.getIndex(item);
    }

    public int getSize() {
        return itemList.getSize();
    }

    public void loadItems(Context context) {
        itemList.loadItems(context);
    }

    // not required?
    public boolean saveItems(Context context) {
        return itemList.saveItems(context);
    }

    public ArrayList<Item> filterItemsByStatus(String status) {
        return itemList.filterItemsByStatus(status);
    }

    public ArrayList<Contact> getActiveBorrowers() {
        return itemList.getActiveBorrowers();
    }

    public void addObserver(Observer observer) {
        itemList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        itemList.removeObserver(observer);
    }
}
