package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa {
    private String registro;
    private LocalDate dataContratacao;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
    public Professor(String registro, LocalDate dataContratacao) {
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }

    public Professor(){

    }


}






RESPOSTAS
2 - resposta: B) A propriedade setId(), da classe “Classe”, se não existir, não irá gerar erro de
compilação.

3 - resposta: A) Se necessário, o programador pode criar uma instância dessa classe, facilitando
assim sua operação, bastando adicionar a outra classe a linha de código:
Calculadora calc = new Calculadora()

4 - resposta: C) Um objeto é uma entidade que possui um estado e um conjunto definido de operações
definidas para funcionar nesse estado.

5 - B) as classes podem ser potencialmente reutilizáveis.
2 - resposta: B) A propriedade setId(), da classe “Classe”, se não existir, não irá gerar erro de
compilação.

3 - resposta: A) Se necessário, o programador pode criar uma instância dessa classe, facilitando
assim sua operação, bastando adicionar a outra classe a linha de código:
Calculadora calc = new Calculadora()

4 - resposta: C) Um objeto é uma entidade que possui um estado e um conjunto definido de operações
definidas para funcionar nesse estado.

5 - B) as classes podem ser potencialmente reutilizáveis.

















