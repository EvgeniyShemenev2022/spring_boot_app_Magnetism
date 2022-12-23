package org.shemenevweb.magnetism.controller.rest;

import org.shemenevweb.magnetism.service.interf.CRUDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public abstract class CrudRestController<E, I> {

    abstract CRUDService<E, I> getService();

    @PostMapping
    public ResponseEntity<E> create(@RequestBody E entity) {
        getService().create(entity);

        return ResponseEntity.ok(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> findById(@PathVariable I id) {

        E object = getService().findById(id);
        if (object == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(object);
    }

    @GetMapping
    public ResponseEntity<List<E>> findAll() {
        List<E> objects = getService().findAll();

        return ResponseEntity.ok(objects);
    }

    @PutMapping
    public ResponseEntity<E> update(@PathVariable E entity) {
        E updatedObject = getService().update(entity);

        return ResponseEntity.ok(updatedObject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable I id) {
        E objectForDelete = getService().findById(id);
        getService().delete(objectForDelete);

        return ResponseEntity.noContent().build();
    }

}
