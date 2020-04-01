package eu.ensup.springjpa.service;

import eu.ensup.springjpa.dao.IEleveDao;
import eu.ensup.springjpa.domaine.Eleve;

import java.util.List;

public class EleveService {

	private IEleveDao elevedao;

	public EleveService(IEleveDao elevedao) {
		super();
		this.elevedao = elevedao;
	}

	public EleveService() {
		super();
	}

	public IEleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(IEleveDao elevedao) {
		this.elevedao = elevedao;
	}

	public List<Eleve> findByNom(String Nom){
		return elevedao.findByNom(Nom);
	}

	public void initialisation() {
		System.out.println("Creation de l'objet service");
	}

	public void destruction() {
		System.out.println("Destruction de l'objet service");
	}
}
