class ArraysSwitch
{
   public static void main(String args[])
   {
      String [][] dayAnecdotes = {{"March", "31", "Went out like a lion"},
                            {"April", "30", "Turned its petals high"},
                            {"May", "31", "Full of promises"},
                            {"June", "30", "Busting out all over"}};
      
      String temp = dayAnecdotes[0][0];
      dayAnecdotes[0][0] = dayAnecdotes[1][0];
      dayAnecdotes[1][0] = temp;
      
      System.out.println(dayAnecdotes[0].length);
      
      for(int i=0; i<dayAnecdotes.length; i++)
      {
         System.out.println();
         for(int j=0; j<dayAnecdotes[0].length; j++)
         System.out.print(dayAnecdotes[i][j]+' ');
      }
   }
}
