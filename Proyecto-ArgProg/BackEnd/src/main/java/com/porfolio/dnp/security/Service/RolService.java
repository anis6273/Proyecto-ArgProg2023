package com.porfolio.dnp.Security.Service;

import com.porfolio.dnp.Security.Repository.IRolRepository;
import com.porfolio.dnp.Security.Entity.Rol;
import com.porfolio.dnp.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela
 */
@Service
@Transactional
public class RolService {

    @Autowired
    IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
