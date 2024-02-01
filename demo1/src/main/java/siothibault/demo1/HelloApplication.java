package siothibault.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jouet barbie = new Jouet("Poupée Barbie", "Plastique", 15, 1);
        Jouet echecLumineux = new Jouet("Echec lumineux", "Bois", 20, 2);

        int choix;
        while (choix != 4) {
            System.out.println("1. Afficher l'état des jouets");
            System.out.println("2. Augmenter/Diminuer le prix des jouets");
            System.out.println("3. Intervertir les catégories des jouets");
            System.out.println("4. Quitter");
            System.out.print("Entrez votre choix : ");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    afficherEtatJouets(barbie, echecLumineux);

                case 2:
                    System.out.print("Entrez le pourcentage d'augmentation/diminution : ");
                    double pourcentage = scanner.nextDouble();
                    augmenterDiminuerPrix(barbie, pourcentage);
                    augmenterDiminuerPrix(echecLumineux, pourcentage);

                case 3:
                    intervertirCategories(barbie, echecLumineux);

                case 4:
                    System.out.println("Au revoir !");
            }
        }
    }

    private static void afficherEtatJouets(Jouet jouet1, Jouet jouet2) {
        System.out.println("Jouet 1 : " + jouet1);
        System.out.println("Jouet 2 : " + jouet2);
    }

    private static void augmenterDiminuerPrix(Jouet jouet, double pourcentage) {
        double nouveauPrix = jouet.getPrix() * (1 + pourcentage / 100);
        jouet.setPrix((int) nouveauPrix);
        System.out.println("Le nouveau prix de " + jouet.getNom() + " est : " + nouveauPrix);
    }

    private static void intervertirCategories(Jouet jouet1, Jouet jouet2) {
        int categorieTemp = jouet1.getCategorie();
        jouet1.setCategorie(jouet2.getCategorie());
        jouet2.setCategorie(categorieTemp);
        System.out.println("Les catégories ont été interverties.");
    }
}