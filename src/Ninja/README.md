# Banque Concurrente en Java

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Java Version](https://img.shields.io/badge/java-1.8%2B-blue)

## Exercice

1. Créez une application Java qui simule une banque avec des comptes bancaires et des transactions. Utilisez des threads pour simuler des transactions concurrentes.
2. Créez une classe **BankAccount** avec les attributs **accountNumber** (String) et **balance** (double). Ajoutez les méthodes **deposit** et **withdraw**, en utilisant la synchronisation pour gérer les **accès concurrents**.
3. Créez une classe **Transaction** qui implémente **Runnable** et représente une transaction bancaire (dépôt ou retrait). Chaque transaction doit pouvoir être exécutée dans un **thread** distinct.
4. Créez une classe **Bank** avec une méthode **performTransactions** qui lance plusieurs threads de transaction sur plusieurs comptes bancaires.
5. Utilisez **la réflexion** pour afficher les noms des méthodes de la classe **BankAccount** avant et après l'exécution des transactions.

## Installation et Exécution

### Prérequis

- [Java JDK 8 ou supérieur](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
