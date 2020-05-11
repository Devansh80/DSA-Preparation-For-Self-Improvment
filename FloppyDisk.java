/*Problem: A floppy disk shows f bytes free and u byte used. If you delete a file of size o bytes and create a new file of size n bytes, how many free bytes will the floppy disk have? 

 f u o and n are the user entered value. */


public class FloppyDisk{ 

  public static void main(String[] args) { 

    //free space 

    int f; 

    //used space 

    int u; 

    //delete file size 

    int o; 

    //new file size 

    int n; 

  

    Scanner in = new Scanner(System.in); 

    System.out.println("Enter free disk size in bytes"); 

    f = in.nextInt(); 

  

  

    System.out.println("Enter used disk size in bytes"); 

    u=in.nextInt(); 

    System.out.println("Enter old files size in bytes"); 

    o=in.nextInt(); 

    System.out.println("Enter new file size in bytes"); 

    n=in.nextInt(); 

  

    int totalDiskSize = f+u; 

  

    int currentUsedDiskSize = u-o; 

  

    currentUsedDiskSize = currentUsedDiskSize+n; 

  

    int currentFreeDiskSize = totalDiskSize - currentUsedDiskSize; 

  

    System.out.println("Free Space Available"+currentFreeDiskSize+"bytes"); 

  } 

} 
