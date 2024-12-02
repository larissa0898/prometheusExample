FROM prom/prometheus:latest

# Kopiere nur die Konfigurationsdatei ins passende Verzeichnis
COPY ./prometheus.yml /etc/prometheus/prometheus.yml
COPY ./rules/alert.rules.yml /etc/prometheus/rules/alert.rules.yml

# Exponiere den Port
EXPOSE 9090

