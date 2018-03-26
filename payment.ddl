CREATE TABLE `payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pay_date` datetime NOT NULL,
  `item_id` int(11) NOT NULL,
  `unit_price` decimal(7,0) NOT NULL,
  `quantity` int(11) NOT NULL,
  `amount` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
