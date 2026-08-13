package com.example.example_bot.command.group;

import io.lemonjuice.flandre_bot_framework.command.group.SimpleGroupCommandRunner;
import io.lemonjuice.flandre_bot_framework.model.Message;
import io.lemonjuice.flandre_bot_framework.permission.IPermissionLevel;
import io.lemonjuice.flandre_bot_framework.permission.PermissionLevel;

public class GroupPingCommand extends SimpleGroupCommandRunner {
    public GroupPingCommand(Message command) {
        super(command);
    }

    @Override
    protected boolean needAtFirst() {
        return false;
    }

    @Override
    protected String getCommandBody() {
        return "ping";
    }

    @Override
    public IPermissionLevel getPermissionLevel() {
        return PermissionLevel.NORMAL;
    }

    @Override
    public void apply() {
        this.command.getContext().sendText("pong");
    }
}
