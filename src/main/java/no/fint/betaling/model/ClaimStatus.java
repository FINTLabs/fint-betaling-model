package no.fint.betaling.model;

public enum ClaimStatus {
    STORED("stored"), SENT("sent"), PAID("paid"), ERROR("error"), SEND_ERROR("send error"), UPDATE_ERROR("update error");

    private final String claimStatus;

    ClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimStatus() {
        return claimStatus;
    }
}
