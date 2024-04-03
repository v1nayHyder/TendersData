package Java_by_Shriyance_concept_coding.Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Categories2.class)
@interface Category2{
    int age();
    String name();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Categories2{
    Category2[] value();

}
@Category2(age = 10,name = "Vinay")
@Category2(age = 30,name = "Rohit")
@Category2(age = 56,name = "Kavi")
class Number{
    static public void num(){
        System.out.println("hell0");
    }
}

class Main2{
    public static void main(String[] args) {
        Category2[] category2s=new Number().getClass().getAnnotationsByType(Category2.class);
        for (Category2 category2:category2s) {
            System.out.println(category2.age()+" "+category2.name());;
        }
        Number.num();
    }

}