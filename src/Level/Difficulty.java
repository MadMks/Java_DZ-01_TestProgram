package Level;

public enum Difficulty {
    Easy(1, "easy"),
    Hard(2,"hard");

    private int code;
    private String title;

    Difficulty(int code, String title){
        this.code = code;
        this.title = title;
    }

    public int getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }
}
