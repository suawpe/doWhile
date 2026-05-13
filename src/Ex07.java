void main() {
    Scanner sc = new Scanner(System.in);
    int senhacr;

    do {
        IO.println("Digite sua senha");
        senhacr = sc.nextInt();
        if (senhacr != 7) {
            IO.println("Senha incorreta. Tente Novamente!");
        }
    } while (senhacr != 7);


    IO.println("Parabens! Voce acertou!");
}