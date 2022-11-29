
@teste
Feature: cadastro
  acessando a tela de login

  @login
  Scenario: tela de cadastro
    Given Dado que eu esteja na tela de cadastro
    And clico no botao usarname e digito os dados
    And clico no botao password e digito a senha
    When e clico no botao login
    Then então sou redirecionado para a tela de cadastro

  