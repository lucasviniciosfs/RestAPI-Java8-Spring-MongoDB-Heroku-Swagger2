CREATE​ TABLE​ `company` (
`id` bigint(20) NOT​ NULL​,
`cnpj` varchar(255) NOT​ NULL​,
`date_update` datetime NOT​ NULL​,
`date_create` datetime NOT​ NULL​,
`razao_social` varchar(255) NOT​ NULL
) ENGINE=InnoDB DEFAULT​ CHARSET=utf8;
ALTER​ TABLE​ `company`
ADD​ PRIMARY​ KEY​ (`id`);
ALTER​ TABLE​ `company`
MODIFY​ `id` bigint(20) NOT​ NULL​ AUTO_INCREMENT;
INSERT​ INTO​ `company` (`id`, `cnpj`, `date_update`, `date_create`, `razao_social`)
VALUES (NULL​, '82198127000121', CURRENT_DATE​(), CURRENT_DATE​(), 'Empresa
ADMIN');