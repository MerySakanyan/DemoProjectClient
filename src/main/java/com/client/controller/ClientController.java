package com.client.controller;

import com.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ClientController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/adddata", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("email") String email, @ModelAttribute("password") String password,
                              @ModelAttribute("amount") int amount) {
        Map<String, String> message = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();
                  User user = new User(email, password, amount);
            ResponseEntity<String>     responseEntity  = restTemplate.postForEntity("http://localhost:8080/adduser",
                    user,String.class);
            message.put("message", responseEntity.getBody());
        return new ModelAndView("index", message);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST )
    public ModelAndView delete(@ModelAttribute("email") String email){
          Map<String, String> message = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String>     responseEntity  = restTemplate.postForEntity("http://localhost:8080/deleteuser",
                email,String.class);
        message.put("messagedelete", responseEntity.getBody());
      //  message.put("messagedelete",email);
        return new ModelAndView("index", message);
    }


}
