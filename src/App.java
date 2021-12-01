import java.util.ArrayList;

public class App {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] firstBlockTransactions = {"O Gustavo enviou 10 bitcoins para Rivaldo"};
        Block firstBlock = new Block(0, firstBlockTransactions);

        String[] secondBlockTransactions = {"Victor enviou 20 bitcoins para Herik", "Herik enviou 10 bitcoins para Guilherme"};
        Block secondBlock = new Block(firstBlock.getBlockHash(), secondBlockTransactions);

        System.out.printf("Hash do primeiro bloco: %d\n", firstBlock.getBlockHash());
        System.out.printf("Hash do segundo bloco: %d\n", secondBlock.getBlockHash());
    }
}
