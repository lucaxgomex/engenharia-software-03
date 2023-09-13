public interface AnimationInterface<GenericValue> {
  public boolean isTheStartOfANewAnimationSet(GenericValue... key);

  public void incrementAnimationViewCount(GenericValue key); 

  public long getCount(GenericValue key);

  public void reset(GenericValue key);

  public void saveDuration(GenericValue... key);

  public long getCurrentDuration(GenericValue... key);
}
