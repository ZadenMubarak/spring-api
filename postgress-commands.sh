# setup docker

echo "setting it all up"
docker compose up -d
echo "logs"
docker compose logs
echo "ps"
docker compose ps
echo "entering special bash"
docker exec -it postgres bash