class Pedido {
    protected String numero;
    protected String data;
    protected double valorTotal;

    protected Cliente cliente;
    protected Vendedor vendedor;

    public Pedido(String numero, String data, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }
}
