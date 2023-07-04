package DairyApp;

import java.util.ArrayList;

public class Diaries {



  private  static ArrayList<Diary> diarys = new ArrayList<>();

    public int getDiarySize(){
        return diarys.size();
    }
    public int generateId() {
        int id = 0;
         id += 1;
         return id;
     }
   public  void addToDiaries(String name, String passWord) {
        Diary diary = new Diary(name, passWord);
        diarys.add(diary);
    }


    public Diary findDiaryByUserName(String userName) {
        for (Diary diary: diarys){
            if (diary.getUserName().equalsIgnoreCase(userName)){
                return diary;
            }
        }
        throw new NullPointerException("diary not found");
    }


    public  void deleteDiary(String userName) {
        try{
            Diary diary = findDiaryByUserName(userName);
            diarys.remove(diary);
        }catch (NullPointerException ex){
            System.out.println("diary not found");
        }
    }

}
