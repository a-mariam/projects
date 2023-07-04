package ArraySnacksByChibuzor;

import java.util.Arrays;

public class MBTI {
    public static String[][] questions() {
        String[][] questions = new String[20][2];
        questions[0][0] = "A. expend energy, enjoy groups,";
        questions[0][1] = "B. conserve energy, enjoy one-on-one.";
        questions[1][0] = "A. Interpret literally,";
        questions[1][1] = "B. look for meaning and possibilities";
        questions[2][0] = "A.logical, thinking, questioning,";
        questions[2][1] = "B. empathetic, felling, accommodating";
        questions[3][0] = "A. organized, orderly,";
        questions[3][1] = "B. flexible adaptable";
        questions[4][0] = "A. more outgoing, think out loud,";
        questions[4][1] = "B. more reserved, think to yourself";
        questions[5][0] = "A. practical , realistic, experimental,";
        questions[5][1] = "B. imaginative , innovative, theoretical";
        questions[6][0] = "A. candid, straight forward, frank,";
        questions[6][1] = "B. tactful, kind, encouraging";
        questions[7][0]= "A. plan, schedule,";
        questions[7][1] = "B unplanned, spontaneous";
        questions[8][0] = "A. seek many tasks, public activities, interaction with other,";
        questions[8][1] = "B. seek private, solidarity activities with quiet to concentrate";
        questions[9][0] = "A. standard, usual, conventional,";
        questions[9][1] = "B.different, novel unique";
        questions[10][0] = "A. firm, tend to criticize, hold the line,";
        questions[10][1] = "B. gentle, tend to appreciate, conciliate";
        questions[11][0] = "A. regulated, structured,";
        questions[11][1] = "B. easy-going, live and let live";
        questions[12][0] = "A. external, communicative, express yourself,";
        questions[12][1] = "B. internal, reticent, keep to yourself";
        questions[13][0] = "A. focus on here-and-now,";
        questions[13][1] = "B. look to the future, global perspective, big picture";
        questions[14][0] = "A. tough-minded, just,";
        questions[14][1] = "B. tender-hearted, merciful";
        questions[15][0] = "A. preparation, plan ahead,";
        questions[15][1] = "B. go with the flow, adapt as you go";
        questions[16][0] = "A. active, initiate,";
        questions[16][1] = "B. reflective, deliberate";
        questions[17][0] = "A. facts, things, what is,";
        questions[17][1] = "B. ideas, dreams, what could be, philosophical";
        questions[18][0] = "A. matter of facts, issue-oriented,";
        questions[18][1] = "B. sensitive, people-oriented, compassionate";
        questions[19][0] = "A. control, govern,";
        questions[19][1] = "B. latitude, freedom";
        //System.out.println(Arrays.toString(questions));
        System.out.println(questions);
        return questions;
    }

    public static void main(String[] args) {
        questions();
    }
}
