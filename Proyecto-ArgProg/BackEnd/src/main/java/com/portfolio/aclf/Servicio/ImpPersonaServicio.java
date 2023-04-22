
package com.portfolio.aclf.Servicio;

import com.portfolio.aclf.Entidad.Persona;
import com.porfolio.dnp.Repositorio.IPersonaRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class ImpPersonaServicio {

    @Autowired
    IPersonaRepositorio ipersonaRepository;
    
    public List<Object> list(){
         return ipersonaRepository.findAll();
     }
     
     public Optional<Object> getOne(int id){
         return ipersonaRepository.findById(id);
     }
     
     public Optional<Object> getByNombre(String nombre){
         return ipersonaRepository.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         ipersonaRepository.save(persona);
     }
     
     public void delete(int id){
         ipersonaRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return ipersonaRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return ipersonaRepository.existsByNombre(nombre);
     }

    public void save(com.portfolio.aclf.Entity.Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
