@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Для возраста 18 лет и более метод возвращает true, но вернул false",true, isAdult);
}
