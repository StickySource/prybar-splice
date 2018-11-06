package net.stickycode.prybar.splice;

import javax.inject.Inject;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;
import net.stickycode.stereotype.StickyComponent;

@StickyComponent
public class SingleFieldExample
    implements PrybarComponent {

  @Inject
  private PlaceHolder component;

  @Override
  public void wire(PrybarRuntime prybar) {
    this.component = prybar.require(new PrybarComponentLookup(this, PlaceHolder.class, "component"));
  }

}