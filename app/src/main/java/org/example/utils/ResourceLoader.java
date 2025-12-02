package org.example.utils;

import java.io.File;

public class ResourceLoader {
    private static final String INPUTS_FOLDERNAME = "inputs";    

    public static File getInputsFolder(){
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory+"\\"+INPUTS_FOLDERNAME); 

        return new File(userDirectory+"\\"+INPUTS_FOLDERNAME);
    }
}
