package org.users.Entity;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
//The @UserDefinition annotation must be present on a single entity
// and can be either a regular Hibernate ORM entity or a Hibernate ORM with Panache entity.
@UserDefinition
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //  The @Username and @Password field types are always String.
    @Column(name = "username", nullable = false)
  //  Indicates the field used for the username.
    @Username
    private String username;

    @Column(name = "password", nullable = false)
    //  Indicates the field used for the password.
    @Password

    @JsonbTransient
 // Prevents mapping of a Java Bean property, field or type to JSON representation.
    private String password;

   // Quarkus security offers a Jakarta Persistence integration to collect
    // usernames, passwords, and roles, and store them into Jakarta Persistence database entities.

    @Column(name = "role", nullable = false)
    @Roles
    // Specifies the list of security roles permitted to access methods in an application
    private String role;

    @Column(name = "first_name", nullable = false)
    @NotBlank
    @Size(max = 256)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank
    @Size(max = 256)
    private String lastName;

    @Column(name = "age", nullable = false)
    @Min(1)
    @Max(200)
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BcryptUtil.bcryptHash(password);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
