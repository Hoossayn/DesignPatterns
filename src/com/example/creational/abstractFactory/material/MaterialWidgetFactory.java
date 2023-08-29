package com.example.creational.abstractFactory.material;

import com.example.creational.abstractFactory.Button;
import com.example.creational.abstractFactory.TextBox;
import com.example.creational.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
