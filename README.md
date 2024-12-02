# prometheusExample

New:
`git clone https://github.com/dein-benutzername/datenbanksysteme_ha.git`
`cd datenbanksysteme_ha`
`docker-compose up --build`


Zugriff auf die Dienste:
  -  Spring Boot App: http://localhost:8080
  -  Grafana: http://localhost:3000 (Standardlogin: admin/admin)
  -  Prometheus: http://localhost:9090
  -  Alertmanager: http://localhost:9093
  -  NodeExporter: http://localhost:9100



Old:

Grafana runs on http://localhost:3000  `sudo systemctl status grafana-server`

Prometheus runs on http://localhost:9090 and can be started by running `./prometheus --config.file=prometheus.yml`

Spring-application runs on http://localhost:8080

Alertmanager runs on http://localhost:9093 and can be started by running `./alertmanager --config.file=alertmanager.yml`
