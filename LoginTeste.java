package loginteste;

import elementos.Elementos;
import executa.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class LoginTeste extends MassadeDados {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	MassadeDados massadedados = new MassadeDados();
	
	
	@Given("Dado que eu esteja na tela de cadastro")
	public void dado_que_eu_esteja_na_tela_de_cadastro() throws InterruptedException {
	Executa.abrirnavegador();		
		Thread.sleep(2000);
	}
	
	@After 
	public void fecharnavegador() {
		
		Executa.fecharnavegador();
	}

	@Given("clico no botao usarname e digito os dados")
	public void clico_no_botao_usarname_e_digito_os_dados() throws InterruptedException {
	   metodos.escrever(elementos.conta,massadedados.conta);
	   Thread.sleep(2000);
	}

	@Given("clico no botao password e digito a senha")
	public void clico_no_botao_password_e_digito_a_senha() throws InterruptedException {
		 metodos.escrever(elementos.senha,massadedados.senha);
		 Thread.sleep(2000);
	}

	@When("e clico no botao login")
	public void e_clico_no_botao_login() throws InterruptedException {
	    metodos.clicar(elementos.login);
	    Thread.sleep(2000);
	}

	@Then("então sou redirecionado para a tela de cadastro")
	public void então_sou_redirecionado_para_a_tela_de_cadastro() {
	    
		
	}
	

}
