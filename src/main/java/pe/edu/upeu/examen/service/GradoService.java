package pe.edu.upeu.examen.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examen.entity.Grado;

public interface GradoService {
	Grado create(Grado a);
	Grado update(Grado a);
	void delete (Long id);
	Optional<Grado> read(Long id);
	List <Grado> readAll();

}
