# 1421-escrevendo-cheque-extenso
Continuando a discussão do Exercício 14.20, reiteramos a importância de se projetar
sistemas de preenchimento de cheques para impedir a alteração de valores do cheque. Um método comum de segurança requer que o valor
seja escrito em números e “por extenso” também. Mesmo se alguém for capaz de alterar o valor numérico do cheque, é extremamente
difícil alterar o valor por extenso. Elabore um aplicativo que insere um valor numérico de cheque menor do que $1.000 e escreve o valor
por extenso em inglês. Por exemplo, o valor 112,43 deve ser escrito assim

ONE hundred TWELVE and 43/100
