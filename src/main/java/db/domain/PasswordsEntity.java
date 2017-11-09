package db.domain;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "passwords", schema = "public", catalog = "mydb")
public class PasswordsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 0)
    private BigInteger id;

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }
}
