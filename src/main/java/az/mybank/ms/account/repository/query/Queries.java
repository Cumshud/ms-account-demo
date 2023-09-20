package az.mybank.ms.account.repository.query;

public enum Queries {

    FIND_ACCOUNT_BY_ID("findByAccountId");

    private final String key;

    Queries(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

}