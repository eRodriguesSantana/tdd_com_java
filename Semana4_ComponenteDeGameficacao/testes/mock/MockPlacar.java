package mock;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import classes.Usuario;
import interfaces.Placar;

public class MockPlacar implements Placar{
	ArrayList <Usuario> usuarios = new ArrayList<Usuario>();

	@Override
	public void registrarPonto(String nome, int ponto, String tipo) {
		Usuario usuario = getUsuario(nome);
		usuario.adicionaTipo(tipo, ponto);
		
	}

	@Override
	public String[] getUsuarioPontoTipo() {
		String tipos;
		String[] tiposSplit;
		String[] userPontoTipo = null;
		int cont = 0;
		
		for(Usuario users : usuarios){
			tipos = users.getTipos();
			tiposSplit = tipos.split(";");
			
			userPontoTipo = new String[tiposSplit.length];
			for(String s : tiposSplit){
				userPontoTipo[cont] = users.getNome() + ";" + users.getPontos(s) + ";" + s;
			}
			cont++;
		}
		return userPontoTipo;
	}

	@Override
	public List<String> getPontosRanking(String tipo) {
		List<String> rank = new ArrayList<String>();
		
		for(String s : rank){
			System.out.println(s);
		}
		return rank;
	}
	
	public Usuario getUsuario(String nome) {
		for(Usuario user : usuarios){
			if(user.getNome() == nome)
				return user;
		}
		return null;
	}
	
	Usuario user1;
	Usuario user2;
	
	@Before
	public void inicializacao(){
		usuarios.add(new Usuario("Guerra"));
		usuarios.add(new Usuario("Gleider"));
		usuarios.add(new Usuario("Mario"));
		usuarios.add(new Usuario("Luis"));
		this.registrarPonto("Guerra", 10, "Estrela");
		this.registrarPonto("Guerra", 15, "Estrela");
		this.registrarPonto("Gleider", 5, "Estrela");
		this.registrarPonto("Gleider", 20, "Moeda");
		this.registrarPonto("Mario", 50, "Estrela");
		this.registrarPonto("Luis", 15, "Estrela");
	
		
	}
	
	@Test
	public void testRegistrarPonto(){
		user1 = getUsuario("Guerra");
		user2 = getUsuario("Gleider");
		
		assertEquals(user1.getPontos("Estrela"), 25);
		assertEquals(user2.getPontos("Estrela"), 5);
		assertEquals(user2.getPontos("Moeda"), 20);
	}
	
	@Test
	public void testGetUsuarioPontoTipo(){
		
		getPontosRanking("Estrela");
	}

}
