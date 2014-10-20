// Grant Sugimura

public class NimGame
{
  private int numPieces; // Number of pieces the comp takes
  public int play(int pieces) 
  {
    if (pieces % 3 == 0) // Checks if there is no remainder
    {
      numPieces = 2; // If so, take 2 pieces
    }
    if (pieces % 3 == 2) // Checks if there is a remainder of 2 
    {
      numPieces = 1; // If so, take 1
    }
    if (pieces % 3 == 1) // Checks if there is a remainder of 1 
    {
      numPieces = 1; // If so, take 1
    }
    
    System.out.println("The computer takes "+ numPieces); // Shows how many the computer takes
    return numPieces; // Returns value
  }
  
}
  
  
  

  
  