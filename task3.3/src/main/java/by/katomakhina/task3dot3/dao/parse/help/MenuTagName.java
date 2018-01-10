package by.katomakhina.task3dot3.dao.parse.help;

public enum MenuTagName {
    CANDY("candy"),
    CANDIES("candies"),
    ID("id"),
    TYPE("type"),
    NAME("name"),
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
    PRODUCTION("products");

    private String tag;

    MenuTagName(String tag) {
        this.tag = tag;
    }

    public String getTagName() {
        return tag;
    }
}
