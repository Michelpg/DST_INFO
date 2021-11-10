
-- --------------------------------------------------------

--
-- Structure de la table `tranche`
--

DROP TABLE IF EXISTS `tranche`;
CREATE TABLE IF NOT EXISTS `tranche` (
  `id` int(11) NOT NULL,
  `tarifunit` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tranche`
--

INSERT INTO `tranche` (`id`, `tarifunit`) VALUES
(7465, '14454'),
(9886, '62554');
