package Test6;
public  enum CheckMenu {
    PAC ("Пациентам"),
    DOCTOR ("Врачам"),
    FRANCHISE ("Франчайзинг"),
    COR ("Корпоративным клиентам"),
    PRESS ("Прессе");

    private String title;
    CheckMenu(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

}
