# Prometheus-Anwendungsbeispiel

## Inhaltsverzeichnis

1. [Projektinformationen](#projektinformationen)
2. [Voraussetzungen](#voraussetzungen)
3. [Anwendung](#anwendung)
    1. [Projekt starten](#projekt-starten)
    2. [Zugriff auf die Dienste](#zugriff-auf-die-dienste)
4. [Service-Ansichten](#service-ansichten)
    1. [API](#api)
    2. [Grafana](#grafana)
    3. [Prometheus](#prometheus)
    4. [Alertmanager](#alertmanager)
    5. [Node Exporter](#node-exporter)

## Projektinformationen
Dieses Projekt zeigt den Einsatz von Prometheus als Monitoring- und Alarmsystem. Um die Funktionalität von Prometheus zu demonstrieren, wurde eine einfache Spring Boot-Anwendung implementiert, die Metriken bereitstellt und als Beispielziel dient.

#### Hauptkomponenten:

- Prometheus:
        Überwacht die Spring Boot-Anwendung und sammelt Metriken.
        Ermöglicht das Erstellen von Regeln für Alarme basierend auf den Metriken.
- Alertmanager:
        Benachrichtigt bei ausgelösten Alarmpunkten über Telegram.
- API basierend auf Spring Boot:
        Dient als Beispiel-Service, der Prometheus-kompatible Metriken bereitstellt.
- Node Exporter:
        Stellt Systemmetriken bereit, wie bspw. die CPU-Auslastung.
- Grafana:
        Visualisiert die von Prometheus gesammelten Daten in Dashboards.
- Docker Compose:
        Orchestriert die Container für eine einfache Bereitstellung.

![Projektstruktur](images/diagramm.PNG)

## Voraussetzungen
Folgende Tools sollten vor dem Start der Anwendung installiert sein:

- Docker

Während der Entwicklung dieses Projekt wurden folgende Versionen verwendet:
- Docker version 27.3.1
- docker-compose version 1.29.2

## Anwendung

### Projekt starten
Im Root-Verzeichnis kann die Applikation mit dem Befehl `docker-compose up --build` gestartet werden. 

### Zugriff auf die Dienste
Unter folgenden URLs sind die Services erreichbar:

  -  API basierend auf Spring Boot: 
        - Get-Route: http://localhost:8080/api/metrics-test
        - Error-Route: http://localhost:8080/api/error
  -  Grafana: http://localhost:3000/dashboards (Standardlogin: admin/admin)
  -  Prometheus: http://localhost:9090
  -  Alertmanager: http://localhost:9093
  -  NodeExporter: http://localhost:9100
  - Telegram Alert-Bot: https://t.me/dbs_prometheus_alert_bot


## Service-Ansichten
### API
Endpunkte der API:

![metrics-test Endpunkt](images/api-metrics-test.png)

![Error Endpunkt](images/api-error.png)

### Grafana
Vorkonfigurierte Grafana-Dashboards:
![Grafana Dashboards](images/grafana-dashboards.png)

### Prometheus
In der Web UI von Prometheus sind die eingerichteten Alerts zu sehen.

Inaktiver Alert:
![Prometheus inactive](images/prometheus-alert-inactive.png)

Aktiver Alert (firing):
![Prometheus friing](images/prometheus-firing.png)

### Alertmanager
Alertmanager ohne ausgelöste Alerts:
![Alertmanager ohne Alertsg](images/alertmanager-no-alerts.png)

Alertmanager mit Alerts:
![Alertmanager mit Alerts](images/alertmanager-alerts.png)

### Node Exporter
![Node Exporter](images/node-exporter.png)

