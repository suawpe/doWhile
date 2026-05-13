void main() {
    Scanner sc = new Scanner(System.in);

    int escolha;
    int numero1;
    int numero2;

    IO.println("Escolha dois numeros para realizar uma operação\n");
    IO.println("Primeiro numero:");
    numero1 = sc.nextInt();
    IO.println("Segundo numero:");
    numero2 = sc.nextInt();

    do {
        IO.println("Menu\n 1- Somar\n 2- Subtrair\n 3- Multiplicar\n 4- Dividir\n 5- Sair");
        escolha = sc.nextInt();
        if (escolha == 1) {
            IO.println("soma: " + numero1 + numero2);
        } else if (escolha == 2) {
            IO.println("Subtrair: " + (numero1 - numero2));
        }  else if (escolha == 3) {
            IO.println("Multiplicar: " + (numero1 * numero2));
        }  else if (escolha == 4) {
            IO.println("Dividir: " + (numero1 / numero2));
        }

    } while (escolha != 5);

}