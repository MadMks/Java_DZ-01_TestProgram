public enum Response {
    OK(200, "Ok");

    private int code;
    private String title;

    Response(int code, String title){
        this.code = code;
        this.title = title;
    }

    public int getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return "Code: " + code + ". Title: " + title;
    }
}