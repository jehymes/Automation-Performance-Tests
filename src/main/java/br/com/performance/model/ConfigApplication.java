package br.com.performance.model;

public class ConfigApplication {

	private final String DIR_JMETER = "./src/test/jmeter/";
	private final String NOME_ARQ_URL = "URL";
	private final String NORME_ARQ_PATH = "PATH_VU";
	private final String VAR_URL_JMETER = "P_URL";
	private final String VAR_PATH_URL_JMETER = "P_";
	private final String EXT_ARQ = ".txt";

	private int qtdArqPathUrl = 0;

	public ConfigApplication() {
		super();
	}

	public ConfigApplication(int qtdArqPathUrl) {
		super();
		this.qtdArqPathUrl = qtdArqPathUrl;
	}

	public String getDIR_JMETER() {
		return DIR_JMETER;
	}

	public String getNOME_ARQ_URL() {
		return NOME_ARQ_URL;
	}

	public String getNORME_ARQ_PATH() {
		return NORME_ARQ_PATH;
	}

	public String getVAR_URL_JMETER() {
		return VAR_URL_JMETER;
	}

	public String getVAR_PATH_URL_JMETER() {
		return VAR_PATH_URL_JMETER;
	}

	public String getEXT_ARQ() {
		return EXT_ARQ;
	}

	public int getQtdArqPathUrl() {
		return qtdArqPathUrl;
	}

	public void setQtdArqPathUrl(int qtdArqPathUrl) {
		this.qtdArqPathUrl = qtdArqPathUrl;
	}

}
