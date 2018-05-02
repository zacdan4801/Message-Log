public class LogMessage
{
  private String machineId;
  private String description;

  public LogMessage(String message)
  {
      /* Complete for Part (a) */
      int index = message.indexOf(":");
      machineId = message.substring( 0, index );
      description = message.substring( index + 1, message.length() );
  }

  public boolean containsWord(String keyword)
  {
      /* Complete for Part (b) */
      String words = description;
      int indexOfWord = words.indexOf( keyword );
      if( indexOfWord == -1 )
      {
          return false;
        } 
      int lastIndexOfWord = words.lastIndexOf( keyword );
      if( (indexOfWord == 0 || words.substring(indexOfWord - 1, indexOfWord).equals(" ")))
      {
            if( lastIndexOfWord == words.length() || words.substring(lastIndexOfWord, lastIndexOfWord + 1).equals(" "))
            {
                return true;
            }
        }
      return false;
  }

  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {  return getMachineId() + ":" + getDescription();  }
}
