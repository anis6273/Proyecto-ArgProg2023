
package com.portfolio.aclf.Servicio;

import com.portfolio.aclf.Entidad.Educacion;
import com.porfolio.dnp.Repositorio.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Object> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Object> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Object> getByNmbreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    }
}
