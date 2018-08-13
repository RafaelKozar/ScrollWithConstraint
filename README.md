# ScrollWithConstraint

Desafio: colocar um LinearLayout com o tamnho fixo, outro como wrap content e uma imageView com tamanho dentro de um constraintLayout no qual o layout se ajuste conforme o tamanho da tela (telas grandes e pequenas)

Solução: Para tal é preciso usar o constraint dentro de um scrollView para que q de scroll em telas pequenas e usar o atributo spread_inside do chainStyle, para que componentes da parte de cima e de baixo se alinhem respectivamente com o top e bottom da tela, sem deixar espaço.
