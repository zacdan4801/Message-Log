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
      int lastIndexOfWord = words.lastIndexOf( keyword );
      
      
  }

  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {  return getMachineId() + ":" + getDescription();  }
}
