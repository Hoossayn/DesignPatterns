package com.example.creational.abstractFactory.app;

import com.example.creational.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
