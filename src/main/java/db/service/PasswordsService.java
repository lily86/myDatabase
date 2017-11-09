package db.service;

import java.math.BigInteger;
import java.util.List;

import db.domain.PasswordsEntity;

public interface PasswordsService {

    public void addPassword(PasswordsEntity pw);

    public List<PasswordsEntity> listPassword();

    public void removePassword(BigInteger id);
}
