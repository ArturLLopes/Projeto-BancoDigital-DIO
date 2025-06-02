# 🏦 Projeto Banco Digital - DIO


[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/)

## 📋 Sobre o Projeto

O **Projeto Banco Digital** é uma aplicação desenvolvida como parte do bootcamp da Digital Innovation One (DIO), que simula as principais funcionalidades de um banco digital moderno. O projeto implementa conceitos fundamentais de programação orientada a objetos e padrões de design para criar um sistema bancário robusto e escalável.

## 🚀 Funcionalidades

- ✅ **Criação de Contas**: Conta Corrente e Conta Poupança
- ✅ **Operações Bancárias**: Depósito, Saque e Transferência
- ✅ **Consulta de Saldo**: Visualização do saldo atual
- ✅ **Extrato**: Histórico de transações
- ✅ **Gerenciamento de Clientes**: Cadastro e consulta de dados
- ✅ **Validações**: Sistema de validação para operações seguras

## 🛠️ Tecnologias Utilizadas

- **Java 21+**
- **Spring Boot** 
- **Gradle** - Gerenciamento de dependências
- **JUnit** - Testes unitários
- **Git** - Controle de versão

## 📁 Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── dio/
│               └── banco/
│                   ├── model/
│                   │   ├── Conta.java
│                   │   ├── ContaCorrente.java
│                   │   ├── ContaPoupanca.java
│                   │   └── Cliente.java
│                   ├── service/
│                   │   └── BancoService.java
│                   ├── repository/
│                   └── Main.java
└── test/
    └── java/
        └── com/
            └── dio/
                └── banco/
                    └── BancoTest.java
```

## 🔧 Como Executar

### Pré-requisitos

- Java 11 ou superior
- Gradle 3.6+
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos para execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/ArturLLopes/Projeto-BancoDigital-DIO.git
   ```

2. **Navegue até o diretório do projeto**
   ```bash
   cd Projeto-BancoDigital-DIO
   ```

3. **Compile o projeto**
   ```bash
   mvn clean compile
   ```

4. **Execute a aplicação**
   ```bash
   mvn exec:java -Dexec.mainClass="com.dio.banco.Main"
   ```

   Ou execute diretamente pela IDE:
   - Abra o projeto na sua IDE
   - Localize a classe `Main.java`
   - Execute o método `main`

## 💡 Exemplos de Uso

```java
// Criando um cliente
Cliente cliente = new Cliente("João Silva", "123.456.789-00");

// Criando contas
ContaCorrente cc = new ContaCorrente(client);
ContaPoupanca cp = new ContaPoupanca(cliente);

// Realizando operações
cc.depositar(1000.0);
cc.transferir(300.0, cp);
cc.sacar(100.0);

// Consultando saldo
System.out.println("Saldo CC: " + cc.getSaldo());
System.out.println("Saldo CP: " + cp.getSaldo());
```

## 🧪 Executando os Testes

```bash
# Executar todos os testes
mvn test

# Executar testes com relatório de cobertura
mvn test jacoco:report
```

## 📊 Conceitos Aplicados

### Programação Orientada a Objetos
- **Encapsulamento**: Proteção dos dados internos das classes
- **Herança**: Hierarquia entre as classes de conta
- **Polimorfismo**: Implementação de diferentes tipos de conta
- **Abstração**: Interface comum para operações bancárias

### Padrões de Design
- **Template Method**: Para operações comuns entre tipos de conta
- **Factory Method**: Para criação de diferentes tipos de conta
- **Strategy**: Para diferentes tipos de operações

## 🤝 Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👤 Autor

**Artur L. Lopes**

- GitHub: [@ArturLLopes](https://github.com/ArturLLopes)
- LinkedIn: [LinkedIn](www.linkedin.com/in/arturlageslopes)

## 🎓 Sobre a DIO

Este projeto foi desenvolvido como parte do bootcamp da [Digital Innovation One (DIO)](https://dio.me/), uma plataforma de educação gratuita que conecta os melhores talentos da tecnologia com as empresas mais inovadoras do mundo.

## 📚 Recursos Adicionais

- [Documentação Java](https://docs.oracle.com/en/java/)
- [Spring Boot Guide](https://spring.io/guides)

---

⭐ **Gostou do projeto? Deixe uma estrela!** ⭐
