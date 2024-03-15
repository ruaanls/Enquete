
public class Resposta {

	private String pessoa;
	private String texto;
	private int pergunta; //numero da pergunta
	
	public Resposta() {
	}
	
	public Resposta(String pessoa, String texto, int questao) {
		this.pessoa = pessoa;
		this.texto = texto;
		this.pergunta = questao;
	}
	
	public int getPergunta() {
		return pergunta;
	}
	
	public void setPergunta(int pergunta) {
		this.pergunta = pergunta;
	}
	
	
}
