package com.example.Behavioral.mediator;

public class ArticleDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();


    public ArticleDialogBox(){
        //articlesListBox.attach(() -> articleSelected());
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }


    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    public void simulateInteraction(){
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Second Article");
        System.out.println("TextBox: " +titleTextBox.getContent());
        System.out.println("Button: " +saveButton.isEnabled());
    }
}
