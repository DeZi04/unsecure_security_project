# Cross Site Scripting

Cross-Site-Scripting bezeichnet das Ausnutzen einer Computersicherheitslücke in Webanwendungen. Es werden meist mithilfe von JavaScript-Code 
Informationen aus einem Kontext, in dem sie nicht vertrauenswürdig sind, in einen anderen Kontext eingefügt, in dem sie
als vertrauenswürdig eingestuft werden. Daraufhin wird aus diesem «vertrauenswürdigen» Kontext dann ein Angriff gestartet werden.
Ziel ist es meist, an sensible Daten des Benutzers zu gelangen, um beispielsweise seine Benutzerkonten zu
übernehmen (Identitätsdiebstahl).

Es gibt zwei Haupttypen von XSS-Angriffen: 

- **Reflektierende XSS-Angriffe**. Diese erfolgen durch das Einschleusen von Code in eine URL, die von einem Benutzer angefordert wird. Der Angreifer kann dann einen Link mit dem manipulierten Code an einen Benutzer senden, der die URL aufruft und dadurch den Angriff auslöst.
- **Persistente XSS-Angriffe** erfolgen durch das Einschleusen von Code in eine Webseite, die dauerhaft gespeichert wird. Beispielsweise kann ein Angreifer einen Kommentar mit schädlichem Code auf einer Webseite hinterlassen, der von anderen Benutzern angezeigt wird, wenn sie die Seite besuchen.

Der einfachste Weg, um sich vor XSS zu schützen, ist, indem man alle eingeben des Nutzers überprüft und schaut, ob schädlicher Code vorhanden ist. Diesen entfernt man dann bevor alles abgespeichert wird.
