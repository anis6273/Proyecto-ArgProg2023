package com.portfolio.aclf.Service;

import com.portfolio.aclf.Entity.Persona;
import com.portfolio.aclf.Interface.IPersonaService;
import com.portfolio.aclf.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonarepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
                return persona;
    }

    @Override
    public void savePersona(Persona persona) {
      ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long Id) {
        ipersonarepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(Long Id) {
        Persona persona = ipersonarepository.findById(Id).orElse(null);
        return persona;
    }
    
}
