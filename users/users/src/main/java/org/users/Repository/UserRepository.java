package org.users.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.users.Entity.User;

@ApplicationScoped
// @ApplicationScoped annotation is used to define a bean as an application-scoped bean,
// meaning it will be created only once per application and shared among all clients.
public class UserRepository implements PanacheRepository<User> {
}