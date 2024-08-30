# Estudo de Estrutura de Classes em Java

## Descrição do Projeto

Este projeto foi desenvolvido com o objetivo principal de estudar e praticar a estruturação de classes em Java, utilizando um diagrama UML como base. O projeto foca na implementação de classes que simulam as funcionalidades do iPhone original, lançado em 2007.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes, cada uma representando uma funcionalidade distinta do iPhone:

1. **iPhone**
    - Classe principal que representa o iPhone e suas funcionalidades gerais.
    - Métodos implementados:
        - `ligar()`
        - `desligar()`
        - `bloquearTela()`
        - `desbloquearTela()`
        - `conectarWiFi(String nomeRede)`
        - `desconectarWiFi()`
        - `ajustarVolume(int nivel)`

2. **ReprodutorMusical**
    - Classe que representa o reprodutor de música do iPhone.
    - Métodos implementados:
        - `reproduzirMusica()`
        - `pausarMusica()`
        - `selecionarFaixa(String nomeFaixa)`

3. **AparelhoTelefonico**
    - Classe que representa as funcionalidades telefônicas do iPhone.
    - Métodos implementados:
        - `fazerLigacao(String numeroTelefone)`
        - `receberLigacao(String idChamada)`
        - `enviarSMS(String mensagem, String numeroTelefone)`

4. **NavegadorInternet**
    - Classe que representa o navegador de internet do iPhone.
    - Métodos implementados:
        - `abrirPaginaWeb(String url)`
        - `atualizarPagina()`
        - `adicionarFavorito(String url)`

5. **Camera**
    - Classe que representa a câmera do iPhone.
    - Métodos implementados:
        - `tirarFoto()`
        - `visualizarGaleria()`

6. **Aplicativos**
    - Classe que representa o gerenciamento de aplicativos do iPhone.
    - Métodos implementados:
        - `abrirAplicativo(String nomeApp)`
        - `fecharAplicativo(String nomeApp)`

7. **Armazenamento**
    - Classe que representa o armazenamento de dados no iPhone.
    - Métodos implementados:
        - `salvarDados(String nomeDados, String dados)`
        - `recuperarDados(String nomeDados)`
        - `excluirDados(String nomeDados)`

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

