package com.example.example_bot.command.group;

import com.example.example_bot.resource.ResourceInit;
import io.lemonjuice.flandre_bot.command.group.SimpleGroupCommandRunner;
import io.lemonjuice.flandre_bot.model.Message;
import io.lemonjuice.flandre_bot.permission.IPermissionLevel;
import io.lemonjuice.flandre_bot.permission.PermissionLevel;
import io.lemonjuice.flandre_bot.utils.SendingUtils;

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
        SendingUtils.sendGroupForwardText(this.command.selfId, this.command.groupId, ResourceInit.EXAMPLE_HELP_DOC.get());
    }
}
