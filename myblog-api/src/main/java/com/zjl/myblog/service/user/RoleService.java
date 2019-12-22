package com.zjl.myblog.service.user;

import com.zjl.myblog.domain.RoleDO;

import java.util.List;

public interface RoleService {

     RoleDO addRole(RoleDO role) throws Exception;

     List<RoleDO> addRoles(List<RoleDO> roles) throws Exception;

}
