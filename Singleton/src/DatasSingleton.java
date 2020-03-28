import java.time.LocalDate;

public class DatasSingleton {
	
	private LocalDate dataAtual = LocalDate.now();

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}
}
