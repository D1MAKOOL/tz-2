# Простейшая программа для работы с числами из файла и настройка CI/CD

##Бейдж

![Java CI](https://github.com/username/repo-name/actions/workflows/ci.yml/badge.svg)

##Диаграмма

![photo_2024-05-23 18 55 28](https://github.com/D1MAKOOL/tz-2/assets/167441082/62adf1dd-0699-40ef-9ad5-ba02556ba197)


## Описание

Этот проект представляет собой простейшую программу на Java, которая считывает числа из файла и выполняет следующие операции:
- Поиск минимального числа (`_min`)
- Поиск максимального числа (`_max`)
- Суммирование всех чисел (`_sum`)
- Вычисление произведения всех чисел (`_mult`)

Кроме того, проект включает тестирование этих функций и настройку простейшего CI/CD с использованием GitHub Actions.

## Структура проекта

- src/main/java/com/example/Main.java - основной класс программы.
- src/test/java/com/example/Main_test.java - тесты для проверки корректности функций.
- README.md - описание проекта.
- .github/workflows/main.yml - конфигурация для GitHub Actions.

## Функционал

Программа выполняет следующие функции:

- _min: Поиск минимального числа в списке.
- _max: Поиск максимального числа в списке.
- _sum: Суммирование всех чисел в списке.
- _mult: Вычисление произведения всех чисел в списке.

## Пример работы

В файле: 1 4 2 3

- Минимальное: 1
- Максимальное: 4
- Сумма: 10 (1+2+3+4)
- Произведение: 24 (1*2*3*4)

## Тестирование

Проект включает следующие тесты:

1. Проверка корректности функций поиска минимума и максимума.
2. Проверка корректности функций сложения и умножения.
3. Проверка скорости работы программы при увеличении размера входного файла.
4. Дополнительные тесты на ваше усмотрение.
5. Построение графика зависимости времени выполнения от количества чисел в файле.

## Настройка CI/CD

Для автоматизации тестирования и деплоя используется GitHub Actions.

### Шаги настройки

1. Создать репозиторий на GitHub и загрузить файлы проекта.
2. Подключить GitHub Actions для запуска тестов.
3. Настроить запуск тестов при каждом коммите.
4. Добавить бейдж статуса тестов в README.md.
5. Настроить интеграцию с мессенджером для уведомлений о результатах тестирования.

## Инструкции по запуску

1. Клонировать репозиторий:
   ```bash
   git clone https://github.com/username/repo-name.git
