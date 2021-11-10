
-- --------------------------------------------------------

--
-- Structure de la table `bateaufret`
--

DROP TABLE IF EXISTS `bateaufret`;
CREATE TABLE IF NOT EXISTS `bateaufret` (
  `id` int(11) NOT NULL,
  `poidsMax` decimal(50,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bateaufret`
--

INSERT INTO `bateaufret` (`id`, `poidsMax`) VALUES
(123, '4000'),
(544, '3000');
