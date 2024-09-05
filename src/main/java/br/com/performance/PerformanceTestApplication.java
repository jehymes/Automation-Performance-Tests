package br.com.performance;

public class PerformanceTestApplication {

	public static void main(String[] args) {
		ConfigureTest test = new ConfigureTest();
		test.gravarURL();
		test.gravarPath(1000);
		System.out.println("Arquivos criados com sucesso!");
	}
	
}
