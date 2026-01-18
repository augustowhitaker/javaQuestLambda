# 🚀 Lista de Exercícios - Interfaces e Lambdas em Java ☕️

Este repositório contém a lista de exercícios do Professor **Lucas**, feita pelo aluno **Augusto**, com o objetivo de revisar **interfaces** e praticar **expressões lambda em Java**.  

O foco é aprender a **passar comportamento como parâmetro**, essencial para eventos e componentes, como botões no Java Swing.

---

## 📁 Estrutura das pastas

Cada pasta contém:  

- `src/` - código-fonte do exercício  
- `.gitignore` - ignora pastas de build (`bin/`) e arquivos de IDE  

---

## 📝 Exercícios

### 01) Interface com vários métodos 🐶
**Objetivo:** Criar interface `Animal` com métodos `comer`, `dormir` e `emitirSom`  
**Prática:** Implementar na classe `Cachorro` e chamar todos os métodos

### 02) Passando interface como parâmetro 🔘
**Objetivo:** Criar interface funcional `EmitirSom` e classe `Botao`  
**Prática:** Passar um objeto que implementa a interface para o método `apertar`

### 03) Lambda direta ⚡
**Objetivo:** Usar lambda diretamente para emitir som  
**Prática:** Passar lambda para `apertar` e imprimir `"Pruu pruu"`

### 04) Lambda em variável 💾
**Objetivo:** Guardar uma lambda em variável do tipo `EmitirSom`  
**Prática:** Passar a variável para o método `apertar`

### 05) Redução de sintaxe ✨
**Objetivo:** Criar interface `LancarMagia` e classe `Varinha`  
**Prática:** Chamar lambda de três formas: com `{ }`, em linha, e armazenada em variável

### 06) Lambda com 1 parâmetro 🎤
**Objetivo:** Criar interface `Falar` e classe `Microfone`  
**Prática:** Lambda que imprime `"O microfone recebeu: Teste"`

### 07) Lambda com 2 parâmetros 🔊
**Objetivo:** Criar interface `SomComVolume` e classe `CaixaDeSom`  
**Prática:** Lambda que imprime `Som:Bip|Volume:3`

### 08) Lambda com retorno 📨
**Objetivo:** Criar interface `GerarMensagem` e classe `Mensageiro`  
**Prática:**  
- Lambda que retorna `"Olá, NOME!"`  
- Lambda em linha e com `{ } + return`  
- Imprimir `"Mensagem gerada: <mensagem>"`

### 09) Corrigindo erro comum ⚠️
**Objetivo:** Tornar interface `Acao` funcional  
**Prática:** Criar lambda para a versão corrigida

### 10) Pequeno desafio - Botão com listener 🪄
**Objetivo:** Simular botão com listener, similar ao `addActionListener` do Swing  
**Prática:**  
- Criar `EventoClique`, `BotaoMagico` e interface `CliqueListener`  
- Registrar listener usando lambda  
- Imprimir `"Você clicou no Botão Mágico!"`

---

## 📌 Resumo da prática

O aluno **Augusto** praticou:  

- Criação de **interfaces funcionais**  
- Uso de **lambdas** com 0, 1 ou 2 parâmetros  
- **Lambdas com e sem retorno**  
- **Passagem de comportamento como parâmetro**  
- **Simulação de eventos de clique**  

Esses exercícios reforçam conceitos essenciais de **Java** e **programação orientada a objetos**, importantes para **interfaces gráficas interativas**.

---

## 🧑‍🏫 Autor

- **Aluno:** Augusto  
- **Professor:** Lucas
