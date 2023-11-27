def readVersion(String versionfile) {
    def packageJson = readJSON file: versionfile
    def version = packageJson.version
    echo "Current version: ${version}"
    return version
}
