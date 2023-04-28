import requests
from bs4 import BeautifulSoup

# List of product URLs
urls = [
    'https://www.example.com/product1',
    'https://www.example.com/product2',
    'https://www.example.com/product3',
    # ... and so on
]

# Loop through each URL and retrieve delivery information
for url in urls:
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'html.parser')
    delivery_info = soup.find('div', {'class': 'delivery-info'}).text.strip()
    print(delivery_info)






