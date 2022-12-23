package org.shemenevweb.magnetism.controller.rest;

import org.shemenevweb.magnetism.model.Task;
import org.shemenevweb.magnetism.service.interf.CRUDService;
import org.shemenevweb.magnetism.service.interf.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(TaskRestController.TASK_REST_URL)
@RestController
public class TaskRestController extends CrudRestController<Task, Long> {

    public static final String TASK_REST_URL = "task";

    @Autowired
    private TaskService taskService;

    @Override
    CRUDService<Task, Long> getService() {
        return taskService;
    }
}
