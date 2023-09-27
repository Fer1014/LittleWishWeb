package pe.edu.upc.aaw.littlewishproject.entities;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"}) })
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "rol",nullable = false, length = 45)
    private String rol;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users users;

    public Role() {
    }

    public Role(int id, String rol, Users users) {
        Id = id;
        this.rol = rol;
        this.users = users;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
