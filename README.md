#  Lista de Exercícios - Interfaces e Lambdas em Java ☕️

Lista de exercícios do **Professor Lucas** para revisar interfaces e praticar **lambdas**.  
Foco: **passar comportamento como parâmetro**, útil em eventos e botões no Java Swing.

---

## 📂 Estrutura do projeto

Cada pasta contém:

src/: código-fonte do exercício
.gitignore: ignora pastas de build (bin/) e arquivos de IDE


---

## 🏆 Exercícios

### 01) 🐶 Interface com vários métodos
**Objetivo:** Criar interface `Animal` (`comer`, `dormir`, `emitirSom`).  
**Prática:** Implementar na classe `Cachorro` e chamar os métodos.

### 02) 🔘 Passando interface como parâmetro
**Objetivo:** Criar interface funcional `EmitirSom` e classe `Botao`.  
**Prática:** Passar um objeto que implementa a interface para `apertar`.

### 03) ⚡ Lambda direta
**Objetivo:** Usar lambda para emitir som sem criar classe.  
**Prática:** Lambda para `apertar`, imprimir `"Pruu pruu"`.

### 04) 💾 Lambda em variável
**Objetivo:** Guardar lambda em variável `EmitirSom`.  
**Prática:** Passar variável para `apertar`.

### 05) ✨ Redução de sintaxe
**Objetivo:** Criar `LancarMagia` e `Varinha`.  
**Prática:** Chamar lambda: com `{ }`, em linha e armazenada em variável.

### 06) 🗣️ Lambda com 1 parâmetro
**Objetivo:** Criar `Falar` e `Microfone`.  
**Prática:** Lambda imprime `"O microfone recebeu: Teste"`.

### 07) 🔊 Lambda com 2 parâmetros
**Objetivo:** Criar `SomComVolume` e `CaixaDeSom`.  
**Prática:** Lambda imprime `Som:Bip|Volume:3`.

### 08) 💌 Lambda com retorno
**Objetivo:** Criar `GerarMensagem` e `Mensageiro`.  
**Prática:** Lambda retorna `"Olá, <nome>!"`, imprimir `"Mensagem gerada: <mensagem>"`.

### 09) ⚠️ Corrigindo erro comum
**Objetivo:** Tornar interface `Acao` funcional.  
**Prática:** Criar lambda para a versão corrigida.

### 10) 🖱️ Pequeno desafio - Botão com listener
**Objetivo:** Simular botão com listener (como `addActionListener`).  
**Prática:**  
- Criar `EventoClique`, `BotaoMagico` e `CliqueListener`  
- Registrar listener usando lambda  
- Ao clicar, imprimir `"Você clicou no Botão Mágico!"`

---

## ✏️ Resumo da prática



- Interfaces funcionais  
- Lambdas com 0, 1 e 2 parâmetros  
- Lambdas com e sem retorno  
- Passagem de comportamento como parâmetro  
- Simulação de eventos de clique  

**Esses exercícios reforçam conceitos essenciais de Java e programação orientada a objetos.**

---

## 👨‍🎓 Autor

- **Aluno:** Augusto  
- **Professor:** Lucas
