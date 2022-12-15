package Laba2;
import java.util.*;
import java.util.stream.Collectors;

final public class Sentence{
    private String line;
    private String letterToFind;
    private String output;
    public Sentence() {
        this.line = setRandomSentence(5) + " " + setRandomSentence(2) + " " + setRandomSentence(7);
    }
    public Sentence(String line) {
        this.line = line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public void setLetter(String letter) {
        this.letterToFind = letter;
    }
    public String getLine() {
        return this.line;
    }
    public Sentence(Sentence givenObject) {
        this.line = givenObject.getLine();
    }
    //a.	Отсортируйте слова в предложении по длине слов, если слов с одинаковой длины несколько, то по алфавиту
    private String setRandomSentence(int size) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
    private List<String> transformWords(String line) {
        List<String> words = Arrays.asList((this.line.replaceAll("\\W", " ")).split("\\s+"));
        return words;
    }
    private List<String> delWords(List<String> words){
        for (String word : words) {
            if ((word.substring(0, 1).toLowerCase()).equals(word.substring(word.length() - 1).toLowerCase())) {
                words.set(words.indexOf(word), ""); //удаляем это слово
            }
        }
        return words;
    }
    private String replaceDel(List<String> words){
        output = String.join(" ", words).replaceAll("\\s+", " ");
        return output;
    }
    private List<String> transformLetters(String line){
        String formatLine = line.replaceAll("\\W", "").toLowerCase();
        List<String> letters = Arrays.asList(formatLine.split(""));
        return letters;
    }
    private static class LengthTwoComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        }
    }
    public void sortingSensForLenOrlAphabet(){
        List<String> words = transformWords(this.line);
        words.sort(new LengthTwoComparator());
        this.output = words.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(String.format("До: %s\nПосле: %s", this.line, String.join(" ", this.output)+"\n"));
    }
    public void delFirstAndLast(){
        List<String> words = transformWords(this.line);
        delWords(words);
        replaceDel(words);
        System.out.println(String.format("До: %s\nПосле: %s", this.line, this.output +"\n"));
    }
    public void averageOccurOfLetter(){
        List<String> letters = transformLetters(line);
        System.out.println("Какая буква: " + this.letterToFind);
        int occurrences = Collections.frequency(letters, this.letterToFind);
        this.output = String.valueOf(((float) occurrences / letters.size()));
        System.out.println(String.format("Строка: %s\nСредняя встречаемость: %s", this.line, this.output));
    }
//    public String TaskA()
//    {
//
//        String formatLine = line.replaceAll("\\W", " "); // заменяем символы по типу ". , :" на пробел
//        List<String> words = Arrays.asList(formatLine.split("\\s+")); //представляем массив в виде списка с параметром разделения в виде одного или более пробелов
//        words.sort(new LengthTwoComparator()); //сортируем слова по длине слова или по алфавиту
//        output = words.toString();
//        return output;
//    }
    //b.	Удалите из предложения слова, у которых первая буква совпадает с последней
//    public String TaskB()
//    {
//        List<String> words = Arrays.asList((line.replaceAll("\\W", " ")).split("\\s+")); // заменяем символы по типу ". , :" на пробел и //представляем массив в виде списка с параметром разделения в виде одного или более пробелов
//        for (String word : words) {
//            if ((word.substring(0, 1).toLowerCase()).equals(word.substring(word.length() - 1).toLowerCase())) {
//                words.set(words.indexOf(word), ""); //удаляем это слово
//            }
//        }
//        output = String.join(" ", words).replaceAll("\\s+", " "); //объединяем в новую строку и заменяем 1 и более пробелов на 1 пробел
//        return output;
//    }
    //d.	Определить среднее число встречаемости буквы в предложении


}
