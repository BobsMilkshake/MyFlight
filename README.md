## MyFlight
 Programa fictício de gerenciamento rotas, aeroportos, aeronaves e voos.


## Sistema de classes e gerência
  O programa MyFlight possui 5 entidades de classe, Aeronave, Aeroporto, CiaAerea, Rota e Voo, sendo VooDireto e VooEscalas subclasses de Voo. Para cada classe de entidade existe uma classe que à gerencia, com métodos de adicionar, retirar, procurar, organizar e entre outros, métodos que server para manipular a estrutura da dados sobre essas entidades.
  
  ## Classe App
    Classe App é uma classe de instâncias de objetos de classe.
    
  ## Classes abstratas e interfaces
    Como suporte para as outras classes de entidade e gerencia, nós temos as classes VooAbstrato e Contavel. VooAbstrato é a classe na qual Voo, VooDireto e VooEscalas vão herdar, facilitando a implementação delas. Contavel é a interface implementada por Aeroporto, que possui um método de retornar a quantidade de entidades instanciadas.


