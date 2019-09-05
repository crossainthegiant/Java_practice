/**
 * Created by cross on 2019/8/31.
 */
public class java_practice {
    public static void main(String[] args) {
        person ming = new person("xiaoming",17);
//        ming.setName("cool");
//        ming.setAge(18);
        System.out.println("name:"+ming.getName()+"age"+ming.getAge());
    }
}


class person{
    private String name;
    private int age;

    public person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        if (name==null||name.isBlank()){
            throw new IllegalArgumentException("命名不规范");
        }
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
        }