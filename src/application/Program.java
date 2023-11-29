package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        sc.nextLine();
        Champion champion1 = new Champion(name, life, attack, armor);

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();
        Champion champion2 = new Champion(name, life, attack, armor);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("\nResultado do turno %d:\n", i);
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println(champion1.status());
            System.out.println(champion2.status());

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }
        }
        System.out.println("\nFIM DO COMBATE");

    }
}
