package hello.com;
class dog{
    public String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}
class speak extends dog{
    public String speak;

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
public class Quick_quiz_Inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.setBark("wowo");
        System.out.println(d.getBark());
        speak s = new speak();
        s.setSpeak("hey");
        System.out.println(s.getSpeak());
    }
}
