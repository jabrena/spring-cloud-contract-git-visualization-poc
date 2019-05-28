
org.springframework.cloud.contract.spec.Contract.make {
    description "should return even when number input is even"
    request{
        method GET()
        url("/api/concept1") {

        }
        headers {
            header 'Content-Type', 'application/json'
        }
    }
    response {
        status 200
        headers {
            headers {
                header 'Content-Type', 'application/json'
            }
        }
        body( """
			{
				"status": "OK"
			}
			""")
    }
}
