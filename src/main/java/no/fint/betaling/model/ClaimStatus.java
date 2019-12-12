package no.fint.betaling.model;

public enum ClaimStatus {
    STORED("stored"), SENT("sent"), ACCEPTED("accepted"), PAID("paid"), ERROR("error"), SEND_ERROR("send error"), ACCEPT_ERROR("accept error"), UPDATE_ERROR("update error");

    private final String claimStatus;

    ClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimStatus() {
        return claimStatus;
    }
}
