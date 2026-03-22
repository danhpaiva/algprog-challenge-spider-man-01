# 🕷️ Desafio de Algoritmo em Java<br>Sistema de Identidade do Homem-Aranha

Inspirado nos filmes do **Tom Holland** como **Peter Parker** no **Homem‑Aranha**, este desafio propõe a criação de um pequeno algoritmo em **Java** para decidir **quando Peter deve agir como herói ou permanecer como estudante**.

A ideia é trabalhar **variáveis, entrada de dados e estrutura condicional (`if / else`)**, simulando decisões que Peter Parker precisa tomar em seu dia a dia.

---

# 🧑‍💻 Desafio: "Peter Parker ou Homem-Aranha?"

Peter Parker precisa decidir se deve **ir para a escola** ou **agir como Homem-Aranha para combater o crime**.

Você deverá criar um programa em **Java** que analise algumas situações da cidade de Nova York e determine qual ação Peter deve tomar.

---

# 🎯 Objetivo

Criar um algoritmo em Java que:

1. Declare variáveis
2. Receba ou defina valores para essas variáveis
3. Utilize **estrutura condicional (`if`, `else if`, `else`)**
4. Exiba no console qual decisão Peter Parker deve tomar.

---

# 📥 Entradas do Sistema (Variáveis)

Seu programa deve considerar as seguintes variáveis:

| Variável        | Tipo    | Descrição                                             |
| --------------- | ------- | ----------------------------------------------------- |
| `nivelCrime`    | int     | Nível de crime na cidade (0 a 10)                     |
| `temProvaHoje`  | boolean | Indica se Peter tem prova na escola                   |
| `tioHappyLigou` | boolean | Indica se alguém da equipe dos Vingadores pediu ajuda |
| `horaDoDia`     | int     | Hora atual (0 a 23)                                   |

---

# 🧠 Regras de Decisão

Seu algoritmo deve seguir a seguinte lógica:

### Regra 1

Se o **nível de crime for maior que 7**, Peter deve virar o **Homem-Aranha**.

```
if (nivelCrime > 7)
```

---

### Regra 2

Se o nível de crime **não for alto**, mas **alguém dos Vingadores pediu ajuda**, ele deve ajudar.

```
else if (tioHappyLigou)
```

---

### Regra 3

Se **não houver emergência** e **Peter tiver prova**, ele deve ir para a escola.

```
else if (temProvaHoje)
```

---

### Regra 4

Caso contrário, Peter pode **patrulhar a cidade como Homem-Aranha**.

```
else
```

---

# 🖥️ Exemplo de Saída Esperada

```
Nivel de crime: 9
Tem prova hoje: true
Tio Happy ligou: false

Decisão: Vestir o traje! Nova York precisa do Homem-Aranha!
```

ou

```
Nivel de crime: 2
Tem prova hoje: true
Tio Happy ligou: false

Decisão: Hoje é dia de escola, Peter!
```

---

# 📌 Requisitos Técnicos

O programa deve obrigatoriamente:

✔ Declarar variáveis
✔ Usar **estrutura condicional `if / else`**
✔ Exibir mensagens no console
✔ Estar escrito em **Java**

---

# ⭐ Desafio Extra (Opcional)

Se quiser deixar o algoritmo mais interessante:

* Adicione **mais níveis de decisão**
* Use **Scanner para ler dados do usuário**
* Crie mensagens diferentes dependendo da situação

Exemplo:

```
if (nivelCrime >= 9) {
    System.out.println("Emergência total! Balance pela cidade imediatamente!");
}
```

---

# 🏁 Resultado Esperado

Ao final do desafio, o programa deve simular a decisão:

🧑‍🎓 **Peter Parker (vida normal)**
ou
🕷️ **Homem-Aranha (herói da cidade)**

---

💡 **Lembre-se do lema do tio Ben:**

> "Com grandes poderes vêm grandes responsabilidades."
