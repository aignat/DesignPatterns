package designpatterns.structural.adapter;

public interface Target {

    String getCustCardNo();

    String getCardOwnerName();

    String getCardExpMonthDate();

    Integer getCVVNo();

    Double getTotalAmount();

    void setCustCardNo(String custCardNo);

    void setCardOwnerName(String cardOwnerName);

    void setCardExpMonthDate(String cardExpMonthDate);

    void setCVVNo(Integer cVVNo);

    void setTotalAmount(Double totalAmount);
}
