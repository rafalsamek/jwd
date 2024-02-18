package database;

import java.math.BigDecimal;

public class BudgetEntry {
    private BigDecimal amount;
    private String entryName;

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }
}
