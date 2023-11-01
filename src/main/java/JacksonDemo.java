import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {
    public static void main(String[] args) throws Exception {
        Demo demoObject = new Demo();
        demoObject.setBalance(12.30);
        demoObject.setBlockedBalance(23.45);
        demoObject.setFutureBalance(56.22);
        demoObject.setAvailableBalance(12.30);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(demoObject);
        System.out.println(json);
    }
}

class Demo {
    private Double balance;
    private Double blockedBalance;
    private Double futureBalance;
    private Double availableBalance;
    private boolean isTrue;

    //=== 4개 필드의 getters, setters ===//
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBlockedBalance() {
        return blockedBalance;
    }

    public void setBlockedBalance(Double blockedBalance) {
        this.blockedBalance = blockedBalance;
    }

    public Double getFutureBalance() {
        return futureBalance;
    }

    public void setFutureBalance(Double futureBalance) {
        this.futureBalance = futureBalance;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    //=== 필드가 아닌 getter ===//
    public Double getTotalBalance() {
        return balance + blockedBalance + futureBalance + availableBalance;
    }
}