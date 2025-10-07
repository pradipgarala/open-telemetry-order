CREATE SCHEMA IF NOT EXISTS orders;

CREATE TABLE IF NOT EXISTS orders.orders (
  id int8 not null,
  customer_id int8 null,
  order_date timestamp(6) null,
  total_amount int8 null,
  CONSTRAINT order_pkey PRIMARY KEY (id)
);