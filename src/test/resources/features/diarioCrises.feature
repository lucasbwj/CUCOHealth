#language: pt

  Funcionalidade: Diario de Crises

    Cenario: Validar obrigatoriedade do campo Dia em que Ocorreu a Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Dia em que Ocorreu a Crise
      E clica em Concluir
      Entao o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios

    Cenario: Validar obrigatoriedade do campo Horario em que Ocorreu a Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Horario em que Ocorreu a Crise
      E clica em Concluir
      Entao o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios

    Cenario: Validar obrigatoriedade do campo Tipo de Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Tipo de Crise
      E clica em Concluir
      Entao o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios

    Cenario: Validar obrigatoriedade do campo Duracao da Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Duracao da Crise
      E clica em Concluir
      Entao o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios

    Cenario: Validar obrigatoriedade do campo Como essa Crise Afetou seu Emocional
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Como essa Crise Afetou seu Emocional
      E clica em Concluir
      Entao o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios

    Cenario: Validar a nao obrigatoriedade do campo Enviar Video da Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario preenche todos os campos do formulario, menos o Enviar Video da Crise
      E clica em Concluir
      Entao o sistema exibe uma mensagem de crise adicionada com sucesso

    Cenario: Validar a formatacao em calendario do campo Dia em que Ocorreu a Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica no campo Dia em que Ocorreu a Crise
      Entao o sistema exibe um calendario conforme o prototipo desenvolvido

    Cenario: Validar a formatacao em relogio analogico do campo Horario em que Ocorreu a Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica no campo Horario em que Ocorreu a Crise
      Entao o sistema exibe um relogio analogico conforme o prototipo desenvolvido

    Cenario: Validar tentativa de registro de crise com data futura
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica no campo Dia em que Ocorreu a Crise
      Entao o sistema nao permite selecao de um dia com data futura

    Cenario: Validar tentativa de registro de crise com data futura
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica no campo Dia em que Ocorreu a Crise
      Entao o sistema nao permite selecao de um dia com data futura a atual

    Cenario: Validar tentativa de selecao de mais de um Tipo de Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario seleciona um Tipo de Crise
      E seleciona novamente um Tipo de Crise diferente
      Entao o sistema substitui o primeiro tipo selecionado, pois nao e possivel selecionar mais de um tipo de crise

    Cenario: Validar exibicao de descricao em dropdown de todos tipos de crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica no campo Tipo de Crise
      E clica nas setas de drop down de todos os tipos de crise
      Entao o sistema exibe todas as descricoes de todos tipos de crise

    Cenario: Validar tentativa de selecao de mais de uma Duracao de Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario seleciona uma Duracao de Crise
      E seleciona novamente uma Duracao de Crise diferente
      Entao o sistema substitui a primeira duracao selecionada, pois nao e possivel selecionar mais de uma duracao de crise

    Cenario: Validar tentativa de selecao de mais de uma opcao de Como essa Crise Afetou seu Emocional
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario seleciona uma opcao de Como essa Crise Afetou seu Emocional
      E seleciona novamente uma opcao diferente de Como essa Crise Afetou seu Emocional
      Entao o sistema substitui a primeira duracao selecionada, pois nao e possivel selecionar mais de uma opcao de Como essa Crise Afetou seu Emocional

    Cenario: Validar opcao apenas de upload de video em Enviar Video de Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica em Enviar Video de Crise
      Entao o sistema permite a selecao e upload de um video atraves de ferramenta do sistema operecional

    Cenario: Validar tentativa de upload de video superior a 60mb em Enviar Video de Crise
      Dado que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia
      E clica em Adicionar Nova Crise
      Quando o usuario clica em Enviar Video de Crise
      E faz o upload de um video com mais de sessenta mb
      Entao o sistema exibe uma mensagem de erro informando que o video excede o tamanho de sessenta mb
