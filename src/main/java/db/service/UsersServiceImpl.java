package db.service;

import java.math.BigInteger;
import java.util.List;

import db.domain.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import db.dao.UsersDAO;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;

    @Transactional
    public void addUser(UsersEntity user) {
        usersDAO.addUser(user);
    }

    @Transactional
    public List<UsersEntity> listUser() {

        return usersDAO.listUser();
    }

    @Transactional
    public void removeUser(BigInteger id) {
        usersDAO.removeUser(id);
    }
}