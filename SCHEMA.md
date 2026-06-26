# Wiki Schema — LeiConverter

## Domain
Android currency converter project (LeiConverter v4) with BNM exchange rates, cross-rate calculation, and 30-day volatility charts.

## Conventions
- File names: lowercase, hyphens, no spaces
- Every wiki page starts with YAML frontmatter
- Use wikilinks (double brackets, e.g. `[[project-overview]]`) to link between pages (minimum 2 outbound links per page)
- When updating, always bump `updated` date
- Every new page added to `index.md`
- Every action appended to `log.md`

## Tag Taxonomy
- ui: UI/UX changes
- data: data layer (API, Room, parsing)
- feature: new features
- bug: bug fixes
- refactoring: code refactoring
- docs: documentation
- release: release notes

## Page Thresholds
- Create page when entity/concept appears in 2+ sources
- Add to existing page for passing mentions
- Split pages over 200 lines
