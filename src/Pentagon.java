/*
Хотел вычислить площадь пятиугольника.
Не уверен насчёт корректности самих вычислений, но гугл выдавал площадь пятиугольника следующей формулой:
A = (5/2)r2sin72˚, где r — радиус описанной окружности. (так же там r во 2й степени)
На куче других сайтов была куча других формул с учётом сторон, радиусом вписанной окружности и тд.
Решил остановиться на этом варианте, как более-менее простой для записи.
*/


public class Pentagon {

    int r = 5;   //радиус описанной окружности (для примера).

    public void getArea() {
        double result = (5 / 2) * Math.pow(r, 2) * Math.sin(72);
        System.out.println(result);
    }
}
