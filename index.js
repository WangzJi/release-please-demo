// index.js
const packageInfo = require('./package.json');

function greet(name = 'World') {
  return `Hello, ${name}!`;
}

function showVersion() {
  return `Release Please Demo v${packageInfo.version}`;
}

function main() {
  console.log(greet());
  console.log(showVersion());
  console.log('This is a demo for release-please automation!');
}

// Export functions for testing
module.exports = {
  greet,
  showVersion
};

// Run main function if this file is executed directly
if (require.main === module) {
  main();
}

function addNumbers(a, b) { return a + b; }
