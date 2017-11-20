package Tests;

import CRUD.Bakery;
import Entity.Baker;
import Entity.Cake;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class BakeryInspection {
   Bakery bakery = new Bakery();

   @Test
    public void testSaveRecord() throws Exception{
       Cake cake1 = new Cake("Napoleon", new Date(), 410, 2110);
       Cake cake = bakery.add(cake1);
       System.out.println(cake);
   }

   @Test
    public void testDeleteRecord() throws Exception{
       Cake cake1 = new Cake();
       cake1.setBakedDate(new Date());
       cake1.setCalories(1000);
       cake1.setName("Prague");
       cake1.setCost(210);
       Cake cake = bakery.add(cake1);
       bakery.del(cake.getId());
   }

   @Test
    public  void testSelectAll() throws Exception{
       Cake cake1 = new Cake();
       cake1.setBakedDate(new Date());
       cake1.setCalories(700);
       cake1.setName("Sharlotka");
       cake1.setCost(350);
       Cake cake2 = cake1;
       cake2.setName("Sharlotka with diet topping");
       cake2.setCost(400);
       Cake cake3 = cake2;
       cake3.setName("Sharlotka with good topping");
       cake3.setCalories(1000);
       bakery.add(cake1);
       bakery.add(cake2);
       List<Cake> cakes = bakery.getAll();
       System.out.println(cakes);
   }

   @Test
    public void testUpdate() throws Exception{
       Cake cake1 = new Cake("ChokoBoom", new Date(), 550, 510);
       bakery.add(cake1);
       cake1.setCalories(1510);
       bakery.update(cake1);
       Cake cake2 = bakery.get(cake1.getId());
       System.out.println(cake2);
   }
}
