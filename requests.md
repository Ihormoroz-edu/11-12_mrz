# Приклади запитів

## Перелік ігор
```bash
curl http://localhost:8080/api/games
```

## Фільтр за жанром
```bash
curl "http://localhost:8080/api/games?genre=RPG"
```

## Одна гра
```bash
curl http://localhost:8080/api/games/1
```

## Створити (201)
```bash
curl -i -X POST http://localhost:8080/api/games \
  -H "Content-Type: application/json" \
  -d '{"title":"Нова гра","developer":"Студія","price":19.99,"releaseYear":2024,"genre":"RPG","coverUrl":"/covers/x.jpg","description":"Опис"}'
```

## Оновити (200 / 404)
```bash
curl -i -X PUT http://localhost:8080/api/games/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Оновлена гра","developer":"Студія","price":29.99,"releaseYear":2024,"genre":"RPG","coverUrl":"/covers/x.jpg","description":"Опис"}'
```

## Видалити (204 / 404)
```bash
curl -i -X DELETE http://localhost:8080/api/games/2
```

## Неіснуюча гра (404)
```bash
curl -i http://localhost:8080/api/games/999
```