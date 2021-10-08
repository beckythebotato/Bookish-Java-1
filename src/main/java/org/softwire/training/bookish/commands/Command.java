package org.softwire.training.bookish.commands;

import java.util.HashMap;

public interface Command {
    public void Execute(String input, Jdbi jdbi);
}
