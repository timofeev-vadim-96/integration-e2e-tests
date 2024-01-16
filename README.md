## Тимофеев Вадим

### Группа: Веб-разработка на Java | Тех. специализация | 2

> `Unit-тесты. Урок 5. Другие виды тестирования`

`Задание 1`

> По рекомендациям от Google - соотношение модульные/интеграционные/системные = 70%/20%/10%.  

По кейсу дз родил 5/3/1. (единиц)

* Над классом [Notebook](Test/seminars/five/notes/model/NotebookTest.java) написал 5 возможных сценариев `юнит-тестов`  
* Над классом [Presenter](Test/seminars/five/notes/PresenterTest.java) написал 3 возможных сценария `интеграционных тестов  ` 
(здесь взаимодействие Presenter и Notebook. Возможно, также, с UI, но у меня в методах не предполагается)
* Над классом [UI](Test/seminars/five/notes/UITest.java) - 1 `end-2-end` тест  (здесь вся бизнес-логика)



`Задание 2.`
1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов. Это `модульный (Unit-тест),`
т.к. проверяется работа одной функции. Соответственно, даже если список контактов представляет собой БД, то будем
производить ее мокирование.
2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке 
контактов. Это `интеграционный тест`, т.к. проверяется работа нескольких модулей, а именно методов по добавлению контакта, а также
корректности работы фронтенда по отображению контакта. 
3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление. При условии,
что приложение позволяет только работать с контактом - это `системный (E2E-тест)`, т.к. проверяет работоспособность 
приложения от начала и до конца, а также взаимодействие с внешними зависимостями.