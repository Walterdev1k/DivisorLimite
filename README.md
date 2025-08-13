# DivisorLimite

Comandos Utilizados

Aqui está a explicação resumida de cada comando para integrar diretórios locais com remoto no GitHub.

echo "# DiferencaIdade" >> README.md
→ Cria um arquivo README.md com o texto # DiferencaIdade (um título em Markdown).

git init
→ Inicializa um repositório Git na pasta atual (cria a estrutura oculta .git/).

git add README.md
→ Adiciona o arquivo README.md ao Staging Area (preparação para o commit).

git commit -m "first commit"
→ Cria um commit com as alterações adicionadas, usando a mensagem "first commit".

git branch -M main
→ Renomeia a branch padrão (geralmente master) para main (convenção moderna).

git remote add origin https://github.com/User/Diretório(repositório).git
→ Vincula o repositório local a um repositório remoto (GitHub) chamado origin.

git push -u origin main
→ Envia (push) os commits locais para o repositório remoto (origin), na branch main.
→ O -u define origin/main como upstream (rastreamento automático).

Resumo Geral:
Esses comandos criam um novo projeto Git, adicionam um README.md, fazem o primeiro commit e o enviam para um repositório remoto no GitHub.

*******************************************************************************************************************************

walter-domiciano:~/development/Exercicios$ cd DivisorLimite
walter-domiciano:~/development/Exercicios/DivisorLimite(git:master)$ git branch -M main
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ echo "# DivisorLimite" >> README.md
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git init
Reinitialized existing Git repository in /home/walter-domiciano/development/Exercicios/DivisorLimite/.git/
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git add README.md
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git commit -m "first commit"
[main (root-commit) 12f8e1f] first commit
 9 files changed, 85 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 DivisorLimite.iml
 create mode 100644 README.md
 create mode 100644 src/Main.java
 create mode 100644 src/main/java/VerificadorDivisibilidade.java
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git branch -M main
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git remote add origin https://github.com/Walterdev1k/DivisorLimite.git
walter-domiciano:~/development/Exercicios/DivisorLimite(git:main)$ git push -u origin main
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 4 threads
Compressing objects: 100% (13/13), done.
Writing objects: 100% (15/15), 2.25 KiB | 768.00 KiB/s, done.
Total 15 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Walterdev1k/DivisorLimite.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

