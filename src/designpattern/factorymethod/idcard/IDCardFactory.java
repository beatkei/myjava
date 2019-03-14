package designpattern.factorymethod.idcard;

import designpattern.factorymethod.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        // 抽象クラスで定義されてないメソッドを利用するために、IDCCard型にcastしてgetOwnerメソッドを利用
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
