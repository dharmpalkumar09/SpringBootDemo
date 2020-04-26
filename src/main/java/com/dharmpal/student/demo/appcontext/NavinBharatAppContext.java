package com.dharmpal.student.demo.appcontext;

import org.springframework.context.ConfigurableApplicationContext;

public class NavinBharatAppContext {

    private static ConfigurableApplicationContext context =null;

    public static void setApplicationContext(ConfigurableApplicationContext context){
        NavinBharatAppContext.context =context;
    }

    public static ConfigurableApplicationContext getContext(){
        return NavinBharatAppContext.context;
    }

}
