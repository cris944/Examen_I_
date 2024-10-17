package pe.edu.upeu.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import pe.edu.upeu.examen.dao.MatriculaDao;
import pe.edu.upeu.examen.entity.Matricula;
import pe.edu.upeu.examen.repository.MatriculaRepository;
@Component
public class MatriculaDaoImpl implements MatriculaDao{

	@Autowired
	private MatriculaRepository gradoRepository;
	
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return gradoRepository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return gradoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradoRepository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return gradoRepository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return gradoRepository.findAll();
	}
}
