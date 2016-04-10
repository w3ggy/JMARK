package com.jmark.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artyom on 10.04.2016.
 */
public class FileParser {
    File taskFile;

    private List<TestItem> testItems = new ArrayList<>();

    public FileParser(File taskFile) {
        this.taskFile = taskFile;
        parseFile();
    }

    private void parseFile() {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(taskFile);
            Element root = document.getDocumentElement();

            System.out.println("Root element :"
                    + root.getNodeName());
            NodeList nList = document.getElementsByTagName("test");

            /*//
            Element message = (Element) root.getElementsByTagName("message").item(0);
            String textContent = message.getTextContent(); // тоже для упрощения
            System.out.println(textContent);*/

            TestItem testItem;
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    testItem = new TestItem();
                    testItem.setTestID(eElement.getAttribute("id"));
                    testItem.setType(eElement.getAttribute("type"));
                    testItem.setComponent(eElement
                            .getElementsByTagName("component")
                            .item(0)
                            .getTextContent());
                    testItem.setName(eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());
                    testItem.setValue(eElement
                            .getElementsByTagName("value")
                            .item(0)
                            .getTextContent());
                    testItems.add(testItem);


                    System.out.println("Test ID = " + eElement.getAttribute("id"));
                    System.out.println("Type = " + eElement.getAttribute("type"));

                    System.out.println("Component : "
                            + eElement
                            .getElementsByTagName("component")
                            .item(0)
                            .getTextContent());

                    System.out.println("Name : "
                            + eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());

                    System.out.println("Value : "
                            + eElement
                            .getElementsByTagName("value")
                            .item(0)
                            .getTextContent());
                    System.out.println();

                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<TestItem> getTestItems() {
        return testItems;
    }

}
