package com.g1335333249.builder.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 膳食
 *
 * @author guanpeng
 * @date 2019-08-06 17:49
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return ((float) items.stream().mapToDouble(Item::price).sum());
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
