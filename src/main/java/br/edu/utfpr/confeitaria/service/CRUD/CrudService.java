package br.edu.utfpr.confeitaria.service.CRUD;

import br.edu.utfpr.confeitaria.model.Model;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Slf4j
public abstract class CrudService<T extends Model, R> {

    public abstract JpaRepository<T, R> getRepository();

    List<T> findAll() {
        return getRepository().findAll();
    }

    public T save(T object) {
        assert object != null;
        log.info("Saving {}", object.getClass().getSimpleName());
        return getRepository().save(object);
    }

    public T getById(R id) {
        log.info("Fetching elemnt {}", id);
        return getRepository().getById(id);
    }

    public void delete(T object) {
        getRepository().delete(object);
    }

    public void delete(R id){
        getRepository().deleteById(id);
    }

}
