# Define the network drive and path
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$networkPath = "\\X\IMPACTPRO_BUILDS"
subst Z: $networkPath

# Change location to the network drive
Set-Location -Path $networkPath

# Execute the tree command
tree

# Remove the network drive mapping
subst Z: /D
