public class DnaStrand {
  public static String makeComplement(String dna) {
  String [] dnaArray = dna.split("");
    for (int i = 0; i < dna.length(); i++)
    {
     if (dnaArray[i] == "A") {
     dnaArray[i] = "T";
     }
     else if (dnaArray[i] =="T") {dnaArray[i] = "A"; break;}
     else if (dnaArray[i] =="C") {dnaArray[i] = "G"; }
     else dnaArray[i] = "C";
     }
     String convertDna ="";
     for(String str: dnaArray)
        convertDna+=str;

     return convertDna;
  }
}
