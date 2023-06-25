/* 
  Meditation and Mindfulness Program 
  Kotlin File
*/

// DEFINING CLASS ESPMeditation
class ESPMeditation {
	// PROPERTIES
	private var _mindfulnessSessionLength = 0 
	private var _meditationDuration = 0

	// CONSTRUCTORS
	// primary constructor 
	constructor(_mindfulnessSessionLength : Int, _meditationDuration : Int){
		this._mindfulnessSessionLength = _mindfulnessSessionLength
		this._meditationDuration = _meditationDuration
	}

	// METHODS
	// getMindfulnessSessionLength
	fun getMindfulnessSessionLength() : Int { 
		return this._mindfulnessSessionLength
	}

	// setMindfulnessSessionLength
	fun setMindfulnessSessionLength(length : Int) {
	    this._mindfulnessSessionLength = length   
	}

	// getMeditationDuration
	fun getMeditationDuration() : Int {
		return this._meditationDuration
	}

	// setMeditationDuration
	fun setMeditationDuration(length : Int) {
	   this._meditationDuration = length
    }
    
	// startMindfulnessSession
	fun startMindfulnessSession(){
		println("Start your mindfulness session. Take a few deep breaths and focus on the present.")
		println("Notice your thoughts, emotions, and physical state. Spend ${this._mindfulnessSessionLength} minutes being mindful and non-judgmental.")
	}

	// endMindfulnessSession
	fun endMindfulnessSession(){
		println("Thank you for taking part in a mindfulness session. Please take a few moments to reflect on your experience.")
	}

	// startMeditation
	fun startMeditation(){
		println("Begin your meditation session. Spend ${this._meditationDuration} minutes focusing on your breath. Notice your thoughts and emotions as they come and go, and release any attachment to them.")
	}

	// endMeditation
	fun endMeditation(){
		println("Thank you for taking part in the meditation session. Please take a few moments to reflect on your experience and re-center yourself.")
	}

}

// DEFINING MAIN PROGRAM
fun main(args : Array<String>) {
	// instantiate ESPMeditation with mindfulness session length and meditation duration
	val meditationProgram = ESPMeditation(5, 10)

	// print welcome message
	println("Welcome to the Meditation & Mindfulness Program")

	// start mindfulness session
	meditationProgram.startMindfulnessSession()

	// print mindfulness session
	println("Spend ${meditationProgram.getMindfulnessSessionLength()} minutes being mindful and non-judgmental.")

	// end mindfulness session
	meditationProgram.endMindfulnessSession()

	// start meditation session
	meditationProgram.startMeditation()

	// print meditation session
	println("Spend ${meditationProgram.getMeditationDuration()} minutes focusing on your breath.")

	// end meditation session
	meditationProgram.endMeditation()
}