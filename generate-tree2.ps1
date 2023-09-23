# Define the network drive and path
$networkDrive = "X:"
$networkPath = "\\server\share"

# Map the network drive
New-PSDrive -Name $networkDrive -PSProvider FileSystem -Root $networkPath -Persist -Scope Global

# Change location to the network drive
Set-Location -Path $networkDrive

# Execute the tree command
tree

# Remove the network drive mapping
Remove-PSDrive -Name $networkDrive -Scope Global
