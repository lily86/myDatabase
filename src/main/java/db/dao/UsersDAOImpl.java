package db.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import db.domain.UsersEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(UsersEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @SuppressWarnings("unchecked")
    public List<UsersEntity> listUser() {

        return sessionFactory.getCurrentSession().createQuery("from UsersEntity")
                .list();
    }

    public UsersEntity getUser(String login) {
        List<UsersEntity> userList = new ArrayList<UsersEntity>();
        Query query = sessionFactory.getCurrentSession().createQuery("from users u where u.login = :login");
        query.setParameter("login", login);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }

    public void removeUser(BigInteger id) {
        UsersEntity user = (UsersEntity) sessionFactory.getCurrentSession().load(
                UsersEntity.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }

    }
}