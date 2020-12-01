package com.jiang.framework.entity;

/**
 * @description: 中间过程结果
 * @author: jiang
 * @create: 2020-09-16 14:31
 */
public class MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> {

    private RemoteResult<T> result;

    private FIRST first;
    private SECOND second;
    private TRIPLE triple;
    private ULTRA ultra;
    private PENTA penta;

    public MiddleResult() {
    }

    public MiddleResult(RemoteResult<T> result, FIRST first) {
        this.result = result;
        this.first = first;
    }

    public MiddleResult(RemoteResult<T> result, FIRST first, SECOND second) {
        this.result = result;
        this.first = first;
        this.second = second;
    }

    public MiddleResult(RemoteResult<T> result, FIRST first, SECOND second, TRIPLE triple) {
        this.result = result;
        this.first = first;
        this.second = second;
        this.triple = triple;
    }

    public MiddleResult(RemoteResult<T> result, FIRST first, SECOND second, TRIPLE triple, ULTRA ultra) {
        this.result = result;
        this.first = first;
        this.second = second;
        this.triple = triple;
        this.ultra = ultra;
    }

    public MiddleResult(RemoteResult<T> result, FIRST first, SECOND second, TRIPLE triple, ULTRA ultra, PENTA penta) {
        this.result = result;
        this.first = first;
        this.second = second;
        this.triple = triple;
        this.ultra = ultra;
        this.penta = penta;
    }


    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillRes(RemoteResult<T> result){
        this.setResult(result);
        return this;
    }

    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillFirst(FIRST f){
        this.setFirst(f);
        return this;
    }

    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillSecond(SECOND s){
        this.setSecond(s);
        return this;
    }

    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillTriple(TRIPLE t){
        this.setTriple(t);
        return this;
    }

    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillUltra(ULTRA u){
        this.setUltra(u);
        return this;
    }

    public MiddleResult<T, FIRST, SECOND, TRIPLE, ULTRA, PENTA> fillPenta(PENTA p){
        this.setPenta(p);
        return this;
    }


    public RemoteResult<T> getResult() {
        return result;
    }

    public void setResult(RemoteResult<T> result) {
        this.result = result;
    }

    public FIRST getFirst() {
        return first;
    }

    public void setFirst(FIRST first) {
        this.first = first;
    }

    public SECOND getSecond() {
        return second;
    }

    public void setSecond(SECOND second) {
        this.second = second;
    }

    public TRIPLE getTriple() {
        return triple;
    }

    public void setTriple(TRIPLE triple) {
        this.triple = triple;
    }

    public ULTRA getUltra() {
        return ultra;
    }

    public void setUltra(ULTRA ultra) {
        this.ultra = ultra;
    }

    public PENTA getPenta() {
        return penta;
    }

    public void setPenta(PENTA penta) {
        this.penta = penta;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MiddleResult{");
        sb.append("result=").append(result);
        sb.append(", first=").append(first);
        sb.append(", second=").append(second);
        sb.append(", triple=").append(triple);
        sb.append(", ultra=").append(ultra);
        sb.append(", penta=").append(penta);
        sb.append('}');
        return sb.toString();
    }

}
