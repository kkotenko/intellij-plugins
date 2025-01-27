// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.intellij.terraform.hcl;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.openapi.util.text.StringUtil;
import java.util.EnumSet;
import static org.intellij.terraform.hcl.HCLElementTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

@SuppressWarnings({"ALL"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>HCLLexer.flex</tt>
 */
public class _HCLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int D_STRING = 2;
  public static final int S_STRING = 4;
  public static final int HIL_EXPRESSION = 6;
  public static final int S_HEREDOC_MARKER = 8;
  public static final int S_HEREDOC_LINE = 10;
  public static final int S_HEREDOC_LINE_END = 12;
  public static final int HIL_EXPRESSION_STRING = 14;
  public static final int TEMPLATE_EXPRESSION = 16;
  public static final int TEMPLATE_EXPRESSION_STRING = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 14272 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\2\11\1\14\1\36\3\11\1\37\10\11\1\40\1\41\5\14\1\42\1\43"+
    "\11\11\1\44\2\11\1\45\5\11\1\46\4\11\1\47\1\50\4\11\51\14\1\51\3\14\1\52\1"+
    "\53\4\14\1\54\12\11\1\55\u0381\11");

  /* The ZZ_CMAP_Y table has 2944 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\1\1\10\1\11\1\12\1\13\1\12\1\13\34\12\1"+
    "\14\1\15\1\16\10\1\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\23\12\12\1\24\1\12"+
    "\1\25\1\24\1\12\1\26\4\1\1\12\1\27\1\30\2\1\2\12\1\27\1\1\1\31\1\24\5\12\1"+
    "\32\1\33\1\34\1\1\1\35\1\12\1\1\1\36\5\12\1\37\1\40\1\41\1\12\1\27\1\42\1"+
    "\12\1\43\1\44\1\1\1\12\1\45\4\1\1\12\1\46\4\1\1\47\2\12\1\50\1\1\1\51\1\52"+
    "\1\24\1\53\1\54\1\55\1\56\1\57\1\60\1\52\1\15\1\61\1\54\1\55\1\62\1\1\1\63"+
    "\1\64\1\65\1\66\1\21\1\55\1\67\1\1\1\70\1\52\1\71\1\72\1\54\1\55\1\67\1\1"+
    "\1\60\1\52\1\40\1\73\1\74\1\75\1\76\1\1\1\70\1\64\1\1\1\77\1\35\1\55\1\50"+
    "\1\1\1\100\1\52\1\1\1\101\1\35\1\55\1\102\1\1\1\57\1\52\1\103\1\77\1\35\1"+
    "\12\1\104\1\57\1\105\1\52\1\106\1\107\1\110\1\12\1\111\1\112\1\1\1\64\1\1"+
    "\1\24\2\12\1\113\1\112\1\114\2\1\1\115\1\116\1\117\1\120\1\121\1\122\2\1\1"+
    "\70\1\1\1\114\1\1\1\123\1\12\1\124\1\1\1\125\7\1\2\12\1\27\1\126\1\114\1\127"+
    "\1\130\1\131\1\132\1\114\2\12\1\133\2\12\1\134\24\12\1\135\1\136\2\12\1\135"+
    "\2\12\1\137\1\140\1\13\3\12\1\140\3\12\1\27\2\1\1\12\1\1\5\12\1\141\1\24\45"+
    "\12\1\142\1\12\1\24\1\27\4\12\1\27\1\143\1\144\1\15\1\12\1\15\1\12\1\15\1"+
    "\144\1\70\3\12\1\145\1\1\1\146\1\114\2\1\1\114\5\12\1\26\1\147\1\12\1\150"+
    "\4\12\1\37\1\12\1\151\2\1\1\64\1\12\1\152\1\153\2\12\1\154\1\12\1\76\1\114"+
    "\2\1\1\12\1\112\3\12\1\153\2\1\2\114\1\155\5\1\1\107\2\12\1\145\1\156\1\114"+
    "\2\1\1\157\1\12\1\160\1\41\2\12\1\37\1\1\2\12\1\145\1\1\1\161\1\41\1\12\1"+
    "\152\1\45\5\1\1\162\1\163\14\12\4\1\21\12\1\141\2\12\1\141\1\164\1\12\1\152"+
    "\3\12\1\165\1\166\1\167\1\124\1\166\7\1\1\170\1\1\1\124\6\1\1\171\1\172\1"+
    "\173\1\174\1\175\3\1\1\176\147\1\2\12\1\151\2\12\1\151\10\12\1\177\1\200\2"+
    "\12\1\133\3\12\1\201\1\1\1\12\1\112\4\202\4\1\1\126\35\1\1\203\2\1\1\204\1"+
    "\24\4\12\1\205\1\24\4\12\1\134\1\107\1\12\1\152\1\24\4\12\1\151\1\1\1\12\1"+
    "\27\3\1\1\12\40\1\133\12\1\37\4\1\135\12\1\37\2\1\10\12\1\124\4\1\2\12\1\152"+
    "\20\12\1\124\1\12\1\206\1\1\2\12\1\151\1\126\1\12\1\152\4\12\1\37\2\1\1\207"+
    "\1\210\5\12\1\211\1\12\1\151\1\26\3\1\1\207\1\212\1\12\1\30\1\1\3\12\1\145"+
    "\1\210\2\12\1\145\1\1\1\114\1\1\1\213\1\41\1\12\1\37\1\12\1\112\1\1\1\12\1"+
    "\124\1\47\2\12\1\30\1\126\1\114\1\214\1\215\2\12\1\45\1\1\1\216\1\114\1\12"+
    "\1\217\3\12\1\220\1\221\1\222\1\27\1\65\1\223\1\224\1\202\2\12\1\134\1\37"+
    "\7\12\1\30\1\114\72\12\1\145\1\12\1\225\2\12\1\154\20\1\26\12\1\152\6\12\1"+
    "\76\2\1\1\112\1\226\1\55\1\227\1\230\6\12\1\15\1\1\1\157\25\12\1\152\1\1\4"+
    "\12\1\210\2\12\1\26\2\1\1\154\7\1\1\214\7\12\1\124\1\1\1\114\1\24\1\27\1\24"+
    "\1\27\1\231\4\12\1\151\1\232\1\233\2\1\1\234\1\12\1\13\1\235\2\152\2\1\7\12"+
    "\1\27\30\1\1\12\1\124\3\12\1\70\2\1\2\12\1\1\1\12\1\236\2\12\1\37\1\12\1\152"+
    "\2\12\1\237\3\1\11\12\1\152\1\114\2\12\1\237\1\12\1\154\2\12\1\26\3\12\1\145"+
    "\11\1\23\12\1\112\1\12\1\37\1\26\11\1\1\240\2\12\1\241\1\12\1\37\1\12\1\112"+
    "\1\12\1\151\4\1\1\12\1\242\1\12\1\37\1\12\1\76\4\1\3\12\1\243\4\1\1\70\1\244"+
    "\1\12\1\145\2\1\1\12\1\124\1\12\1\124\2\1\1\123\1\12\1\153\1\1\3\12\1\37\1"+
    "\12\1\37\1\12\1\30\1\12\1\15\6\1\4\12\1\45\3\1\3\12\1\30\3\12\1\30\60\1\1"+
    "\157\2\12\1\26\2\1\1\64\1\1\1\157\2\12\2\1\1\12\1\45\1\114\1\157\1\12\1\112"+
    "\1\64\1\1\2\12\1\245\1\157\2\12\1\30\1\246\1\247\2\1\1\12\1\21\1\154\5\1\1"+
    "\250\1\251\1\45\2\12\1\151\1\1\1\114\1\72\1\54\1\55\1\67\1\1\1\252\1\15\11"+
    "\1\3\12\1\153\1\253\1\114\2\1\3\12\1\1\1\254\1\114\12\1\2\12\1\151\2\1\1\255"+
    "\2\1\3\12\1\1\1\256\1\114\2\1\2\12\1\27\1\1\1\114\3\1\1\12\1\76\1\1\1\114"+
    "\26\1\4\12\1\114\1\126\34\1\3\12\1\45\20\1\1\55\1\12\1\151\1\1\1\70\1\114"+
    "\1\1\1\210\1\12\67\1\71\12\1\76\16\1\14\12\1\145\53\1\2\12\1\151\75\1\44\12"+
    "\1\112\33\1\43\12\1\45\1\12\1\151\1\114\6\1\1\12\1\152\1\1\3\12\1\1\1\145"+
    "\1\114\1\157\1\257\1\12\67\1\4\12\1\153\1\70\3\1\1\157\4\1\1\70\1\1\76\12"+
    "\1\124\1\1\57\12\1\30\20\1\1\15\77\1\6\12\1\27\1\124\1\45\1\76\66\1\5\12\1"+
    "\214\3\12\1\144\1\260\1\261\1\262\3\12\1\263\1\264\1\12\1\265\1\266\1\35\24"+
    "\12\1\267\1\12\1\35\1\134\1\12\1\134\1\12\1\214\1\12\1\214\1\151\1\12\1\151"+
    "\1\12\1\55\1\12\1\55\1\12\1\270\3\271\14\12\1\153\3\1\4\12\1\145\1\114\112"+
    "\1\1\262\1\12\1\272\1\273\1\274\1\275\1\276\1\277\1\300\1\154\1\301\1\154"+
    "\24\1\55\12\1\112\2\1\103\12\1\153\15\12\1\152\150\12\1\15\25\1\41\12\1\152"+
    "\36\1");

  /* The ZZ_CMAP_A table has 3104 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\37\1\31\1\5\1\21\1\25\1\42\1\27\1\32"+
    "\1\33\1\6\1\15\1\36\1\7\1\16\1\4\1\11\11\10\1\44\1\0\1\26\1\40\1\41\1\45\1"+
    "\0\4\13\1\14\1\13\21\20\1\12\2\20\1\34\1\30\1\35\1\0\1\20\1\0\1\53\3\13\1"+
    "\51\1\52\5\20\1\54\1\20\1\56\3\20\1\47\1\55\1\46\1\50\2\20\1\12\2\20\1\22"+
    "\1\43\1\24\1\23\13\0\1\20\12\0\1\20\4\0\1\20\5\0\27\20\1\0\12\20\4\0\14\20"+
    "\16\0\5\20\7\0\1\20\1\0\1\20\1\0\5\20\1\0\2\20\2\0\4\20\1\0\1\20\6\0\1\20"+
    "\1\0\3\20\1\0\1\20\1\0\4\20\1\0\23\20\1\0\13\20\10\0\6\20\1\0\26\20\2\0\1"+
    "\20\6\0\10\20\10\0\13\20\5\0\3\20\15\0\12\17\4\0\6\20\1\0\1\20\17\0\2\20\7"+
    "\0\2\20\12\17\3\20\2\0\2\20\1\0\16\20\15\0\11\20\13\0\1\20\16\0\12\17\6\20"+
    "\4\0\2\20\4\0\1\20\5\0\6\20\4\0\1\20\11\0\1\20\3\0\1\20\7\0\11\20\7\0\5\20"+
    "\1\0\10\20\6\0\26\20\3\0\1\20\2\0\1\20\7\0\12\20\4\0\12\17\1\20\4\0\10\20"+
    "\2\0\2\20\2\0\26\20\1\0\7\20\1\0\1\20\3\0\4\20\3\0\1\20\20\0\1\20\15\0\2\20"+
    "\1\0\1\20\5\0\6\20\4\0\2\20\1\0\2\20\1\0\2\20\1\0\2\20\17\0\4\20\1\0\1\20"+
    "\7\0\12\17\2\0\3\20\20\0\11\20\1\0\2\20\1\0\2\20\1\0\5\20\3\0\1\20\2\0\1\20"+
    "\30\0\1\20\13\0\10\20\2\0\1\20\3\0\1\20\1\0\6\20\3\0\3\20\1\0\4\20\3\0\2\20"+
    "\1\0\1\20\1\0\2\20\3\0\2\20\3\0\3\20\3\0\14\20\13\0\10\20\1\0\2\20\10\0\3"+
    "\20\5\0\1\20\4\0\10\20\1\0\6\20\1\0\5\20\3\0\1\20\3\0\2\20\15\0\13\20\2\0"+
    "\1\20\6\0\3\20\10\0\1\20\12\0\6\20\5\0\22\20\3\0\10\20\1\0\11\20\1\0\1\20"+
    "\2\0\7\20\11\0\1\20\1\0\2\20\14\0\12\17\7\0\2\20\1\0\1\20\2\0\2\20\1\0\1\20"+
    "\2\0\1\20\6\0\4\20\1\0\7\20\1\0\3\20\1\0\1\20\1\0\1\20\2\0\2\20\1\0\4\20\1"+
    "\0\2\20\11\0\1\20\2\0\5\20\1\0\1\20\11\0\12\17\2\0\14\20\1\0\24\20\13\0\5"+
    "\20\22\0\7\20\4\0\4\20\3\0\1\20\3\0\2\20\7\0\3\20\4\0\15\20\14\0\1\20\1\0"+
    "\6\20\1\0\1\20\5\0\1\20\2\0\13\20\1\0\15\20\1\0\4\20\2\0\7\20\1\0\1\20\1\0"+
    "\4\20\2\0\1\20\1\0\4\20\2\0\7\20\1\0\1\20\1\0\4\20\2\0\16\20\2\0\6\20\2\0"+
    "\15\20\2\0\1\20\1\0\10\20\7\0\15\20\1\0\6\20\23\0\1\20\4\0\1\20\3\0\5\20\2"+
    "\0\22\20\1\0\1\20\5\0\17\20\1\0\16\20\2\0\5\20\13\0\14\20\13\0\1\20\15\0\7"+
    "\20\7\0\16\20\15\0\2\20\12\17\3\0\3\20\11\0\4\20\1\0\4\20\3\0\2\20\11\0\10"+
    "\20\1\0\1\20\1\0\1\20\1\0\1\20\1\0\6\20\1\0\7\20\1\0\1\20\3\0\3\20\1\0\7\20"+
    "\3\0\4\20\2\0\6\20\5\0\1\20\15\0\1\20\2\0\1\20\4\0\1\20\2\0\12\20\1\0\1\20"+
    "\3\0\5\20\6\0\1\20\1\0\1\20\1\0\1\20\1\0\4\20\1\0\13\20\2\0\4\20\5\0\5\20"+
    "\4\0\1\20\4\0\2\20\13\0\5\20\6\0\4\20\3\0\2\20\14\0\10\20\7\0\10\20\1\0\7"+
    "\20\6\0\2\20\12\0\5\20\5\0\2\20\3\0\7\20\6\0\3\20\12\17\2\20\13\0\11\20\2"+
    "\0\27\20\2\0\7\20\1\0\3\20\1\0\4\20\1\0\4\20\2\0\6\20\3\0\1\20\1\0\1\20\2"+
    "\0\5\20\1\0\12\20\12\17\5\20\1\0\3\20\1\0\10\20\4\0\7\20\3\0\1\20\3\0\2\20"+
    "\1\0\1\20\3\0\2\20\2\0\5\20\2\0\1\20\1\0\1\20\30\0\3\20\3\0\6\20\2\0\6\20"+
    "\2\0\6\20\11\0\7\20\4\0\5\20\3\0\5\20\5\0\1\20\1\0\10\20\1\0\5\20\1\0\1\20"+
    "\1\0\2\20\1\0\2\20\1\0\12\20\6\0\12\20\2\0\6\20\2\0\6\20\2\0\6\20\2\0\3\20"+
    "\3\0\14\20\1\0\16\20\1\0\2\20\1\0\2\20\1\0\10\20\6\0\4\20\4\0\16\20\2\0\1"+
    "\20\1\0\14\20\1\0\2\20\3\0\1\20\2\0\4\20\1\0\2\20\12\0\10\20\6\0\6\20\1\0"+
    "\3\20\1\0\12\20\3\0\1\20\12\0\4\20\13\0\12\17\1\20\1\0\1\20\3\0\7\20\1\0\1"+
    "\20\1\0\4\20\1\0\17\20\1\0\2\20\14\0\3\20\7\0\4\20\11\0\2\20\1\0\1\20\20\0"+
    "\4\20\10\0\1\20\13\0\10\20\5\0\3\20\2\0\1\20\2\0\2\20\2\0\4\20\1\0\14\20\1"+
    "\0\1\20\1\0\7\20\1\0\21\20\1\0\4\20\2\0\10\20\1\0\7\20\1\0\14\20\1\0\4\20"+
    "\1\0\5\20\1\0\1\20\3\0\14\20\2\0\13\20\1\0\10\20\2\0\22\17\1\0\2\20\1\0\1"+
    "\20\2\0\1\20\1\0\12\20\1\0\4\20\1\0\1\20\1\0\1\20\6\0\1\20\4\0\1\20\1\0\1"+
    "\20\1\0\1\20\1\0\3\20\1\0\2\20\1\0\1\20\2\0\1\20\1\0\1\20\1\0\1\20\1\0\1\20"+
    "\1\0\1\20\1\0\2\20\1\0\1\20\2\0\4\20\1\0\7\20\1\0\4\20\1\0\4\20\1\0\1\20\1"+
    "\0\12\20\1\0\5\20\1\0\3\20\1\0\5\20\1\0\5\20");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\1\2\1\3\1\4\1\5\1\6\2\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\2\1\1\31\1\32\3\10\1\33\2\34\4\33"+
    "\2\35\2\36\1\33\2\37\3\33\1\40\1\41\1\1"+
    "\1\42\2\43\1\42\1\44\1\45\2\46\2\47\2\33"+
    "\1\50\1\51\1\52\1\53\1\54\1\7\3\0\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\3\10"+
    "\1\0\1\65\2\66\1\67\2\70\1\0\1\71\2\44"+
    "\1\33\1\0\2\7\1\0\1\7\1\72\3\10\1\65"+
    "\1\67\1\71\1\54\1\0\1\73\1\10\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u01d6\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u01d6\0\u034e\0\u01d6\0\u01d6\0\u01d6"+
    "\0\u037d\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6"+
    "\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u01d6\0\u01d6\0\u0497"+
    "\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u01d6\0\u0582\0\u05b1\0\u01d6"+
    "\0\u05e0\0\u060f\0\u01d6\0\u063e\0\u01d6\0\u066d\0\u01d6\0\u060f"+
    "\0\u069c\0\u06cb\0\u06fa\0\u01d6\0\u01d6\0\u0729\0\u01d6\0\u0758"+
    "\0\u01d6\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u01d6\0\u0843\0\u01d6"+
    "\0\u0872\0\u08a1\0\u01d6\0\u01d6\0\u01d6\0\u08d0\0\u08ff\0\u092e"+
    "\0\u095d\0\u098c\0\u09bb\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u01d6"+
    "\0\u01d6\0\u01d6\0\u01d6\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6"+
    "\0\u0ad5\0\u01d6\0\u0b04\0\u0b33\0\u01d6\0\u0b62\0\u0b91\0\u0bc0"+
    "\0\u01d6\0\u0bef\0\u0c1e\0\u0c4d\0\u095d\0\u0c7c\0\u098c\0\u01d6"+
    "\0\u0cab\0\u0cda\0\u0d09\0\u01d6\0\u01d6\0\u01d6\0\u01d6\0\u0c4d"+
    "\0\u031f\0\u0d38\0\u031f\0\u031f";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\3\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\3\23\1\24\1\25\1\13\1\23\1\13\1\26\1\13"+
    "\1\27\1\30\1\31\1\32\1\13\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\3\23\1\51\3\23\1\52\1\53"+
    "\1\54\1\55\16\53\1\56\1\57\1\53\1\60\1\61"+
    "\1\53\1\60\1\62\1\63\26\53\1\64\1\65\16\53"+
    "\1\56\1\66\1\53\1\60\1\61\1\53\1\67\1\70"+
    "\1\60\25\53\21\71\1\72\1\60\1\73\1\74\1\60"+
    "\1\71\1\75\1\76\1\75\25\71\1\77\1\100\1\101"+
    "\4\77\1\102\5\103\2\77\2\103\25\77\11\103\1\104"+
    "\1\105\1\106\54\104\1\13\1\107\1\110\54\13\21\71"+
    "\1\111\1\60\1\112\1\60\1\111\1\71\1\113\1\76"+
    "\1\113\46\71\2\60\1\73\1\74\1\72\1\71\1\114"+
    "\1\76\1\114\46\71\1\111\1\60\1\112\1\60\1\111"+
    "\1\71\1\115\1\76\1\115\25\71\60\0\3\14\57\0"+
    "\1\116\1\0\1\117\50\0\1\16\2\0\54\16\10\0"+
    "\1\21\1\22\55\0\2\21\2\0\1\120\1\0\1\121"+
    "\32\0\1\120\15\0\2\21\1\122\1\0\1\120\1\0"+
    "\1\121\32\0\1\120\14\0\6\23\2\0\2\23\25\0"+
    "\11\23\16\0\1\123\66\0\1\124\11\0\1\125\56\0"+
    "\1\126\56\0\1\127\1\130\55\0\1\131\60\0\1\132"+
    "\57\0\1\133\22\0\6\23\2\0\2\23\25\0\1\23"+
    "\1\134\7\23\7\0\6\23\2\0\2\23\25\0\5\23"+
    "\1\135\3\23\7\0\6\23\2\0\2\23\25\0\2\23"+
    "\1\136\6\23\1\53\2\0\16\53\2\0\1\53\2\0"+
    "\1\53\1\0\1\137\1\0\25\53\2\0\1\55\76\0"+
    "\1\140\35\0\1\141\1\142\76\0\1\143\34\0\1\53"+
    "\2\0\25\53\1\60\26\53\2\0\1\65\55\0\1\144"+
    "\1\145\54\0\21\71\2\0\1\71\2\0\1\71\1\0"+
    "\1\146\1\0\25\71\22\0\1\147\34\0\21\71\2\0"+
    "\1\71\1\74\1\0\1\71\1\0\1\146\1\0\26\71"+
    "\2\0\24\71\1\60\1\71\1\60\25\71\2\0\1\101"+
    "\64\0\5\103\2\0\2\103\25\0\11\103\1\0\1\150"+
    "\1\151\5\0\5\103\2\0\2\103\25\0\11\103\1\104"+
    "\2\0\54\104\2\0\1\106\56\0\1\110\76\0\1\152"+
    "\34\0\21\71\2\0\1\71\1\60\1\0\1\71\1\0"+
    "\1\146\1\0\25\71\1\116\2\0\54\116\6\117\1\153"+
    "\50\117\7\0\3\154\3\0\1\154\51\0\2\155\2\0"+
    "\1\156\34\0\1\156\15\0\2\157\1\0\2\157\34\0"+
    "\3\157\21\0\1\160\47\0\6\23\2\0\2\23\25\0"+
    "\2\23\1\161\6\23\7\0\6\23\2\0\2\23\25\0"+
    "\6\23\1\162\2\23\7\0\6\23\2\0\2\23\25\0"+
    "\6\23\1\163\2\23\1\53\2\0\25\53\1\0\26\53"+
    "\23\0\1\164\35\0\1\142\77\0\1\165\35\0\1\145"+
    "\54\0\1\71\2\0\24\71\1\0\1\71\1\0\25\71"+
    "\23\0\1\166\35\0\1\151\77\0\1\60\33\0\4\117"+
    "\1\167\1\117\1\153\50\117\10\0\2\154\54\0\1\170"+
    "\2\154\3\0\1\170\50\0\6\23\2\0\2\23\25\0"+
    "\3\23\1\171\5\23\7\0\6\23\2\0\2\23\25\0"+
    "\7\23\1\172\1\23\7\0\6\23\2\0\2\23\25\0"+
    "\6\23\1\173\2\23\7\0\6\23\2\0\2\23\25\0"+
    "\3\23\1\174\5\23";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3431];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\1\11\3\1\1\11\4\1\1\11\1\1\3\11"+
    "\1\1\7\11\5\1\2\11\5\1\1\11\2\1\1\11"+
    "\2\1\1\11\1\1\1\11\1\1\1\11\4\1\2\11"+
    "\1\1\1\11\1\1\1\11\4\1\1\11\1\1\1\11"+
    "\2\1\3\11\3\1\3\0\10\11\3\1\1\0\2\1"+
    "\1\11\2\1\1\11\1\0\2\1\1\11\1\1\1\0"+
    "\2\1\1\0\1\1\1\11\3\1\4\11\1\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  // This parameters can be getted from capabilities
    private boolean withInterpolationLanguage;

    public _HCLLexer(EnumSet<HCLCapability> capabilities) {
      this((java.io.Reader)null);
      this.withInterpolationLanguage = capabilities.contains(HCLCapability.INTERPOLATION_LANGUAGE);
    }
    enum StringType {
      None, SingleQ, DoubleQ
    }
  // State data
    StringType stringType = StringType.None;
    int stringStart = -1;
    int hil = 0;
    int myHereDocMarkerLength = 0;
    int myHereDocMarkerWeakHash = 0;
    boolean myHereDocIndented = false;
    char myILStringChar;

    private void hil_inc() {
      hil++;
    }
    private int hil_dec() {
      assert hil > 0;
      hil--;
      return hil;
    }
    private void push_eol() {
      yypushback(getEOLLength());
    }
    private int getEOLLength() {
      if (yylength() == 0) return 0;
      char last = yycharat(yylength() - 1);
      if (last != '\r' && last != '\n') return 0;
      if ((yylength() > 1) && yycharat(yylength() - 2) == '\r') return 2;
      return 1;
    }
    private IElementType eods() {
      yybegin(YYINITIAL); stringType = StringType.None; zzStartRead = stringStart; return DOUBLE_QUOTED_STRING;
    }
    private IElementType eoss() {
      yybegin(YYINITIAL); stringType = StringType.None; zzStartRead = stringStart; return SINGLE_QUOTED_STRING;
    }
    private IElementType eoil() {
      hil=0; return stringType == StringType.SingleQ ? eoss(): eods();
    }
    private void setHereDocMarker(CharSequence marker) {
      myHereDocIndented = true; // Temprorarly set to true see #30
      int length = marker.length();
      String value = marker.toString();
      assert(length > 0);
      if (marker.charAt(0) == '-') {
        assert(length > 1);
        // Indented heredoc
        myHereDocIndented = true;
        length--;
        value = value.substring(1);
      }
      myHereDocMarkerLength = length & 0xFF;
      int hash = value.hashCode();
      myHereDocMarkerWeakHash = hash & 0xFFFF;
    }
    private void resetHereDocMarker() {
      myHereDocMarkerLength = 0;
      myHereDocMarkerWeakHash = 0;
    }
    private boolean isHereDocMarkerDefined() {
      return myHereDocMarkerLength != 0 && myHereDocMarkerWeakHash != 0;
    }
    private boolean isHereDocMarker(CharSequence input) {
      if (myHereDocIndented) input = StringUtil.trimLeading(input);
      if ((input.length() & 0xFF) != myHereDocMarkerLength) return false;
      int hash = input.toString().hashCode();
      return myHereDocMarkerWeakHash == (hash & 0xFFFF);
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HCLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case D_STRING: {
              return eods();
            }  // fall though
            case 125: break;
            case S_STRING: {
              return eoss();
            }  // fall though
            case 126: break;
            case HIL_EXPRESSION: {
              return eoil();
            }  // fall though
            case 127: break;
            case S_HEREDOC_MARKER: {
              yybegin(YYINITIAL); return BAD_CHARACTER;
            }  // fall though
            case 128: break;
            case S_HEREDOC_LINE: {
              yybegin(YYINITIAL); return BAD_CHARACTER;
            }  // fall though
            case 129: break;
            case S_HEREDOC_LINE_END: {
              yybegin(YYINITIAL); return BAD_CHARACTER;
            }  // fall though
            case 130: break;
            case HIL_EXPRESSION_STRING: {
              return eoil();
            }  // fall though
            case 131: break;
            case TEMPLATE_EXPRESSION: {
              return eoil();
            }  // fall though
            case 132: break;
            case TEMPLATE_EXPRESSION_STRING: {
              return eoil();
            }  // fall though
            case 133: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 62: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 63: break;
          case 3: 
            { return OP_DIV;
            } 
            // fall through
          case 64: break;
          case 4: 
            { return LINE_HASH_COMMENT;
            } 
            // fall through
          case 65: break;
          case 5: 
            { return OP_MUL;
            } 
            // fall through
          case 66: break;
          case 6: 
            { return OP_MINUS;
            } 
            // fall through
          case 67: break;
          case 7: 
            { return NUMBER;
            } 
            // fall through
          case 68: break;
          case 8: 
            { return ID;
            } 
            // fall through
          case 69: break;
          case 9: 
            { return OP_PLUS;
            } 
            // fall through
          case 70: break;
          case 10: 
            { return OP_DOT;
            } 
            // fall through
          case 71: break;
          case 11: 
            { return L_CURLY;
            } 
            // fall through
          case 72: break;
          case 12: 
            { return R_CURLY;
            } 
            // fall through
          case 73: break;
          case 13: 
            { return OP_MOD;
            } 
            // fall through
          case 74: break;
          case 14: 
            { return OP_LESS;
            } 
            // fall through
          case 75: break;
          case 15: 
            { stringType = StringType.SingleQ; stringStart = zzStartRead; yybegin(S_STRING);
            } 
            // fall through
          case 76: break;
          case 16: 
            { stringType = StringType.DoubleQ; stringStart = zzStartRead; yybegin(D_STRING);
            } 
            // fall through
          case 77: break;
          case 17: 
            { return L_PAREN;
            } 
            // fall through
          case 78: break;
          case 18: 
            { return R_PAREN;
            } 
            // fall through
          case 79: break;
          case 19: 
            { return L_BRACKET;
            } 
            // fall through
          case 80: break;
          case 20: 
            { return R_BRACKET;
            } 
            // fall through
          case 81: break;
          case 21: 
            { return COMMA;
            } 
            // fall through
          case 82: break;
          case 22: 
            { return OP_NOT;
            } 
            // fall through
          case 83: break;
          case 23: 
            { return EQUALS;
            } 
            // fall through
          case 84: break;
          case 24: 
            { return OP_GREATER;
            } 
            // fall through
          case 85: break;
          case 25: 
            { return OP_COLON;
            } 
            // fall through
          case 86: break;
          case 26: 
            { return OP_QUEST;
            } 
            // fall through
          case 87: break;
          case 27: 
            { 
            } 
            // fall through
          case 88: break;
          case 28: 
            { push_eol(); return eods();
            } 
            // fall through
          case 89: break;
          case 29: 
            { return eods();
            } 
            // fall through
          case 90: break;
          case 30: 
            { push_eol(); return eoss();
            } 
            // fall through
          case 91: break;
          case 31: 
            { return eoss();
            } 
            // fall through
          case 92: break;
          case 32: 
            { if (hil_dec() <= 0) yybegin(stringType == StringType.SingleQ ? S_STRING: D_STRING);
            } 
            // fall through
          case 93: break;
          case 33: 
            { myILStringChar=yycharat(yylength() - 1); yybegin(HIL_EXPRESSION_STRING);
            } 
            // fall through
          case 94: break;
          case 34: 
            { if (!isHereDocMarkerDefined()) {
      yybegin(YYINITIAL);
      return BAD_CHARACTER;
    }
    yybegin(S_HEREDOC_LINE);
    return BAD_CHARACTER;
            } 
            // fall through
          case 95: break;
          case 35: 
            { if (!isHereDocMarkerDefined()) {
      yybegin(YYINITIAL);
      return BAD_CHARACTER;
    }
    yybegin(S_HEREDOC_LINE);
    return WHITE_SPACE;
            } 
            // fall through
          case 96: break;
          case 36: 
            { yypushback(getEOLLength());
    setHereDocMarker(yytext());
    return HD_MARKER;
            } 
            // fall through
          case 97: break;
          case 37: 
            { int eol = getEOLLength();
    int len = yylength();
    int len_eff = len - eol;
    assert len_eff >= 0;
    if((len_eff & 0xFF) >= myHereDocMarkerLength
       && isHereDocMarker(yytext().subSequence(0, len_eff))) {
      // End of HereDoc
      yypushback(eol);
      yybegin(YYINITIAL);
      resetHereDocMarker();
      return HD_MARKER;
    } else {
      yybegin(S_HEREDOC_LINE_END);
      return HD_LINE;
    }
            } 
            // fall through
          case 98: break;
          case 38: 
            { yypushback(getEOLLength()); yybegin(S_HEREDOC_LINE_END); return HD_LINE;
            } 
            // fall through
          case 99: break;
          case 39: 
            { yybegin(S_HEREDOC_LINE); return HD_EOL;
            } 
            // fall through
          case 100: break;
          case 40: 
            { if(myILStringChar == yycharat(yylength() - 1)) {yybegin(HIL_EXPRESSION);}
            } 
            // fall through
          case 101: break;
          case 41: 
            { myILStringChar=yycharat(yylength() - 1); yybegin(TEMPLATE_EXPRESSION_STRING);
            } 
            // fall through
          case 102: break;
          case 42: 
            { if(myILStringChar == yycharat(yylength() - 1)) {yybegin(TEMPLATE_EXPRESSION);}
            } 
            // fall through
          case 103: break;
          case 43: 
            { return LINE_C_COMMENT;
            } 
            // fall through
          case 104: break;
          case 44: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 105: break;
          case 45: 
            { yybegin(S_HEREDOC_MARKER); return HD_START;
            } 
            // fall through
          case 106: break;
          case 46: 
            { return OP_LESS_OR_EQUAL;
            } 
            // fall through
          case 107: break;
          case 47: 
            { return OP_NOT_EQUAL;
            } 
            // fall through
          case 108: break;
          case 48: 
            { return OP_EQUAL;
            } 
            // fall through
          case 109: break;
          case 49: 
            { return OP_MAPPING;
            } 
            // fall through
          case 110: break;
          case 50: 
            { return OP_GREATER_OR_EQUAL;
            } 
            // fall through
          case 111: break;
          case 51: 
            { return OP_AND_AND;
            } 
            // fall through
          case 112: break;
          case 52: 
            { return OP_OR_OR;
            } 
            // fall through
          case 113: break;
          case 53: 
            { if (withInterpolationLanguage) {hil_inc(); yybegin(HIL_EXPRESSION);}
            } 
            // fall through
          case 114: break;
          case 54: 
            { push_eol(); yypushback(1); return eods();
            } 
            // fall through
          case 115: break;
          case 55: 
            { if (withInterpolationLanguage) {hil_inc(); yybegin(TEMPLATE_EXPRESSION);}
            } 
            // fall through
          case 116: break;
          case 56: 
            { push_eol(); yypushback(1); return eoss();
            } 
            // fall through
          case 117: break;
          case 57: 
            { hil_inc();
            } 
            // fall through
          case 118: break;
          case 58: 
            { return OP_ELLIPSIS;
            } 
            // fall through
          case 119: break;
          case 59: 
            { return TRUE;
            } 
            // fall through
          case 120: break;
          case 60: 
            { return NULL;
            } 
            // fall through
          case 121: break;
          case 61: 
            { return FALSE;
            } 
            // fall through
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
