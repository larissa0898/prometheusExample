# Verwende das offizielle Alertmanager-Image als Basis
FROM prom/alertmanager:latest

# Kopiere deine Alertmanager-Konfigurationsdatei in den Container
COPY ./alertmanager.yml /etc/alertmanager/alertmanager.yml

# Exponiere den Port für den Alertmanager
EXPOSE 9093

# Starte den Alertmanager
#CMD [ "/alertmanager", "--config.file=/etc/alertmanager/config.yml" ]
