import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description "should return book"

    request {
        url "/book"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
            name: "TestBook",
            value: 10
        )
    }
}