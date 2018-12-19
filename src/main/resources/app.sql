# Create Table 
DROP TABLE IF EXISTS app_user_tbl;
CREATE TABLE app_user_tbl (
app_user_id INTEGER NOT NULL IDENTITY    PRIMARY KEY,
app_user_name VARCHAR(50) NOT NULL UNIQUE,
app_password  VARCHAR(50) NOT NULL
)
