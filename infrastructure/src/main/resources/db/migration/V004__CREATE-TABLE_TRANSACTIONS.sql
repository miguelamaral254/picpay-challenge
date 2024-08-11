CREATE TABLE Transactions (

    Id BIGINT AUTO_INCREMENT PRIMARY KEY,
    FromWallet BIGINT NOT NULL ,
    ToWallet BIGINT NOT NULL ,
    TansactionAmmount DECIMAL (10,2) NOT NULL ,
    Status VARCHAR(30) NOT NULL,
    CreatedAt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    UpdateAt DATETIME,
    FOREIGN KEY (FromWallet) REFERENCES Wallets(Id),
    FOREIGN KEY (ToWallet) REFERENCES Wallets(Id)
);
