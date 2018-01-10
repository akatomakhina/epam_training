package by.katomakhina.task3dot3.dao.parse.help;

import by.katomakhina.task3dot3.dao.parse.help.util.Transformator;
import by.katomakhina.task3dot3.entity.Candy;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CandyStAXParser {

    private CandyStAXParser() {
    }

    public static List<Candy> parse(XMLStreamReader reader) throws XMLStreamException {
        List<Candy> candies = new ArrayList<>();
        Candy candy = null;
        Candy.Ingredients ingredients = null;
        Candy.Value value = null;
        MenuTagName tags;
        String text = null;

        while (reader.hasNext()) {
            int type = reader.next();

            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    tags = MenuTagName.valueOf(Transformator.getEnumFromString(reader.getLocalName()));
                    switch (tags) {
                        case CANDY:
                            candy = new Candy();
                            candy.setId(reader.getAttributeValue(null, "id"));
                            candy.setType(reader.getAttributeValue(null, "type"));
                            break;
                        case INGREDIENTS:
                            ingredients = new Candy.Ingredients();
                            break;
                        case VALUE:
                            value = new Candy.Value();
                            break;
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:
                    text = reader.getText().trim();
                    if (text.isEmpty()) {
                        break;
                    }
                    break;

                case XMLStreamConstants.END_ELEMENT:
                    tags = MenuTagName.valueOf(Transformator.getEnumFromString(reader.getLocalName()));
                    switch (tags) {
                        case NAME:
                            candy.setName(text);
                            break;
                        case ENERGY:
                            candy.setEnergy(text);
                            break;
                        case WATER:
                            ingredients.setWater(text);
                            break;
                        case SUGAR:
                            ingredients.setSugar(text);
                            break;
                        case FRUCTOSE:
                            ingredients.setFructose(text);
                            break;
                        case TYPE_OF_CHOCOLATE:
                            ingredients.setType_of_chocolate(text);
                            break;
                        case VANILLIN:
                            ingredients.setVanillin(text);
                            break;
                        case INGREDIENTS:
                            candy.setIngredients(ingredients);
                            break;
                        case PROTEINS:
                            value.setProteins(text);
                            break;
                        case FATS:
                            value.setFats(text);
                            break;
                        case CARBOHYDRATES:
                            value.setCarbohydrates(text);
                            break;
                        case VALUE:
                            candy.setValue(value);
                            break;
                        case PRODUCTION:
                            candy.setProduction(text);
                            break;
                        case CANDY:
                            candies.add(candy);
                            break;
                    }
            }
        }
        return candies;
    }
}
