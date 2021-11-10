
-- --------------------------------------------------------

--
-- Structure de la table `lot`
--

DROP TABLE IF EXISTS `lot`;
CREATE TABLE IF NOT EXISTS `lot` (
  `idAff` int(11) NOT NULL,
  `idLot` int(11) NOT NULL,
  `poids` decimal(10,0) NOT NULL,
  `idTran` int(11) NOT NULL,
  PRIMARY KEY (`idLot`,`idAff`),
  KEY `idAff` (`idAff`),
  KEY `idTran` (`idTran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lot`
--

INSERT INTO `lot` (`idAff`, `idLot`, `poids`, `idTran`) VALUES
(23456, 5346, '3455', 7465),
(23456, 7456, '5669', 9886),
(459629, 34564, '3466', 9886);
