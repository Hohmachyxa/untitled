package com.example.untitled.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Login", nullable = false, unique = true)
    private String login;

    @Column(name = "E-Mail", nullable = false, unique = true)
    private String mail;

    @Column(name = "Creation time", nullable = false, unique = true)
    private Date date;

    public User(String login, String mail) {
        this.login = login;
        this.mail = mail;
    }

    public void setName(String name) {

    }

    public void setmail(String mail) {
    }
}


