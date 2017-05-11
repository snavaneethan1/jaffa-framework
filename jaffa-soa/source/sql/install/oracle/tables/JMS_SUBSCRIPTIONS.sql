CREATE TABLE JMS_SUBSCRIPTIONS (
  CLIENTID VARCHAR(128) NOT NULL,
  SUBNAME VARCHAR(128) NOT NULL,
  TOPIC VARCHAR(255) NOT NULL,
  SELECTOR VARCHAR(255),
  PRIMARY KEY(CLIENTID, SUBNAME)
)
/