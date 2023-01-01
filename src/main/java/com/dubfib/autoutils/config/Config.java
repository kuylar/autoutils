package com.dubfib.autoutils.config;

import java.util.HashMap;

public class Config {
    public static final String NAME = "AutoUtilities";
    public static final String ID = "autoutils";
    public static final String VERSION = "1.1";
    public final HashMap<String, String>[] translations;

    public Config(HashMap<String, String>[] translations) {
        this.translations = translations;
    }
};