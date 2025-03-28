/* HEADER BLOCK
PROGRAMMER: Lambsauce
DATE: 03.08.2025
DO NOT REPLICATE
INTENDED FOR USE BY MONOLITH SERVERS USERS ONLY
*/


import java.util.Scanner;

public class Methods {
	// method to calculate exact cost of seeds with set tax > 0
	
public static double taxCalc(double taxPercent, double orgPrice, double amtSeeds) { // calculates the amount with taxes paid for seeds
	double taxedPrice = orgPrice * (taxPercent * 0.01) + orgPrice;
	double newPrice = taxedPrice * amtSeeds;
	return newPrice;
}
// calculate the grossProfit
public static double grossCalc(double finalPrice, double sellPrice) {
	double pProfit = sellPrice - finalPrice;
	return pProfit;
}
//calculate the selling price with taxes into account
public static double sellPrice(double pSell, double newTax) { // tax calculated later down in the code, price sold in grossCalc
double taxPrice = (newTax * 0.01) * pSell;
return pSell - taxPrice;

}

public static void main (String [] args) {
	// local registry for undeclared variables
	String seedType;
	double pPrice, sPrice, nYield, sGross, seedCount, taxSet, oPrice = 0, lPrice = 0; 
	//lPrice is how much you're paying on top of original, oPrice is original price of item
	// pPrice is how much you're paying for the item with tax included
	// sPrice is how much you're selling the plant(s) for.
	// nYield is how much money you yield.
	// sGross is how much you make in profit. Other 2 variables are self explained 
	Scanner scnr = new Scanner(System.in); 
	plantVariables plantVars = new plantVariables(); // creates an instance of plantVariables
	System.out.println("1. Enter seed type, spell the name exactly as listed in the shop menu.");
	System.out.println("2. Enter amount of seeds you will be purchasing");
	System.out.println("3. Enter the current tax set.");

seedType = scnr.nextLine();
while (	!seedType.equalsIgnoreCase("Apple") && !seedType.equalsIgnoreCase("Tomato") && !seedType.equalsIgnoreCase("Banana") && !seedType.equalsIgnoreCase("Cabbage") &&
		!seedType.equalsIgnoreCase("Carrot") && !seedType.equalsIgnoreCase("Chilli") && !seedType.equalsIgnoreCase("Cocoa") && !seedType.equalsIgnoreCase("Coconut") && !seedType.equalsIgnoreCase("Corn") && 
		!seedType.equalsIgnoreCase("Eggplant") && !seedType.equalsIgnoreCase("Onion") && !seedType.equalsIgnoreCase("Orange") && !seedType.equalsIgnoreCase("Pear") && !seedType.equalsIgnoreCase("Potato") &&  
		!seedType.equalsIgnoreCase("White Grape") && !seedType.equalsIgnoreCase("Pumpkin") && !seedType.equalsIgnoreCase("Purple Grape") && !seedType.equalsIgnoreCase("Red Grape") 
		&& !seedType.equalsIgnoreCase("Gourd") && !seedType.equalsIgnoreCase("Pineapple") && !seedType.equalsIgnoreCase("Melon")){
	
		System.out.println("You have entered an incorrect option, please try again.");
		seedType = scnr.nextLine();
	}
 
seedCount = scnr.nextDouble(); // ensure proper values are recorded
while (seedCount <= 0) {
	System.out.println("You have entered a value below zero, try again.");
	seedCount = scnr.nextDouble();
}

taxSet = scnr.nextDouble();
while (taxSet < 0 || taxSet > 40) { // ensure proper values are recorded
	System.out.println("Enter a valid tax value, taxes cannot be less 0% or greater than 40%");
	taxSet = scnr.nextDouble();
}

if (seedType.equalsIgnoreCase("Apple")) {
    nYield = (seedCount * 3) * plantVars.sApple;
    pPrice = taxCalc(taxSet, plantVars.pApple, seedCount);
    oPrice = plantVars.sApple * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Purple Grape")) {
    nYield = (seedCount * 3) * plantVars.sPurpleGrape;
    pPrice = taxCalc(taxSet, plantVars.pPurpleGrape, seedCount);
    oPrice = plantVars.sPurpleGrape * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Pineapple")) {
    nYield = seedCount * plantVars.sPineapple;
    pPrice = taxCalc(taxSet, plantVars.pPineapple, seedCount);
    oPrice = plantVars.sPineapple * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Red Grape")) {
    nYield = (seedCount * 3) * plantVars.sRedGrape;
    pPrice = taxCalc(taxSet, plantVars.pRedGrape, seedCount);
    oPrice = plantVars.sRedGrape * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Banana")) {
    nYield = (seedCount * 3) * plantVars.sBanana;
    pPrice = taxCalc(taxSet, plantVars.pBanana, seedCount);
    oPrice = plantVars.sBanana * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Cabbage")) {
    nYield = (seedCount * 3) * plantVars.sCabbage;
    pPrice = taxCalc(taxSet, plantVars.pCabbage, seedCount);
    oPrice = plantVars.pCabbage * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
   
}
else if (seedType.equalsIgnoreCase("Carrot")) {
    nYield = (seedCount * 3) * plantVars.sCarrot;
    pPrice = taxCalc(taxSet, plantVars.pCarrot, seedCount);
    oPrice = plantVars.pCarrot * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Chilli")) {
    nYield = (seedCount * 3) * plantVars.sChilli;
    pPrice = taxCalc(taxSet, plantVars.pChilli, seedCount);
    oPrice = plantVars.pChilli * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Cocoa")) {
    nYield = (seedCount * 3) * plantVars.sCocoa;
    pPrice = taxCalc(taxSet, plantVars.pCocoa, seedCount);
    oPrice = plantVars.pCocoa * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Coconut")) {
    nYield = (seedCount * 3) * plantVars.sCoconut;
    pPrice = taxCalc(taxSet, plantVars.pCoconut, seedCount);
    oPrice = plantVars.pCoconut * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Corn")) {
    nYield = (seedCount * 3) * plantVars.sCorn;
    pPrice = taxCalc(taxSet, plantVars.pCorn, seedCount);
    oPrice = plantVars.pCorn * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Eggplant")) {
    nYield = (seedCount * 3) * plantVars.sEggplant;
    pPrice = taxCalc(taxSet, plantVars.pEggplant, seedCount);
    oPrice = plantVars.pEggplant * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
  
}
else if (seedType.equalsIgnoreCase("Onion")) {
    nYield = (seedCount * 3) * plantVars.sOnion;
    pPrice = taxCalc(taxSet, plantVars.pOnion, seedCount);
    oPrice = plantVars.pOnion * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Orange")) {
    nYield = (seedCount * 3) * plantVars.sOrange;
    pPrice = taxCalc(taxSet, plantVars.pOrange, seedCount);
    oPrice = plantVars.pOrange * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
   
}
else if (seedType.equalsIgnoreCase("Pear")) {
    nYield = (seedCount * 3) * plantVars.sPear;
    pPrice = taxCalc(taxSet, plantVars.pPear, seedCount);
    oPrice = plantVars.pPear * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
   
}
else if (seedType.equalsIgnoreCase("Potato")) {
     nYield = (seedCount * 3) * plantVars.sPotato;
     pPrice = taxCalc(taxSet, plantVars.pPotato, seedCount);
     oPrice = plantVars.pPotato * seedCount;
     lPrice = Math.abs(pPrice - oPrice);
   
}
else if (seedType.equalsIgnoreCase("Pumpkin")) {
    nYield = (seedCount * 3) * plantVars.sPumpkin;
    pPrice = taxCalc(taxSet, plantVars.pPumpkin, seedCount);
    oPrice = plantVars.pPumpkin * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Tomato")) {
    nYield = (seedCount * 3) * plantVars.sTomato;
    pPrice = taxCalc(taxSet, plantVars.pTomato, seedCount);
    oPrice = plantVars.pTomato * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
    
}
else if (seedType.equalsIgnoreCase("Gourd")) {
    nYield = (seedCount * 3) * plantVars.sGourd;
    pPrice = taxCalc(taxSet, plantVars.pGourd, seedCount);
    oPrice = plantVars.pGourd * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("White Grape")) {
    nYield = (seedCount * 1) * plantVars.sWhiteGrape;
    pPrice = taxCalc(taxSet, plantVars.pWhiteGrape, seedCount);
    oPrice = plantVars.pWhiteGrape  * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else if (seedType.equalsIgnoreCase("Melon")) {
    nYield = (seedCount * 3) * plantVars.sMelon;
    pPrice = taxCalc(taxSet, plantVars.pMelon, seedCount);
    oPrice = plantVars.pMelon * seedCount;
    lPrice = Math.abs(pPrice - oPrice);
}
else {
    System.out.println("You entered incorrect information!");
    return;
}

sPrice = sellPrice(nYield, taxSet);
sGross = grossCalc(pPrice, sPrice);

System.out.println("You can expect to spend: $" + pPrice + " collectively at " + taxSet + "%");
System.out.printf("You are going to pay: $%.2f over the original price of: $%.2f\n", lPrice, oPrice); 
System.out.printf("You will sell the " + seedType + "(s) at: $%.1f\n", sPrice);
System.out.printf("You will gross: $%.2f\n", sGross);

}
}

