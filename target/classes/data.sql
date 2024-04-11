insert into INVOICE (id, customer_name, customer_id, invoice_no, company_name, company_address, company_phone, customer_role, sender_name, sender_address, sender_phone)
values  (1, 'Dele Farotimi', 'sbs243', 110, 'Farotimi & associates', '3, Awolowo Rd, Ikoyi', '08011334455', 'CEO', 'SBSC', '14A, Karimu Kotun Street, Victoria Island, Lagos, Nigeria.', '07067427215'),
        (2, 'Toheeb Lawal', 'sbs172', 111, 'TL Limited', '2, Awolowo Rd, Ikoyi', '08022664455', 'CEO', 'SBSC', '14A, Karimu Kotun Street, Victoria Island, Lagos, Nigeria.', '07067427215'),
        (3, 'Aishat Shekau', 'sbs093', 113, 'AS Limited', '25, Opebi Rd, Ikeja', '08023456789', 'CEO', 'SBSC', '14A, Karimu Kotun Street, Victoria Island, Lagos, Nigeria.', '07067427215'),
        (4, 'James Pierce', 'sbs873', 114, 'JP & Sons', '1, Admiralty Rd, Lekki Phase 1', '08055774455', 'CEO', 'SBSC', '14A, Karimu Kotun Street, Victoria Island, Lagos, Nigeria.', '07067427215'),
        (5, 'Modupe Lawal', 'sbs110', 115, 'Scents Limited', '15, Awolowo Rd, Ikoyi', '08012664466', 'CEO', 'SBSC', '14A, Karimu Kotun Street, Victoria Island, Lagos, Nigeria.', '07067427215');


insert into ITEMS (id, invoice_no, item_name, item_description, item_quantity, unit_price)
values  (1, 110, '60GB SSD Cloud Server', '', 1, 310000.00),
        (2, 110, 'Apple Store Deployment', '', 1, 490000.00),
        (3, 110, 'Application Development', '', 1, 3290000.00),
        (4, 110, 'Google Playstore Development', '', 1, 290000.00),
        (5, 111, '60GB SSD Cloud Server', '', 1, 310000.00),
        (6, 111, 'Apple Store Deployment', '', 1, 490000.00),
        (7, 111, 'Application Development', '', 1, 3290000.00),
        (8, 111, 'Google Playstore Development', '', 1, 290000.00);