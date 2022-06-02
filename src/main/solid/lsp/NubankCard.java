package main.solid.lsp;

abstract public class NubankCard implements IPaymentsInstrument{

    @Override
    public void validate() throws Exception {
        //validação básica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado!");
    }
}
