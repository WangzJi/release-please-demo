# Testing PR Workflow

This document describes how to test the PR-based release workflow.

## Test Cases

### 1. Valid PR Titles ✅

These titles should pass validation:

- `feat: add new transaction rollback feature`
- `fix: resolve memory leak in connection pool`
- `docs: update installation guide`
- `perf: optimize database query performance`
- `test: add unit tests for calculator`
- `chore: update dependency versions`

### 2. Invalid PR Titles ❌

These titles should fail validation:

- `update code` (missing type and colon)
- `bug fix` (missing colon and wrong format)
- `feat add feature` (missing colon)
- `new feature` (missing type)

### 3. Breaking Changes 💥

These titles indicate breaking changes:

- `feat!: remove deprecated API methods`
- `fix!: change configuration file format`

## Expected Workflow

1. **Create PR** with conventional title
2. **GitHub Actions validates** title format
3. **Review and merge** PR 
4. **Automatic changelog** generation from PR title
5. **Draft release** created with organized changelog

## Validation Results

When you create a PR, you should see:
- ✅ PR title validation job passes/fails
- 📝 Helpful error messages for invalid titles
- 📊 PR information displayed in Actions logs

## Testing This Branch

This branch contains:
- Enhanced Application.java with PR workflow validation
- Updated transaction manager integration
- This testing documentation

Expected PR title: `feat: add PR workflow validation and testing documentation` 