package com.groupeisi.m2gl.secureapp_spring.controller;

import com.groupeisi.m2gl.secureapp_spring.entities.AccountUserEntity;
import com.groupeisi.m2gl.secureapp_spring.service.AccountUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class AccountUserController{

  public AccountUserService accountUserService;
  public AccountUserController(AccountUserService accountUserService) {
    this.accountUserService = accountUserService;
  }

  @PostMapping
  public void createUser(@RequestBody AccountUserEntity user) {
    accountUserService.createUser(user);
  }

  @GetMapping
  public List<AccountUserEntity> getAllUsers() {
    return accountUserService.getAllUsers();
  }

  @PutMapping("/{id}")
  public void updateUser(@PathVariable int id, @RequestBody AccountUserEntity user) {
    accountUserService.updateUser(id, user);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable int id) {
    accountUserService.deleteUser(id);
  }
}