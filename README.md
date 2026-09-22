# JoEnglish — Android native

JoEnglish est un projet Android natif (pas une page GitHub Pages). Cette V2 met en place le moteur d'interface et les interactions de base :

- choix initial langue source → langue cible, enregistré pour l'installation ;
- parcours A1 → C2, 600 positions de leçons par niveau ;
- écran d'accueil riche, XP, série, objectif et récompenses ;
- leçons interactives avec feedback vert/rouge et corrections pédagogiques ;
- expressions ; révision ; défis ; statistiques ; planning ; audio/volume ; paramètres ; JoBot ;
- notifications Android ;
- réinitialisation de la progression sans changer la combinaison de langues ;
- auteur : Joseph Marchand ; WhatsApp : 10D 243 98 62 30 968.

## Compilation dans GitHub Actions

Le workflow `.github/workflows/build-apk.yml` installe Gradle et les composants Android nécessaires puis construit `app-debug.apk`.

Cette V2 est le moteur et l'interface native. Les packs de contenu complets A1→C2 (3 600+ leçons rédigées, 1 000+ expressions et milliers d'exercices) doivent être ajoutés comme données de cours sans recopier le code de l'interface.
