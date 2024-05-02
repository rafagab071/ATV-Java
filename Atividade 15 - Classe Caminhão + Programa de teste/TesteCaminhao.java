public class TesteCaminhao {
    public static void test() {
        Caminhao meuCaminhao = new Caminhao("Scania", "DPP0922", 2017, 9999.0, 22.0, 9);

        System.out.println("Dados do Caminhao:");
        meuCaminhao.imprime();
    }
}