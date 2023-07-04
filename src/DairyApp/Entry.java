package DairyApp;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Entry {
    int id =0 ;
    String title;
    String body;
    LocalDateTime time ;

    public void currentDateAndTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy \n  HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

public  void entry(int id, String title, String body){
    if(title.isEmpty()){
        throw  new NullPointerException("Title can not be empty");
    }else {
        this.title = title;
    }
    if (body.isEmpty()){
        throw new NullPointerException("Body can not be empty");
    }else {
        this.body = body;
    }
   this.id = id;
}
   public int getId(){
        return  id;
   }
   public String getTitle(){
        return title;
   }
   @Override
    public String toString(){
        return String.format("""
                %s,
                %s,
                %s,
                """,title,body,time);
   }
}
