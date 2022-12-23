package org.shemenevweb.magnetism.service.interf;

import java.util.List;

public interface CRUDService<E, I> {

void create(E entity);
E findById(I id);
List<E> findAll();
E update(E entity);
void delete(E entity);


}

