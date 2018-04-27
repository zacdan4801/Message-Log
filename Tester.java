/**
   * >>>>>>>>>>>>>> expected output <<<<<<<<<<<<<<
   * ------ test contains keyWord "disk" ------
   * CLIENT3:security alert – repeated login failures==>false
   * Webserver:disk offline==>true
   * SERVER1:file not found==>false
   * SERVER2:read error on disk DSK1==>true
   * SERVER1:write error on disk DSK2==>true
   * Webserver:error on /dev/disk==>false
   * True:disk==>true
   * True:error on disk==>true
   * True:error on disk DSK1==>true
   * False:DISK offline==>false
   * False:error on disk3==>false
   * False:error on /dev/disk==>false
   * False:diskette==>false
   * 
   * ------ removed messages containing keyWord "disk" ------
   * Webserver:disk offline
   * SERVER2:read error on disk DSK1
   * SERVER1:write error on disk DSK2
   * True:disk
   * True:error on disk
   * True:error on disk DSK1
   * 
   * 
   * ------ remaining messages after remove ------
   * CLIENT3:security alert – repeated login failures
   * SERVER1:file not found
   * Webserver:error on /dev/disk
   * False:DISK offline
   * False:error on disk3
   * False:error on /dev/disk
   * False:diskette
   * 
   **********************************************/

import java.util.List;
public class Tester
{
  /************************************************
   * The main tester method below is complete
   ************************************************/ 
  public static void main(String[] args)
  {
    String[] messages = {
        "CLIENT3:security alert – repeated login failures",
        "Webserver:disk offline",
        "SERVER1:file not found",
        "SERVER2:read error on disk DSK1",
        "SERVER1:write error on disk DSK2",
        "Webserver:error on /dev/disk",
        "True:disk",
        "True:error on disk",
        "True:error on disk DSK1",
        "False:DISK offline",
        "False:error on disk3",
        "False:error on /dev/disk",
        "False:diskette"};
        
    System.out.println("------ test contains keyWord \"disk\" ------");    
    for (String s : messages)
    {
      LogMessage msg = new LogMessage(s);
      System.out.println(msg.getMachineId() + ":" + msg.getDescription() + "==>" + msg.containsWord("disk"));
    }

    SystemLog theLog  = new SystemLog(messages);
    List<LogMessage> removed = theLog.removeMessages("disk");
    
    System.out.println("\n------ removed messages containing keyWord \"disk\" ------");    
    for (LogMessage msg : removed)
      System.out.println(msg);
    System.out.println();

    System.out.println("\n------ remaining messages after remove ------");    
    System.out.println(theLog);

  }
}


