package db.dao;

import java.math.BigInteger;
import java.util.List;

import db.domain.PasswordsEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PasswordsDAOImpl implements PasswordsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addPassword(PasswordsEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @SuppressWarnings("unchecked")
    public List<PasswordsEntity> listPassword() {

        return sessionFactory.getCurrentSession().createQuery("from PasswordsEntity")
                .list();
    }

    public void removePassword(BigInteger id) {
        PasswordsEntity user = (PasswordsEntity) sessionFactory.getCurrentSession().load(
                PasswordsEntity.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }

    }
}