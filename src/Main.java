public class Main {
    public static void main(String[] args) {

   // Задание 1
   System.out.println("Задача 1");
   double dogWeight = 8;
   System.out.println(dogWeight);
   var catWeight = 3.6;
   System.out.println(catWeight);
   var papers = 763789;
   System.out.println(papers);

   // Задание 2
   System.out.println("Задача 2");
   dogWeight = dogWeight + 4;
   System.out.println(dogWeight);
   catWeight = catWeight + 4;
   System.out.println(catWeight);
   papers =papers + 4;
   System.out.println(papers);

   // Задание 3
   System.out.println("Задача 3");
   dogWeight = dogWeight - 3.5;
   System.out.println(dogWeight);
   catWeight = catWeight - 1.6;
   System.out.println(catWeight);
   papers = papers - 7639;
   System.out.println(papers);

   // Задание 4
   System.out.println("Задача 4");
   var friends = 19;
   System.out.println(friends);
   friends = friends + 2;
   System.out.println(friends);
   friends = friends / 7;
   System.out.println(friends);

   // Задание 5
   System.out.println("Задача 5");
   var frog = 3.5;
   System.out.println(frog);
   frog = frog * 10;
   System.out.println(frog);
   frog = frog / 3.5;
   System.out.println(frog);
   frog = frog + 4;
   System.out.println(frog);

   // Задание 6
   System.out.println("Задача 6");
   var firstBoxerWeight = 78.2;
   var secondBoxerWeight = 82.7;
   var totalWeight = firstBoxerWeight + secondBoxerWeight;
   System.out.println(" Общий вес боксеров " + totalWeight + "кг");
   var differenceWeight = secondBoxerWeight % firstBoxerWeight;
   System.out.println(" Разница веса составляет " + differenceWeight + "кг");

   // Задание 7
   System.out.println("Задача 7");
   differenceWeight = secondBoxerWeight - firstBoxerWeight;
   System.out.println(differenceWeight);
   differenceWeight = secondBoxerWeight % firstBoxerWeight;
   System. out.println(differenceWeight);

   // Задание 8
   System.out.println("Задача 8");
   var totalWorkTime = 640;
   var workOnePeopleTime = 8;
   var totalWorker = totalWorkTime / workOnePeopleTime;
   System.out.println(" Всего работников в компании - " + totalWorker + " человек");
   totalWorker = totalWorker + 94;
   System.out.println(" Всего в компании работает - " + totalWorker + " человека ");
   workOnePeopleTime = totalWorkTime / totalWorker;
   System.out.println("Если в компании работает " + totalWorker + " человека, то всего " + workOnePeopleTime + " часа работы может быть поделено между сотрудниками ");


    }
}