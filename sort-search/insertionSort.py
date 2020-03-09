# Insertion sort in Python 3

def insertionSort(array):
	i = 1				# index of the element being checked("current")
	l = len(data)		# length of array
	while i < l:		# traverse the array
		temp = data[i]	# save the data at the index of current
		j = i - 1		# index to the left of current one 
		while j >= 0 and data[j] > temp: # compare all elements before  the current one, as long as they are > current
			data[j + 1] = data[j]	# copy data to the right to make room to insert element out of order
			j = j - 1	# keep going left (see inner while loop)...
			print(data)
		data[j + 1] = temp	# insert "current" data in its right place
		i = i + 1		# on to the next element in the array
	# end of insertionSort method

# "main"
data = [5, 7, 4, 2, 1, 6, 3]
print("Original array")
print('='*21)
print(data)
print('='*21)

insertionSort(data)

print('='*21)
print("Sorted array")
print(data)
print('='*21)
