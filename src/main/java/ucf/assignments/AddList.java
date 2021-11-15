package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.scene.control.Tab;

import java.util.HashMap;
/**
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ivan Pavlov
 */

public class AddList {
    public static HashMap<Tab,ObservableList<Items>>  mapOfTabAndItems = new HashMap<Tab,ObservableList<Items>>();
    public static HashMap<String,ObservableList<Items>> mapOflisters = new HashMap<String,ObservableList<Items>>();

    //add an element to the hashMap
    public AddList(String listnamesent, ObservableList<Items> listsent){
        mapOflisters.put(listnamesent,listsent);
    }
    public static void AddTab(Tab tabname, ObservableList<Items> listsent){mapOfTabAndItems.put(tabname,listsent);}//new code 11-14

    //return the HashMap
    public static HashMap<String,ObservableList<Items>> getMap(){return mapOflisters;}
    public static HashMap<Tab,ObservableList<Items>> getMapofTabs(){return mapOfTabAndItems;}//new code 11-14


    public AddList(){}


}
