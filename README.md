# 🚗 Sistema Automotivo - Gestão de Estoque de Veículos

![Status do Projeto](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.0-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)

## 📖 Sobre o Projeto
Este projeto foi desenvolvido como requisito acadêmico para demonstrar a aplicação prática de **Programação Orientada a Objetos (POO)**, desenvolvimento de APIs RESTful e persistência de dados. O sistema resolve o problema de desorganização no estoque de veículos de concessionárias, permitindo o cadastro, consulta, atualização e remoção (CRUD) de veículos, além de suas respectivas marcas e modelos.

---

## 🎯 Funcionalidades Principais
- **Gestão de Marcas e Modelos:** Cadastro e associação estruturada para manter a integridade dos dados.
- **Gestão de Veículos:** Controle completo incluindo cor, ano, preço, quilometragem e status de disponibilidade (Disponível, Vendido, Descontinuado).
- **Filtros Avançados:** Pesquisa otimizada por Marca, Modelo, Ano de Fabricação e Status, utilizando JPA Specifications.
- **Interface Web Integrada:** Front-end simples provido para facilitar a interação e validação dos dados de forma visual.

---

## 💻 Tecnologias Utilizadas
* **Backend:** Java 17, Spring Boot, Spring Data JPA, Hibernate, Maven.
* **Banco de Dados:** MySQL.
* **Frontend:** HTML5, CSS3 e Vanilla JavaScript (Fetch API).
* **Outros:** Lombok (para redução de boilerplate).

---

## ⚙️ Arquitetura e Estrutura
O sistema foi desenhado sobre o padrão arquitetural MVC modificado (padrão de camadas REST):
- `model`: Entidades (classes) representando as tabelas do banco de dados (POO, encapsulamento).
- `repository`: Interfaces de acesso a dados via JPA.
- `service`: Lógica de negócio e regras de sistema isoladas.
- `controller`: Exposição dos endpoints REST para comunicação HTTP.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Java 17+ instalado
- MySQL Server rodando localmente na porta padrão (3306)
- Maven (Opcional caso utilize a IDE para rodar)

### Passo a Passo
1. **Banco de Dados:**
   Abra seu SGBD (ex: phpMyAdmin ou MySQL Workbench) e crie o banco de dados rodando:
   ```sql
   CREATE DATABASE gestao_veiculos;
   ```

2. **Configuração de Acesso:**
   No arquivo `src/main/resources/application.properties`, as credenciais estão configuradas como padrão (`root` sem senha ou `root`/`root`). Altere caso seu MySQL possua senha.

3. **Iniciando a Aplicação:**
   Abra a pasta do projeto na sua IDE favorita (IntelliJ, Eclipse, VS Code) e rode o método `main` da classe `GestaoVeiculosApplication`.

4. **Acessando a Interface:**
   Com a aplicação rodando, abra o navegador e acesse:
   👉 `http://localhost:8080/index.html`

---

## 📸 Demonstração do Sistema (Telas)

<table>
  <tr>
    <td align="center">
      <strong>Interface do Sistema (Index)</strong><br>
      <img src="Sistema/Index.png" width="400px;" alt="Interface do Sistema" />
    </td>
    <td align="center">
      <strong>Filtros em Ação</strong><br>
      <img src="Sistema/Filtros.png" width="400px;" alt="Filtros" />
    </td>
  </tr>
  <tr>
    <td align="center" colspan="2">
      <strong>Banco de Dados (MySQL)</strong><br>
      <img src="Sistema/BancoDeDados.png" width="800px;" alt="Banco de Dados MySQL" />
    </td>
  </tr>
</table>

---

## 💻 Evidências de Código (Orientação a Objetos e REST)

<table>
  <tr>
    <td align="center">
      <strong>Entidade Veiculo (POO e Encapsulamento)</strong><br>
      <img src="codigo/Veiculo.png" width="400px;" alt="Classe Veiculo" />
    </td>
    <td align="center">
      <strong>Veiculo Controller (REST API)</strong><br>
      <img src="codigo/VeiculoController.png" width="400px;" alt="Veiculo Controller" />
    </td>
  </tr>
  <tr>
    <td align="center">
      <strong>Veiculo Service (Regra de Negócio)</strong><br>
      <img src="codigo/VeiculoService.png" width="400px;" alt="Veiculo Service" />
    </td>
    <td align="center">
      <strong>Filtros Avançados (JPA Specification)</strong><br>
      <img src="codigo/VeiculoSpecification.png" width="400px;" alt="Veiculo Specification" />
    </td>
  </tr>
</table>

---
Desenvolvido para trabalho acadêmico. 🎓
