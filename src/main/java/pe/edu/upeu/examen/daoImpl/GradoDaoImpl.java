package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import pe.edu.upeu.examen.dao.GradoDao;
import pe.edu.upeu.examen.entity.Grado;
import pe.edu.upeu.examen.repository.GradoRepository;
@Component
public class GradoDaoImpl implements GradoDao{

	@Autowired
	private GradoRepository cursoRepository;
	
	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return cursoRepository.save(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return cursoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}
}


