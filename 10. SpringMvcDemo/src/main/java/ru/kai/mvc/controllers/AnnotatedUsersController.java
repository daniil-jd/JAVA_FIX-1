package ru.kai.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.kai.mvc.dao.UsersDao;
import ru.kai.mvc.forms.UserForm;
import ru.kai.mvc.models.User;
import ru.kai.mvc.repositories.UsersRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * 23.04.2018
 * AnnotatedUsersController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class AnnotatedUsersController {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(path = "/jpa/users")
    public ModelAndView getUsersByJpa() {
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("usersFromServer", usersRepository.findAll());
        return modelAndView;
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ModelAndView getUsers(@RequestParam(value = "first_name_prefix", required = false) String firstNamePrefix) {
        List<User> users;

        if (firstNamePrefix != null) {
            users = usersDao.findAllByFirstNamePrefix(firstNamePrefix);
        } else {
            users = usersDao.findAll();
        }
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("usersFromServer", users);
        return modelAndView;
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute UserForm userForm) {
        User newUser = User.builder()
                .lastName(userForm.getLastName())
                .firstName(userForm.getFirstName())
                .build();
        usersDao.save(newUser);
        return new ModelAndView("redirect:/users");
    }

    @RequestMapping(path = "/users/{user-id}", method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable("user-id") Long userId) {
        Optional<User> userCandidate = usersDao.find(userId);
        if (userCandidate.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("users");
            modelAndView.addObject("usersFromServer", Collections.singletonList(userCandidate.get()));
            return modelAndView;
        }
        else return new ModelAndView("error");
    }
}
