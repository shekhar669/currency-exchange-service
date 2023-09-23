$folderPath = "D:CV"

# Execute the tree command
$treeOutput = Invoke-Expression "tree $folderPath"

# Output the tree command result
$treeOutput
