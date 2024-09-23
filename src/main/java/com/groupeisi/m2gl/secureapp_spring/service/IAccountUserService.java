package com.groupeisi.m2gl.secureapp_spring.service;

import com.groupeisi.m2gl.secureapp_spring.entities.AccountUserEntity;

import java.util.List;

public interface IAccountUserService {

  void createUser(AccountUserEntity user);
  List<AccountUserEntity> getAllUsers();
  void updateUser(int id, AccountUserEntity user);
  void deleteUser(int id);
}
