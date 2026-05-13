void main() {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int i = 1;

    IO.println("Digite o numero que voce deseja ver a tabuada de 1 a 10");
    num = sc.nextInt();

    do {
        int contagem = num * i;
        IO.println(num + " x " + i + " = " +contagem);
        i++;
    } while (i<=10);
}