package com.example.creational.abstractFactory.ant;

import com.example.creational.abstractFactory.Button;
import com.example.creational.abstractFactory.TextBox;
import com.example.creational.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
