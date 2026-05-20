void main() {
    Scanner sc = new Scanner(System.in);

    double saldo = 1000;
    int op;

    do {
        IO.println("1 - Ver saldo");
        IO.println("2 - Depositar");
        IO.println("3 - Sacar");
        IO.println("4 - Sair");

        op = sc.nextInt();

        if (op == 1) {
            IO.println("Saldo: R$ " + saldo);
        }

        if (op == 2) {
            IO.println("Valor para depositar:");
            saldo = saldo + sc.nextDouble();
        }

        if (op == 3) {
            IO.println("Valor para sacar:");
            double saque = sc.nextDouble();

            if (saque <= saldo) {
                saldo = saldo - saque;
            } else {
                IO.println("Saldo insuficiente");
            }
        }

    } while (op != 4);
}