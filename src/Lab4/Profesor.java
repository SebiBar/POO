package Lab4;

class Profesor extends Person{
    private String[] courses;

    public void setCourses(String[] newCourses){this.courses = newCourses;}
    public String[] getCourses(){return this.courses;}
}
