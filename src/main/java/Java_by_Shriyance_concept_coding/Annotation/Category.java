package Java_by_Shriyance_concept_coding.Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Categories.class)
public @interface Category {
    String name();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Categories{
   Category[] value();
}
@Category(name="LivingThing")
@Category(name="Carnivorous")
@Category(name="Bird")
class Eagle{
    public void fly(){
        System.out.println("hello");
    }
}


class Main{
    public static void main(String[] args) {
        Category[] category=new Eagle().getClass().getAnnotationsByType(Category.class);
        for (Category category1:category){
            System.out.println(category1.name());
        }
    }
}