#language: pt
#encoding: utf-8


  @Busca
  @FullSmoke
Funcionalidade: Busca

  Contexto: Acesso ao site
    Dado:  que eu estou no site "https://www.jocar.com.br"


  @FluxoPrincipal
  Esquema do Cenario: Validar busca por produto


    Quando:	eu faço uma busca pelo produto "<termo_busca>"
    E:	eu clico no botao de comparar preços
    Então:	é apresentada a msg de sucesso

    Exemplos:

    nome_site | termo_busca | Mensagem Final
    https://www.jocar.com.br| oleo |




  @FluxoExceção
  Esquema do Cenario: Validar busca por produto invalido


    Quando:	eu faço uma busca pelo produto "<termo_busca>"
    E:	eu clico no botao de comparar preços
    Então:	é apresentada a msg de produto nao encontrado

    Exemplos:
    nome_site | termo_busca | Mensagem Final
    https://www.jocar.com.br| #$%¨&&| produto nao encontrado



  @SiteMobile
    @FluxoAlternativo

  Esquema do Cenario: Validar botao de voltar ao topo


    E:	eu faço uma busca pelo produto "<termo_busca>"
    E:	vou ate o fim da pagina
    Quando: clico no botao voltar ao topo
    Então:	é apresentada a msg de produto nao encontrado

    Exemplos:
    nome_site | termo_busca | Mensagem Final
    https://www.jocar.com.br| #$%¨&&| produto nao encontrado









