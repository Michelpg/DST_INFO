
-- --------------------------------------------------------

--
-- Structure de la table `affretement`
--

DROP TABLE IF EXISTS `affretement`;
CREATE TABLE IF NOT EXISTS `affretement` (
  `id` int(11) NOT NULL,
  `date` varchar(50) NOT NULL,
  `heure` varchar(50) NOT NULL,
  `idBatFret` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idBatFret` (`idBatFret`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `affretement`
--

INSERT INTO `affretement` (`id`, `date`, `heure`, `idBatFret`) VALUES
(23456, '10/04/2021', '17h34', 123),
(34443, '01/01/2021', '12h08', 544),
(459629, '02/05/2021', '23h56', 544);
