package com.example.example_bot.resource;

import io.lemonjuice.flandre_bot.resource.HelpDocResource;
import io.lemonjuice.flandre_bot.resource.Resource;
import io.lemonjuice.flandre_bot.resource.ResourceRegister;

import java.util.List;

public class ResourceInit {
    public static final ResourceRegister RESOURCES = new ResourceRegister();

    public static final Resource<List<String>> EXAMPLE_HELP_DOC = RESOURCES.register(new HelpDocResource("assets/example_help_doc.txt"));
}
