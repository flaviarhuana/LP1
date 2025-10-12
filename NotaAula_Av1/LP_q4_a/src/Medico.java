class Medico {
    protected String nome;
    protected String crm;
    protected String trabalhaNoHospital = "Sim";

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public void tratarPaciente() {
        System.out.println(nome + " (CRM: " + crm + ") está tratando um paciente.");
    }
}