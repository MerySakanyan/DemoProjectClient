package com.client;

import com.client.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;

import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@PropertySource("classpath:application.properties")
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("application.xml");
//


       User user = new User("ghfvbgba@mail.ru", "1111", 1000);


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String>     responseEntity  = restTemplate.postForEntity("http://localhost:8080/adduser",
              user,String.class);
        String a=responseEntity.getBody();
        System.out.println(responseEntity.getBody());
    }
}
