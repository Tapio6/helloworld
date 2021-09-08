package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//CONTROLLER ANNOTAATIO KERTOO, ETTÄ TÄMÄ ON KONTROLLERI
// JA TUO KÄYTTÖÖN IMPORTIN KAUTTA
@Controller
@ResponseBody
public class HelloController {
@RequestMapping("*")
public String hello() {
return "Hello Spring";
}
}