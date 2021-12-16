package Reto4_C4;

import Reto4_C4.Interface.interfaceClothe;
import Reto4_C4.Interface.interfaceOrder;
import Reto4_C4.Interface.interfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
/**
 *
 * @author Diana L
 */
@Component
@SpringBootApplication
public class Ciclo4Application implements CommandLineRunner {
    @Autowired
    private interfaceClothe interfaceClothe;
    @Autowired
    private interfaceUser interfaceUser;
    @Autowired
    private interfaceOrder interOrder;
    
	public static void main(String[] args) {
		SpringApplication.run(Ciclo4Application.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
  
        interfaceClothe.deleteAll();
        interfaceUser.deleteAll();
        interOrder.deleteAll();
        
        
    }
}
