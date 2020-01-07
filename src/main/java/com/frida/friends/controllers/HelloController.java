package com.frida.friends.controllers;
import com.frida.friends.properties.FriendsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private FriendsProperties friendsProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String  say(){
        return friendsProperties.getName()+"  \n "
                + friendsProperties.getAge() + "  \n"
                + friendsProperties.getHeight()+ " \n "
                + friendsProperties.getSex();
    }
}
