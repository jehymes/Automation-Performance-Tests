package br.com.performance.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

public class Util {
	static Random rand = new Random();

	public static ArrayList<String> getListUf() {
		List<String> ufs = new ArrayList<String>();
		ufs.add("AC");
		ufs.add("AL");
		ufs.add("AP");
		ufs.add("AM");
		ufs.add("BA");
		ufs.add("CE");
		ufs.add("DF");
		ufs.add("ES");
		ufs.add("GO");
		ufs.add("MA");
		ufs.add("MT");
		ufs.add("MS");
		ufs.add("MG");
		ufs.add("PA");
		ufs.add("PB");
		ufs.add("PR");
		ufs.add("PE");
		ufs.add("PI");
		ufs.add("RJ");
		ufs.add("RN");
		ufs.add("RS");
		ufs.add("RO");
		ufs.add("RR");
		ufs.add("SC");
		ufs.add("SP");
		ufs.add("SE");
		ufs.add("TO");

		return (ArrayList<String>) ufs;
	}

	public static HashMap<String, Integer> getCodEstado() {
		HashMap<String, Integer> codEstado = new HashMap<String, Integer>();
		for (String uf : Util.getListUf()) {
			switch (uf) {
			case "AC":
				codEstado.put(uf, 12);
				break;
			case "AL":
				codEstado.put(uf, 27);
				break;
			case "AM":
				codEstado.put(uf, 13);
				break;
			case "AP":
				codEstado.put(uf, 16);
				break;
			case "BA":
				codEstado.put(uf, 29);
				break;
			case "CE":
				codEstado.put(uf, 23);
				break;
			case "DF":
				codEstado.put(uf, 53);
				break;
			case "ES":
				codEstado.put(uf, 32);
				break;
			case "GO":
				codEstado.put(uf, 52);
				break;
			case "MA":
				codEstado.put(uf, 21);
				break;
			case "MG":
				codEstado.put(uf, 31);
				break;
			case "MS":
				codEstado.put(uf, 50);
				break;
			case "MT":
				codEstado.put(uf, 51);
				break;
			case "PA":
				codEstado.put(uf, 15);
				break;
			case "PB":
				codEstado.put(uf, 25);
				break;
			case "PE":
				codEstado.put(uf, 26);
				break;
			case "PI":
				codEstado.put(uf, 22);
				break;
			case "PR":
				codEstado.put(uf, 41);
				break;
			case "RJ":
				codEstado.put(uf, 33);
				break;
			case "RN":
				codEstado.put(uf, 24);
				break;
			case "RO":
				codEstado.put(uf, 11);
				break;
			case "RR":
				codEstado.put(uf, 14);
				break;
			case "RS":
				codEstado.put(uf, 43);
				break;
			case "SC":
				codEstado.put(uf, 42);
				break;
			case "SE":
				codEstado.put(uf, 28);
				break;
			case "SP":
				codEstado.put(uf, 35);
				break;
			case "TO":
				codEstado.put(uf, 17);
				break;
			default:
				break;
			}
		}
		return codEstado;
	}

	public static ArrayList<String> getListCep() {
		List<String> ceps = new ArrayList<String>();
		// AC
		ceps.add("69901070");
		ceps.add("69903291");
		ceps.add("69903327");
		ceps.add("69905514");
		ceps.add("69906462");
		ceps.add("69911512");
		ceps.add("69911518");
		ceps.add("69911878");
		ceps.add("69912326");
		ceps.add("69915288");
		ceps.add("69915634");
		ceps.add("69915678");
		ceps.add("69915882");
		ceps.add("69918258");
		ceps.add("69918434");
		ceps.add("69919380");
		ceps.add("69920050");
		ceps.add("69920088");
		ceps.add("69921186");
		ceps.add("69929970");
		// AL
		ceps.add("57010688");
		ceps.add("57010876");
		ceps.add("57014508");
		ceps.add("57018105");
		ceps.add("57025665");
		ceps.add("57030672");
		ceps.add("57032071");
		ceps.add("57038230");
		ceps.add("57038690");
		ceps.add("57039425");
		ceps.add("57040528");
		ceps.add("57040740");
		ceps.add("57042770");
		ceps.add("57043378");
		ceps.add("57045560");
		ceps.add("57048040");
		ceps.add("57048724");
		ceps.add("57051010");
		ceps.add("57060020");
		ceps.add("57062654");
		// AM
		ceps.add("69006820");
		ceps.add("69008355");
		ceps.add("69015202");
		ceps.add("69015310");
		ceps.add("69020417");
		ceps.add("69020710");
		ceps.add("69021055");
		ceps.add("69030300");
		ceps.add("69033696");
		ceps.add("69035814");
		ceps.add("69036162");
		ceps.add("69036586");
		ceps.add("69039550");
		ceps.add("69039611");
		ceps.add("69040050");
		ceps.add("69040660");
		ceps.add("69041195");
		ceps.add("69041784");
		ceps.add("69046700");
		ceps.add("69047236");
		// AP
		ceps.add("68903083");
		ceps.add("68903118");
		ceps.add("68903410");
		ceps.add("68903450");
		ceps.add("68903886");
		ceps.add("68904345");
		ceps.add("68904350");
		ceps.add("68906177");
		ceps.add("68908049");
		ceps.add("68908127");
		ceps.add("68908511");
		ceps.add("68908788");
		ceps.add("68908815");
		ceps.add("68908897");
		ceps.add("68909011");
		ceps.add("68909159");
		ceps.add("68911140");
		ceps.add("68912500");
		ceps.add("68925025");
		ceps.add("68926385");
		// BA
		ceps.add("40024106");
		ceps.add("40040495");
		ceps.add("40080060");
		ceps.add("40110020");
		ceps.add("40220350");
		ceps.add("40225510");
		ceps.add("40226283");
		ceps.add("40230049");
		ceps.add("40240760");
		ceps.add("40243510");
		ceps.add("40276090");
		ceps.add("40279200");
		ceps.add("40286560");
		ceps.add("40290700");
		ceps.add("40296290");
		ceps.add("40301156");
		ceps.add("40310035");
		ceps.add("40313195");
		ceps.add("40313530");
		ceps.add("40313585");
		// CE
		ceps.add("60020290");
		ceps.add("60040531");
		ceps.add("60055420");
		ceps.add("60120095");
		ceps.add("60125100");
		ceps.add("60130540");
		ceps.add("60135600");
		ceps.add("60160240");
		ceps.add("60165430");
		ceps.add("60170030");
		ceps.add("60170090");
		ceps.add("60170970");
		ceps.add("60180190");
		ceps.add("60180720");
		ceps.add("60184260");
		ceps.add("60190350");
		ceps.add("60191705");
		ceps.add("60330410");
		ceps.add("60336620");
		ceps.add("60337305");
		// DF
		ceps.add("70041903");
		ceps.add("70070943");
		ceps.add("70075900");
		ceps.add("70150000");
		ceps.add("70200695");
		ceps.add("70257140");
		ceps.add("70258520");
		ceps.add("70296500");
		ceps.add("70303907");
		ceps.add("70307000");
		ceps.add("70308000");
		ceps.add("70313916");
		ceps.add("70373000");
		ceps.add("70385060");
		ceps.add("70393900");
		ceps.add("70648057");
		ceps.add("70650596");
		ceps.add("70658194");
		ceps.add("70658332");
		ceps.add("70670300");
		// ES
		ceps.add("29016540");
		ceps.add("29017047");
		ceps.add("29017282");
		ceps.add("29025669");
		ceps.add("29026763");
		ceps.add("29027017");
		ceps.add("29027105");
		ceps.add("29027110");
		ceps.add("29032373");
		ceps.add("29032567");
		ceps.add("29043236");
		ceps.add("29043528");
		ceps.add("29047275");
		ceps.add("29047486");
		ceps.add("29047823");
		ceps.add("29050637");
		ceps.add("29050800");
		ceps.add("29051097");
		ceps.add("29052075");
		ceps.add("29056184");
		// GO
		ceps.add("72812150");
		ceps.add("72812565");
		ceps.add("72816220");
		ceps.add("72821480");
		ceps.add("72821510");
		ceps.add("72823568");
		ceps.add("72830210");
		ceps.add("72833506");
		ceps.add("72833610");
		ceps.add("72833615");
		ceps.add("72833661");
		ceps.add("72851355");
		ceps.add("72851610");
		ceps.add("72851640");
		ceps.add("72853133");
		ceps.add("72853390");
		ceps.add("72856550");
		ceps.add("72856652");
		ceps.add("72856726");
		ceps.add("72860006");
		// MA
		ceps.add("65015971");
		ceps.add("65025640");
		ceps.add("65035501");
		ceps.add("65040390");
		ceps.add("65042063");
		ceps.add("65043540");
		ceps.add("65043660");
		ceps.add("65047390");
		ceps.add("65049270");
		ceps.add("65050470");
		ceps.add("65052872");
		ceps.add("65054092");
		ceps.add("65054866");
		ceps.add("65055085");
		ceps.add("65055471");
		ceps.add("65057170");
		ceps.add("65058037");
		ceps.add("65058128");
		ceps.add("65058207");
		ceps.add("65058246");
		// MG
		ceps.add("30180020");
		ceps.add("30190924");
		ceps.add("30210170");
		ceps.add("30220421");
		ceps.add("30230042");
		ceps.add("30260532");
		ceps.add("30270380");
		ceps.add("30290649");
		ceps.add("30310270");
		ceps.add("30320580");
		ceps.add("30335230");
		ceps.add("30360180");
		ceps.add("30410610");
		ceps.add("30421346");
		ceps.add("30431320");
		ceps.add("30431385");
		ceps.add("30451455");
		ceps.add("30494320");
		ceps.add("30512001");
		ceps.add("30512550");
		// MS
		ceps.add("79002052");
		ceps.add("79005160");
		ceps.add("79008190");
		ceps.add("79008221");
		ceps.add("79012050");
		ceps.add("79013480");
		ceps.add("79014060");
		ceps.add("79015460");
		ceps.add("79017061");
		ceps.add("79017070");
		ceps.add("79018022");
		ceps.add("79022095");
		ceps.add("79033291");
		ceps.add("79034006");
		ceps.add("79035530");
		ceps.add("79042150");
		ceps.add("79044847");
		ceps.add("79044876");
		ceps.add("79046050");
		ceps.add("79051839");
		// MT
		ceps.add("78025554");
		ceps.add("78030120");
		ceps.add("78040300");
		ceps.add("78043914");
		ceps.add("78045370");
		ceps.add("78050080");
		ceps.add("78050184");
		ceps.add("78050513");
		ceps.add("78050879");
		ceps.add("78052090");
		ceps.add("78055454");
		ceps.add("78055700");
		ceps.add("78058295");
		ceps.add("78058472");
		ceps.add("78058671");
		ceps.add("78060055");
		ceps.add("78061316");
		ceps.add("78065340");
		ceps.add("78070600");
		ceps.add("78080570");
		// PA
		ceps.add("66015902");
		ceps.add("66023040");
		ceps.add("66025144");
		ceps.add("66026064");
		ceps.add("66026283");
		ceps.add("66030170");
		ceps.add("66030328");
		ceps.add("66030383");
		ceps.add("66030488");
		ceps.add("66030700");
		ceps.add("66033095");
		ceps.add("66033150");
		ceps.add("66045160");
		ceps.add("66045650");
		ceps.add("66055390");
		ceps.add("66063075");
		ceps.add("66063100");
		ceps.add("66065360");
		ceps.add("66070250");
		ceps.add("66070604");
		// PB
		ceps.add("58011325");
		ceps.add("58013240");
		ceps.add("58028440");
		ceps.add("58033180");
		ceps.add("58039110");
		ceps.add("58040331");
		ceps.add("58043110");
		ceps.add("58050200");
		ceps.add("58050570");
		ceps.add("58050630");
		ceps.add("58050697");
		ceps.add("58051393");
		ceps.add("58052238");
		ceps.add("58055420");
		ceps.add("58056080");
		ceps.add("58057205");
		ceps.add("58057370");
		ceps.add("58059395");
		ceps.add("58064165");
		ceps.add("58065027");
		// PE
		ceps.add("50090090");
		ceps.add("50090440");
		ceps.add("50100220");
		ceps.add("50110121");
		ceps.add("50110472");
		ceps.add("50110765");
		ceps.add("50610150");
		ceps.add("50640200");
		ceps.add("50680660");
		ceps.add("50730310");
		ceps.add("50730670");
		ceps.add("50791002");
		ceps.add("50791060");
		ceps.add("50810320");
		ceps.add("50875133");
		ceps.add("50900050");
		ceps.add("50900341");
		ceps.add("50920827");
		ceps.add("50950110");
		ceps.add("50980140");
		// PI
		ceps.add("64001902");
		ceps.add("64005513");
		ceps.add("64006245");
		ceps.add("64006600");
		ceps.add("64008363");
		ceps.add("64011623");
		ceps.add("64012090");
		ceps.add("64012336");
		ceps.add("64012361");
		ceps.add("64012520");
		ceps.add("64012643");
		ceps.add("64012821");
		ceps.add("64013490");
		ceps.add("64013506");
		ceps.add("64015030");
		ceps.add("64016725");
		ceps.add("64016745");
		ceps.add("64017410");
		ceps.add("64020097");
		ceps.add("64022108");
		// PR
		ceps.add("80010923");
		ceps.add("80040250");
		ceps.add("80050460");
		ceps.add("80215010");
		ceps.add("80240550");
		ceps.add("80240560");
		ceps.add("80330000");
		ceps.add("80330260");
		ceps.add("80440020");
		ceps.add("80710120");
		ceps.add("80730200");
		ceps.add("81020981");
		ceps.add("81050220");
		ceps.add("81070010");
		ceps.add("81170000");
		ceps.add("81170060");
		ceps.add("81170390");
		ceps.add("81200452");
		ceps.add("81210520");
		ceps.add("81270360");
		// RJ
		ceps.add("20020901");
		ceps.add("20180007");
		ceps.add("20211984");
		ceps.add("20251030");
		ceps.add("20251420");
		ceps.add("20270110");
		ceps.add("20521160");
		ceps.add("20521470");
		ceps.add("20535240");
		ceps.add("20710005");
		ceps.add("20750260");
		ceps.add("20751340");
		ceps.add("20765295");
		ceps.add("20766680");
		ceps.add("20921170");
		ceps.add("20930060");
		ceps.add("20941210");
		ceps.add("20941290");
		ceps.add("20943180");
		ceps.add("20943530");
		// RN
		ceps.add("59015000");
		ceps.add("59025035");
		ceps.add("59025330");
		ceps.add("59050481");
		ceps.add("59054115");
		ceps.add("59054510");
		ceps.add("59054972");
		ceps.add("59056330");
		ceps.add("59065410");
		ceps.add("59065440");
		ceps.add("59068670");
		ceps.add("59069380");
		ceps.add("59070075");
		ceps.add("59073068");
		ceps.add("59073126");
		ceps.add("59073171");
		ceps.add("59073251");
		ceps.add("59073387");
		ceps.add("59074125");
		ceps.add("59074365");
		// RO
		ceps.add("76801322");
		ceps.add("76801683");
		ceps.add("76803488");
		ceps.add("76803812");
		ceps.add("76804412");
		ceps.add("76805728");
		ceps.add("76807448");
		ceps.add("76808122");
		ceps.add("76808204");
		ceps.add("76811298");
		ceps.add("76811606");
		ceps.add("76812050");
		ceps.add("76812370");
		ceps.add("76812899");
		ceps.add("76820136");
		ceps.add("76820148");
		ceps.add("76820486");
		ceps.add("76824356");
		ceps.add("76829386");
		ceps.add("76870134");
		// RR
		ceps.add("69303220");
		ceps.add("69303482");
		ceps.add("69304090");
		ceps.add("69312500");
		ceps.add("69315318");
		ceps.add("69316028");
		ceps.add("69316202");
		ceps.add("69316498");
		ceps.add("69317472");
		ceps.add("69318100");
		ceps.add("69318768");
		// RS
		ceps.add("90010250");
		ceps.add("90020023");
		ceps.add("90020170");
		ceps.add("90035006");
		ceps.add("90050210");
		ceps.add("90150004");
		ceps.add("90245290");
		ceps.add("90250102");
		ceps.add("90460240");
		ceps.add("90480050");
		ceps.add("90520490");
		ceps.add("90680355");
		ceps.add("90810075");
		ceps.add("91030130");
		ceps.add("91050220");
		ceps.add("91130375");
		ceps.add("91150299");
		ceps.add("91150774");
		ceps.add("91160180");
		ceps.add("91160280");
		// SC
		ceps.add("88010090");
		ceps.add("88020530");
		ceps.add("88025050");
		ceps.add("88025310");
		ceps.add("88032000");
		ceps.add("88032030");
		ceps.add("88032160");
		ceps.add("88036080");
		ceps.add("88036090");
		ceps.add("88036270");
		ceps.add("88040001");
		ceps.add("88045505");
		ceps.add("88053411");
		ceps.add("88054001");
		ceps.add("88054385");
		ceps.add("88056694");
		ceps.add("88058706");
		ceps.add("88060150");
		ceps.add("88060308");
		ceps.add("88061065");
		// SE
		ceps.add("49001159");
		ceps.add("49004589");
		ceps.add("49005212");
		ceps.add("49008205");
		ceps.add("49026110");
		ceps.add("49026209");
		ceps.add("49030836");
		ceps.add("49031220");
		ceps.add("49037580");
		ceps.add("49040710");
		ceps.add("49042140");
		ceps.add("49043727");
		ceps.add("49044169");
		ceps.add("49044543");
		ceps.add("49045750");
		ceps.add("49050440");
		ceps.add("49060703");
		ceps.add("49061079");
		ceps.add("49061112");
		ceps.add("49065800");
		// SP
		ceps.add("01029901");
		ceps.add("01227200");
		ceps.add("01251000");
		ceps.add("01255010");
		ceps.add("01308040");
		ceps.add("01311914");
		ceps.add("01332906");
		ceps.add("01416902");
		ceps.add("01426040");
		ceps.add("01501001");
		ceps.add("01543000");
		ceps.add("01546120");
		ceps.add("02072001");
		ceps.add("02084150");
		ceps.add("02119020");
		ceps.add("02123005");
		ceps.add("02131040");
		ceps.add("02138000");
		ceps.add("02140030");
		ceps.add("02147015");
		// TO
		ceps.add("77001360");
		ceps.add("77006244");
		ceps.add("77015312");
		ceps.add("77015690");
		ceps.add("77015767");
		ceps.add("77016400");
		ceps.add("77018380");
		ceps.add("77019140");
		ceps.add("77020036");
		ceps.add("77022076");
		ceps.add("77022440");
		ceps.add("77023340");
		ceps.add("77024700");
		ceps.add("77024720");
		ceps.add("77026020");
		ceps.add("77060758");
		ceps.add("77064750");
		ceps.add("77413400");
		ceps.add("77413460");
		ceps.add("77413810");

		return (ArrayList<String>) ceps;
	}

	public static HashMap<String, String> getUfCidade() {
		Random rand = new Random();
		HashMap<String, String> ufCidade = new HashMap<String, String>();
		if (rand.nextInt(2) == 0) {
			// AC
			ufCidade.put("AC", "Placido de Castro");
			// AL
			ufCidade.put("AL", "Maceio");
			// AM
			ufCidade.put("AM", "Itacoatiara");
			// AP
			ufCidade.put("AP", "Santana");
			// BA
			ufCidade.put("BA", "Salvador");
			// CE
			ufCidade.put("CE", "Caucaia");
			// DF
			ufCidade.put("DF", "Brasilia");
			// ES
			ufCidade.put("ES", "Vila Velha");
			// GO
			ufCidade.put("GO", "Planaltina");
			// MA
			ufCidade.put("MA", "Caxias");
			// MG
			ufCidade.put("MG", "Itacarambi");
			// MS
			ufCidade.put("MS", "Dourados");
			// MT
			ufCidade.put("MT", "Varzea Grande");
			// PA
			ufCidade.put("PA", "Maraba");
			// PB
			ufCidade.put("PB", "Patos");
			// PE
			ufCidade.put("PE", "Recife");
			// PI
			ufCidade.put("PI", "Parnaiba");
			// PR
			ufCidade.put("PR", "Ponta Grossa");
			// RJ
			ufCidade.put("RJ", "Angra dos Reis");
			// RN
			ufCidade.put("RN", "Parnamirim");
			// RO
			ufCidade.put("RO", "Porto Velho");
			// RR
			ufCidade.put("RR", "Boa Vista");
			// RS
			ufCidade.put("RS", "Caxias do Sul");
			// SC
			ufCidade.put("SC", "Itajai");
			// SE
			ufCidade.put("SE", "Aracaju");
			// SP
			ufCidade.put("SP", "Cotia");
			// TO
			ufCidade.put("TO", "Gurupi");
		} else {
			// AC
			ufCidade.put("AC", "Rio Branco");
			// AL
			ufCidade.put("AL", "Palmeira dos Indios");
			// AM
			ufCidade.put("AM", "Manaus");
			// AP
			ufCidade.put("AP", "Macapa");
			// BA
			ufCidade.put("BA", "Salvador");
			// CE
			ufCidade.put("CE", "Fortaleza");
			// DF
			ufCidade.put("DF", "Brasilia");
			// ES
			ufCidade.put("ES", "Vitoria");
			// GO
			ufCidade.put("GO", "Luziania");
			// MA
			ufCidade.put("MA", "Sao Luis");
			// MG
			ufCidade.put("MG", "Santana do Paraiso");
			// MS
			ufCidade.put("MS", "Campo Grande");
			// MT
			ufCidade.put("MT", "Cuiaba");
			// PA
			ufCidade.put("PA", "Xinguara");
			// PB
			ufCidade.put("PB", "Campina Grande");
			// PE
			ufCidade.put("PE", "Olinda");
			// PI
			ufCidade.put("PI", "Teresina");
			// PR
			ufCidade.put("PR", "Curitiba");
			// RJ
			ufCidade.put("RJ", "Rio de Janeiro");
			// RN
			ufCidade.put("RN", "Natal");
			// RO
			ufCidade.put("RO", "Cacoal");
			// RR
			ufCidade.put("RR", "Boa Vista");
			// RS
			ufCidade.put("RS", "Porto Alegre");
			// SC
			ufCidade.put("SC", "Florianopolis");
			// SE
			ufCidade.put("SE", "Aracaju");
			// SP
			ufCidade.put("SP", "Sao Paulo");
			// TO
			ufCidade.put("TO", "Palmas");
		}

		return ufCidade;
	}

	public static HashMap<String, String> getCidadeBairo() {
		HashMap<String, String> cidadeBairo = new HashMap<String, String>();
		for (Entry<String, String> ufCidade : Util.getUfCidade().entrySet()) {
			String cidade = ufCidade.getValue();

			// AC
			if (cidade.equals("Rio Branco"))
				cidadeBairo.put("Rio Branco", "Morada do Sol");
			else if (cidade.equals("Placido de Castro"))
				cidadeBairo.put("Placido de Castro", "Centro");

			// AL
			else if (cidade.equals("Maceio"))
				cidadeBairo.put("Maceio", "Benedito Bentes");
			else if (cidade.equals("Palmeira dos Indios"))
				cidadeBairo.put("Palmeira dos Indios", "Sao Cristovao");

			// AM
			else if (cidade.equals("Manaus"))
				cidadeBairo.put("Manaus", "Jorge Teixeira");
			else if (cidade.equals("Itacoatiara"))
				cidadeBairo.put("Itacoatiara", "Sao Francisco");

			// AP
			else if (cidade.equals("Macapa"))
				cidadeBairo.put("Macapa", "Pedrinhas");
			else if (cidade.equals("Santana"))
				cidadeBairo.put("Santana", "Igarape");

			// BA
			else if (cidade.equals("Salvador")) {
				int check = rand.nextInt(3);
				switch (check) {
				case 0:
					cidadeBairo.put("Salvador", "Canela");
					break;
				case 1:
					cidadeBairo.put("Salvador", "Alto das Pombas");
					break;
				case 2:
					cidadeBairo.put("Salvador", "Brotas");
					break;

				default:
					break;
				}
			}

			// CE
			else if (cidade.equals("Fortaleza"))
				cidadeBairo.put("Fortaleza", "Siqueira");
			else if (cidade.equals("Caucaia"))
				cidadeBairo.put("Caucaia", "Icarai");

			// DF
			else if (cidade.equals("Brasilia")) {
				int check = rand.nextInt(3);
				switch (check) {
				case 0:
					cidadeBairo.put("Brasilia", "Taguatinga");
					break;
				case 1:
					cidadeBairo.put("Brasilia", "Aguas Claras");
					break;
				case 2:
					cidadeBairo.put("Brasilia", "Ceilandia");
					break;
				default:
					break;
				}
			}

			// ES
			else if (cidade.equals("Vitoria"))
				cidadeBairo.put("Vitoria", "Piedade");
			else if (cidade.equals("Vila Velha"))
				cidadeBairo.put("Vila Velha", "Olaria");

			// GO
			else if (cidade.equals("Luziania"))
				cidadeBairo.put("Luziania", "Parque");
			else if (cidade.equals("Planaltina"))
				cidadeBairo.put("Planaltina", "Setor");

			// MA
			else if (cidade.equals("Sao Luis"))
				cidadeBairo.put("Sao Luis", "Vila");
			else if (cidade.equals("Caxias"))
				cidadeBairo.put("Caxias", "Jose Castro");

			// MG
			else if (cidade.equals("Santana do Paraiso"))
				cidadeBairo.put("Santana do Paraiso", "Cidade Nova");
			else if (cidade.equals("Itacarambi"))
				cidadeBairo.put("Itacarambi", "Mato Grosso");

			// MS
			else if (cidade.equals("Campo Grande"))
				cidadeBairo.put("Campo Grande", "Vila");
			else if (cidade.equals("Dourados"))
				cidadeBairo.put("Dourados", "Jardim");

			// MT
			else if (cidade.equals("Cuiaba"))
				cidadeBairo.put("Cuiaba", "Parque");
			else if (cidade.equals("Varzea Grande"))
				cidadeBairo.put("Varzea Grande", "Ponte Nova");

			// PA
			else if (cidade.equals("Xinguara"))
				cidadeBairo.put("Xinguara", "Itamarati");
			else if (cidade.equals("Maraba"))
				cidadeBairo.put("Maraba", "Nova Maraba");

			// PB
			else if (cidade.equals("Campina Grande"))
				cidadeBairo.put("Campina Grande", "Castelo Branco");
			else if (cidade.equals("Patos"))
				cidadeBairo.put("Patos", "Centro");

			// PE
			else if (cidade.equals("Olinda"))
				cidadeBairo.put("Olinda", "Ouro Preto");
			else if (cidade.equals("Recife"))
				cidadeBairo.put("Recife", "Santo Amaro");

			// PI
			else if (cidade.equals("Teresina"))
				cidadeBairo.put("Teresina", "Monte Castelo");
			else if (cidade.equals("Parnaiba"))
				cidadeBairo.put("Parnaiba", "Igaraçu");

			// PR
			else if (cidade.equals("Curitiba"))
				cidadeBairo.put("Curitiba", "Centro");
			else if (cidade.equals("Ponta Grossa"))
				cidadeBairo.put("Ponta Grossa", "Chapada");

			// RJ
			else if (cidade.equals("Rio de Janeiro"))
				cidadeBairo.put("Rio de Janeiro", "Bangu");
			else if (cidade.equals("Angra dos Reis"))
				cidadeBairo.put("Angra dos Reis", "Parque");

			// RN
			else if (cidade.equals("Natal"))
				cidadeBairo.put("Natal", "Ponte Negra");
			else if (cidade.equals("Parnamirim"))
				cidadeBairo.put("Parnamirim", "Liberdade");

			// RO
			else if (cidade.equals("Carcoal"))
				cidadeBairo.put("Carcoal", "Centro");
			else if (cidade.equals("Porto Velho"))
				cidadeBairo.put("Porto Velho", "Tres Marias");

			// RR
			else if (cidade.equals("Boa Vista")) {
				int check = rand.nextInt(2);
				switch (check) {
				case 0:
					cidadeBairo.put("Boa Vista", "Nova cidade");
					break;
				case 1:
					cidadeBairo.put("Boa Vista", "Mecejana");
					break;
				default:
					break;
				}
			}

			// RS
			else if (cidade.equals("Porto Alegre"))
				cidadeBairo.put("Porto Alegre", "Boa Vista");
			else if (cidade.equals("Caxias do Sul"))
				cidadeBairo.put("Caxias do Sul", "Serrano");

			// SC
			else if (cidade.equals("Florianopolis"))
				cidadeBairo.put("Florianopolis", "Centro");
			else if (cidade.equals("Itajai"))
				cidadeBairo.put("Itajai", "Cidade Nova");

			// SE
			else if (cidade.equals("Aracaju")) {
				int check = rand.nextInt(2);
				switch (check) {
				case 0:
					cidadeBairo.put("Aracaju", "Farolandia");
					break;
				case 1:
					cidadeBairo.put("Aracaju", "Santa Maria");
					break;
				default:
					break;
				}
			}

			// SP
			else if (cidade.equals("Sao Paulo"))
				cidadeBairo.put("Sao Paulo", "Jardim");
			else if (cidade.equals("Cotia"))
				cidadeBairo.put("Cotia", "Palos Verdes");

			// TO
			else if (cidade.equals("Palmas"))
				cidadeBairo.put("Palmas", "Plano");
			else if (cidade.equals("Gurupi"))
				cidadeBairo.put("Gurupi", "Vila Iris");

		}

		return cidadeBairo;
	}
}
