package nums20_30.bodyMassIndex_28;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int countTests = sc.nextInt();
        int weight = 0;
        double height = 0;
        for(int i = 0;i<countTests;i++){    
            weight = sc.nextInt();
            height = sc.nextDouble();
            System.out.print(gradation(weight,height)+" "); 
        }
    } 
    
    private static BMIgradation gradation(int weight,double height){
        BMIgradation grad = BMIgradation.normal;
        double bmi =  (weight)/(height*height);
       // System.out.print(bmi+ " ");
        if(bmi < 18.5) {
            grad = BMIgradation.under;
        }            
        else if(18.5 <= bmi && bmi < 25.0){
            grad = BMIgradation.normal;   
        }
        else if(25.0 <= bmi && bmi < 30.0){
            grad = BMIgradation.over;
        }
        else if(30.0 <= bmi){
            grad = BMIgradation.obese;
        }
        return grad;
    }
}
enum BMIgradation{
    under,normal, over, obese;
}

/*
Применим наши навыки программирования к некой квази-научной проблеме, поскольку заниматься лишь абстрактными упражнениями бывает скучно.

В 19 веке была предложена несложная мера "относительной упитанности" тела человека. Она вычисляется на основании только роста и веса, и называется Индекс Массы Тела (Body Mass Index = BMI). Определяется она как вес делённый на рост в квадрате:

BMI = вес / рост^2
Здесь вес берется в килограммах, а рост в метрах.

На основании этого показателя выделяют четыре категории:

Underweight     -           BMI < 18.5      (недостаточная масса)
Normal weight   -   18.5 <= BMI < 25.0      (норма)
Overweight      -   25.0 <= BMI < 30.0      (избыточная масса)
Obesity         -   30.0 <= BMI             (ожирение)
Например, если я вешу 80 кг а мой рост 173 см то можно вычислить:

BMI = 80 / (1.73)^2 = 26.7
т.е. присутствует избыточный вес.

Мы не будем обсуждать насколько правильна эта оценка (конечно она не учитывает многих факторов - пола, возраста, особенностей скелета) - вместо этого вам просто нужно определить категории для нескольких человек по их показателям.

Входные данные - указывают количество человек (подопытных!) в первой строке.
Остальные строки содержат параметры одного человека каждая - вес в килограммах и рост в метрах.
Ответ должен содержать одно из слов under, normal, over, obese (см. категории выше) для каждого из исследуемых людей, через пробел.

Пример:

входные данные:
3
80 1.73
55 1.58
49 1.91

ответ:
over normal under
*/

/*
Let us apply our programming skills to some quasi-scientific problem - since it is bit dull to learn only abstract things.

The simple measure of body constitution was proposed at the middle of XIX century. It depends only on the height and weight of a person - and is called Body Mass Index or BMI. It is defined as:

BMI = weight / height^2
Where weight is taken in kilograms and height in meters.

Four general grades are proposed:

Underweight     -           BMI < 18.5
Normal weight   -   18.5 <= BMI < 25.0
Overweight      -   25.0 <= BMI < 30.0
Obesity         -   30.0 <= BMI
For example, if I have weight of 80 kg and height of 1.73 m I can calculate:

BMI = 80 / (1.73)^2 = 26.7
i.e. somewhat overweight.

We will not discuss how proper or improper this gradation is. Instead you should simply calculate grades for several people.

Input data contain number of people in the first line.
Other lines will contain two values each - weight in kilograms and height in metres.
Answer should contain words under, normal, over, obese for each corresponding test-case, separated with spaces. For example:

input data:
3
80 1.73
55 1.58
49 1.91

answer:
over normal under
*/

//        String inp = 
//                "3\n" +
//"80 1,73\n" +
//"50 1,58\n" +
//"49 1,91";    
         //Scanner sc = new Scanner(inp);