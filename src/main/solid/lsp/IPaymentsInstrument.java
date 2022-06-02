package main.solid.lsp;

public interface IPaymentsInstrument {

    void validate() throws Exception;
    void collectPayment();
}
