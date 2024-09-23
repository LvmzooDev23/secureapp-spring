package com.groupeisi.m2gl.secureapp_spring.mapper;

import com.groupeisi.m2gl.secureapp_spring.dto.AccountUserDto;
import com.groupeisi.m2gl.secureapp_spring.entities.AccountUserEntity;

public class AccountUserMapper {
  public static AccountUserDto toAccountUserDto(AccountUserEntity accountUserEntity)
  {
    return new AccountUserDto();
  }

  public static AccountUserEntity toAccountUserEntity(AccountUserDto accountUserDto)
  {
    return new AccountUserEntity();
  }
}
