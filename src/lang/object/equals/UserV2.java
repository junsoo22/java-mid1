package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj){    //id를 기준으로 동등성 비교
//        UserV2 user=(UserV2) obj;   //캐스팅해줘야함. 다운캐스팅
//        return id.equals(user.id);     //문자끼리의 비교 equals
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
