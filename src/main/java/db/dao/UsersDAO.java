package db.dao;

import java.math.BigInteger;
import java.util.List;
import db.domain.UsersEntity;

public interface UsersDAO {

    public void addUser(UsersEntity user);

    public UsersEntity getUser(String login);

    public List<UsersEntity> listUser();

    public void removeUser(BigInteger id);
}