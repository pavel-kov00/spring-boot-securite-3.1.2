package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }


    @Override
    public Set<Role> getallrole() {
        return roleDao.getallrole();
    }

    @Override
    public Role getRolebyId(long id) {
        return roleDao.getRolebyId(id);
    }

    @Override
    public Role getByName(String rolename) {
        return roleDao.getByName(rolename);
    }
}
