package com.groupeisi.m2gl.secureapp_spring.service;

import com.groupeisi.m2gl.secureapp_spring.dao.IAccountUserDao;
import com.groupeisi.m2gl.secureapp_spring.entities.AccountUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountUserService implements IAccountUserService {

  public IAccountUserDao iAccountUserDao;

  public AccountUserService(IAccountUserDao iAccountUserDao) {
    this.iAccountUserDao = iAccountUserDao;
  }
  @Override
  public void createUser(AccountUserEntity user) {
    iAccountUserDao.save(user);
  }

  @Override
  public List<AccountUserEntity> getAllUsers() {
    return iAccountUserDao.findAll();
  }

  @Override
  public void updateUser(int id, AccountUserEntity user) {
    Optional<AccountUserEntity> existingUser = iAccountUserDao.findById(id);
    if (existingUser.isPresent()) {
      AccountUserEntity updatedUser = existingUser.get();
      updatedUser.setEmail(user.getEmail());
      updatedUser.setPassword(user.getPassword());
      updatedUser.setState(user.isState());
      iAccountUserDao.save(updatedUser);
    }
  }

  @Override
  public void deleteUser(int id) {
    iAccountUserDao.deleteById(id);
  }
}
