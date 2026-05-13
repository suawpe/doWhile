void main() {
    Scanner sc = new Scanner(System.in);

    int escolha;

    do {
        IO.println("Menu\n 1- Diga Olá!\n 2- Mostrar uma mensagem\n 3- Sair");
        escolha = sc.nextInt();
        if (escolha == 1) {
            IO.println("Olá!!!\n");
        } else if (escolha == 2) {
            IO.println("Uma mensagem!\n");

        }

    } while (escolha != 3);

}