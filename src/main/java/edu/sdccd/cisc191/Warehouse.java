package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A Warehouse receives, stores and ships Items.
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Warehouse
{
    /**
     * storage is managed as one big stack, where items are laid on top of each other
     */
    private ArrayList<Item> storage = new ArrayList<Item>();

    public int getNumberOfItemsInStock()
    {
    // gets the number of items in the storge array list
        return storage.size();

    }

    /**
     *
     * TODO Modify to add item to the collection and make the tests pass.
     *
     * @param item the item to store in the Warehouse
     */
    public void receive(Item item)
    {
        //System.out.println("Warehouse receive(" + item + ") running in Thread: " + Thread.currentThread().getName());

        // TODO: store item at the front of the list
        // we add the recieved item to the storge arry list
        storage.add(item);

    }

    /**
     * TODO Modify to remove an item from the collection and make the tests pass
     * @return the item that was retrieved from storage
     * @throws OutOfStockException if there are no items to ship
     */
    //
    public Item ship() throws OutOfStockException {
        //System.out.println("Warehouse ship() running in Thread: " + Thread.currentThread().getName());

        // TODO: return the first item in the list,
        // return the most recently added item
        if (getNumberOfItemsInStock()>0) {
            return storage.remove(storage.size()-1);

        }
        // if the list is empty we throw an out of stock exception
        else {
            throw new OutOfStockException ();

        }
        // if there are any items in storage


    }

}