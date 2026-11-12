package org.example;

public class Order {
    public abstract static class MenuItem {
        public String mealTime = "Brunch";
        public String servedAt() {
            return mealTime;
        }
    }

    public static class FeaturedMenuItem extends MenuItem {
        public String mealTime = "Dinner";

        @Override
        public String servedAt() {
            return "Served at " + mealTime;
        }
    }
    public static void main(String[] args) {
        FeaturedMenuItem mi = new FeaturedMenuItem();
        System.out.println(mi.servedAt());
        System.out.println(mi.mealTime);
    }
}
