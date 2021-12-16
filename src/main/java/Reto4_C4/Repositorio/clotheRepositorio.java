
package Reto4_C4.Repositorio;

import Reto4_C4.Interface.interfaceClothe;
import Reto4_C4.Modelo.clothe;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Diana L
 */
@Repository
public class clotheRepositorio {
    
    @Autowired
    private interfaceClothe crud;

    public List<clothe> getAll() {
        return crud.findAll();
    }

    public Optional<clothe> getClothe(String reference) {
        return crud.findById(reference);
    }

    public clothe create(clothe clothe) {
        return crud.save(clothe);
    }

    public void update(clothe clothe) {
        crud.save(clothe);
    }

    public void delete(clothe clothe) {
        crud.delete(clothe);
    }
}
