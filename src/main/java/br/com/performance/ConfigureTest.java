package br.com.performance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Random;

import br.com.performance.interfaces.PerformanceViaCepInterface;
import br.com.performance.model.ConfigApplication;
import br.com.performance.model.PathUrl;
import br.com.performance.utils.Util;

public class ConfigureTest implements PerformanceViaCepInterface {
	private Random rand = new Random();

	private PathUrl path = new PathUrl("viacep.com.br", "ws", "json");

	private ConfigApplication conf = new ConfigApplication(2);
	private File diretorio = new File(conf.getDIR_JMETER());

	File arqURL = new File(diretorio, conf.getNOME_ARQ_URL() + conf.getEXT_ARQ());

	/**
	 * Gerador de conteúdo para arquivo URL.txt
	 */
	public boolean gravarURL() {
		if (arqURL.exists()) {
			try {
				FileWriter fw = new FileWriter(arqURL, false);
				PrintWriter pw = new PrintWriter(fw);

				pw.println(conf.getVAR_URL_JMETER());
				pw.print(path.getUrl());

				pw.flush();
				pw.close();

				return true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			criarArquivoURL();
			gravarURL();
		}
		return false;
	}

	/**
	 * Gerador de conteúdos para arquivos PATH_VU.txt
	 */
	public boolean gravarPath(int qtd) {
		criarArquivosPath();
		if (gravarVariaveisPath()) {
			for (int x = 0; x < conf.getQtdArqPathUrl(); x++) {
				for (int y = 0; y < qtd; y++) {

					if (x < 10) {
						try {
							FileWriter fw = new FileWriter(
									new File(diretorio, conf.getNORME_ARQ_PATH() + "0" + (x + 1) + conf.getEXT_ARQ()),
									true);
							PrintWriter pw = new PrintWriter(fw);

							pw.print("\n");
							if (x == 0) {
								int qtdListCep = Util.getListCep().size();
								String cep = Util.getListCep().get(rand.nextInt(qtdListCep));
								path.setContent(cep);

								pw.print(path.toString());
							} else {
								path.setContent(montarEndereço());
								pw.print(path.toString());
							}

							pw.flush();
							pw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						try {
							FileWriter fw = new FileWriter(
									new File(diretorio, conf.getNORME_ARQ_PATH() + (x + 1) + conf.getEXT_ARQ()), true);
							PrintWriter pw = new PrintWriter(fw);

							pw.print("\n");
							int qtdListCep = Util.getListCep().size();
							String cep = Util.getListCep().get(rand.nextInt(qtdListCep));
							path.setContent(cep);

							pw.print(path.toString());
							pw.print("\n");
							path.setContent(montarEndereço());
							pw.print(path.toString());

							pw.flush();
							pw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Grava valores das variáveis dos arquivos PATH_VU
	 * 
	 * @return true
	 */
	private boolean gravarVariaveisPath() {
		boolean status = false;
		for (int x = 0; x < conf.getQtdArqPathUrl(); x++) {
			if (x < 10) {
				try {
					FileWriter fw = new FileWriter(
							new File(diretorio, conf.getNORME_ARQ_PATH() + "0" + (x + 1) + conf.getEXT_ARQ()), false);
					PrintWriter pw = new PrintWriter(fw);

					pw.print(conf.getVAR_PATH_URL_JMETER() + "0" + (x + 1));

					pw.flush();
					pw.close();

					status = true;
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					FileWriter fw = new FileWriter(
							new File(diretorio, conf.getNORME_ARQ_PATH() + (x + 1) + conf.getEXT_ARQ()), false);
					PrintWriter pw = new PrintWriter(fw);

					pw.print(conf.getVAR_PATH_URL_JMETER() + (x + 1));

					pw.flush();
					pw.close();

					status = true;
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
		}

		return status;

	}

	/**
	 * Gerador de Arquivos PATH_VU.txt
	 */
	public boolean criarArquivosPath() {
		boolean statusArqPath = false;
		// Criando PATH_VU
		for (int x = 0; x < conf.getQtdArqPathUrl(); x++) {
			if (x < 10) {
				File arqPATH = new File(diretorio, conf.getNORME_ARQ_PATH() + "0" + (x + 1) + conf.getEXT_ARQ());
				if (!arqPATH.exists()) {
					try {
						statusArqPath = arqPATH.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				File arqPATH = new File(diretorio, conf.getNORME_ARQ_PATH() + (x + 1) + conf.getEXT_ARQ());
				if (!arqPATH.exists()) {
					try {
						statusArqPath = arqPATH.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return statusArqPath;

	}

	/**
	 * Gerador de arquivo URL.txt
	 */
	public boolean criarArquivoURL() {
		if (diretorio.exists()) {
			// Criando URL.txt
			if (!arqURL.exists()) {
				try {
					return arqURL.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	/**
	 * Retorna String para path de pesquisa por endereço.
	 * 
	 * @return String
	 */
	private String montarEndereço() {
		int status = 0;
		String cidade = "";
		String bairro = "";
		String uf = "";

		while (status != 1) {
			uf = Util.getListUf().get(rand.nextInt(Util.getListUf().size()));
			for (Map.Entry<String, String> ufCidade : Util.getUfCidade().entrySet()) {
				if (ufCidade.getKey().equals(uf)) {
					cidade = ufCidade.getValue();
					for (Map.Entry<String, String> cidadeBairro : Util.getCidadeBairo().entrySet()) {
						if (cidadeBairro.getKey().equals(cidade)) {
							bairro = cidadeBairro.getValue();
							status = 1;
							break;
						}
					}
				}
			}
		}

		return uf + "/" + cidade + "/" + bairro;
	}

}
