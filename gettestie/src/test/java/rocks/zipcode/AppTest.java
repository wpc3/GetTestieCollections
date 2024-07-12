package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }



    @Test
    public void hashSetTest(){
        HashSet<String> cars = new HashSet<>();
        cars.add("Buick");
        cars.add("Acura");

        int expected = 2;

        assertEquals(expected,cars.size());

    }



@Test
public void hashSetTest2()
    {
        HashSet<String> cars = new HashSet<>();
        cars.add("Buick");
        cars.add("Acura");
        cars.clear();

        int expected = 0;

        assertEquals(expected, cars.size());

    }

    @Test
    public void arrayListTest(){
        ArrayList<String> people = new ArrayList<>();
        people.add("me");
        people.add("you");
        people.add("I");
        people.set(1,"Ron");

        String expected = "Ron";

        assertEquals(expected,people.get(1));

    }

    @Test
    public void arrayListTest2(){
        ArrayList<String> people = new ArrayList<>();
        people.add("me");
        people.add("you");
        people.add("I");
        people.remove(2);

        int expected = 2;

        assertEquals(expected,people.size());

    }

    @Test
    public void hashMapTest(){
        HashMap<String,Integer> peopleWithSameName = new HashMap<>();

       //Given
        String key1 = "Bill";
        String key2 = "Libby";
        Integer value1 = 5;
        Integer value2 = 4;

        //When
        peopleWithSameName.put(key1,value1);
        peopleWithSameName.put(key2,value2);

        //Then

        assertEquals(2,peopleWithSameName.size());


    }
    @Test
    public void hashMapTest2() {
        HashMap<String, Integer> peopleWithSameName = new HashMap<>();

        //Given
        String key1 = "Bill";
        String key2 = "Libby";
        Integer value1 = 5;
        Integer value2 = 4;
        peopleWithSameName.put(key1, value1);
        peopleWithSameName.put(key2, value2);


        int actual = peopleWithSameName.get(key1);

        //When
        int expected = 5;

        //Then

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testLinkedSet(){
        LinkedList<String> toys = new LinkedList<>();
        toys.add("truck");
        toys.add("helicopter");
        toys.add("actionFigure");

        String actual = toys.getLast();
        String expected = "actionFigure";

        assertEquals(actual,expected);


    }
    @Test
    public void testLinkedSet2(){
        LinkedList<String> toys = new LinkedList<>();
        toys.add("truck");
        toys.add("helicopter");
        toys.add("actionFigure");
        toys.removeFirst();

        String actual = toys.getFirst();
        String expected = "helicopter";

        assertEquals(actual,expected);

    }




    @Test
    public void toTestArrayDeque(){
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Club");
        deque.add("Spade");
        deque.clear();

        int expected = 0;
        int actual = deque.size();

        assertEquals(expected,actual);
    }


    @Test
    public void toTestArrayDeque2(){
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Club");
        deque.add("Spade");


        String  expected = "Club";
        String actual = deque.peek();

        assertEquals(expected,actual);
    }

    @Test
    public void vectorTest(){
    Vector<Integer> vector = new Vector<>();
    vector.add(55);
    vector.add(45);
    vector.add(55);

    assertEquals(3,vector.size());

    }

    @Test
    public void vectorTest2(){
        Vector<Integer> vector = new Vector<>();
        vector.add(55);
        vector.add(45);
        vector.add(55);
        vector.remove(1);

        assertEquals(2,vector.size());
    }

    @Test
    public void treeMapTest(){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(3,"Lemon");
        treeMap.put(5,"Orange");
        treeMap.put(6,"Pear");

        String expected = "Orange";
        String actual = treeMap.get(5);

        assertEquals(expected,actual);

    }

    @Test
    public void treeMapTest2(){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(3,"Lemon");
        treeMap.put(5,"Orange");
        treeMap.put(6,"Pear");
        treeMap.remove(6);

        int expected = 2;


        assertEquals(expected,treeMap.size());

    }

    @Test
    public void treeSetTest(){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(0);
        treeSet.add(3);

        int expected = 0;
        int actual = treeSet.first();

        assertEquals(actual,expected);
    }

    @Test
    public void treeSetTest2(){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(0);
        treeSet.add(3);

        int expected = 100;
        int actual = treeSet.last();

        assertEquals(actual,expected);
    }

    @Test
    public void iteratorTest() {
     //Make a collection
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Benz");
    cars.add("Lambo");
    cars.add("Maybach");

    //Get the iterator
    Iterator<String>  it = cars.iterator();

    //Tests method to ensure it correctly reports whether there are more elements to iterate over
    Assert.assertTrue(it.hasNext());

    }

    @Test
    public void iteratorTest2() {
        //Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Benz");
        cars.add("Lambo");
        cars.add("Maybach");

        //Get the iterator
        Iterator<String>  it = cars.iterator();

        //Testing if cars list is empty
        assertFalse( cars.isEmpty());

    }

    @Test
    public void priorityQueueTest(){
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    //Given
    priorityQueue.add(3);
    priorityQueue.add(4);
    priorityQueue.add(17);

    //Testing to see if poll returns the smallest number in the que
    Assert.assertEquals(Integer.valueOf(3), priorityQueue.poll());

    }

    @Test
    public void priorityQueueTest2(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //Given
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(17);

        int expected = 3;
        int actual = priorityQueue.peek();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testingComparable(){
    //Given

    Person person1 = new Person("Will", 1990);
    Person person2 = new Person("Bryan",1995);
    Person person3 = new Person("Tim",2000);

    //When & Then
//    Assert.assertTrue(person1.compareTo(person2) > 0);
    Assert.assertTrue(person2.compareTo(person3) > 0);

    }


}
