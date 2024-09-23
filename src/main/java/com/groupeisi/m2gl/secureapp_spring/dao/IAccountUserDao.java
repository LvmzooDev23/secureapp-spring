package com.groupeisi.m2gl.secureapp_spring.dao;

import com.groupeisi.m2gl.secureapp_spring.entities.AccountUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountUserDao extends JpaRepository<AccountUserEntity,Integer> {
}
