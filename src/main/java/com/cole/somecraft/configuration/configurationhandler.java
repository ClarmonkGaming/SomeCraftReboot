package com.cole.somecraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;
public class configurationhandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
    boolean configValue = false;
        try
        {
            // load config
            configuration.load();
            // read in properteis from config
            configValue = configuration.get("SomeCraft", "configValue", true, "Example value").getBoolean(true);
        }
        catch(Exception e)
        {
            // log the exception
        }
        finally
        {
            // save config
            configuration.save();
        }

        System.out.println(configValue);
    }
}
