
0. [Первый проект](https://github.com/soplyashka/MobDev/blob/main/Lesson6/README.md#%D0%BF%D0%B5%D1%80%D0%B2%D1%8B%D0%B9-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82-lesson6)
1. [Второй проект](https://github.com/soplyashka/MobDev/blob/main/Lesson6/README.md#%D0%B2%D1%82%D0%BE%D1%80%D0%BE%D0%B9-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82-mireaproject)

## Первый проект "Lesson6"


### 1. На экране необходимо разместить три поля ввода, и кнопку для сохранения информации.
Требуется запомнить номер группы, номер по списку и название любимого фильма или сериала с помощью «getSharedPreferences». После новой загрузки приложения в поле ввода должны отобразиться значения из памяти. Для ВЫПОЛНЕНИЯ ЗАДАНИЯ требуется:
- найти файл настроек с помощью «Device Explorer» в среде разработки «Android Studio»;
- открыть файл настроек;
- создать директорию «raw» в проекте;
- сделать скриншот экрана со значениями файла и разместить его в директории «raw».

Введём необходимые данные и нажмем кнопку сохранить:
![](scr/1.jpg)

Найдём файл настроек, сделаем скриншот и добавим в директорию raw:
![](scr/2.jpg)

Перезапустим приложением и увидим, что зачения отображаются из памяти
![](scr/3.jpg)

### 2. Создать новый модуль «SecureSharedPreferences». 
Требуется создать экран отображения имени Вашего любимого поэта и его фотографии или рисунка

![](scr/4.jpg)


### 3. Создать новый модуль «InternalFileStorage». 
Для ВЫПОЛНЕНИЯ ЗАДАНИЯ требуется:
- добавить на экран поле ввода и кнопку;
- записать в файл памятную дату в истории России и ее описание;
- создать директорию «raw» в проекте;
- переместить созданный файл с эмулятора или устройства в проект

Добавим памятную дату - отмену крепостного права и нажмем кнопку сохранить:
![](scr/5.jpg)
![](scr/6.jpg)

Переместим созданный файл в директорию raw:
![](scr/7.jpg)



### 4. Создать новый модуль «Notebook».
Требуется создать приложение – «Блокнот» с сохранением файлов. Для ВЫПОЛНЕНИЯ ЗАДАНИЯ требуется:
- добавить на экран поля ввода «названия файла» и «цитата»;
- добавить на экран кнопки «сохранить данные в файл» и «загрузить данные из файла»;
- файлы сохраняются в публичную директорию «Directory_Documents» с перезаписью;
- при загрузке файла считываются данные и устанавливаются в поле «цитата»;
- требуется записать в два файла цитаты известных людей;
- создать директорию «raw» в проекте;
- переместить созданные файлы с эмулятора или устройства в проект.

Сохраним два файла с цитатами:
![](scr/8.jpg)
![](scr/9.jpg)

Попробуем загрузить данные из одного файла:
![](scr/10.jpg)
![](scr/11.jpg)

Найдем два новых созданных файла и переместим их в директорию raw в проект:
![](scr/12.jpg)
![](scr/13.jpg)


### 5. Создать новый модуль «EmployeeDB». 
Создать базу данных для хранения информации о вымышленных супер-героях
![](scr/18.jpg)
![](scr/19.jpg)



## Второй проект "MireaProject"
### В контрольном задании «MireaProject» 
- добавить фрагмент «Профиль», в котором пользователь должен указать определённые параметры (задумка исполнителя) и сохранить их в«SharedPreferences»;
- добавить фрагмент «Работа с файлами». Придумать функционал экрана, связанный с обработкой файлов (конвертация форматов, криптография, стеганография и т.д.). При нажатии на «Floating Action Button» вызывается диалоговое окно/фрагмент/View создания записи


![](scr/14.jpg)
![](scr/15.jpg)
![](scr/16.jpg)
![](scr/17.jpg)
