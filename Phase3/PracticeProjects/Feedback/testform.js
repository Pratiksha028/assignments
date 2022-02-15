
functionSubmitTestForm() {
	
alert("The form was submitted");
}

* @param {Object} options
 * @param {string} options.url - URL to POST data to
 * @param {FormData} options.formData - `FormData` instance
 * @return {Object} - Response body from URL that was POSTed to
 */
asyncfunctionpostFormDataAsJson({ url, formData }) {
	 
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/fromEntries
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify
	 */
	constplainFormData=Object.fromEntries(formData.entries());
	constformDataJsonString=JSON.stringify(plainFormData);

	constfetchOptions= {
		
		method: "POST",
		
		headers: {
			"Content-Type": "application/json",
			"Accept": "application/json"
		},
		
		body: formDataJsonString,
	};

	constresponse=awaitfetch(url, fetchOptions);

	if (!response.ok) {
		consterrorMessage=awaitresponse.text();
		thrownewError(errorMessage);
	}

	returnresponse.json();
}
