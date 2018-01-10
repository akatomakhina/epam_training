package by.katomakhina.task3dot3.entity;

import java.util.ArrayList;

public class Candy extends ArrayList<Candy> {

    private String id;
    private String type;
    private String name;
    private String energy;
    private Ingredients ingredients;
    private Value value;
    private String production;

    public Candy() {
    }

    public Candy(String id, String type, String name, String energy, Ingredients ingredients, Value value, String production) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.energy = energy;
        this.ingredients = ingredients;
        this.value = value;
        this.production = production;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (id != null ? !id.equals(candy.id) : candy.id != null) return false;
        if (type != candy.type) return false;
        if (name != null ? !name.equals(candy.name) : candy.name != null) return false;
        if (energy != null ? !energy.equals(candy.energy) : candy.energy != null) return false;
        if (production != null ? !production.equals(candy.production) : candy.production != null) return false;
        if (ingredients != null ? !ingredients.equals(candy.ingredients) : candy.ingredients != null) return false;
        return value == candy.value;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (energy != null ? energy.hashCode() : 0);
        result = 31 * result + (production != null ? production.hashCode() : 0);
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", energy='" + energy + '\'' +
                ", production='" + production + '\'' +
                ", ingredients=" + ingredients +
                ", value=" + value +
                '}';
    }



    /* INGREDIENTS CLASS */




    public static class Ingredients{
        private String water;
        private String sugar;
        private String fructose;
        private String type_of_chocolate;
        private String vanillin;

        public Ingredients() {
        }

        public Ingredients(String water, String sugar, String fructose, String type_of_chocolate, String vanillin) {
            this.water = water;
            this.sugar = sugar;
            this.fructose = fructose;
            this.type_of_chocolate = type_of_chocolate;
            this.vanillin = vanillin;
        }

        public String getWater() {
            return water;
        }

        public void setWater(String water) {
            this.water = water;
        }

        public String getSugar() {
            return sugar;
        }

        public void setSugar(String sugar) {
            this.sugar = sugar;
        }

        public String getFructose() {
            return fructose;
        }

        public void setFructose(String fructose) {
            this.fructose = fructose;
        }

        public String getType_of_chocolate() {
            return type_of_chocolate;
        }

        public void setType_of_chocolate(String type_of_chocolate) {
            this.type_of_chocolate = type_of_chocolate;
        }

        public String getVanillin() {
            return vanillin;
        }

        public void setVanillin(String vanillin) {
            this.vanillin = vanillin;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ingredients that = (Ingredients) o;

            if (water != null ? !water.equals(that.water) : that.water != null) return false;
            if (sugar != null ? !sugar.equals(that.sugar) : that.sugar != null) return false;
            if (fructose != null ? !fructose.equals(that.fructose) : that.fructose != null) return false;
            if (type_of_chocolate != null ? !type_of_chocolate.equals(that.type_of_chocolate) : that.type_of_chocolate != null)
                return false;
            return vanillin != null ? vanillin.equals(that.vanillin) : that.vanillin == null;
        }

        @Override
        public int hashCode() {
            int result = water != null ? water.hashCode() : 0;
            result = 31 * result + (sugar != null ? sugar.hashCode() : 0);
            result = 31 * result + (fructose != null ? fructose.hashCode() : 0);
            result = 31 * result + (type_of_chocolate != null ? type_of_chocolate.hashCode() : 0);
            result = 31 * result + (vanillin != null ? vanillin.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Ingredients{" +
                    "water='" + water + '\'' +
                    ", sugar='" + sugar + '\'' +
                    ", fructose='" + fructose + '\'' +
                    ", type_of_chocolate='" + type_of_chocolate + '\'' +
                    ", vanillin='" + vanillin + '\'' +
                    '}';
        }
    }



    /* VALUES CLASS */



    public static class Value{
        private String proteins;
        private String fats;
        private String carbohydrates;

        public Value() {
        }

        public Value(String proteins, String fats, String carbohydrates) {
            this.proteins = proteins;
            this.fats = fats;
            this.carbohydrates = carbohydrates;
        }

        public String getProteins() {
            return proteins;
        }

        public void setProteins(String proteins) {
            this.proteins = proteins;
        }

        public String getFats() {
            return fats;
        }

        public void setFats(String fats) {
            this.fats = fats;
        }

        public String getCarbohydrates() {
            return carbohydrates;
        }

        public void setCarbohydrates(String carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Value value = (Value) o;

            if (proteins != null ? !proteins.equals(value.proteins) : value.proteins != null) return false;
            if (fats != null ? !fats.equals(value.fats) : value.fats != null) return false;
            return carbohydrates != null ? carbohydrates.equals(value.carbohydrates) : value.carbohydrates == null;
        }

        @Override
        public int hashCode() {
            int result = proteins != null ? proteins.hashCode() : 0;
            result = 31 * result + (fats != null ? fats.hashCode() : 0);
            result = 31 * result + (carbohydrates != null ? carbohydrates.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "proteins='" + proteins + '\'' +
                    ", fats='" + fats + '\'' +
                    ", carbohydrates='" + carbohydrates + '\'' +
                    '}';
        }
    }
}
