# Simple RPG Game in Java in Terminal

This project is a basic RPG game developed in Java, aimed at enhancing language skills and deepening programming knowledge. The game is currently under development and includes basic functionalities for entity combat, experience, and leveling systems.

## Features

- **Entity System**: Defines entities as either Human or Monster with attributes like name, type, health points (HP), level, and experience.
- **Combat and Attack**: Allows entities to attack each other, inflicting damage and checking for defeat.
- **Experience and Leveling**: Entities gain experience points when defeating enemies, which can lead to level increases.

## Code Structure

The code is organized around an `Entity` class, representing a game entity (human or monster) with the following main components:

- **Attributes**: Name, type, level, experience, and HP.
- **Methods**:
  - `attack()`: Allows an entity to attack another, dealing damage.
  - `takeDamage()`: Updates an entity's HP when it receives damage.
  - `earnEXP()`: Experience points system for leveling up.
  - `profile()`: Displays information about the entity.

## Technologies Used

- **Java**: Main programming language.
- **Random**: Used to define experience gained after a battle.

## Project Objective

This is a personal project created exclusively for studying and improving skills in Java. It is a work in progress and is intended as a learning foundation, with potential for expansion with new features.

## How to Contribute

As this is a personal project, external contributions are not planned at the moment. However, suggestions and feedback are welcome!


---

# Jogo Simples de RPG em Java no Terminal

Este projeto é um jogo básico de RPG desenvolvido em Java, com o objetivo de aprimorar habilidades na linguagem e aprofundar conhecimentos de programação. A criação do jogo está em andamento e inclui funcionalidades básicas de combate entre entidades, sistema de experiência e níveis.

## Funcionalidades

- **Sistema de Entidades**: Define entidades do tipo Humano e Monstro com características como nome, tipo, pontos de vida (HP), nível e experiência.
- **Combate e Ataque**: Permite que as entidades ataquem umas às outras, infligindo dano e verificando a derrota.
- **Experiência e Níveis**: Ao derrotar inimigos, as entidades ganham pontos de experiência que podem levá-las a subir de nível.

## Estrutura do Código

O código é organizado em torno de uma classe `Entity`, que representa uma entidade do jogo (humano ou monstro), com os seguintes componentes principais:

- **Atributos**: Nome, tipo, nível, experiência e HP.
- **Métodos**:
  - `attack()`: Permite que uma entidade ataque outra, causando dano.
  - `takeDamage()`: Atualiza o HP de uma entidade ao receber dano.
  - `earnEXP()`: Sistema de pontos de experiência para ganhar níveis.
  - `profile()`: Exibe informações sobre a entidade.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Random**: Usado para definir a experiência adquirida após um combate.

## Objetivo do Projeto

Este é um projeto pessoal, criado exclusivamente para estudo e desenvolvimento de habilidades em Java. A implementação está em andamento e é planejada como uma base para aprendizado, podendo ser expandida com novas funcionalidades.

## Como Contribuir

Como se trata de um projeto pessoal, contribuições externas não estão previstas no momento. No entanto, sugestões e feedbacks são bem-vindos!
