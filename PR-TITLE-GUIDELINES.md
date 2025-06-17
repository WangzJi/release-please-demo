# PR Title Guidelines for Changelog Generation

## Overview

This project uses PR titles (not individual commits) to generate changelogs automatically. Your PR title should follow the conventional commit format.

## PR Title Format

```
<type>: <description>

Examples:
feat: add distributed transaction manager
fix: resolve connection timeout issue
docs: update integration guide
perf: optimize connection pool performance
```

## Supported Types

| Type | Description | Version Bump | Changelog Section |
|------|-------------|--------------|-------------------|
| `feat` | New features | Minor | 🚀 Features |
| `fix` | Bug fixes | Patch | 🐛 Bug Fixes |
| `perf` | Performance improvements | Patch | ⚡ Performance Improvements |
| `docs` | Documentation changes | None | 📝 Documentation |
| `style` | Code style changes | None | 💄 Styles |
| `refactor` | Code refactoring | None | ♻️ Code Refactoring |
| `test` | Test additions/changes | None | ✅ Tests |
| `build` | Build system changes | None | 🔧 Build System |
| `ci` | CI configuration changes | None | 👷 CI |
| `chore` | Maintenance tasks | None | 🔨 Miscellaneous |
| `revert` | Revert previous changes | None | ⏪ Reverts |

## Breaking Changes

For breaking changes, add `!` after the type:
```
feat!: change API structure completely
fix!: remove deprecated methods
```

## Examples for Seata Project

### Good PR Titles
- `feat: implement AT transaction mode support`
- `fix: resolve distributed lock timeout issue`
- `perf: optimize global transaction commit performance`
- `docs: add Seata integration examples`
- `feat!: change transaction manager API`

### Avoid These
- `update code` (not descriptive)
- `bug fix` (missing conventional format)
- `feat add new feature` (missing colon)

## Workflow

1. **Create PR** with conventional title
2. **Review and merge** PR 
3. **Changelog generated** automatically from PR title
4. **Draft release created** with organized changelog

## Benefits

- ✅ Clean, organized changelogs
- ✅ PR-level granularity (not commit-level)
- ✅ Automatic version bumping
- ✅ Consistent release notes 