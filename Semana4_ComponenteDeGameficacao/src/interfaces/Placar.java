package interfaces;

import java.util.List;

import classes.Usuario;

public interface Placar {
	public void registrarPonto(String user, int ponto, String tipo);
	public String[] getUsuarioPontoTipo();
	public List<String> getPontosRanking(String tipo);
}
