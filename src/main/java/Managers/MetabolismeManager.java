/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Entites.Metabolisme;
import java.util.ArrayList;

/**
 *
 * @author rcorroch
 */
public class MetabolismeManager {
    private static ArrayList<Metabolisme> metabolisme;
    static{
    metabolisme= new ArrayList<>();
    metabolisme.add(new Metabolisme("IMC", "insuffisance pondérale (maigreur)", "Votre poids apparaît trop faible par rapport à votre taille. Ce faible indice de masse corporel (IMC) est peut-être la conséquence d'une pathologie, mais elle-même peut exposer à un certain nombre de risques pour votre santé (carences, anémie, ostéoporose...). Parlez-en avec votre médecin traitant. Il pourra rechercher la cause de cette maigreur et vous conseiller."));
    metabolisme.add(new Metabolisme("IMC", "poids normal", "Votre poids est adapté à votre taille. Gardez vos habitudes alimentaires pour conserver un indice de masse corporel (IMC) idéal et un poids qui vous assure un état de santé optimal. Une alimentation équilibrée, sans excès de matières grasses, associée à une activité physique régulière vous aideront à maintenir votre poids idéal."));
    metabolisme.add(new Metabolisme("IMC", " surpoids", "Votre poids commence à devenir trop élevé par rapport à votre taille. A long terme, un indice de masse corporel (IMC) élevé a des conséquences sur la santé. L'excès de poids entraîne un risque accru de maladies métaboliques (diabète), cardiaques, respiratoires, articulaires et de cancer. Si vous souhaitez commencer un régime pour perdre du poids, parlez-en au préalable avec votre médecin traitant."));
    metabolisme.add(new Metabolisme("IMC", " obésité", "Votre poids est trop élevé par rapport à votre taille. Du point de vue médical, l'obésité est un excès de masse grasse ayant des conséquences sur la santé. L'excès de poids entraîne un risque accru de maladies métaboliques (diabète), cardiaques, respiratoires, articulaires et de cancer. Si vous souhaitez commencer un régime pour perdre du poids, parlez-en au préalable avec votre médecin traitant. A noter que la sévérité de l'obésité dépend de l'indice de masse corporelle (IMC) : elle est dite \"modérée\" pour un IMC compris entre 30 et 34,9, \"sévère\" lorsque l'IMC est compris entre 35 et 39,9 et \"massive\" pour un IMC au-dessus de 40."));
    metabolisme.add(new Metabolisme("IMG", "homme", "Chez les hommes, le résultat doit se situer entre 15% et 20%. En dessous de ces chiffres, il est possible que vous n’ayez pas assez de masse grasse dont le corps a besoin. Au-dessus de 20%, il est possible que vous ayez trop de masse graisseuse,À noter que ce calcul n’est pas applicable,aux athlètes d’endurance ou aux personnes très musclées."));
    metabolisme.add(new Metabolisme("IMG", "femme", "Chez les femmes, la moyenne est comprise entre 25% et 30%. À noter que ce calcul n’est pas applicable aux femmes enceintes ou qui allaitent,aux athlètes d’endurance ou aux personnes très musclées."));
    metabolisme.add(new Metabolisme("MB", "info general", "Le métabolisme de base peut donc se comprendre comme les besoins « inévitables » de votre organisme : il ne peut fonctionner correctement sans cette énergie. Il s’agit de l’énergie minimale dont a besoin l’organisme pour survivre au repos, c’est à dire l’énergie demandée pour assurer des fonctions basiques comme la respiration, la digestion, le fonctionnement du cerveau, le maintien de la température du corps…"));
    }
       public static ArrayList<Metabolisme> getAll(){
       return metabolisme;
   } 
}
