package com.prosegur.transactional.transactions.infrastructure.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckGetController {

  @GetMapping("/health-check")
  public ResponseEntity<String> handle() {
    return ResponseEntity.ok("");
  }

}
