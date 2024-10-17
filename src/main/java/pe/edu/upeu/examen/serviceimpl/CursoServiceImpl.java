package pe.edu.upeu.examen.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.dao.CursoDao;
import pe.edu.upeu.examen.entity.Curso;
import pe.edu.upeu.examen.service.CursoService;
@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoDao dao;
	
	@Override
	public Curso create(Curso a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Curso update(Curso a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
