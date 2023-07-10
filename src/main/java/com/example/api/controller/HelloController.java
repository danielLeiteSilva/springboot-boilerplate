package com.example.api.controller;

import com.example.api.dto.ClientDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello";
    }
    @PostMapping("/getAge")
    @ResponseBody
    public String Client(@RequestBody ClientDTO clientDTO){
        return clientDTO.getIdade();
    }
}
