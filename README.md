# **Automation Performance Test**

Projeto de Teste de Performance desenvolvido para treinamento de habilidades e técnicas.


## Estrutura do Projeto
```
src
|-main
| |-java
| | |-br
| | | |-com
| | | | |-performance
| | | | | |-interfaces
| | | | | | |-PerformanceViaCepInterface.java
| | | | | |-model
| | | | | | |-ConfigApplication.java
| | | | | | |-PathUrl.java
| | | | | |-utils
| | | | | | |-Util.java
| | | | |-ConfigureTest.java
| | | | |-PerformanceTestApplication.java
|-test
| |-resources
| |-jmeter
| | |-loadtest.properties
| | |-PATH_VU01.txt
| | |-PATH_VU02.txt
| | |-SICREDI.jmx
| | |-URL.txt
| |
|
```


## Começando

Essas instruções fornecerão uma cópia do projeto em funcionamento em sua máquina local para fins de desenvolvimento e teste. Consulte a implantação de notas sobre como implantar o projeto em um sistema ao vivo.


### Pré-requisitos

O que você precisa para testar a aplicação.

```
Git
Java 8+ JDK
Maven
JMeter
Jenkins
```
***Observação: É necessário que o maven e o jdk esteja em suas variáveis de ambiente, que o Jenkins esteja instalado em sua maquina e que o Apache JMeter esteja no diretório 'C:\JMeter'.***

***Observação: O Jenkinsfile deste projeto foi construido para poder rodar em ambiente windows o que pode ocasionar erros em sistemas baseados em linux.*** 


### Instalando

Crie uma copia do projeto em seu ambiente de desenvolvimento utilizando o Git com um dos comandos abaixo:
``` 
https://github.com/jehymes/Automation-API-Tests.git
https://github.com/jehymes/Automation-Performance-Tests.git
```

## Executando os testes

1. Abra o projeto em sua IDE de preferência.
2. Navegue no diretório de pastas até 'src/main/java/br/com/performance/PerformanceTestApplication.java'.
3. Altere a quantidade de itens a serem gerados para os testes na linha 8.
```
...
public class PerformanceTestApplication {

	public static void main(String[] args) {
		ConfigureTest test = new ConfigureTest();
		test.gravarURL();
		test.gravarPath(1000); //Adicione a quantidade de itens para o teste
		System.out.println("Arquivos criados com sucesso!");
	}
	
} 
```
4. Execute o arquivo 'PerformanceTestApplication.java'.
5. Configure os parametros para os testes em 'src/test/jmeter/loadtest.properties'.
``` 
#VAR CASES 60%
THREADS_VU01 = 600  //Quantidade de Threads
RAMP_UP_VU01 = 3600 //Ramp-up do Teste
LOOP_COUNT_VU01 = 1 //Contador de Loop
...
```
6. Execute os comandos na pasta do projeto pelo terminal.
```
mvn clean package -U -Dmaven.test.skip=true
mvn verify
```

## Construção da Pipilene

***Observação.: É necessário a instalação do plugin 'HTML Publisher' no Jenkins.***

1. Abra o Jenkins.
2. Crie um 'Novo Job'.
3. Coloque o nome do projeto como 'automation-performance'.
4. Selecione 'Pipeline' e clique em OK.
5. Na aba 'Pipeline' selecione a Definition como 'Pipeline Script from SCM'
6. Em SCM selecione 'Git'
7. Coloque o repositório 'https://github.com/jehymes/Automation-Performance-Tests.git'
8. Adicione uma nova Credentials(User: jehymes.gil, Password: DN--7tax4KW43yWrerKt).
9. Clique em Add.
10. Selecione a Credentials que você acabou de criar.
11. Clique em 'Salvar'
12. Construa a Build do projeto.

## Built With

* [Java](#https://www.java.com/pt-BR/) - Usado na criação dos arquivos de configuração dos testes.
* [JMeter](#https://jmeter.apache.org/) - Usado para criação e execução dos testes.
* [Jenkins](#https://www.jenkins.io/) - Usado na integração contínua do projeto. 
* [Git](#https://git-scm.com/) - Usado no versionamento do projeto.
* [Maven](#https://maven.apache.org/) - Usado na automação de compilação do projeto.

## Autor

* [**Jehymeson Gil Alves Oliveira**](https://github.com/jehymes)



