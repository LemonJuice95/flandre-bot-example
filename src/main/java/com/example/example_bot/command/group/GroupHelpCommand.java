package com.example.example_bot.command.group;

import com.example.example_bot.resource.ResourceInit;
import io.lemonjuice.flandre_bot_framework.command.group.SimpleGroupCommandRunner;
import io.lemonjuice.flandre_bot_framework.model.Message;
import io.lemonjuice.flandre_bot_framework.permission.IPermissionLevel;
import io.lemonjuice.flandre_bot_framework.permission.PermissionLevel;

public class GroupHelpCommand extends SimpleGroupCommandRunner {
    public GroupHelpCommand(Message command) {
        super(command);
    }

    @Override
    public IPermissionLevel getPermissionLevel() {
        return PermissionLevel.NORMAL;
    }

    @Override
    protected boolean needAtFirst() {
        return true;
    }

    @Override
    protected String getCommandBody() {
        return "/help";
    }

    @Override
    public void apply() {
        this.command.getContext().sendForwardMessage(ResourceInit.EXAMPLE_HELP_DOC.get());
    }
}
