-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Jun-2024 às 23:13
-- Versão do servidor: 10.4.32-MariaDB
-- versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `studentinfo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `info`
--

CREATE TABLE `info` (
  `id` int(11) NOT NULL,
  `firstname` varchar(200) NOT NULL,
  `lastname` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `rollnumber` varchar(200) NOT NULL,
  `course` varchar(200) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `info`
--

INSERT INTO `info` (`id`, `firstname`, `lastname`, `email`, `rollnumber`, `course`, `date`) VALUES
(5, 'Miguel', 'Magalhães', '2021103166@ispgaya.pt', '2021103166', 'Redes e Sistemas Informáticos', '2024-06-02 15:09:33'),
(7, 'Alberto', 'Coelho', '2020345387@ispgaya.pt', '2020345387', 'Engenharia Mecânica', '2024-06-02 16:00:48'),
(8, 'Mariana ', 'Moreira', '2019157382@ispgaya.pt', '2019157382', 'Engenharia Informática', '2024-06-02 16:02:16'),
(9, 'João', 'Silva', '2018765438@ispgaya.pt', '2018765438', 'Eletrónica e Automação Industrial', '2024-06-02 16:04:46'),
(10, 'Alexandre ', 'Almeida', '2017746321@ispgaya.pt', '2017746321', 'Gestão de Turismo', '2024-06-02 16:05:27'),
(11, 'Gustavo', 'Martins', '2017852189@ispgaya.pt', '2017852189', 'Marketing Digital', '2024-06-02 16:05:54'),
(12, 'Olívia ', 'Rei', '2021342654@ispgaya.pt', '2021342654', 'Tecnologia Mecatrónica', '2024-06-02 16:06:39'),
(13, 'Sara ', 'Sousa', '2024365429@ispgaya.pt', '2024365429', 'Gestão de PME', '2024-06-02 16:08:18'),
(14, 'Cris ', 'Martin', '2023427653@ispgaya.pt', '2023427653', 'Gestão e Informática Aplicada aos Negócios', '2024-06-02 16:09:41'),
(15, 'Fábio', 'Sequeira', '2024732849@ispgaya.pt', '2024732849', 'Tecnologias e Programação de Sistemas de Informação', '2024-06-02 16:10:32'),
(16, 'Andreia ', 'Fonseca', '2021738297@ispgaya.pt', '2021738297', 'Contabilidade', '2024-06-02 16:11:56'),
(17, 'Gabriel', 'Teixeira', '2012453876@ispgaya.pt', '2012453876', 'Gestão', '2024-06-02 16:12:40'),
(18, 'Beatriz', 'Bastos', '2016837298@ispgaya.pt', '2016837298', 'Engenharia Eletrónica e de Automação', '2024-06-02 16:13:10'),
(19, 'Camille', 'Placido', '2024453289@ispgaya.pt', '2024453289', 'Turismo e Negócios Sustentáveis', '2024-06-02 16:14:44'),
(20, 'João', 'Miguel', '2023748209@ispgaya.pt', '2023748209', 'Cibersegurança e Auditoria de Sistemas Informáticos', '2024-06-02 16:15:30');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `info`
--
ALTER TABLE `info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `info`
--
ALTER TABLE `info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
