package ru.kai.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kai.mvc.models.User;

/**
 * 23.04.2018
 * UsersRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository extends JpaRepository<User, Long>{
}
