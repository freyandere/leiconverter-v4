---
title: LeiConverter
created: 2026-06-26
updated: 2026-06-26
type: entity
tags: [ui, data, feature]
sources: []
confidence: high
---
# LeiConverter

## Overview
Android currency converter with Material 3 UI, real-time BNM exchange rates, cross-rate calculation, and 30-day volatility chart.

## Architecture
MVVM (Model-View-ViewModel) with Unidirectional Data Flow:
- UI: Jetpack Compose (Material 3)
- State: ViewModel + StateFlow
- Data: Room (caching) + Retrofit (BNM XML)
- Charts: Vico (sparkline)

## Links
- [GitHub](https://github.com/freyandere/leiconverter-v4)
- [Kanban Board](kanban.md)
