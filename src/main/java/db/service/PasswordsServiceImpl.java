package db.service;

import db.dao.PasswordsDAO;
import db.domain.PasswordsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
public class PasswordsServiceImpl implements PasswordsService {

    @Autowired
    private PasswordsDAO passwordsDAO;

    @Transactional
    public void addPassword(PasswordsEntity pw) {
        passwordsDAO.addPassword(pw);
    }

    @Transactional
    public List<PasswordsEntity> listPassword() {

        return passwordsDAO.listPassword();
    }

    @Transactional
    public void removePassword(BigInteger id) {
        passwordsDAO.removePassword(id);
    }
}
