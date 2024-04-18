def getRandomInteger(min, max) {
	if (min >= max) {
		error("'min' is bigger or equal to 'max' parameter")
	}
	def rnd = new SecureRandom()
	return Math.abs(rnd.nextInt() % (max - min)) + min
}
return this
