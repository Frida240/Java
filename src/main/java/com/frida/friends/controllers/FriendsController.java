package com.frida.friends.controllers;
import com.frida.friends.properties.FriendsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/friendsController")
public class FriendsController {

    @Autowired
    private FriendsProperties friendsProperties;

    /**
     * 访问read 或者 hi 都可以
     * @return
     */
//    @RequestMapping(value = {"/read","/hi"},method = RequestMethod.GET)
    @GetMapping(value = "/read")
    public String  read(){
        return friendsProperties.getName()+"  \n "
                + friendsProperties.getAge() + "  \n"
                + friendsProperties.getHeight()+ " \n "
                + friendsProperties.getSex();
    }

    /**
     * 访问read 或者 hi 都可以
     * @return
     */
    @RequestMapping(value = {"/read","/hi"},method = RequestMethod.POST)
    public String  wirte(){
        return friendsProperties.getName()+"  \n "
                + friendsProperties.getAge() + "  \n"
                + friendsProperties.getHeight()+ " \n "
                + friendsProperties.getSex();
    }


}
