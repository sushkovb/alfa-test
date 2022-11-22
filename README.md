# Проект по автоматизации тестирования сайта компании Alfa Digital

## Содержание

> ➠ [Покрытый функционал](#earth_africa-покрытый-функционал)
>
> ➠ [Технологический стек](#classical_building-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#robot-удаленный-запуск-тестов)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)

## Покрытый функционал

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка отображения заголовка страницы
- [x] Проверка возможности отклика на вакансию


## Технологический стек

<p>
  <img src="https://img.icons8.com/color/48/000000/intellij-idea.png" title="Intellij Idea" alt="Intellij Idea" width="40" height="40"/>&nbsp; 
  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original-wordmark.svg" title="Java" alt="Java" width="40" height="40"/>&nbsp;
  <img src="https://www.svgrepo.com/show/354051/maven.svg" title="Maven"  alt="Maven" width="40" height="40"/>&nbsp;
  <img src="https://plugins.gradle.org/shared-assets/shared/images/elephant-corner.png" title="Gradle"  alt="Gradle" width="40" height="40"/>&nbsp;
  <img src="https://img.icons8.com/glyph-neue/344/github.png" title="GitHub" alt="GitHub" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/jenkins/jenkins-original.svg"  title="Jenkins" alt="Jenkins" width="40" height="40"/>&nbsp;
  <img src="https://miro.medium.com/max/1400/1*J8sjpKQJswCKiPUYVefbgQ.jpeg" title="JUnit 5" alt="JUnit 5" width="70" height="40"/>&nbsp;
  <img src="https://images.opencollective.com/allure-report/f14e715/logo/256.png" title="Allure" alt="Allure" width="40" height="40"/>&nbsp;
  <img src="https://avatars.githubusercontent.com/u/26328913?s=400&v=4" title="Selenoid" alt="Selenoid" width="50" height="40"/>&nbsp;
  </p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.


## Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```
### Удаленный запуск тестов 

```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Параметры сборки

> <code>REMOTE_DRIVER_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>100.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>800x800</code>_).



### Главная страница Allure-отчета

<p>
<a href="https://ibb.co/b7y1v3F"><img src="https://i.ibb.co/KmQ6sGD/1.png" alt="1" border="0"></a>
</p>

### Группировка тестов по проверяемому функционалу

<p>
<a href="https://ibb.co/8rCr0Yh"><img src="https://i.ibb.co/CbcbzPr/2.png" alt="2" border="0"></a>
</p>


### Основной дашборд

<p>
<a href="https://ibb.co/XbVRtYq"><img src="https://i.ibb.co/nbRJjPF/3.png" alt="3" border="0"></a>
</p>
