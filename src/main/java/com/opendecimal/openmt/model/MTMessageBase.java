package com.opendecimal.openmt.model;

public class MTMessageBase {

    private BasicHeader basicHeader;

    private ApplicationHeader applicationHeader;

    private UserHeader userHeader;

    private Body body;

    private Trailer trailer;

    public BasicHeader getBasicHeader() {
        return basicHeader;
    }

    public void setBasicHeader(BasicHeader basicHeader) {
        this.basicHeader = basicHeader;
    }

    public ApplicationHeader getApplicationHeader() {
        return applicationHeader;
    }

    public void setApplicationHeader(ApplicationHeader applicationHeader) {
        this.applicationHeader = applicationHeader;
    }

    public UserHeader getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(UserHeader userHeader) {
        this.userHeader = userHeader;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
