package db.domain;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "users", schema = "public", catalog = "mydb")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 0)
    private BigInteger id;

    @Basic
    @Column(name = "login", nullable = false, length = 255)
    private String login;

    @OneToOne(mappedBy = "user")
    private PasswordsEntity pw;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public PasswordsEntity getPasswordsEntity() {
        return pw;
    }

    public void setPasswordsEntity(PasswordsEntity pw) {
        this.pw = pw;
    }
}
