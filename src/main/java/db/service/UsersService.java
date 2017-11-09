package db.service;

import java.math.BigInteger;
import java.util.List;
import db.domain.UsersEntity;

public interface UsersService {

    public void addUser(UsersEntity user);

    public List<UsersEntity> listUser();

    public void removeUser(BigInteger id);
}