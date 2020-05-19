# Строки до 0
Пользователь вводит строки одну за другой до тех 
пор, пока не введёт "0". 
Программа должна выводить введенные строки, 
пока не встретилась строка содержащая "0".

## Формат входных данных
Строки
## Формат выходных данных
Введенные строки

## Примеры:
### Входные данные
Едет  
по  
0  
### Результат работы
Едет  
по

## P.S.
Обратите внимание на разницу между методами сканера
Next() и NextLine()

Для сравнения строк можно использовать метод equals()
### Пример 

```java 
String str = "0";
        if (str.equals("0"))
            System.out.println("YES");
```
