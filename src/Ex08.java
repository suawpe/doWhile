void main() {

    Scanner sc = new Scanner(System.in);

    int i = 0;
    String nome = "";

    while (!nome.equalsIgnoreCase("sair")) {
        IO.println("Digite um nome:");
        nome = sc.nextLine();

        if (!nome.equalsIgnoreCase("sair")) {
            i++;
        }
    }

    IO.println("Total de nomes cadastrados: " + i);
}