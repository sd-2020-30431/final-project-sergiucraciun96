package utcn.sergiucraciun.BookStore.business.validators;


import utcn.sergiucraciun.BookStore.data.entities.ShippingInfo;

public class PhoneValidator extends Validator<ShippingInfo> {
    @Override
    public boolean validate(ShippingInfo shippingInfo) {
        if (shippingInfo.getPhone().matches("\\d{10}"))
            return true;
        else
            return false;
    }
}
