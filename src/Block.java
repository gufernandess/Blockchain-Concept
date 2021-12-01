import java.util.Arrays;

public class Block {

    /*

    Alguns conceitos necessários para entender o contexto da aplicação:

    - Hash: Assinatura digital;
    - Cada bloco terá uma:
                           - lista de transações;
                           - hash anterior;
                           - hash atual;

    */

    private int previousHash, blockHash;
    private String[] listOfTransactions;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.listOfTransactions = transactions;

        Object[] contains = {Arrays.hashCode(listOfTransactions), previousHash}; // Construção de uma assinatura digital baseada nos registros
        this.blockHash = Arrays.hashCode(contains);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public String[] getListOfTransactions() {
        return listOfTransactions;
    }
    
}
