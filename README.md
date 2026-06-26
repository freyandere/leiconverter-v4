# LeiConverter v4

Android currency converter with Material 3 UI, real-time BNM exchange rates, cross-rate calculation, and 30-day volatility chart.

## Features

| Feature | Description |
|---------|-------------|
| Real-time Conversion | Instant recalculation on keystroke |
| Cross-Rates | EUR → USD via MDL base (BNM-only source) |
| Custom Numpad | No system keyboard, inline formatting |
| Swap Button | One-tap currency inversion with rotation |
| BNM XML | Official rates from Banca Națională a Moldovei |
| Room Caching | Offline-first with Stale-While-Revalidate |
| Volatility Chart | 30-day sparkline (Vico) |

## Setup

1. Clone and open in Android Studio (Arctic Fox or newer)
2. Sync Gradle dependencies
3. Run on device or emulator

## Development

- **Branch**: `dev` for active development
- **Release**: `main` for production
- **CI**: GitHub Actions (tests + linting)

## Architecture

MVVM with Unidirectional Data Flow:
- UI: Jetpack Compose (Material 3, dynamic colors)
- State: ViewModel + StateFlow
- Data: Room (caching) + Retrofit (BNM XML)
- Charts: Vico (sparkline)

```
┌─────────────────────────────────────────────┐
│  UI Layer (Compose)                         │
│  ┌─────────┐  ┌─────────┐  ┌─────────────┐ │
│  │ Numpad  │  │ Convert │  │  Sparkline  │ │
│  └─────────┘  └─────────┘  └─────────────┘ │
└─────────────────────────────────────────────┘
              │ StateFlow
┌─────────────────────────────────────────────┐
│  Presentation Layer (ViewModel)             │
│  ┌───────────────────────────────────────┐  │
│  │ Cross-rate calc, conversion logic     │  │
│  └───────────────────────────────────────┘  │
└─────────────────────────────────────────────┘
              │
┌─────────────────────────────────────────────┐
│  Data Layer                                 │
│  ┌─────────┐  ┌──────────────────────────┐ │
│  │  Room   │  │  Retrofit (BNM XML)      │ │
│  └─────────┘  └──────────────────────────┘ │
└─────────────────────────────────────────────┘
```

## Design Tokens

| Token | Value | Usage |
|-------|-------|-------|
| Background | #0A0A0A | body background |
| Surface | #111111 | phone-frame, status-bar |
| SurfaceVariant | #1A1A1A | chips, badges |
| Accent | #F0AD4E | active selections, focus |
| Rate | #4A9EFF | rate values |
| Alert | #E74C3C | dates, warnings |
| Card radius | 36dp | main cards |
| Chip radius | 8dp | currency chips |
| Grid | 8dp / 16dp | base spacing |

## Links

- [Kanban Board](kanban.md)
- [Wiki](index.md)
- [Issue Tracker](https://github.com/freyandere/leiconverter-v4/issues)
