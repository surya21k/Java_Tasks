public class Student {
    int Java,SQL,HTML,CSS,JavaScript;

    public void readMarks(){
        Java = 90;
        SQL = 85;
        HTML = 80;
        CSS = 95;
        JavaScript = 90;
    }
    public void calculatePercentage(){
        int total = Java + SQL + HTML + CSS + JavaScript ;
        double percentage = (total / 500) * 100;

        System.out.println("******** Student Report ********");
        System.out.println("Marks:");
        System.out.println("Java : " + Java);
        System.out.println("SQL : " + SQL);
        System.out.println("HTML : " + HTML);
        System.out.println("CSS : " + CSS);
        System.out.println("JavaScript : " + JavaScript);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.readMarks();
        s1.calculatePercentage();
    }
}
