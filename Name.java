public class Name {
    private String surname;
    private String name;
    private String patronymic;

    public Name(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Name(String name) {
        this.surname = name;
    }

    public Name(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        String allname = "";

        if (surname != null && !surname.isEmpty()) {
            allname += surname;
        }

        if (name != null && !name.isEmpty()){
            allname += name;

        }

        if (patronymic != null && !patronymic.isEmpty()) {
            allname += patronymic;

        }
        return allname;
    }

}
