multiplos :: Int -> [Int] -> [Int]
multiplos _ []       = []
multiplos n (x : xs)
  | x `mod` n == 0   = x : multiplos n xs
  | otherwise        = multiplos n xs

main :: IO ()
main = do
  let lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
  let resultado = multiplos 3 lista
  putStrLn ("Multiplos de 3 en la lista: " ++ show resultado)
