
public class Stagista implements IConfronta {
	private String Nome;
	private String Cognome;
	private int Eta;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public int getEta() {
		return Eta;
	}

	public void setEta(int eta) {
		Eta = eta;
	}

	public Stagista(String nome, String cognome, int eta) {
		super();
		Nome = nome;
		Cognome = cognome;
		Eta = eta;
	}

	@Override
	public String toString() {
		return "Stagista [Nome =" + Nome + ", Cognome =" + Cognome + ", Eta =" + Eta + "]";
	}

	@Override
	public boolean minoreDi(int e) {
		// TODO Auto-generated method stub

		return false;
	}

}
