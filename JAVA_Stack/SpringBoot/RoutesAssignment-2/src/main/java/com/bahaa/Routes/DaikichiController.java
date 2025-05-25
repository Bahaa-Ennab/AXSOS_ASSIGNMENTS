package com.bahaa.Routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    @RequestMapping("/")
    public String daikichi() {
        return "Welcome! ";
    }
    @RequestMapping(value="/today", method = RequestMethod.GET)
    public String today(){
      return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping(value="/tomorrow", method = RequestMethod.GET)
    public String tomorrow(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }


}
