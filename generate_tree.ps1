$folderPath = "\\wn000106946\IMPACTPRO_BUILDS"

# Execute the tree command
$treeOutput = Invoke-Expression "tree $folderPath"

# Output the tree command result
$treeOutput
