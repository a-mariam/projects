package DairyApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diaries diary = new Diaries();
    @Test
    public  void test_If_Diaries_Exist(){
        diary = new Diaries();
        assertNotNull(diary);
}
@Test
public void test_That_Diaries_IsNot_Empty(){
        diary = new Diaries();
    assertNotNull(diary);
}

@Test
public void testThat_Diaries_Can_GenerateId(){
        diary = new Diaries();
        assertEquals(1,diary.generateId());
}
@Test
    public void test_That_Diary_Can_Be_Added(){
        diary.addToDiaries("name","PassWord");
        assertEquals(1,diary.getDiarySize());

}
@Test
    public void testThat_DiaryCan_BeFind_ByIts_UserName(){
        diary.addToDiaries("name","password");
        diary.findDiaryByUserName("name");
        //assertEquals("name",diary.findDiaryByUserName("name"));
}
@Test
public  void testThat_Diary_CanBe_Deleted(){
        diary.addToDiaries("name","password");
        diary.deleteDiary("name");
        assertEquals(0,diary.getDiarySize());
}
@Test
    public  void testThat_DiaryCan_CanBe_Delete(){
        diary.addToDiaries("mam","pass");
        diary.deleteDiary("mam");
        assertEquals(0,diary.getDiarySize());
}
@Test
    public void testThat_DiaryExist(){
        Diary Diary = new Diary("name","password");
        assertNotNull(Diary);
}

    @Test
    public void test_That_Diary_IsLockedByDefault(){
        Diary Diary = new Diary("name","password");
        assertTrue(Diary.locked());
    }
    @Test
    public void testThat_Diary_IsUnlock(){
        Diary diary = new Diary("mariam","password");
        assertTrue(diary.locked());
        assertEquals(false,diary.unlock("password"));
    }
    @Test
    public void testThat_Entry_CanBe_Found_ById(){
        Diary diary = new Diary("Mariam","pass");
        diary.creatEntry("title","body");
        assertEquals(1, diary.findEntryIdByTitle("title"));

    }
    @Test
    public  void testThat_Diary_CanGenerate_Entry(){
        Diary diary = new Diary("mary","1111");
        diary.creatEntry("I am a girl", "short");
        assertEquals(1,diary.getEntrySize());
    }

    @Test
    public void testThat_EntryCan_BeDeleted(){
        Diary diary = new Diary("Mariam","1111");
        diary.creatEntry("i am tired","I hope i make it");
        diary.deleteEntry("i am tired");
        assertEquals(0,diary.getEntrySize());
    }
    @Test
    public void testThat_Entry_CanBe_Update(){
        Diary diary = new Diary("name","pass");
        diary.creatEntry("title","body");
        diary.updateEntry(2,"newTitle","newBody");
    }

}