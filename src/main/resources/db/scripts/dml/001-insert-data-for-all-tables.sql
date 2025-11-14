BEGIN;
-- Insert 10 categories
INSERT INTO categories
VALUES (1, 'Beverages'),
       (2, 'Condiments'),
       (3, 'Confections'),
       (4, 'Dairy Products'),
       (5, 'Grains/Cereals'),
       (6, 'Meat/Poultry'),
       (7, 'Produce'),
       (8, 'Seafood'),
       (9, 'Household Supplies'),
       (10, 'Personal Care');

-- Insert 10 products (CategoryID references above)
INSERT INTO products
VALUES (1, 'Apple Juice 1L', 1, 120, 2.99),
       (2, 'Extra Virgin Olive Oil 500ml', 2, 45, 8.50),
       (3, 'Dark Chocolate 70% 100g', 3, 200, 3.75),
       (4, 'Mature Cheddar 250g', 4, 60, 6.49),
       (5, 'Whole Grain Sliced Bread', 5, 80, 2.25),
       (6, 'Boneless Chicken Breast 1kg', 6, 50, 5.99),
       (7, 'Romaine Lettuce (each)', 7, 150, 1.29),
       (8, 'Atlantic Salmon Fillet 400g', 8, 30, 12.99),
       (9, 'Liquid Laundry Detergent 2L', 9, 40, 10.99),
       (10, 'Fluoride Toothpaste 100ml', 10, 90, 3.49);

-- Insert 10 account members with meaningful roles and emails
-- MemberPassword values shown as example salted hashes/placeholders; replace with real hashes as needed.
INSERT INTO accountmember
VALUES (1, '$2b$10$examplehashadm1', 'Alice Nguyen', 'alice.nguyen@example.com', 'ADMIN'),
       (2, '$2b$10$examplehashadm2', 'Brian Tran', 'brian.tran@example.com', 'ADMIN'),
       (3, '$2b$10$examplehashmgr1', 'Carla Hoang', 'carla.hoang@example.com', 'MANAGER'),
       (4, '$2b$10$examplehashusr1', 'Daniel Le', 'daniel.le@example.com', 'USER'),
       (5, '$2b$10$examplehashusr2', 'Eva Pham', 'eva.pham@example.com', 'USER'),
       (6, '$2b$10$examplehashusr3', 'Frank Vu', 'frank.vu@example.com', 'USER'),
       (7, '$2b$10$examplehashusr4', 'Grace Do', 'grace.do@example.com', 'USER'),
       (8, '$2b$10$examplehashusr5', 'Huy Nguyen', 'huy.nguyen@example.com', 'USER'),
       (9, '$2b$10$examplehashusr6', 'Ivy Bui', 'ivy.bui@example.com', 'USER'),
       (10, '$2b$10$examplehashusr7', 'Jackie Vo', 'jackie.vo@example.com', 'USER');
COMMIT;