package com.example.example_bot.command.group;

import io.lemonjuice.flandre_bot.command.group.SimpleGroupCommandRunner;
import io.lemonjuice.flandre_bot.model.Message;
import io.lemonjuice.flandre_bot.permission.IPermissionLevel;
import io.lemonjuice.flandre_bot.permission.PermissionLevel;
import io.lemonjuice.flandre_bot.utils.SendingUtils;

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
        SendingUtils.sendGroupText(this.command.groupId, "pong");
    }
}
