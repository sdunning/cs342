CREATE TABLE CLIENT (
    Fname           VARCHAR(15)     NOT NULL,
    Minit           CHAR,
    Lname           VARCHAR(15)     NOT NULL,
    Ssn             CHAR(9)         NOT NULL,
    Address         VARCHAR(35),
    Budget          INT             NOT NULL,
    PRIMARY KEY(Ssn)
);
CREATE TABLE INTENTION (
    Purpose         VARCHAR(15)     NOT NULL,
    Price           INT             NOT NULL,
    NumBedRm        INT,
    NumBath         INT,
    NumLivingRm     INT,
    NumFloors       INT
);
CREATE TABLE PROPERTY (
    ListingNum      INT             NOT NULL    DEFAULT 99999,
    Price           DECIMAL(10,2)   NOT NULL,
    Address         VARCHAR(35)     NOT NULL,
    Status          VARCHAR(15)     NOT NULL,
    LotSize         INT,
    SqFeet          INT,
    YearBuilt       INT,
    NumVisits       INT                         DEFAULT 0,
    ListDate        DATE,
    PRIMARY KEY(ListingNum)
);
CREATE TABLE RESIDENTIAL (
    ListingNum      INT             NOT NULL,
    Pool            BOOLEAN,
    NumBedRm        INT,
    NumBath         INT,
    NumLivingRm     INT,
    NumFloors       INT,
    FOREIGN KEY(ListingNum) REFERENCES PROPERTY(ListingNum)
);
CREATE TABLE COMMERCIAL (
    ListingNum      INT             NOT NULL,
    ParkingLot      BOOLEAN         NOT NULL,
    PLSize          INT,
    NumRestRoom     INT,
    NumFloors       INT,
    FOREIGN KEY(ListingNum) REFERENCES PROPERTY(ListingNum)
);
CREATE TABLE RANCH (
    ListingNum      INT             NOT NULL,
    Home            BOOLEAN         NOT NULL,
    Barn            BOOLEAN         NOT NULL,
    Agriculture     BOOLEAN         NOT NULL,
    Animals         BOOLEAN         NOT NULL,
    PortWater       BOOLEAN,
    Electricy       BOOLEAN,
    FOREIGN KEY(ListingNum) REFERENCES PROPERTY(ListingNum)
);
CREATE TABLE LOCATION (
    SchlDistrc      VARCHAR(15),
    AreaType        VARCHAR(15),
    Neighborhood    VARCHAR(10),
);
