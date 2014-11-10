CREATE TABLE SDUNN_SROCHA_PROPERTY (
    ListingNum      INT             NOT NULL,
    Price           DECIMAL(10,2)   NOT NULL,
    Address         VARCHAR(35)     NOT NULL,
    Status          VARCHAR(15)     NOT NULL,
    LotSize         INT,
    SqFeet          INT,
    YearBuilt       INT,
    NumVisits       INT,
    ListDate        DATE,
    PRIMARY KEY(ListingNum)
);

