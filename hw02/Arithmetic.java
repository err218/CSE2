//Emma Resnick
//CSE2
//6 September 2014
//hw02


//class
public class Arithmetic{
    
    //method
    public static void main(String arg[]){
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$= 2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of enevelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
      
       
        //total costs of each category 
        //tax on each kind of item
        
        double totalSockCost= nSocks*sockCost$;
        double taxSock= totalSockCost*taxPercent;
       
        
        double totalGlassesCost=nGlasses*glassCost$;
        double taxGlasses= totalGlassesCost*taxPercent;
       
        
        double totalEnvelopesCost=nEnvelopes*envelopeCost$;
        double taxEnvelopes= totalEnvelopesCost*taxPercent;
        
        
        //total not including sales tax.
        double totalPurchase= totalSockCost+totalGlassesCost+totalEnvelopesCost; 
        
        //total sales tax
        double totalTax= taxSock+taxGlasses+taxEnvelopes;
        
        //Final Transaction (including tax)
        double finalTransaction= totalPurchase+totalTax;
        
        
        System.out.println("Three types of items are being bought: Socks, Glasses, and Envelopes");
        
        //costs
        System.out.println("Each pair of socks costs $"+ sockCost$);
        System.out.println("Each glass costs $" + glassCost$);
        System.out.println("Each box of envelopes cost $"+ envelopeCost$);
            
            
            
        //how many of each item are purchased    
        System.out.println(nSocks+ " pairs of socks are purchased.");
        System.out.println(nGlasses+ " drinking glasses are purchased.");
        System.out.println(nEnvelopes+ " boxes of envelopes are purchased.");
        
        //total costs for each type of item (no tax)
        System.out.println("The total cost for socks is $" + totalSockCost);
        System.out.println("The total cost for glasses is $"+ totalGlassesCost);
        System.out.println("The total cost for envelopes is $"+totalEnvelopesCost);
        
        //Tax for each type of item.
        
        System.out.printf("There is $ " + "%.2f" + " of tax on the sock purchase.\n", taxSock);
    
        System.out.printf("There is $"+ "%.2f" + " of tax on the glasses purchase.\n", taxGlasses);
       
        System.out.printf("There is $"+ "%.2f" + " of tax on the envelope purchase.\n", taxEnvelopes);
        
         //Purchase without sales tax
        System.out.println("The total purchase, before sales tax, is $ "+ totalPurchase);
        
        //Sales tax
        
        System.out.printf("The total sales tax is $"+ "%.2f"+ "\n", totalTax );
        
        
        
        //Final Transaction
        System.out.printf("The final transaction comes out to be $"+ "%.2f", finalTransaction);
       
        
        
    }
}