# Hexis

Application Android de suivi d'entraînement (musculation, course) avec une couche de gamification (XP, niveaux, progression) sur un thème de mythologie grecque.

## Stack

- Kotlin, Jetpack Compose (Material 3)
- Room (SQLite) + KSP, coroutines / Flow
- Architecture MVVM : `data/` (entités, DAO, Database, Repository) → `view/` (ViewModel) → `ui/` (écrans Compose)
- Package : `io.github.nikapink.hexis`

## État actuel

- Couche données complète : `Seance`, `SeanceExercice`, `Serie` (clés étrangères en cascade), un DAO par entité, `SeanceDatabase` (singleton thread-safe), `SeanceRepository`.
- `HexisApplication` instancie la base et le repository (`by lazy`).
- `MainActivity` récupère `SeanceViewModel` via `by viewModels { SeanceViewModelFactory(...) }`.
- `SeanceScreen` : formulaire de création de séance + liste des séances (`collectAsState` → `LazyColumn`).

## Prochaines étapes

1. Navigation Compose : clic sur une séance → écran de détail avec ses exercices (filtrés par `seanceId`).
2. Écran des séries d'un exercice.
3. Amélioration visuelle de l'UI.
4. Plus tard : XP / niveaux, puis éventuellement une carte d'exploration (GPS, « brouillard de guerre »).

## Façon de travailler avec Claude

Ce projet est mon premier projet Android et sert à apprendre. Je viens de JavaFX / MVC.

- **Ne pas écrire le code à ma place** dans les fichiers du projet, sauf demande explicite.
- Expliquer les concepts, donner les étapes dans l'ordre, renvoyer vers la doc officielle.
- Les exemples de code sont bienvenus s'ils illustrent le principe sur un cas différent du mien (autres noms, autre contexte), pour que je l'adapte moi-même.
- Faire le lien avec JavaFX / MVC et SQL / PostgreSQL quand c'est utile.
- Réponses courtes : un concept, une action claire.

## Conventions

- Commits : Conventional Commits (`feat:`, `fix:`, `refactor:`, `docs:`...), en anglais.
- Branches : `main` stable, développement sur `dev`.
