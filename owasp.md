# OWASP
Das Open Web Appliaction Security Project ist eine Non-Profit-Organisation, die sich zum Ziel gesetzt hat, die Sicherheit von Anwendungen und Diensten im Internet zu verbessern. Dabei wird bewusst auf Verbindungen zu Technologiefirmen verzichtet, um möglichst unabhängig zu sein.  
## OWASP Top 10
In den OWASP Top 10 werden regelmässig die zehn verbreitetsten Sicherheitslücken publiziert. Gegen diese sollte eine Applikation unbedingt abgesichert sein. Zu jeder Sicherheitslücke in dieser stellt OWASP eine Dokumentation bereit, die erklärt, was die Sicherheitslücke ist und wie man sie beheben kann.
Aktuell ist “Broken Access Control” auf dem ersten Platz  der verbreitetsten Sicherheitslücken. Im folgenden Abschnitt wird diese Sicherheitslücke etwas genauer betrachtet.

### Broken Access Control
Bei einer Broken-Access-Control-Sicherheitslücke liegt ein Problem im Zusammenhang mit den Zugriffsrechten vor. Das Problem kann dabei verschiedene Ursachen haben. OWASP listet folgende Punkte als mögliche Ursachen:

-	Verletzung des Prinzips der geringsten Privilegien oder der standardmäßigen Verweigerung des Zugangs, wobei der Zugang nur für bestimmte Fähigkeiten, Rollen oder Benutzer gewährt werden sollte, aber für jeden verfügbar ist.

- Umgehung von Zugriffskontrollen durch Änderung der URL (Manipulation von Parametern oder Erzwingen von Browsing), des internen Anwendungsstatus oder der HTML-Seite oder durch Verwendung eines Angriffstools, das API-Anfragen ändert.

- Ermöglichung der Anzeige oder Bearbeitung des Kontos einer anderen Person durch Angabe ihrer eindeutigen Kennung (unsichere direkte Objektverweise)

- Zugriff auf API mit fehlender Zugriffskontrolle für POST, PUT und DELETE

- Ausweitung der Rechte. Als Benutzer handeln, ohne eingeloggt zu sein, oder als Administrator handeln, wenn man als Benutzer eingeloggt ist.

- Manipulation von Metadaten, wie z. B. die Wiedergabe oder Manipulation eines JSON Web Token (JWT) oder eines Cookies.

- Eine falsche CORS-Konfiguration (Cross-origin resource sharing) ermöglicht den API-Zugriff von nicht autorisierten/unvertrauten Quellen.

- Force-Browsen auf authentifizierten Seiten als nicht authentifizierter Benutzer oder als Standardbenutzer auf Seiten, die privilegierte Rechte benötigen.

Um eine solche Sicherheitslücke zu verhindern ist es wichtig, dass, ausser auf öffentlichen Ressourcen,  Requests standardmässig abgelehnt  werden.  Zudem sollten Fehler mit Bezug zur Zugangskontrolle geloggt und nötigenfalls ein Administrator benachrichtigt werden. Damit automatisierte Attacken weniger effizient sind, ist es sinnvoll die Anzahl Anfragen pro Nutzer auf eine Ressource zu beschränken.
