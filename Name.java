public class Name {
    private String surname;
    private String name;
    private String patronymic;

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

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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
