package conecta4;

public class ficha {
	
	private String tipo_;
	
	public ficha(String tipo){
		tipo_ = tipo;
	}

	public String getTipo_() {
		return tipo_;
	}
	
	@Override
	public String toString() {
		return getTipo_();
	}
	
}
