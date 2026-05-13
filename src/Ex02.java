void main() {
    Scanner sc = new Scanner(System.in);
    int senha;

    do {
        IO.println("Digite sua senha");
        senha = sc.nextInt();
        if (senha != 1234) {
            IO.println("Senha incorreta");
        }
    } while (senha != 1234);


    IO.println("Senha correta! Celular desbloqueado");
}