package com.flowingsun.user.dao;

import com.flowingsun.user.entity.RolePermisson;
import org.apache.ibatis.annotations.Param;

public interface RolePermissonMapper {

    Integer insertByRoleIdPermissionId(@Param("roleId") Integer roleId,@Param("permissionId") Integer permissionId);

    int insert(RolePermisson record);

    int insertSelective(RolePermisson record);
}