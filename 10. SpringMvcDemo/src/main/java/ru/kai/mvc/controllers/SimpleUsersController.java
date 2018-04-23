package ru.kai.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.kai.mvc.dao.UsersDao;
import ru.kai.mvc.forms.UserForm;
import ru.kai.mvc.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * 23.04.2018
 * SimpleUsersController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleUsersController implements Controller {

    @Autowired
    private UsersDao usersDao;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if (httpServletRequest.getMethod().equals("GET")) {
            List<User> users = usersDao.findAll();

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("usersFromServer", users);
            modelAndView.setViewName("users");
            return modelAndView;
        } else if (httpServletRequest.getMethod().equals("POST")) {
            String firstName = httpServletRequest.getParameter("firstName");
            String lastName = httpServletRequest.getParameter("lastName");
            User newUser = User.builder()
                    .firstName(firstName)
                    .lastName(lastName)
                    .build();
            usersDao.save(newUser);
            return new ModelAndView("redirect:/simple/users");
        }
        return null;
    }


}
