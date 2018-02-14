/*
Hunter Smith
CSIT 150 Lab 4
February 13, 2018
 */


package lab4final;
public class Faculty extends Employee {
    private String[] courses = new String[3];

    /**
     * constructor for faculty member.
     * @param name - sets member name
     * @param salary - sets members salary
     * @param inCourses - sets members courses
     */
    public Faculty(String name, double salary, String[] inCourses){
        super.setSalary(salary);
        super.setName("Professor " + name);
        setCourses(inCourses);
    }

    /**
     *
     * @return returns the name of the faculty member
     */
    public String getName(){
        return super.getName();
    }

    /**
     *
     * @return members courses
     */
    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for (int i = 0; i < courses.length; i++)
            temp[i] = (courses[i]);

        return temp;
    }

    /**
     *
     * @return the names of all courses
     */
    public String getCourseNames(){
        String listCourses = "";
        for(int i = 0; i < courses.length; i++){
            listCourses += courses[i] + "\n";
        }
        return listCourses;
    }

    /**
     * set the new courses to the member
     * @param addCourses - new courses
     */
    public void setCourses(String[] addCourses){
        this.courses = new String[addCourses.length];
        for(int i = 0; i < addCourses.length; i++){
            this.courses[i] = addCourses[i];
        }
    }

    /**
     * increase the size of the array
     */
    private void increaseSize() {
        if (courses == null) {
            courses = new String[2];
            for (int i = 0; i < 2; i++)
                courses[i] = new String();
        } else {
            String[] temp = new String[courses.length * 2];
            for (int i = 0; i < courses.length; i++)
                temp[i] = courses[i];

            courses = temp;
        }
    }

    /**
     *
     * @return information about the member
     */
    public String toString(){
        String summary = (String.format(name + "'s salary is %.2f. " + name + "'s courses are ", salary));
        for(int i = 0; i < courses.length; i++){
            summary += " " + courses[i];
            if(i<(courses.length-1)){
                summary += ",";
            }
        }
        return summary;
    }
}
