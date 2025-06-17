# Release Please Demo - GitHub Draft Release Generator

A demonstration project showing how to use [release-please](https://github.com/googleapis/release-please) to automatically generate **GitHub Draft Releases** based on conventional commits.

## What is This Demo?

This project demonstrates how to use release-please to automatically:
- ✅ Generate GitHub **Draft Releases**
- ✅ Create detailed changelogs from conventional commits
- ✅ Manage version bumping automatically
- ✅ Support any project type (language-agnostic)

## Key Features

- **Draft Releases**: Automatically creates draft releases that you can review before publishing
- **Language Agnostic**: Works with any project type (Java, Node.js, Python, Go, etc.)
- **Conventional Commits**: Uses commit message format to determine version bumps
- **Automated Changelog**: Generates beautiful changelogs from your commits

## How it Works

1. **Make commits** using conventional commit format
2. **Push to main branch** 
3. **Release-please analyzes** your commits
4. **Draft release created** automatically on GitHub
5. **Review and publish** when ready

## Conventional Commit Format

Use these commit prefixes to control version bumping:

```bash
# Feature - Minor version bump (1.0.0 → 1.1.0)
git commit -m "feat: add awesome new feature"

# Bug Fix - Patch version bump (1.0.0 → 1.0.1)
git commit -m "fix: resolve critical issue"

# Breaking Change - Major version bump (1.0.0 → 2.0.0)
git commit -m "feat!: breaking API changes"
git commit -m "fix!: breaking bug fix"

# Other types (no version bump)
git commit -m "docs: update documentation"
git commit -m "style: format code"
git commit -m "refactor: improve code structure"
git commit -m "test: add missing tests"
git commit -m "chore: update dependencies"
```

## Supported Commit Types

| Type | Description | Version Bump | Changelog Section |
|------|-------------|--------------|-------------------|
| `feat` | New features | Minor | Features |
| `fix` | Bug fixes | Patch | Bug Fixes |
| `feat!`/`fix!` | Breaking changes | Major | Features/Bug Fixes |
| `docs` | Documentation | None | Documentation |
| `style` | Code style | None | Styles |
| `refactor` | Code refactoring | None | Code Refactoring |
| `test` | Tests | None | Tests |
| `chore` | Maintenance | None | Miscellaneous |

## Workflow Process

1. **Commit & Push**: Make commits using conventional format and push to `main`
2. **Auto-Analysis**: GitHub Actions runs release-please
3. **Draft Creation**: If releasable commits found, creates draft release
4. **Manual Review**: Review the draft release on GitHub
5. **Publish**: Manually publish when ready

## Project Structure

```
release-please-demo/
├── .github/workflows/
│   └── release-please.yml    # GitHub Actions workflow
├── src/                      # Your project source (any language)
├── version.txt              # Current version file
├── README.md                # This documentation
└── .gitignore              # Git ignore rules
```

## Benefits of Draft Releases

- ✅ **Review before publishing** - Check changelog and version
- ✅ **Add release notes** - Enhance with additional information
- ✅ **Attach files** - Add binaries, packages, or artifacts
- ✅ **Control timing** - Publish when ready, not automatically
- ✅ **Multiple environments** - Test in staging before production

## Demo Usage

Try making some commits and see the magic happen:

```bash
# Make a feature change
echo "new feature" >> feature.txt
git add feature.txt
git commit -m "feat: add new feature file"
git push origin main

# Check GitHub Actions and Releases tab
# A draft release will be created automatically!
```

## Configuration

The workflow is configured in `.github/workflows/release-please.yml` with:
- **Release Type**: `simple` (language-agnostic)
- **Draft Mode**: `true` (creates drafts, not published releases)
- **Branch**: `main` (monitors main branch)
- **Changelog**: Comprehensive commit type support

## Current Version

See `version.txt` or check the latest GitHub release tag.

## License

MIT