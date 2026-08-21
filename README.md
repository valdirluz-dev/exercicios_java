# Exercícios de Java

Uma coleção de projetos práticos para estudar Java por meio de exemplos progressivos. Os exercícios exploram desde sintaxe e orientação a objetos até exceções, interfaces funcionais, multithreading e gerenciamento de dependências.

> Repositório de estudos em evolução: cada projeto possui sua própria estrutura de código e pode ser executado de forma independente.

## Trilha de aprendizagem

| Projeto                          | Tema                   | O que é praticado                                            |
| -------------------------------- | ---------------------- | ------------------------------------------------------------ |
| `algoritmo_data`                 | Data e hora            | `LocalDate` e formatação de datas                            |
| `CalculadoraComEnum`             | Programação funcional  | `enum`, `BiFunction` e lambdas                               |
| `CalculadoraGeneralizada`        | Calculadora            | Operações matemáticas e organização em classes               |
| `carro_orientado_a_objetos`      | POO                    | Estado, métodos e controle de um carro                       |
| `exercicio_carro`                | Classes e objetos      | Atributos, métodos e criação de objetos                      |
| `exercicio_contabancaria`        | Conta bancária         | Depósito, saque e consulta de saldo                          |
| `ExercícioImpostoDeRenda`        | Interfaces             | Categorias de despesas e cálculo de imposto                  |
| `exercicio_maquinadepet`         | POO                    | Máquina de banho, estados e interação com pets               |
| `maquina_de_pet`                 | POO                    | Uma segunda versão do exercício de máquina de pets           |
| `ExercicioUsuarios`              | Herança e polimorfismo | Login, perfis de usuário, ações e relatórios                 |
| `gerenciamento-de-dependencias`  | Maven                  | Lombok, MapStruct, DTOs e mapeamento de modelos              |
| `mesclagem_numérica_multithread` | Concorrência           | Threads e sincronização                                      |
| `Relogio`                        | Abstração              | Interfaces e relógios em formatos diferentes                 |
| `sistema_bancario`               | Encapsulamento         | Operações de uma conta em um sistema bancário                |
| `sistema_de_ingressos`           | Herança                | Ingresso inteiro, meia-entrada e família                     |
| `Sistemas_mensagens_marketing`   | Polimorfismo           | Envio de mensagens por e-mail, SMS, redes sociais e WhatsApp |
| `TestePolimorfismo`              | Polimorfismo           | Execução de operações por uma interface comum                |
| `TratamentoDeExceções`           | Exceções               | CRUD de usuários e validação de entradas                     |
| `TreinoArray`                    | Arrays e lambdas       | Operações matemáticas selecionadas por `enum`                |

## Conceitos explorados

- Classes, objetos e encapsulamento
- Herança, interfaces e polimorfismo
- Métodos, atributos e construtores
- `enum`, lambdas e interfaces funcionais
- Coleções, arrays e manipulação de dados
- API `java.time`
- Tratamento e criação de exceções
- Threads e métodos sincronizados
- Maven, Lombok, MapStruct e DTOs
- Organização de projetos com pacotes

## Pré-requisitos

- JDK 17 ou superior
- Terminal ou editor de código, como o VS Code
- Maven 3.8 ou superior para `gerenciamento-de-dependencias`

Alguns projetos foram configurados originalmente para Java 21. O JDK 21 é recomendado quando o exercício utilizar recursos dessa versão.

## Como executar um projeto simples

Entre no projeto desejado, compile os arquivos `.java` em uma pasta de saída e execute a classe principal:

```bash
cd algoritmo_data
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac -d out
java -cp out datahora.ExibirData
```

A classe principal de cada projeto foi nomeada para refletir o exercício. Alguns exemplos:

```bash
# Calculadora com enum e lambda
java -cp out list.CalculadoraEnum

# Sistema de usuários
java -cp out users.SistemaUsuarios

# Sistema de ingressos
java -cp out poo.CalcularIngressos
```

Execute os comandos de compilação dentro do projeto correspondente, pois cada projeto possui seus próprios pacotes e arquivos de configuração.

## Projeto Maven

O projeto `gerenciamento-de-dependencias` possui um `pom.xml` próprio:

```bash
cd gerenciamento-de-dependencias
mvn compile
```

Para executar o exemplo de mapeamento após a compilação:

```bash
java -cp target/classes br.com.my.dto.TestarMapeamento
```

## Organização dos arquivos

Cada fonte `.java` começa com um Javadoc curto explicando sua responsabilidade. Os nomes dos arquivos de entrada também descrevem o exercício, por exemplo:

- `ExibirData.java`
- `CalculadoraEnum.java`
- `SistemaUsuarios.java`
- `CalcularIngressos.java`
- `ExecutarMaquinaDePet.java`

Arquivos gerados de compilação e metadados específicos de IDE foram removidos para manter o repositório focado no código-fonte e nas configurações necessárias.

## Observação sobre o multithreading

O projeto `mesclagem_numérica_multithread` cria duas threads produtoras: uma adiciona números positivos e a outra adiciona números negativos em uma fila segura. Depois que ambas terminam, uma terceira thread exibe o total de números mesclados, que deve ser `200000`.

Para executar:

```bash
cd mesclagem_numérica_multithread
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac -d out
java -cp out multithread.MultithreadExemplo
```

Os projetos independentes foram validados com `javac`.

## Objetivo

Praticar a construção de programas Java pequenos e completos, consolidar fundamentos da linguagem e criar uma base para projetos maiores de backend.

---

Feito para estudar, testar ideias e evoluir um exercício por vez.
