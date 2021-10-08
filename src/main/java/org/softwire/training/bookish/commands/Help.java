package org.softwire.training.bookish.commands;

public class Help implements Command {
    @Override
    public void Execute(String input) {
        System.out.println("Available Commands: none yet!");
    }
}
