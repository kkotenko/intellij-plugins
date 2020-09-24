package com.intellij.tapestry.psi;

import com.intellij.lexer.XHtmlHighlightingLexer;
import com.intellij.psi.tree.TokenSet;

/**
 * @author Alexey Chmutov
 */
public class TmlHighlightingLexer extends XHtmlHighlightingLexer {

  private static final TokenSet CUSTOM_ATTRIBUTE_TOKENS = TokenSet.create(TelTokenTypes.TAP5_EL_CONTENT);

  public TmlHighlightingLexer() {
    super(TmlLexer.createElAwareXmlLexer());
  }

  @Override
  protected TokenSet createAttributeEmbedmentTokenSet() {
    return TokenSet.orSet(super.createAttributeEmbedmentTokenSet(), CUSTOM_ATTRIBUTE_TOKENS);
  }
}

