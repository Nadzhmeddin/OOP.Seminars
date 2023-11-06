package Seminar_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class GenericDemo {
    // A <- B <- C <- D <- E

    public static void main(String[] args) {
        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();
        List<C> cList = new ArrayList<>();
        List<D> dList = new ArrayList<>();
        List<E> eList = new ArrayList<>();
        List<Object> objectLists = new ArrayList<>();

        Comparator<A> aComparator = null;
        Comparator<B> bComparator = null;
        Comparator<C> cComparator = null;
        Comparator<D> dComparator = null;
        Comparator<E> eComparator = null;
        Comparator<Object> objectComparator = null;

        Collections.sort(aList, aComparator);


        foo1(cList, dList);
        foo1(cList, eList);
        foo1(cList, cList);
        foo3(aList);
        foo3(cList);
        foo4(bList, objectLists);
        foo5(cList);

        foo6(bList, cList);

        // Ма
        
    }

    // Метод, который принимает два списка, первый из которых принимает объекты {B,C,D,E}, а второй принимает
    // всех дочерних от первого аргумента.
    static <T extends B> void foo6(List<T> first, List<? extends T> second) {

    }

    // Метод, который принимает список мэп и перекладывает их в одну общую мапу Map<? , ?> 
    static <K, V> void move(List<? extends Map<? extends K, ? extends V>> from, Map<K, V> to){

    }

    // Метод, который принимает коллекцию типов C D E и возвращает тип, этой коллекции
    static <T extends C> T foo5(Collection<T> collection) {
        T next =  collection.iterator().next();
        return next;
    }

    // Написать метод, который принимает списки каких-то Comparable-типов
    static <T extends Comparable <? super T>> void sort(List<T> list) {

    }

    // PECS Producer Extends Consumer Super
    // Поставщик Потребитель
    // Метод, который перекачивает данные из одного списка в другой
    static <T extends A> void foo4(List<? extends T> from, List<? super T > to) {
        to.addAll(from); 
        // A -> A
        // A -> B
        // B -> A

    }

    // Метод, который принимает List с типами C B A
    static void foo3(List<? super C> list) {
        list.get(0);
    }

    //Метод, который принимает 2  списка с типами содержащие классы С D E
    // Wildcard
    static void foo1(List<? extends C> list1, List<? extends C> list2) {

    }


    static class A {
        void a() {
        }
    }

    static class B extends A {
        void b() {
        }
    }

    static class C extends B {
        void c() {
        }
    }

    static class D extends C {
        void d() {
        }
    }

    static class E extends D {
        void e() {
        }
    }
}
