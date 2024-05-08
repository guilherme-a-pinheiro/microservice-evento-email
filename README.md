# Sistema de Microserviços para Gerenciamento de Eventos e Inscrições

Este é um projeto de microserviços em Java para o gerenciamento de eventos e inscrições, incluindo o envio de e-mails utilizando o serviço SES da AWS. O sistema consiste em dois microserviços: um para gerenciar os eventos e inscrições dos participantes e outro para o envio de e-mails aos participantes recém-inscritos.

## Funcionalidades Principais

- **Gerenciamento de Eventos:** O microserviço de gerenciamento de eventos permite criar, listar, atualizar e excluir eventos. Cada evento possui um título, descrição, data, número máximo de participantes e número de participantes registrados.
- **Inscrição em Eventos:** Os participantes podem se inscrever em eventos disponíveis. Cada inscrição é associada a um evento e ao e-mail do participante.
- **Envio de E-mails via SES da AWS:** O segundo microserviço é responsável por enviar e-mails de confirmação aos participantes recém-inscritos utilizando o serviço SES (Simple Email Service) da AWS.

## Configuração

1. **Clonagem dos Repositórios:** Clone os repositórios dos microserviços em sua máquina local.

2. **Compilação e Execução:** Utilize Maven para compilar e executar cada microserviço.

```bash
# Microserviço de Gerenciamento de Eventos (Porta 8090)
cd microservico-eventos
mvn clean install
mvn spring-boot:run -Dserver.port=8090

# Microserviço de Envio de E-mails (Porta 8080)
cd microservico-emails
mvn clean install
mvn spring-boot:run -Dserver.port=8080
```

### Acesso aos Endpoints

Os endpoints estarão disponíveis de acordo com a configuração do servidor de aplicação.

#### Endpoints

**Microserviço de Gerenciamento de Eventos (EventController)**

- `GET /events`: Retorna a lista de todos os eventos cadastrados.
- `GET /events/upcoming`: Retorna os eventos futuros.
- `POST /events`: Adiciona um novo evento ao sistema.
- `POST /events/{eventId}/register`: Registra um participante em um evento.

**Microserviço de Envio de E-mails (EmailSenderController)**

- `POST /api/email/send`: Envia um e-mail.

## Integrações e Tecnologias Utilizadas

- **H2 Database:** Banco de dados em memória utilizado para armazenar os dados dos eventos e inscrições durante o desenvolvimento.
- **SES da AWS (Simple Email Service):** Serviço utilizado para envio de e-mails de confirmação aos participantes.
- **Spring Boot:** Framework utilizado para desenvolvimento dos microserviços em Java.
- **Spring Cloud:** Conjunto de ferramentas para construir e implementar sistemas distribuídos.
- **OpenFeign:** Cliente HTTP declarativo para comunicação entre serviços.
- **Lombok:** Biblioteca para geração automática de código em Java.
- **Maven:** Ferramenta de automação de compilação utilizada para gerenciar as dependências e construir os projetos.

Estes microserviços foram configurados para rodar simultaneamente nas portas 8090 e 8080, respectivamente, e utilizam o banco de dados H2 em memória para armazenar os dados dos eventos e inscrições durante o desenvolvimento. Certifique-se de configurar corretamente o SES da AWS para o envio de e-mails. Se precisar de mais alguma informação, estou à disposição para ajudar!
