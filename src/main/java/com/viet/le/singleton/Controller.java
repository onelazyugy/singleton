package com.viet.le.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/setData")
    public String setData(@RequestBody String text) {
        setDataOnSingleton(text);
        return "body set";
    }

    @GetMapping("/getData")
    public String getData() {
        return getDataOnSingleton();
    }

    synchronized
    private void setDataOnSingleton(String text) {
        Singleton singleton = Singleton.getInstance();
        singleton.setString(text);
    }

    synchronized
    private String getDataOnSingleton() {
        Singleton singleton = Singleton.getInstance();
        return singleton.getString();
    }
}
