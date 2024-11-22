package menu.model.category.type;

import java.util.Arrays;

public enum Category {

    JAPANESS(1, "일식"),
    KOREAN(2, "한식"),
    CHINESS(3, "중식"),
    ASIAN(4, "아시안"),
    WESTERN(5, "양식")
    ;

    private Integer num;
    private String name;

    Category(int num, String name){
        this.num = num;
        this.name = name;
    }

    public Category getCategory(Integer categoryNum){
        return Arrays.stream(values())
            .filter(value -> value.num.equals(categoryNum))
            .findAny()
            .orElse(null);
    }
}