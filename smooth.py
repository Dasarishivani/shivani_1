word_counts = {'apple':100,'banana':200,'cherry':0}
vocabulary = 10
total = sum(word_counts.values())
def calculate_laplace(word):
    count = word_counts.get(word,0)
    probability = (count + 1) / (total + vocabulary)
    return probability
new_word = 'cherry'
result = calculate_laplace(new_word)
print(result)