

class Professor extends Person{
    private int publicationCount;
    private int age;
    private int studentsCount;
    public enum Position{
        CHANCELLOR,
        PRO_RECTOR,
        UNIVERSITY_ADMINISTRATION,
        FACULTY,
        HEAD_OF_A_FACULTY,
        PROFESSOR
    }
    private String positionProfessor;

    Professor(String name, String lastName, String patronymic, int publicationCount, int age, int studentsCount, int numberPosition){
        super(name, lastName, patronymic);
        this.publicationCount = publicationCount;
        this.age = age;
        this.studentsCount = studentsCount;

            for (Position ignored : Position.values()){
                if (numberPosition == 1){
                    this.positionProfessor = Position.CHANCELLOR.toString();
                }else if (numberPosition == 2){
                    this.positionProfessor = Position.PRO_RECTOR.toString();
                }else if (numberPosition == 3){
                    this.positionProfessor = Position.UNIVERSITY_ADMINISTRATION.toString();
                }else if (numberPosition == 4){
                    this.positionProfessor = Position.FACULTY.toString();
                }else if (numberPosition == 5){
                    this.positionProfessor = Position.HEAD_OF_A_FACULTY.toString();
                }else if (numberPosition == 6){
                    this.positionProfessor = Position.PROFESSOR.toString();
                }else {
                    this.positionProfessor = "No such position number";
                }
            }
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Publication count: " + publicationCount);
        System.out.println("Age: " + age);
        System.out.println("Students count: " + studentsCount);
        System.out.println("Position: " + positionProfessor);
        System.out.println("__________________");
    }
}

