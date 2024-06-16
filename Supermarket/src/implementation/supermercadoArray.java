package implementation;

public class supermercadoArray implements Supermercado{

    private final String[] itens; // Criação do vetor. Por ser final, é obrigatório inicializar no construtor
    private int lastIndex; //criado para contabilizar todos os itens que forem adicionados no vetor e retornar o índece do último


    //CONSTRUTOR
    public supermercadoArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }


    //Métodos da Classe Supermercado
    @Override
    public void add(final String item) {
        //verificar se ao adicionar o item no vetor, ainda existe vaga
        if (lastIndex == itens.length - 1){
            System.err.println("Lista de supermercado cheia.");
        } else {
            lastIndex++;
            itens [lastIndex]= item;
        }
    }

    @Override
    public void print() {
        System.out.println("######################");
        if (lastIndex <0){
            System.out.println("Lista de supermercado vazia.");
        }
        for (int i = 0; i <= lastIndex; i++){
            System.out.println(i +"-" + itens[i]);
        }
        System.out.println("########################");
    }

    @Override
    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex){
            shift (index); //Operação que puxa os elementos da esquerda para a direita
            lastIndex--;
        }else {
            System.out.println("Índice invalido!");
        }
    }

    private void shift(final int index) {
        for (int i = index; i< lastIndex; i++){
            itens[i] = itens [i+1];
        }
    }
    // A CLASSE AO IMPLEMENTAR UMA INTERFACE É OBRIGADO A IMPLEMENTAR TODOS OS MÉTODOS

}