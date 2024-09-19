Trabalho realizado por: Miguel Magalhães, Nº2021103166



Guia de Execução do Projeto

Requisitos:

-IDE Recomendado: Apache NetBeans IDE.
-Servidores: Apache e MySQL.
-Dependência: mysql-connector-j-8.4.0.
-Passos para Configuração e Execução



1. Configuração do Ambiente

1.1. Instale o Apache NetBeans IDE:

-Certifique-se de ter o Apache NetBeans IDE instalado. Se ainda não tiver, você pode baixá-lo e instalá-lo a partir do sítio web oficial do NetBeans.

1.2. Instale o XAMPP ou outro software similar:

-Recomenda-se usar XAMPP para gerir os servidores Apache e MySQL.
-Baixe e instale o XAMPP a partir do sítio web oficial do XAMPP.



2. Configuração da Base de Dados

2.1. Inicie os servidores Apache e MySQL:

-Abra o painel de controlo do XAMPP e inicie os módulos Apache e MySQL.

2.2. Importe a base de dados:

-Abra o phpMyAdmin (geralmente acessível via http://localhost/phpmyadmin).
-Crie uma base de dados (por exemplo, meu_projeto).
-Importe o arquivo SQL fornecido na pasta Base de Dados para a base de dados criada.

3. Configuração do Projeto no NetBeans




3.1. Abra o projeto no NetBeans:

-Inicie o NetBeans e abra o projeto localizado na pasta Código.

3.2. Configure o conector MySQL:

-Baixe o mysql-connector-j-8.4.0 a partir do sítio web oficial do MySQL.
-No NetBeans, adicione o conector MySQL ao projeto:
	-> Vá para Projetos > Clique com o botão direito no nome do projeto > Propriedades.
	->Selecione Bibliotecas > Adicionar JAR/Folder.
	->Navegue até o local onde o mysql-connector-j-8.4.0.jar foi baixado e adicione-o.




4. Considerações Importantes

4.1. Estrutura de Pastas:

-Não altere o nome de nenhuma pasta dentro da pasta Código, pois isso pode comprometer a execução do programa.




5. Executar o Projeto

5.1. Rodar o Projeto:
	->Com todas as configurações acima concluídas, você pode executar o projeto no NetBeans clicando em Run (Executar).
	->Certifique-se de que os servidores Apache e MySQL estejam ativos durante a execução do projeto.



Trabalho realizado por: Miguel Magalhães, Nº2021103166
