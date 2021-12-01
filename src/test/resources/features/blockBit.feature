#language:pt
@Desafio
Funcionalidade: Desafio BlockBit

  Contexto:
    Dado que esteja na pagina principal
  @gerarCertificado
  Cenario: Gerar novo certificado de usuário
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    E acesso o menu certicado
    Quando clico no botao novo de certificado
    E preencho os campos e salvo os dados
      | nome    | teste   |
      | sistema | Windows |
    Entao exibe o certificado gerado
  @encerrarSessao
  Cenario: Encerrar Sessão do usuario
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    E acesso o menu sessao
    Quando removo a sessao do usuario
    Entao exibe a mensagem "Nenhum item encontrado"
  @encerrarSessaoPortal
  Cenario: Encerrar sessao do portal
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    Quando encerro a sessao do usuario
    Entao retorna para pagina de login
  @CertificadoUsuarioLogado
  Cenario: Download certificado usuario logado
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    Quando realizo download do certificado com usuario logado
    Entao o download foi realizado
  @CertificadoUsuarioNaoLogado
  Cenario: Download certificado usuario nao logado
    Quando realizo o download do certificado com usuario nao logado
    Entao o download foi realizado
  @DownloadCertificadoCriado
  Cenario: Download certificado de usuario criado
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    E acesso o menu certicado
    Quando clico no botao download de certificado
    E informo a senha "teste"
    E realizo o download o certificado com senha
@loginELogout
  Esquema do Cenario: Login e logou de multiplos usuarios
    Dado que esteja logado no sistema com
      | email | user_bb1@support-qa.com |
      | senha | q1Q!q1Q!                |
    E acesso o menu sessao
    Quando removo a sessao do usuario
    Entao exibe a mensagem "Nenhum item encontrado"
    Quando encerro a sessao do usuario
    Entao retorna para pagina de login

    Exemplos:
      | email                   | senha    |
      | user_bb1@support-qa.com | q1Q!q1Q! |
      | user_bb2@support-qa.com | q1Q!q1Q! |