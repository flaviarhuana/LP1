package app;

import service.SistemaService;

public class Main {
    public static void main(String[] args) {
        SistemaService sistema = new SistemaService();
        sistema.menu();
    }
}
