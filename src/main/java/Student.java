

class Student extends Person{

    private int point;

    Student(String name, String lastName, String patronymic, int point) {
        super(name, lastName, patronymic);
        this.point = point;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Grade point average: " + point);
        System.out.println("__________________");
    }
}
