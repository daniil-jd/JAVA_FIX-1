package ru.kai.mvc.dao;



import ru.kai.mvc.models.User;

import java.util.List;

/**
 * 04.04.2018
 * UsersDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByFirstNamePrefix(String firstNamePrefix);
}
