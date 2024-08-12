Instructions
Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new languages, remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to learn Java or Kotlin!

Karl needs to know if his list of languages ever becomes empty, so he can go find more to learn! Define a method called isEmpty which returns true if there are no languages in the list.

if (languageList.isEmpty()) {
    findMoreLanguagesToLearn();
}

Stuck? Reveal Hints
Opens in a modal
Karl is looking forward to learning Kotlin and Python! Help Karl get started by defining a method called addLanguage which takes the language he wants to learn and adds it to the list.

languageList.addLanguage("Kotlin");
languageList.addLanguage("Python");

Stuck? Reveal Hints
Opens in a modal
Karl decided he does not want to learn Scala right now. Help Karl remove it from the list by defining a method called removeLanguage which takes the language he is removing and removes it from the list.

languageList.removeLanguage("Scala");

Stuck? Reveal Hints
Opens in a modal
Karl wants to remember the first language he added to the list (that is still in the list). Define a method called firstLanguage that returns the first language in the list.

String kotlin = languageList.firstLanguage(); // "Kotlin"

Stuck? Reveal Hints
Opens in a modal
Karl needs to know how many languages he is trying to learn. Help Karl find the answer by defining a method called count which returns the number of languages in the list.

int two = languageList.count(); // 2

Stuck? Reveal Hints
Opens in a modal
Karl is trying to remember if he wanted to learn Python or Ruby. Define a method called containsLanguage which takes the language he is asking about so Karl can find out!

boolean learningPython = languageList.containsLanguage("Python"); // true
boolean learningRuby = languageList.containsLanguage("Ruby"); // false

Stuck? Reveal Hints
Opens in a modal
If Karl wants to learn Java or Kotlin, that is very exciting! Define a method called isExciting that returns true if Karl wants to learn Java or Kotlin.

javaLanguageList.isExciting() // true
neitherKotlinNorJavaLanguageList.isExciting() // false