/*
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(setItem().toString());
        setItem().stream()
            .flatMap(item -> item.children.stream())
            .collect(Collectors.toList());

    }

    private static List<Optional<ExternalMarketPlaceItem>> getItems() {
        List<Optional<ExternalMarketPlaceItem>> items =
                setItem().stream()
                        .collect(Collectors.groupingBy(Item::getPlu))
                        .values()
                        .stream()
                        .map(Test::buildItem)
                        .collect(Collectors.toList());
        return items;
    }

    private static List<Optional<ExternalMarketPlaceItem>> fetchChildrens() {
        return setItem().stream()
                .flatMap(item -> item.getChildren().stream())
                .collect(Collectors.groupingBy(Item::getPlu))
                .values()
                .stream()
                .map(Test::buildItem)
                .collect(Collectors.toList());
    }

    private static Optional<ExternalMarketPlaceItem> buildItem(List<Item> itemList) {
        int itemQuantity = itemList.size();

        return itemList.stream()
                .findFirst()
                .map(
                        item -> {
                            ExternalMarketPlaceItem externalMarketPlaceItem = new ExternalMarketPlaceItem();
                            externalMarketPlaceItem.setExternalItemId(item.getPlu());
                            externalMarketPlaceItem.setItemId(item.getPlu());
                            externalMarketPlaceItem.setItemDescription(item.getDescription());
                            externalMarketPlaceItem.setVendorInstanceId(item.getPlu());
                            externalMarketPlaceItem.setQuantity(itemQuantity);
                            externalMarketPlaceItem.setBaseUnitPrice(item.getPrice());
                            externalMarketPlaceItem.setUnitPrice(item.getPrice());
                            externalMarketPlaceItem.setTotalPrice(item.getPrice() * itemQuantity);
                            externalMarketPlaceItem.setBaseTotalPrice(item.getPrice() * itemQuantity);
                            return externalMarketPlaceItem;
                        });
    }

    static List<Item> setItem() {
        List<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setName("Cheeseburger");
        item.setPlu("M2");
        item.setPrice(1700);
        item.setNotes("");
        item.setDescription("");
        item.setChildren(setChildren());
        items.add(item);
        return items;
    }

    static List<Item> setChildren() {
        List<Item> childrens = new ArrayList<>();

        Item children1 = new Item();
        Item children2 = new Item();
        children1.setName("Extra Sauce");
        children1.setPlu("R3");
        children1.setDescription("Extra Sauce");
        children1.setPrice(100);
        children2.setName("Extra Sauce");
        children2.setPlu("R3");
        children2.setDescription("Extra Sauce");
        children2.setPrice(100);
        childrens.add(children1);
        childrens.add(children2);
        return childrens;
    }
}
*/
