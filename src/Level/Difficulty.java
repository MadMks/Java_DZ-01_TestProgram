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

    public void setCode(int code){
        this.code = code;
    }

    public String getTitle(){
        return title;
    }

    public static Difficulty getDifficulty(int codeLevel){

        Difficulty tempLevel = null;

        for(Difficulty level: Difficulty.values() ){
            if (level.getCode() == codeLevel){
                tempLevel = level;
                break;
            }
        }

        return tempLevel;
    }

    public static boolean isExists(int codeLevel){
        if (Difficulty.getDifficulty(codeLevel) != null){
            return true;
        }
        return false;
    }
}
