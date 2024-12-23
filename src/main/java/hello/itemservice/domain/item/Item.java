package hello.itemservice.domain.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    // 판매 여부
    private boolean open;
    // 등록 지역
    private List<String> regions;
    // 상품 종류
    private ItemType itemType;
    // 배송 방식
    private String deliveryCode;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
