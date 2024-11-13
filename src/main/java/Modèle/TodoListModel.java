/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modèle;

/**
 *
 * @author hfourniret
 */
// TodoListModel.java
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoListModel {
    private ObservableList<TodoItem> items;

    public TodoListModel() {
        items = FXCollections.observableArrayList();
    }

    public ObservableList<TodoItem> getItems() {
        return items;
    }

    public void addItem(String description) {
        items.add(new TodoItem(description));
    }

    public void removeItem(TodoItem item) {
        items.remove(item);
    }
}
