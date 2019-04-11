### Prepare data

Create required keyvault secrets `test.valueX` in keyvault, from portal or use Azure Cli.

i.e., test-value1 ... test-value20 in Key Vault secrets

Azure cli example:

az keyvault secret set --name test-value1 --vault-name {your-keyvault-name} --value "test-value1"

### Check result

Start Spring Boot application

Access localhost:8080