package Reto4_C4.Interface;


import Reto4_C4.Modelo.clothe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface interfaceClothe extends MongoRepository<clothe, String> {

    
}
