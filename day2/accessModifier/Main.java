/*
	Public > Protected > default > private

	-----------------------------------------------------------------	
	parent 			|		child 		|		Result
	----------------|-------------------|-----------------------------
	stronger		|		weaker		|		error
	weaker 			|		stronger	|		no-error (will work)
	same 			|		same 		|		no-error (will work)
	------------------------------------------------------------------

	if one method is static and other method is non-static then method overriding will not be achieved
	
	if both method are static then function hiding will work ,  - program will run but that is not a methodoverriding
	as super keyword will not work -- compile time error

	final , static, private keyword -- never override.


*/