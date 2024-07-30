package netology;

public class Post {

     Birthday birthday;

     String name;

     String passport;

     String patronymic;

     String phone;

     String surname;

     boolean subscription;

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public static class Birthday {

        int day;

        int month;

        int year;

        public Birthday(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}

