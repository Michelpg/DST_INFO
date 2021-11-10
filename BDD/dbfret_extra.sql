
--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `affretement`
--
ALTER TABLE `affretement`
  ADD CONSTRAINT `affretement_ibfk_1` FOREIGN KEY (`idBatFret`) REFERENCES `bateaufret` (`id`);

--
-- Contraintes pour la table `lot`
--
ALTER TABLE `lot`
  ADD CONSTRAINT `lot_ibfk_1` FOREIGN KEY (`idAff`) REFERENCES `affretement` (`id`),
  ADD CONSTRAINT `lot_ibfk_2` FOREIGN KEY (`idTran`) REFERENCES `tranche` (`id`);
