package pe.edu.upeu.examen.daoImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import pe.edu.upeu.examen.dao.EmpleadoDao;
import pe.edu.upeu.examen.entity.Empleado;
import pe.edu.upeu.examen.repository.EmpleadoRepository;
@Component
public class EmpleadoDaoImpl implements EmpleadoDao{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado create(Empleado a) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(a);
	}

	@Override
	public Empleado update(Empleado a) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}
}

