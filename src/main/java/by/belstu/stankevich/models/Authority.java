package by.belstu.stankevich.models;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Authority {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(referencedColumnName="login")
    private User login;
    private String role;

    public User getLogin() {
        return login;
    }

    public void setLogin(User login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
