CREATE TABLE SDUNN_SROCHA_CLIENT (
    Fname           VARCHAR(15)     NOT NULL,
    Minit           CHAR,
    Lname           VARCHAR(15)     NOT NULL,
    Ssn             CHAR(9)         NOT NULL,
    Address         VARCHAR(35),
    MaritalStatus   VARCHAR(10),
    Budget          INT             NOT NULL,
    PRIMARY KEY(Ssn)
);
