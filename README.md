# Release Please Demo

A demonstration project showing how to use [release-please](https://github.com/googleapis/release-please) for automated release management.

## What is Release Please?

Release Please automates CHANGELOG generation, the creation of GitHub releases, and version bumps for your projects.

## How it works

1. **Conventional Commits**: Use conventional commit messages (feat:, fix:, chore:, etc.)
2. **Automated PRs**: Release Please creates PRs with version bumps and changelog updates
3. **Automated Releases**: When you merge the PR, a new release is automatically created

## Demo Usage

### Run the application
```bash
npm start
```

### Make changes and commit
To trigger a release, make commits using conventional commit format:

```bash
# Feature commit (minor version bump)
git commit -m "feat: add new greeting function"

# Bug fix commit (patch version bump)  
git commit -m "fix: resolve greeting display issue"

# Breaking change (major version bump)
git commit -m "feat!: change API structure"

# Chore commit (no version bump)
git commit -m "chore: update documentation"
```

### The Release Process

1. Push your commits to the `main` branch
2. Release Please will analyze your commits
3. If there are releasable changes, it creates a "Release PR"
4. Review and merge the Release PR
5. A new GitHub release is automatically created
6. Version numbers are automatically bumped

## Commit Types

- `feat:` - New features (minor version bump)
- `fix:` - Bug fixes (patch version bump)
- `feat!:` or `fix!:` - Breaking changes (major version bump)
- `chore:` - Maintenance tasks (no version bump)
- `docs:` - Documentation changes (no version bump)
- `style:` - Code style changes (no version bump)
- `refactor:` - Code refactoring (no version bump)

## Current Version

The current version is automatically managed by release-please and can be found in `package.json`.

## License

MIT