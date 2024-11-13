/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contrôler;

// TodoListController.java
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TodoListController {

    @FXML
    private TextField newItemTextField; // Champ de texte pour ajouter une tâche

    @FXML
    private Button addButton; // Bouton pour ajouter une tâche

    @FXML
    private Button deleteButton; // Bouton pour supprimer une tâche

    @FXML
    private ListView<TodoItem> todoListView; // Liste des tâches

    private TodoListModel todoListModel; // Modèle contenant les tâches

    public void initialize() {
        todoListModel = new TodoListModel();
        todoListView.setItems(todoListModel.getItems());
    }

    // Méthode pour ajouter une tâche
    @FXML
    public void handleAddTask(ActionEvent event) {
        String description = newItemTextField.getText().trim();
        if (!description.isEmpty()) {
            todoListModel.addItem(description);
            newItemTextField.clear();
        }
    }

    // Méthode pour supprimer une tâche
    @FXML
    public void handleDeleteTask(ActionEvent event) {
        TodoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            todoListModel.removeItem(selectedItem);
        }
    }
}

