package DataStructure.LinkedList.SampleProblems;

/**
 * @author 刘祥楠
 * @date 2023-06-29 15:20
 */
public class Record {
    private String subject;
    private int mark;

    public Record(String subject, int mark){
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
