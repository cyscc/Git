package pojo;

/**
 * @ProjectName: Git
 * @PackageName: pojo
 * @Author: cyss
 * @CreatTime: 2021-12-21 19:17
 * @Description:
 */
public class Student {
    private String stuName;
    private Integer stuAge;

    public Student() {
    }

    public Student(String stuName, Integer stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public void page(){
        System.out.println("???");
    }

    public void page1(){
        System.out.println("adidas");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
