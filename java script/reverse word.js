<!DOCTYPE html>
<html>
<head>
    <title>Word Reversal</title>
    <script>
        function reverseWords() {
            const inputSentence = document.getElementById('inputSentence').value;
            const words = inputSentence.split(" ");
            const reversedWords = words.map(word => word.split('').reverse().join(''));
            const reversedSentence = reversedWords.join(' ');
            document.getElementById('outputSentence').textContent = reversedSentence;
        }
    </script>
</head>
<body>
    <label for="inputSentence">Enter a sentence: </label>
    <input type="text" id="inputSentence">
    <button onclick="reverseWords()">Reverse Words</button>
    <p>Reversed Sentence: <span id="outputSentence"></span></p>
</body>
</html>
