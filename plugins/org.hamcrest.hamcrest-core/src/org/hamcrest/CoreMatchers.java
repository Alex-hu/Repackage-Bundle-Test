// Generated source.
package org.hamcrest;

public class CoreMatchers {

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T>... param1) {
    return org.hamcrest.core.AllOf.<T>allOf(param1);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T> p0, org.hamcrest.Matcher<? super T> p1) {
    return org.hamcrest.core.AllOf.<T>allOf(p0, p1);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2) {
    return org.hamcrest.core.AllOf.<T>allOf(p0, p1, p2);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3) {
    return org.hamcrest.core.AllOf.<T>allOf(p0, p1, p2, p3);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3, org.hamcrest.Matcher<? super T> p4) {
    return org.hamcrest.core.AllOf.<T>allOf(p0, p1, p2, p3, p4);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(org.hamcrest.Matcher<? super T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3, org.hamcrest.Matcher<? super T> p4, org.hamcrest.Matcher<? super T> p5) {
    return org.hamcrest.core.AllOf.<T>allOf(p0, p1, p2, p3, p4, p5);
  }

  public static <T> org.hamcrest.Matcher<T> allOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>> p0) {
    return org.hamcrest.core.AllOf.<T>allOf(p0);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0, p1, p2, p3);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T> p0, org.hamcrest.Matcher<? super T> p1) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0, p1);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0, p1, p2);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<? super T>... param1) {
    return org.hamcrest.core.AnyOf.<T>anyOf(param1);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3, org.hamcrest.Matcher<? super T> p4) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0, p1, p2, p3, p4);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(org.hamcrest.Matcher<T> p0, org.hamcrest.Matcher<? super T> p1, org.hamcrest.Matcher<? super T> p2, org.hamcrest.Matcher<? super T> p3, org.hamcrest.Matcher<? super T> p4, org.hamcrest.Matcher<? super T> p5) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0, p1, p2, p3, p4, p5);
  }

  public static <T> org.hamcrest.core.AnyOf<T> anyOf(java.lang.Iterable<org.hamcrest.Matcher<? super T>> p0) {
    return org.hamcrest.core.AnyOf.<T>anyOf(p0);
  }

  public static <LHS> org.hamcrest.core.CombinableMatcher<LHS> both(org.hamcrest.Matcher<? super LHS> p0) {
    return org.hamcrest.core.CombinableMatcher.<LHS>both(p0);
  }

  public static <LHS> org.hamcrest.core.CombinableMatcher<LHS> either(org.hamcrest.Matcher<? super LHS> p0) {
    return org.hamcrest.core.CombinableMatcher.<LHS>either(p0);
  }

  public static <T> org.hamcrest.Matcher<T> describedAs(java.lang.String param1, org.hamcrest.Matcher<T> param2, java.lang.Object... param3) {
    return org.hamcrest.core.DescribedAs.<T>describedAs(param1, param2, param3);
  }

  public static <U> org.hamcrest.Matcher<java.lang.Iterable<U>> everyItem(org.hamcrest.Matcher<U> p0) {
    return org.hamcrest.core.Every.<U>everyItem(p0);
  }

  public static <T> org.hamcrest.Matcher<T> is(org.hamcrest.Matcher<T> p0) {
    return org.hamcrest.core.Is.<T>is(p0);
  }

  public static <T> org.hamcrest.Matcher<T> is(T param1) {
    return org.hamcrest.core.Is.<T>is(param1);
  }

  public static <T> org.hamcrest.Matcher<T> is(java.lang.Class<T> p0) {
    return org.hamcrest.core.Is.<T>is(p0);
  }

  public static <T> org.hamcrest.Matcher<T> isA(java.lang.Class<T> p0) {
    return org.hamcrest.core.Is.<T>isA(p0);
  }

  public static org.hamcrest.Matcher<java.lang.Object> anything() {
    return org.hamcrest.core.IsAnything.anything();
  }

  public static org.hamcrest.Matcher<java.lang.Object> anything(java.lang.String p0) {
    return org.hamcrest.core.IsAnything.anything(p0);
  }

  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(T param1) {
    return org.hamcrest.core.IsCollectionContaining.<T>hasItem(param1);
  }

  public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> hasItem(org.hamcrest.Matcher<? super T> p0) {
    return org.hamcrest.core.IsCollectionContaining.<T>hasItem(p0);
  }

  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(org.hamcrest.Matcher<? super T>... param1) {
    return org.hamcrest.core.IsCollectionContaining.<T>hasItems(param1);
  }

  public static <T> org.hamcrest.Matcher<java.lang.Iterable<T>> hasItems(T... param1) {
    return org.hamcrest.core.IsCollectionContaining.<T>hasItems(param1);
  }

  public static <T> org.hamcrest.Matcher<T> equalTo(T param1) {
    return org.hamcrest.core.IsEqual.<T>equalTo(param1);
  }

  public static <T> org.hamcrest.Matcher<T> any(java.lang.Class<T> p0) {
    return org.hamcrest.core.IsInstanceOf.<T>any(p0);
  }

  public static <T> org.hamcrest.Matcher<T> instanceOf(java.lang.Class<?> p0) {
    return org.hamcrest.core.IsInstanceOf.<T>instanceOf(p0);
  }

  public static <T> org.hamcrest.Matcher<T> not(org.hamcrest.Matcher<T> p0) {
    return org.hamcrest.core.IsNot.<T>not(p0);
  }

  public static <T> org.hamcrest.Matcher<T> not(T param1) {
    return org.hamcrest.core.IsNot.<T>not(param1);
  }

  public static org.hamcrest.Matcher<java.lang.Object> nullValue() {
    return org.hamcrest.core.IsNull.nullValue();
  }

  public static <T> org.hamcrest.Matcher<T> nullValue(java.lang.Class<T> p0) {
    return org.hamcrest.core.IsNull.<T>nullValue(p0);
  }

  public static org.hamcrest.Matcher<java.lang.Object> notNullValue() {
    return org.hamcrest.core.IsNull.notNullValue();
  }

  public static <T> org.hamcrest.Matcher<T> notNullValue(java.lang.Class<T> p0) {
    return org.hamcrest.core.IsNull.<T>notNullValue(p0);
  }

  public static <T> org.hamcrest.Matcher<T> sameInstance(T param1) {
    return org.hamcrest.core.IsSame.<T>sameInstance(param1);
  }

  public static org.hamcrest.Matcher<java.lang.String> containsString(java.lang.String p0) {
    return org.hamcrest.core.StringContains.containsString(p0);
  }

  public static org.hamcrest.Matcher<java.lang.String> startsWith(java.lang.String p0) {
    return org.hamcrest.core.StringStartsWith.startsWith(p0);
  }

  public static org.hamcrest.Matcher<java.lang.String> endsWith(java.lang.String p0) {
    return org.hamcrest.core.StringEndsWith.endsWith(p0);
  }

}
