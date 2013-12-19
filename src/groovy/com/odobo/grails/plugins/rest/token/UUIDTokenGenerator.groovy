package com.odobo.grails.plugins.rest.token

import groovy.transform.CompileStatic

/**
 * Uses {@link UUID} to generate tokens.
 */
@CompileStatic
class UUIDTokenGenerator implements TokenGenerator {

    /**
     * Generates a UUID based token
     *
     * @return a String token of 32 alphanumeric characters.
     */
    @Override
    String generateToken() {
        return UUID.randomUUID().toString().replaceAll('-', '')
    }
}
