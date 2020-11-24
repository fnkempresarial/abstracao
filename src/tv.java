
public class tv extends Eletrodomestico {

	private int tamanho;
	private int canal;
	private int volume;
	
	public tv(int tamanho, int voltagem) {
		super(false, voltagem);
	this.tamanho = tamanho;
	setCanal(0);
	setVolume(0);
	
	}

	@Override
	public void ligar() {
		super.setLigado(true);
		setCanal(4);
		setVolume(30);
	}

	@Override
	public void desligar() {		
		super.setLigado(false);
		setCanal(0);
		setVolume(0);
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
}
