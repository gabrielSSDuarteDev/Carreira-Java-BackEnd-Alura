# 🎓 Curso Java: Criando a sua Primeira Aplicação

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Alura-000000?style=for-the-badge&logo=alura&logoColor=white" alt="Alura"/>
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA"/>
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git"/>
</p>

## 📋 Sobre o Repositório

Este repositório foi desenvolvido para centralizar todas as anotações, exercícios de fixação, desafios de lógica e projetos práticos realizados ao longo do curso **"Java: criando a sua primeira aplicação"** da Alura. O treinamento integra a **Semana 02 da Jornada Geração Caldeira**, atuando como o pilar de transição prática entre o Pensamento Computacional abstrato e o desenvolvimento real de software.

O objetivo deste espaço é registrar a evolução no domínio da sintaxe Java, compreensão do ecossistema da linguagem (compilação e execução) e a aplicação de estruturas fundamentais de controle e manipulação de dados para a resolução de problemas reais de engenharia de software.

---

## 🎯 Objetivos do Curso

* Compreender a arquitetura de execução do Java (o papel da JVM, JRE e JDK).
* Dominar a sintaxe básica da linguagem, compreendendo as regras de tipagem forte e estática.
* Aplicar estruturas de decisão condicionais e laços de repetição para controle de fluxo complexos.
* Manipular fluxos de entrada e saída de dados via terminal de forma segura e internacionalizada.
* Desenvolver uma mentalidade prática de código limpo, organizando algoritmos através de métodos e modularização básica.

---

## 📚 Estrutura de Conteúdo Técnico

O curso foi estruturado em módulos incrementais, cujos conceitos foram integralmente praticados e documentados neste repositório:

### 1. O Ecossistema e Ambiente Java
* **JDK (Java Development Kit):** Ferramentas necessárias para compilar, depurar e executar aplicações Java.
* **JRE (Java Runtime Environment):** O ambiente mínimo necessário para a execução de programas compilados em *bytecode*.
* **JVM (Java Virtual Machine):** A máquina virtual responsável por ler o *bytecode* e traduzi-lo em código nativo de máquina, garantindo o princípio fundamental do Java: *"Escreva uma vez, rode em qualquer lugar"* (WORA).

### 2. Fundamentos da Sintaxe e Tipagem
* **Tipos Primitivos de Dados:** Manipulação de variáveis numéricas inteiras (`int`), de ponto flutuante (`double`), lógicas (`boolean`) e caracteres (`char`).
* **Tipagem Forte:** Compreensão de como o Java protege a memória e previne erros em tempo de compilação exigindo a declaração explícita de tipos.
* **Operadores:** Aplicação prática de operadores aritméticos, relacionais e lógicos para construção de expressões matemáticas e booleanas.

### 3. Estruturas de Controle de Fluxo
* **Condicionais (`if`, `else if`, `else`):** Desvios lógicos baseados em avaliações booleanas para tomada de decisões no código.
* **Laços de Repetição (`while` e `for`):** Construção de loops iterativos. Foco no uso do laço `while` para loops contínuos baseados em variáveis sentinelas (parada sob condição dinâmica definida pelo usuário).

### 4. Manipulação Avançada de Strings e I/O
* **Leitura de Dados (`Scanner`):** Captura de fluxos de entrada de dados via teclado com tratamento de exceções de localização regional através do `Locale.US` para leitura de dados decimais com ponto.
* **Text Blocks (`"""..."""`):** Recurso moderno (Java 15+) utilizado para declarar strings multilinha sem a necessidade de caracteres de escape ou concatenações repetitivas, facilitando a construção de menus visuais.
* **Saída Formatada (`System.out.printf`):** Manipulação e arredondamento estético de variáveis numéricas em exibições no terminal através de especificadores de formato (ex: `%.2f` para valores monetários).

### 5. Modularização de Código
* **Criação de Métodos:** Extração e isolamento de blocos lógicos do método principal (`main`) para funções estáticas especializadas, promovendo reutilização, legibilidade e fácil manutenção (Clean Code).

---

## 🛠️ Desafios Lógicos & Projetos Desenvolvidos

A evolução prática ao longo do curso foi dividida em duas frentes de codificação contidas neste repositório:

### ⚡ Desafios de Fixação de Lógica
Exercícios voltados para traduzir o Pensamento Computacional e pseudocódigos em estruturas de código funcionais. Destaca-se o desenvolvimento de algoritmos para:
* **Sistemas de Acumulação Financeira:** Utilização de laços estruturados baseados em flag de parada (`while (valor != 0)`) para consolidação de despesas de quantidade indefinida.
* **Jogos de Adivinhação:** Construção de lógicas interativas combinando estruturas de repetição limitadas por tentativas (`for`) e geração de dados pseudoaleatórios.

### 💼 Projeto de Consolidação: *CountBank*
O projeto final do curso consistiu no desenvolvimento de uma aplicação de console que simula um terminal de autoatendimento bancário (`ContaBancaria.java`). 
* O projeto unifica todos os conceitos do curso: **Text Blocks** para o painel de bordo, **Scanner** para interações, **Laço While** para manter o menu ativo, e **Estruturas Condicionais** conectadas a **Métodos Modularizados** para gerenciar regras de depósito e saques com dupla validação de segurança.

---

## 💻 Como Configurar e Executar o Repositório

### Pré-requisitos
* **Java SE Development Kit (JDK):** Versão 17 ou superior.
* **IDE Recomendada:** IntelliJ IDEA (Community ou Ultimate).

### Instruções Passo a Passo

1. **Clonar o projeto localmente:**
   ```bash
   git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git](https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git)
   ```
   *(Nota: Recomenda-se clonar em um diretório curto no Windows, como `C:\Projetos\`, para evitar problemas com caminhos de arquivos longos).*

2. **Abrir na IDE:**
   * Inicie o IntelliJ IDEA.
   * Vá em **File > Open** e selecione a pasta raiz do repositório clonado.

3. **Configurar o SDK do Projeto:**
   * Pressione `Ctrl + Alt + Shift + S` para abrir a janela **Project Structure**.
   * Em **Project > SDK**, selecione o JDK correspondente instalado na sua máquina (ex: JDK 17).
   * Em **Modules**, certifique-se de que as dependências do código fonte apontam para a mesma versão do JDK.

4. **Executar via terminal (Alternativa):**
   Navegue até a pasta `src/` e execute o arquivo principal diretamente:
   ```bash
   java src/ContaBancaria.java
   ```

---

## 🎓 Conclusão e Certificação

A finalização deste curso marca o encerramento do bloco introdutório da trilha Java, garantindo proficiência na escrita de sintaxe limpa, controle de fluxo algorítmico e domínio técnico básico das ferramentas do ecossistema Java.

<p align="center">
  <img src="Certificado_Primeira_Aplicacao_Java.png" alt="Certificado Alura - Java: Criando a sua primeira aplicação" width="90%"/>
</p>

---
<p align="center">Repositório mantido como portfólio de evolução técnica na Jornada Geração Caldeira 2026.</p>
```
