-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Fev-2021 às 02:00
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `tdc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `cpfoucnpj` varchar(14) NOT NULL,
  `tipo` int(11) NOT NULL,
  `datacadastro` date NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `telefone` varchar(40) NOT NULL,
  `telfixo` varchar(40) NOT NULL,
  `dia` int(2) NOT NULL,
  `mes` int(2) NOT NULL,
  `ano` int(4) NOT NULL,
  `ativoinativo` int(2) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `email`, `cpfoucnpj`, `tipo`, `datacadastro`, `funcionario_id`, `telefone`, `telfixo`, `dia`, `mes`, `ano`, `ativoinativo`, `senha`) VALUES
(29, 'Michael Alves do Reino', 'michaalvesreino@gmail.com', '17290534085', 1, '2021-02-23', 29, '(62)996656640', '(62)3481-2751', 15, 10, 1999, 1, 'mw1cd11i'),
(91, 'Willian Pedro Souza', 'michaelaalves@gmail.com', '92921175053', 1, '2021-01-20', 29, '(62)966564000', '(62)3481-2751', 15, 10, 1999, 1, ''),
(92, 'Rodrigo Pereira de Souza', 'Rodrigo@gmail.com', '70670078107', 1, '2021-01-23', 29, '(62)996656640', '(61)5555-5555', 15, 10, 1999, 1, ''),
(93, 'Michael Alves Reino', 'michaalvesreino@gmail.com', '49536687070', 1, '2021-02-20', 29, '(62)996656640', '(62)3481-2751', 15, 10, 1999, 1, 'va6b2cgm'),
(94, 'Angelica Linda', 'ancheldjjdjsjsj18338@gmail.com', '70528417118', 1, '2021-02-20', 29, '(62)966566400', '(62)3481-2751', 15, 10, 1999, 1, 'jeabc68b'),
(95, 'Angelica Lindissima', 'ancheldjjdjsjsj18338@gmail.com', '25971903071', 1, '2021-02-20', 29, '(62)966599400', '(62)3481-2751', 30, 15, 1999, 1, 'pyjy41qu'),
(96, 'Will cu de fuzil', 'wpjwpj09@gmail.com', '83844242090', 1, '2021-02-20', 29, '(62)996654404', '(61)3481-2751', 15, 10, 1999, 1, 'hdbolbt9');

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos`
--

CREATE TABLE `enderecos` (
  `id` int(11) NOT NULL,
  `bairro` varchar(40) NOT NULL,
  `complemento` varchar(40) NOT NULL,
  `rua` varchar(15) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `cep` varchar(9) NOT NULL,
  `cliente` int(11) NOT NULL,
  `datacadastro` date NOT NULL,
  `cidade` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `enderecos`
--

INSERT INTO `enderecos` (`id`, `bairro`, `complemento`, `rua`, `numero`, `cep`, `cliente`, `datacadastro`, `cidade`) VALUES
(14, 'CENTRO', '0', '10', 0, '73900-000', 90, '2021-01-20', 'POSSE GO'),
(15, 'Vista alegre', 'Vista Algre', '10', 0, '73900-000', 29, '2021-02-23', 'posse go'),
(16, 'centro', 'centreo', '10', 0, '73900-000', 93, '2021-02-20', 'posse go'),
(17, 'Centro', 'Posse', '10', 0, '73900-000', 94, '2021-02-20', 'Posse'),
(18, 'Centro', 'akskask', '10', 0, '73900-000', 95, '2021-02-20', 'posse go');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `loginName` varchar(40) NOT NULL,
  `permissao` int(11) NOT NULL,
  `senha` varchar(40) NOT NULL,
  `datacadastro` date NOT NULL,
  `email` varchar(40) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `ativoinativo` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `loginName`, `permissao`, `senha`, `datacadastro`, `email`, `nome`, `ativoinativo`) VALUES
(29, 'mike', 1, '42767516990368493138776584305024125808', '2021-01-20', 'michael@gmail.com.br', 'Michael', 1),
(55, 'admin', 1, '42767516990368493138776584305024125808', '2020-12-31', 'michaelalvesreino@gmail.com', 'admin', 1),
(56, 'Pedro', 2, '172615877915217560892406575915100721237', '2021-01-17', 'Pedro@gmail.com', 'Pedro Henrique', 1),
(57, 'pedro2', 1, '173447602773428053556316684567667297915', '2021-01-23', 'pedro@gmail.com', 'Pedro Henrique', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `garantias`
--

CREATE TABLE `garantias` (
  `id` int(11) NOT NULL,
  `dataInicial` date NOT NULL,
  `dataFinalGarantia` date NOT NULL,
  `maquina_id` int(11) NOT NULL,
  `clienteId` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `notaFiscal` int(11) NOT NULL,
  `status` varchar(40) NOT NULL,
  `SerialMaquina` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `garantias`
--

INSERT INTO `garantias` (`id`, `dataInicial`, `dataFinalGarantia`, `maquina_id`, `clienteId`, `funcionario_id`, `notaFiscal`, `status`, `SerialMaquina`) VALUES
(18, '2021-01-20', '2022-01-20', 25, 90, 29, 65667, 'Válida', '6656640'),
(19, '2021-01-20', '2022-01-20', 26, 90, 29, 54789, 'Válida', '64555648'),
(20, '2021-01-23', '2022-01-23', 27, 92, 29, 74789, 'Válida', '6547899');

-- --------------------------------------------------------

--
-- Estrutura da tabela `maquinarios`
--

CREATE TABLE `maquinarios` (
  `id` int(11) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `tipo` varchar(40) NOT NULL,
  `descricao` varchar(40) NOT NULL,
  `serie` varchar(40) NOT NULL,
  `datacadastro` date NOT NULL,
  `nomeCliente` varchar(40) NOT NULL,
  `clienteId` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `maquinarios`
--

INSERT INTO `maquinarios` (`id`, `modelo`, `tipo`, `descricao`, `serie`, `datacadastro`, `nomeCliente`, `clienteId`, `funcionario_id`) VALUES
(25, 'MOTOSSERRA', 'Maquina', 'MS 170', '6656640', '2021-01-20', 'Michael Alves do Reino', 90, 29),
(26, 'motosserra stihl', 'Maquina', 'motosserra ms 661', '64555648', '2021-01-20', 'Michael Alves do Reino', 90, 29),
(27, 'motosserra Stihl', 'Maquina', 'motosserra 460', '6547899', '2021-01-23', 'Rodrigo Pereira de Souza', 92, 29);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `funcionario_id` (`funcionario_id`);

--
-- Índices para tabela `enderecos`
--
ALTER TABLE `enderecos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `garantias`
--
ALTER TABLE `garantias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `funcionario_id` (`funcionario_id`),
  ADD KEY `maquina_id` (`maquina_id`);

--
-- Índices para tabela `maquinarios`
--
ALTER TABLE `maquinarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `funcionario_id` (`funcionario_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT de tabela `enderecos`
--
ALTER TABLE `enderecos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT de tabela `garantias`
--
ALTER TABLE `garantias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `maquinarios`
--
ALTER TABLE `maquinarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionarios` (`id`);

--
-- Limitadores para a tabela `garantias`
--
ALTER TABLE `garantias`
  ADD CONSTRAINT `garantias_ibfk_1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionarios` (`id`),
  ADD CONSTRAINT `garantias_ibfk_2` FOREIGN KEY (`maquina_id`) REFERENCES `maquinarios` (`id`);

--
-- Limitadores para a tabela `maquinarios`
--
ALTER TABLE `maquinarios`
  ADD CONSTRAINT `maquinarios_ibfk_1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionarios` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
