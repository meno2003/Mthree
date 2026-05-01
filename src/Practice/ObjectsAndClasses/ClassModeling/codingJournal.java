package Practice.ObjectsAndClasses.ClassModeling;

import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/*

Model a book as if the class were to be part of a publishing system that the author uses to write the book.
Model a book as if the class were to be part of a library cataloging system.
 */

public class codingJournal {
    private String bookName;
    private String[] pages;


    public codingJournal(String bookName,String[] pages){
        this.bookName = bookName;
        this.pages = pages;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setPages(String[] pages){
        this.pages = pages;
    }

    public String[] getPages(){
        return pages;
    }


  public static void main(String[] args){


      Scanner UserInput = new Scanner(System.in);
      LocalDate today = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM");
      String formatted = today.format(formatter);
      String date = today.toString();


      try(FileWriter writer = new FileWriter("C:\\Users\\bc\\Desktop\\Coding Journal\\"+formatted+".txt")){

          System.out.println("What is the one thing I know now that I didn't know when I started today?");
       String journal =  UserInput.nextLine();
       writer.write(journal);
      }
        catch(IOException e){
          System.out.println("could not write file");
      }
  }


}
