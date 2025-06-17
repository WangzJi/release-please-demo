# Release Please Demo (Java)

A demonstration project showing how to use [release-please](https://github.com/googleapis/release-please) for automated release management with Java and Maven.

## What is Release Please?

Release Please automates CHANGELOG generation, the creation of GitHub releases, and version bumps for your Java projects using Maven.

## How it works

1. **Conventional Commits**: Use conventional commit messages (feat:, fix:, chore:, etc.)
2. **Automated PRs**: Release Please creates PRs with version bumps in `pom.xml` and changelog updates
3. **Automated Releases**: When you merge the PR, a new release is automatically created

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Demo Usage

### Build and run the application
```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Run the application
mvn exec:java

# Package into JAR
mvn clean package

# Run the JAR file
java -jar target/release-please-demo-1.0.0.jar
```

### Make changes and commit
To trigger a release, make commits using conventional commit format:

```bash
# Feature commit (minor version bump)
git commit -m "feat: add multiplication function to calculator"

# Bug fix commit (patch version bump)  
git commit -m "fix: handle division by zero properly"

# Breaking change (major version bump)
git commit -m "feat!: change Calculator API to use double instead of int"

# Chore commit (no version bump)
git commit -m "chore: update Maven dependencies"
```

### The Release Process

1. Push your commits to the `main` branch
2. Release Please will analyze your commits
3. If there are releasable changes, it creates a "Release PR" that updates:
   - Version in `pom.xml`
   - `CHANGELOG.md` with new changes
4. Review and merge the Release PR
5. A new GitHub release is automatically created
6. Maven artifacts are built and tested

## Project Structure

```
release-please-demo/
├── src/
│   ├── main/java/com/wangzji/releaseplease/
│   │   ├── Application.java         # Main application class
│   │   └── Calculator.java          # Calculator utility class
│   └── test/java/com/wangzji/releaseplease/
│       └── CalculatorTest.java      # JUnit tests
├── pom.xml                          # Maven configuration
├── .github/workflows/
│   └── release-please.yml           # GitHub Actions workflow
└── README.md
```

## Commit Types

- `feat:` - New features (minor version bump)
- `fix:` - Bug fixes (patch version bump)
- `feat!:` or `fix!:` - Breaking changes (major version bump)
- `chore:` - Maintenance tasks (no version bump)
- `docs:` - Documentation changes (no version bump)
- `style:` - Code style changes (no version bump)
- `refactor:` - Code refactoring (no version bump)
- `test:` - Adding or modifying tests (no version bump)

## Features

- **Calculator**: Basic arithmetic operations with proper error handling
- **Unit Tests**: Comprehensive JUnit 5 test suite
- **Maven Build**: Standard Maven project structure
- **GitHub Actions**: Automated CI/CD with release-please
- **Version Management**: Automatic version bumping in `pom.xml`

## Current Version

The current version is automatically managed by release-please and can be found in `pom.xml`.

## License

MIT