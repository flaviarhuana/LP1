class ClinicoGeral extends Medico {
    protected String atendeEmCasa;

    public ClinicoGeral(String nome, String crm, String atendeEmCasa) {
        super(nome, crm);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println(nome + " está receitando um medicamento.");
    }
}