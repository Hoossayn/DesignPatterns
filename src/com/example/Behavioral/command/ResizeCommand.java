package com.example.Behavioral.command;

import com.example.Behavioral.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
