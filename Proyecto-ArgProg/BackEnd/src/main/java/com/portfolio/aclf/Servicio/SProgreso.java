
package com.portfolio.aclf.Servicio;

import com.porfolio.dnp.Repositorio.RProgreso;
import com.portfolio.aclf.Entidad.progreso;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Transactional
@Service
public class SProgreso {
    @Autowired
    RProgreso rprogreso;
    
    public List<Object> list(){
        return rprogreso.findAll();
    }
    
    public Optional<Object> getOne(int id){
        return rprogreso.findById(id);
    }
    
    public Optional<Object> getByNombre(String nombre){
        return rprogreso.findByNombre(nombre);
    }
    
    public void save(progreso skill){
        rprogreso.save(skill);
    }
    
    public void delete(int id){
        rprogreso.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rprogreso.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rprogreso.existsByNombre(nombre);
    }
}

