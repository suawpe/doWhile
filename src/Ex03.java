void main() {
    Scanner sc = new Scanner(System.in);

    int num;
    int i = 0;
    do {

        IO.println("Digite os numeros que deseja somar / 0 para parar");
        num = sc.nextInt();
        i += num;

    } while (num != 0); {

    }

    IO.println(i);
}