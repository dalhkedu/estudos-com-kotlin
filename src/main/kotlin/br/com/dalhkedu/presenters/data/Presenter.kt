package br.com.dalhkedu.presenters.data

class Presenter<T> {

    private val data: T

    constructor(data: T) {
        this.data = data
    }
}