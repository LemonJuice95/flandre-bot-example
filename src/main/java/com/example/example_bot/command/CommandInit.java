package com.example.example_bot.command;

import com.example.example_bot.command.group.GroupHelpCommand;
import com.example.example_bot.command.group.GroupPingCommand;
import io.lemonjuice.flandre_bot_framework.command.CommandRegister;

public class CommandInit {
    public static final CommandRegister COMMANDS = new CommandRegister();

    static {
        COMMANDS.register(GroupPingCommand::new);
        COMMANDS.register(GroupHelpCommand::new);
    }
}
