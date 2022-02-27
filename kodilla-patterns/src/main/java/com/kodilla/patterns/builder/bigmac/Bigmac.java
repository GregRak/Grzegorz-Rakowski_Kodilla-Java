package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final boolean bunWithSezam;
    private final int burgers;
    private List<Sauces> sauces = new ArrayList<>();
    private List<Ingredients> ingredientsList = new ArrayList<>();

    public static class BigmacBuilder {
        private boolean bunWithSezam;
        private int burgers;
        private List<Sauces> sauces = new ArrayList<>();
        private List<Ingredients> ingredientsList = new ArrayList<>();

        public BigmacBuilder bunWithSezam(boolean isSezam) {
            this.bunWithSezam = isSezam;
            return this;
        }

        public BigmacBuilder burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder sauce(Sauces sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder ingredients(Ingredients ingredient) {
            ingredientsList.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bunWithSezam, burgers, sauces, ingredientsList);
        }
    }


    private Bigmac(final boolean bunWithSezam, final int burgers, List<Sauces> sauces, List<Ingredients> ingredientsList) {
        this.bunWithSezam = bunWithSezam;
        this.burgers = burgers;
        this.sauces = sauces;
        this.ingredientsList = ingredientsList;
    }

    public boolean isBunWithSezam() {
        return bunWithSezam;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Sauces> getSauces() {
        return sauces;
    }

    public List<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun with sezam=" + bunWithSezam +
                ", burgers=" + burgers +
                ", sauces=" + sauces +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
