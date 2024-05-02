public class TesteVeiculo{
    public static void test(){
        Veiculo v;
        v = new Veiculo ("Prisma", "FAR6068", 2013, 40000);
        v.imprime();

        v.deprecia(10);
        System.out.println("==================");
        System.out.println("Veiculo depreciado");
        v.imprime();
    }
}