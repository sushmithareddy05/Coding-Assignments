<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <title>Sort Array in Descending Order</title>
    <script>
        function sortDescending() {
            const inputArray = document.getElementById('inputArray').value.split(',').map(Number);
            const sortedArray = inputArray.sort((a, b) => b - a);
            document.getElementById('outputArray').textContent = sortedArray.join(', ');
        }
    </script>
</head>
<body>
    <label for="inputArray">Enter an array (comma-separated):</label>
    <input type="text" id="inputArray">
    <button onclick="sortDescending()">Sort in Descending Order</button>
    <p>Sorted Array in Descending Order: <span id="outputArray"></span></p>
</body>
</html>