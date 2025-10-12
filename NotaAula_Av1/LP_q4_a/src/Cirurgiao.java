class Cirurgiao extends Medico {

    public Cirurgiao(String nome, String crm) {
        super(nome, crm);
    }

    @Override
    public void tratarPaciente() {
        System.out.println(nome + " (Cirurgião) está preparando a sala de cirurgia.");
    }

    public void fazerIncisao() {
        System.out.println(nome + " está realizando uma incisão cirúrgica.");
    }
}