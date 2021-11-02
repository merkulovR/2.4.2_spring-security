package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    void addRole(Role role);
    void deleteRole(String name);
    Role getRole(String name);
}
