# Lista de Exercícios - Interfaces e Lambdas em Java

Este repositório contém a lista de exercícios proposta pelo **Professor Lucas**, com o objetivo de revisar **interfaces** e praticar **expressões lambda** em Java.  
O foco principal é aprender a **passar comportamento como parâmetro**, conceito fundamental para eventos e componentes como botões no Java Swing.

---

## Getting Started

Para executar os exercícios:

1. Abra sua IDE Java (Eclipse, IntelliJ ou VS Code com Java).  
2. Importe cada pasta de exercício como um **projeto Java separado**.  
3. Abra a classe principal (`App.java` ou `Main.java`).  
4. Execute o método `main()`.  
5. Observe a saída no console para cada exercício.

---

## Folder Structure

O repositório está organizado da seguinte forma:

lista-lambda/
│
├─ exercicio01/ # Interface com vários métodos
├─ exercicio02/ # Passando interface como parâmetro
├─ exercicio03/ # Lambda direta
├─ exercicio04/ # Lambda em variável
├─ exercicio05/ # Redução de sintaxe
├─ exercicio06/ # Lambda com 1 parâmetro
├─ exercicio07/ # Lambda com 2 parâmetros
├─ exercicio08/ # Lambda com retorno
├─ exercicio09/ # Corrigindo erro comum
├─ exercicio10/ # Pequeno desafio - Botão com listener
└─ README.md # Este arquivo

yaml
Copiar código

- `src/`: código-fonte do exercício  
- `.gitignore`: ignora pastas de build (`bin/`, `.settings/`) e arquivos de IDE  

---

## Exercises Overview

| Exercicio | Interface / Classe | Lambda / Parâmetros | Descrição |
|-----------|------------------|-------------------|-----------|
| 01        | Animal / Cachorro | -                 | Interface com vários métodos; implementar e chamar todos |
| 02        | EmitirSom / Botao | 0                 | Passar objeto que implementa interface para método |
| 03        | EmitirSom / Botao | 0                 | Usar lambda diretamente para emitir som |
| 04        | EmitirSom / Botao | 0                 | Guardar lambda em variável e passar |
| 05        | LancarMagia / Varinha | 0             | Três formas de chamar lambda: com `{}`, em linha, e variável |
| 06        | Falar / Microfone | 1                 | Lambda com um parâmetro |
| 07        | SomComVolume / CaixaDeSom | 2         | Lambda com dois parâmetros |
| 08        | GerarMensagem / Mensageiro | 1 + retorno | Lambda com retorno; imprimir mensagem gerada |
| 09        | Acao               | 0                 | Corrigir interface não funcional e criar lambda |
| 10        | CliqueListener / BotaoMagico | 1  | Simular botão com listener e lambda |

---

## Summary

Nesta lista de exercícios, o aluno **Augusto** praticou:

- Criação de **interfaces funcionais**  
- Uso de **lambdas com 0, 1 ou 2 parâmetros**  
- Lambdas **com e sem retorno**  
- Passagem de comportamento como parâmetro  
- Simulação de eventos de clique (botão e listener)  

Esses exercícios reforçam conceitos fundamentais de Java que são essenciais para programação **orientada a objetos** e construção de **interfaces gráficas interativas**.

---

## Author

- **Aluno:** Augusto  
- **Professor:** Lucas