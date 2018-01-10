package by.katomakhina.task3dot3.dao.parse.help;

import by.katomakhina.task3dot3.dao.parse.help.constant.TagAttributeConstants;
import by.katomakhina.task3dot3.dao.parse.help.util.Transformator;
import by.katomakhina.task3dot3.entity.Candy;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

import static by.katomakhina.task3dot3.dao.parse.help.MenuTagName.*;

public class CandySAXParser extends DefaultHandler {

    public CandySAXParser() {
    }

    private List<Candy> candies = new ArrayList<>();
    private Candy candy;
    private StringBuilder text;
    private Candy.Ingredients ingredients;
    private Candy.Value value;

    public List<Candy> getCandies() {
        return candies;
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        text = new StringBuilder();

        if (localName.equals(CANDY.getTagName())) {
            candy = new Candy();

            candy.setId(attributes.getValue(TagAttributeConstants.CANDY_ID));
            candy.setType(attributes.getValue(TagAttributeConstants.TYPE));

        } else if (localName.equals(INGREDIENTS.getTagName())) {
            ingredients = new Candy.Ingredients();
        } else if (localName.equals(VALUE.getTagName())) {
            value = new Candy.Value();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        MenuTagName tagName = MenuTagName.valueOf(Transformator.getEnumFromString(localName));
        switch (tagName) {
            case NAME:
                candy.setName(text.toString());
                break;
            case ENERGY:
                candy.setEnergy(text.toString());
                break;
            case WATER:
                ingredients.setWater(text.toString());
                break;
            case SUGAR:
                ingredients.setSugar(text.toString());
                break;
            case FRUCTOSE:
                ingredients.setFructose(text.toString());
                break;
            case TYPE_OF_CHOCOLATE:
                ingredients.setType_of_chocolate(text.toString());
                break;
            case VANILLIN:
                ingredients.setVanillin(text.toString());
                break;
            case INGREDIENTS:
                candy.setIngredients(ingredients);
                break;
            case PROTEINS:
                value.setProteins(text.toString());
                break;
            case FATS:
                value.setFats(text.toString());
                break;
            case CARBOHYDRATES:
                value.setCarbohydrates(text.toString());
                break;
            case VALUE:
                candy.setValue(value);
                break;
            case PRODUCTION:
                candy.setProduction(text.toString());
                break;
            case CANDY:
                candies.add(candy);
                candy = null;
                break;
        }
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        super.error(e);
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        super.fatalError(e);
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        super.warning(e);
    }
}
