package by.katomakhina.task3dot3.dao.parse.help;

import by.katomakhina.task3dot3.dao.parse.help.constant.TagAttributeConstants;
import by.katomakhina.task3dot3.entity.Candy;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static by.katomakhina.task3dot3.dao.parse.help.MenuTagName.*;

public class CandyDOMParser {

    private static final Logger Logger = LogManager.getLogger(CandyDOMParser.class);

    public CandyDOMParser() {
    }

    public static List<Candy> doParsing(String path) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(CandyDOMParser.class.getResourceAsStream(path)));

        Logger.info("Start parse DOM");

        Document document = parser.getDocument();
        Element root = document.getDocumentElement();
        NodeList candyNodes = root.getElementsByTagName(CANDY.getTagName());

        Logger.info("End parse DOM");

        return getCandies(candyNodes);
    }

    private static List<Candy> getCandies(NodeList nodeList) {
        List<Candy> candies = new ArrayList<>();
        Candy candy = null;

        int size = nodeList.getLength();

        for (int i = 0; i < size; ++i) {
            candy = new Candy();
            Element candyElement = (Element) nodeList.item(i);

            setCandy(candy,candyElement);

            candies.add(candy);
        }
        return candies;
    }

    private static void setCandy(Candy candy, Element candyElement){
        Candy.Ingredients ingredients = new Candy.Ingredients();
        Candy.Value value = new Candy.Value();

        candy.setId(candyElement.getAttribute(TagAttributeConstants.CANDY_ID));
        candy.setType(candyElement.getAttribute(TagAttributeConstants.TYPE));

        candy.setName(getSingleChild(candyElement, NAME.getTagName()).getTextContent().trim());
        candy.setEnergy(getSingleChild(candyElement, ENERGY.getTagName()).getTextContent().trim());


        Element ingredientsElement = getSingleChild(candyElement, INGREDIENTS.getTagName());
        ingredients.setWater(getSingleChild(ingredientsElement, WATER.getTagName()).getTextContent().trim());
        ingredients.setSugar(getSingleChild(ingredientsElement, SUGAR.getTagName()).getTextContent().trim());
        ingredients.setFructose(getSingleChild(ingredientsElement, FRUCTOSE.getTagName()).getTextContent().trim());
        ingredients.setType_of_chocolate(getSingleChild(ingredientsElement, TYPE_OF_CHOCOLATE.getTagName()).getTextContent().trim());
        ingredients.setVanillin(getSingleChild(ingredientsElement, VANILLIN.getTagName()).getTextContent().trim());

        candy.setIngredients(ingredients);

        Element valueElement = getSingleChild(candyElement, VALUE.getTagName());
        value.setProteins(getSingleChild(valueElement, PROTEINS.getTagName()).getTextContent().trim());
        value.setFats(getSingleChild(valueElement, FATS.getTagName()).getTextContent().trim());
        value.setCarbohydrates(getSingleChild(valueElement, CARBOHYDRATES.getTagName()).getTextContent().trim());

        candy.setValue(value);

        candy.setProduction(getSingleChild(candyElement, PRODUCTION.getTagName()).getTextContent().trim());
    }

    private static Element getSingleChild(Element element, String childName) {
        int firstNodeElement = 0;
        NodeList nodeList = element.getElementsByTagName(childName);
        return (Element) nodeList.item(firstNodeElement);
    }
}
