package com.example.example_bot.resource;

import io.lemonjuice.flandre_bot_framework.message.segment.MessageSegment;
import io.lemonjuice.flandre_bot_framework.resource.HelpDocResource;
import io.lemonjuice.flandre_bot_framework.resource.Resource;
import io.lemonjuice.flandre_bot_framework.resource.ResourceRegister;

import java.util.List;

public class ResourceInit {
    public static final ResourceRegister RESOURCES = new ResourceRegister();

    public static final Resource<List<List<MessageSegment>>> EXAMPLE_HELP_DOC = RESOURCES.register(new HelpDocResource("assets/example_help_doc.txt"));
}
