package com.example.example_bot;

import com.example.example_bot.command.CommandInit;
import com.example.example_bot.resource.ResourceInit;
import io.lemonjuice.flandre_bot_framework.event.annotation.EventSubscriber;
import io.lemonjuice.flandre_bot_framework.event.annotation.SubscribeEvent;
import io.lemonjuice.flandre_bot_framework.event.meta.BotInitEvent;

@EventSubscriber
public class ExampleBot {
    @SubscribeEvent
    public void onBotInit(BotInitEvent event) {
        ResourceInit.RESOURCES.load();
        CommandInit.COMMANDS.load();
    }
}
