package org.shemenevweb.magnetism.controller.rest;

import org.shemenevweb.magnetism.model.Role;
import org.shemenevweb.magnetism.service.interf.CRUDService;
import org.shemenevweb.magnetism.service.interf.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RoleRestController.ROLE_REST_URL)
public class RoleRestController extends CrudRestController<Role, Long> {

    public static final String ROLE_REST_URL = "role";

    @Autowired
    private RoleService roleService;

    @Override
    CRUDService<Role, Long> getService() {
        return roleService;
    }
}
