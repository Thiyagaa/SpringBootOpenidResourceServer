package org.ta.openid.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class CarController {
    @GetMapping("/cars")
    @ResponseBody public List<String> cars() {;
        return List.of("Volvo","Benz","Fiat");
    }

}