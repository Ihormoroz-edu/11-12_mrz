# Приклади запитів

## Перелік ігор
```bash
curl http://localhost:8080/api/games
```

## Одна гра
```bash
curl http://localhost:8080/api/games/1
```

## Неіснуюча гра (очікується 404)
```bash
curl -i http://localhost:8080/api/games/999
```