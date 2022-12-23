package org.shemenevweb.magnetism.controller.rest;

import org.shemenevweb.magnetism.model.User;
import org.shemenevweb.magnetism.service.interf.CRUDService;
import org.shemenevweb.magnetism.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserRestController.USER_REST_URL)
public class UserRestController extends CrudRestController<User, Long> {

    public static final String USER_REST_URL = "user";

    @Autowired
    private UserService userService;

    @Override
    CRUDService<User, Long> getService() {
        return userService;
    }
}
