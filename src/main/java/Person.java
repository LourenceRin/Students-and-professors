

abstract class Person {

    private String name;
    private String lastName;
    private String patronymic;

     Person(String name, String lastName, String patronymic){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }
    public void showData(){
        System.out.println("This is: " + name.substring(0, 1).toUpperCase() + name.substring(1) + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + " " + patronymic.substring(0, 1).toUpperCase() + patronymic.substring(1));
    }
}
