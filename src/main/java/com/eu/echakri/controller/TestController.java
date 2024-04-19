package com.eu.echakri.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url...!");
    }

    @GetMapping("/admin_only")
    public  adminOnly() {
        return ResponseEntity.ok("Hello from admin only url");
    }
}
