package co.edu.usa.ciclo.cuatro.cuatro.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="user")
public class Usuario implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_email",nullable=false,length=50, unique=true)
    private String email;

    @Column(name="user_password",nullable=false)
    private String password;

    @Column(name="user_name",nullable=false,length=50)
    private String name;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(Integer id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Usuario(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Usuario() {
    }

    



    


    

    
}
