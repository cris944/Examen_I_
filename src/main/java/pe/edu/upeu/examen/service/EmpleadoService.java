package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Empleado;



public interface EmpleadoService {
	Empleado create(Empleado a);
	Empleado update(Empleado a);
	void delete (Long id);
	Optional<Empleado> read(Long id);
	List <Empleado> readAll();
}
