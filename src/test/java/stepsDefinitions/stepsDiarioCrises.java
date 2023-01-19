package stepsDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class stepsDiarioCrises {
    @Dado("^que o usuario clica em Registro de Crise na tela Cuidando da Minha Epilepsia$")
    public void queOUsuarioClicaEmRegistroDeCriseNaTelaCuidandoDaMinhaEpilepsia() {
    }

    @E("^clica em Adicionar Nova Crise$")
    public void clicaEmAdicionarNovaCrise() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Dia em que Ocorreu a Crise$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosODiaEmQueOcorreuACrise() {
    }

    @E("^clica em Concluir$")
    public void clicaEmConcluir() {
    }

    @Entao("^o sistema exibe uma mensagem de erro solicitando o preenchimento de todos os campos obrigatorios$")
    public void oSistemaExibeUmaMensagemDeErroSolicitandoOPreenchimentoDeTodosOsCamposObrigatorios() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Horario em que Ocorreu a Crise$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosOHorarioEmQueOcorreuACrise() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Tipo de Crise$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosOTipoDeCrise() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Duracao da Crise$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosODuracaoDaCrise() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Como essa Crise Afetou seu Emocional$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosOComoEssaCriseAfetouSeuEmocional() {
    }

    @Quando("^o usuario preenche todos os campos do formulario, menos o Enviar Video da Crise$")
    public void oUsuarioPreencheTodosOsCamposDoFormularioMenosOEnviarVideoDaCrise() {
    }

    @Entao("^o sistema exibe uma mensagem de crise adicionada com sucesso$")
    public void oSistemaExibeUmaMensagemDeCriseAdicionadaComSucesso() {
    }

    @Quando("^o usuario clica no campo Dia em que Ocorreu a Crise$")
    public void oUsuarioClicaNoCampoDiaEmQueOcorreuACrise() {
    }

    @Entao("^o sistema exibe um calendario conforme o prototipo desenvolvido$")
    public void oSistemaExibeUmCalendarioConformeOPrototipoDesenvolvido() {
    }

    @Quando("^o usuario clica no campo Horario em que Ocorreu a Crise$")
    public void oUsuarioClicaNoCampoHorarioEmQueOcorreuACrise() {
    }

    @Entao("^o sistema exibe um relogio analogico conforme o prototipo desenvolvido$")
    public void oSistemaExibeUmRelogioAnalogicoConformeOPrototipoDesenvolvido() {
    }

    @Entao("^o sistema nao permite selecao de um dia com data futura$")
    public void oSistemaNaoPermiteSelecaoDeUmDiaComDataFutura() {
    }

    @Entao("^o sistema nao permite selecao de um dia com data futura a atual$")
    public void oSistemaNaoPermiteSelecaoDeUmDiaComDataFuturaAAtual() {
    }

    @Quando("^o usuario seleciona um Tipo de Crise$")
    public void oUsuarioSelecionaUmTipoDeCrise() {
    }

    @E("^seleciona novamente um Tipo de Crise diferente$")
    public void selecionaNovamenteUmTipoDeCriseDiferente() {
    }

    @Entao("^o sistema substitui o primeiro tipo selecionado, pois nao e possivel selecionar mais de um tipo de crise$")
    public void oSistemaSubstituiOPrimeiroTipoSelecionadoPoisNaoEPossivelSelecionarMaisDeUmTipoDeCrise() {
    }

    @Quando("^o usuario clica no campo Tipo de Crise$")
    public void oUsuarioClicaNoCampoTipoDeCrise() {
    }

    @E("^clica nas setas de drop down de todos os tipos de crise$")
    public void clicaNasSetasDeDropDownDeTodosOsTiposDeCrise() {
    }

    @Entao("^o sistema exibe todas as descricoes de todos tipos de crise$")
    public void oSistemaExibeTodasAsDescricoesDeTodosTiposDeCrise() {
    }

    @Quando("^o usuario seleciona uma Duracao de Crise$")
    public void oUsuarioSelecionaUmaDuracaoDeCrise() {
    }

    @E("^seleciona novamente uma Duracao de Crise diferente$")
    public void selecionaNovamenteUmaDuracaoDeCriseDiferente() {
    }

    @Entao("^o sistema substitui a primeira duracao selecionada, pois nao e possivel selecionar mais de uma duracao de crise$")
    public void oSistemaSubstituiAPrimeiraDuracaoSelecionadaPoisNaoEPossivelSelecionarMaisDeUmaDuracaoDeCrise() {
    }

    @Quando("^o usuario seleciona uma opcao de Como essa Crise Afetou seu Emocional$")
    public void oUsuarioSelecionaUmaOpcaoDeComoEssaCriseAfetouSeuEmocional() {
    }

    @E("^seleciona novamente uma opcao diferente de Como essa Crise Afetou seu Emocional$")
    public void selecionaNovamenteUmaOpcaoDiferenteDeComoEssaCriseAfetouSeuEmocional() {
    }

    @Entao("^o sistema substitui a primeira duracao selecionada, pois nao e possivel selecionar mais de uma opcao de Como essa Crise Afetou seu Emocional$")
    public void oSistemaSubstituiAPrimeiraDuracaoSelecionadaPoisNaoEPossivelSelecionarMaisDeUmaOpcaoDeComoEssaCriseAfetouSeuEmocional() {
    }

    @Quando("^o usuario clica em Enviar Video de Crise$")
    public void oUsuarioClicaEmEnviarVideoDeCrise() {
    }

    @Entao("^o sistema permite a selecao e upload de um video atraves de ferramenta do sistema operecional$")
    public void oSistemaPermiteASelecaoEUploadDeUmVideoAtravesDeFerramentaDoSistemaOperecional() {
    }

    @E("^faz o upload de um video com mais de sessenta mb$")
    public void fazOUploadDeUmVideoComMaisDeMb() {
    }

    @Entao("^o sistema exibe uma mensagem de erro informando que o video excede o tamanho de sessenta mb$")
    public void oSistemaExibeUmaMensagemDeErroInformandoQueOVideoExcedeOTamanhoDeMb() {
    }
}
