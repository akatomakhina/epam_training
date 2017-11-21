package by.katomakhina.task3dot3.candyEnum;

public enum Candy {
        CANDIES("candies"),
        NAME("name"),
        TYPE("yupe"),
        ENERGY("energy"),
        INGREDIENTS("ingredients"),
        WATER("water"),
        SUGAR("sugar"),
        FRUCTOSE("fructose"),
        TYPE_OF_CHOCOLATE("type_of_chocolate"),
        VANILLIN("vanillin"),
        VALUE("value"),
        PROTEINS("proteins"),
        FATS("fats"),
        CARBOHYDRATES("carbohydrates"),
        PRODUCTION("production");


        private String value;
        private Candy(String value){
            this.value=value;
        }
        private String getValue(){
            return value;
        }
}
