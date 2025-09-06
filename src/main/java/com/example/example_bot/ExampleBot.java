package com.example.example_bot;

import com.example.example_bot.command.CommandInit;
import com.example.example_bot.resource.ResourceInit;
import com.google.common.eventbus.Subscribe;
import io.lemonjuice.flandre_bot.event.annotation.EventSubscriber;
import io.lemonjuice.flandre_bot.event.meta.BotInitEvent;

@EventSubscriber
public class ExampleBot {
    @Subscribe
    public void onBotInit(BotInitEvent event) {
        ResourceInit.RESOURCES.load();
        CommandInit.COMMANDS.load();
    }
}
