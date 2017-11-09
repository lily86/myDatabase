package db.dao;

import java.math.BigInteger;
import java.util.List;

import db.domain.PasswordsEntity;

public interface PasswordsDAO {

    public void addPassword(PasswordsEntity pw);

    public List<PasswordsEntity> listPassword();

    public void removePassword(BigInteger id);
}