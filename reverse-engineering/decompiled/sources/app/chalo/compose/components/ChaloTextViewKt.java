package app.chalo.compose.components;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.text.ChaloTextViewStateKt;
import app.chalo.uistate.text.TextStyleMapper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextStyle;
import defpackage.im;
import defpackage.u;
import defpackage.uc;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextViewKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:105:0x0168  */
    /* JADX WARN: Code duplicated, block: B:111:0x0174  */
    /* JADX WARN: Code duplicated, block: B:112:0x0176  */
    /* JADX WARN: Code duplicated, block: B:115:0x017b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01da  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x0202  */
    /* JADX WARN: Code duplicated, block: B:146:0x0208  */
    /* JADX WARN: Code duplicated, block: B:148:0x0213  */
    /* JADX WARN: Code duplicated, block: B:151:0x023d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0244  */
    /* JADX WARN: Code duplicated, block: B:156:0x0252  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[PHI: r3 r6 r8
      0x00a9: PHI (r3v8 androidx.compose.ui.Modifier) = (r3v4 androidx.compose.ui.Modifier), (r3v10 androidx.compose.ui.Modifier) binds: [B:66:0x00be, B:56:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v11 androidx.compose.foundation.interaction.MutableInteractionSource) = 
      (r6v7 androidx.compose.foundation.interaction.MutableInteractionSource)
      (r6v12 androidx.compose.foundation.interaction.MutableInteractionSource)
     binds: [B:66:0x00be, B:56:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r8v18 int) = (r8v5 int), (r8v19 int) binds: [B:66:0x00be, B:56:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128  */
    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x013f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    public static final void a(Modifier modifier, TextUIState.ChaloTextUIState state, MutableInteractionSource mutableInteractionSource, Indication indication, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        MutableInteractionSource mutableInteractionSource2;
        Object obj;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        Object obj2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSourceB;
        int i4;
        Object obj3;
        UITextStyle textStyle;
        Typography typographyE;
        TextStyle displayLarge;
        TextStyle textStyle2;
        int i5;
        boolean z2;
        Object objRememberedValue;
        boolean z3;
        boolean z4;
        Object objRememberedValue2;
        ChaloColorToken chaloColorToken;
        long jM4641getUnspecified0d7_KjU;
        UITextAlign uITextAlign;
        TextAlign textAlignM7161boximpl;
        UIFontWeight uIFontWeight;
        FontWeight fontWeightC;
        Integer num;
        long jM6771getFontSizeXSAIIZE;
        UIFontStyle uIFontStyle;
        FontStyle fontStyleM6850boximpl;
        int i6;
        int iM6860getNormal_LCdwA;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-34887825);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                int i8 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
                i3 |= i8;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            i3 |= i8;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                obj = indication;
                i3 |= composerStartRestartGroup.changed(obj) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                        i3 &= -897;
                    } else {
                        mutableInteractionSourceB = mutableInteractionSource2;
                    }
                    i4 = i3;
                    if (i9 != 0) {
                        obj3 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-34887825, i4, -1, "app.chalo.compose.components.ChaloTextView (ChaloTextView.kt:25)");
                    }
                    textStyle = state.c;
                    Intrinsics.i(textStyle, "textStyle");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1222094540, 48, -1, "app.chalo.uistate.text.TextStyleMapper.map (TextStyleMapper.kt:8)");
                    }
                    typographyE = ChaloTheme.e(composerStartRestartGroup, 6);
                    switch (TextStyleMapper.WhenMappings.f10087a[textStyle.ordinal()]) {
                        case 1:
                            displayLarge = typographyE.getDisplayLarge();
                            break;
                        case 2:
                            displayLarge = typographyE.getDisplayMedium();
                            break;
                        case 3:
                            displayLarge = typographyE.getDisplaySmall();
                            break;
                        case 4:
                            displayLarge = typographyE.getHeadlineMedium();
                            break;
                        case 5:
                            displayLarge = typographyE.getHeadlineSmall();
                            break;
                        case 6:
                            displayLarge = typographyE.getTitleLarge();
                            break;
                        case 7:
                            displayLarge = typographyE.getBodyLarge();
                            break;
                        case 8:
                            displayLarge = typographyE.getBodyMedium();
                            break;
                        case 9:
                            displayLarge = typographyE.getBodySmall();
                            break;
                        case 10:
                            displayLarge = typographyE.getLabelSmall();
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    textStyle2 = displayLarge;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new im(state, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean z5 = (((i4 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(mutableInteractionSourceB)) || (i4 & 384) == 256;
                    if ((i4 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z3 | z5 | (i5 == 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new u(11, mutableInteractionSourceB, obj3, state);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierC = ComposeUtilsKt.c(modifier4, function0, (Function1) objRememberedValue2);
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSourceB;
                    String str = state.b;
                    chaloColorToken = state.d;
                    if (chaloColorToken != null) {
                        jM4641getUnspecified0d7_KjU = ChaloColorTokenKt.c(chaloColorToken);
                    } else {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    }
                    int i10 = state.e;
                    uITextAlign = state.g;
                    if (uITextAlign != null) {
                        textAlignM7161boximpl = TextAlign.m7161boximpl(ChaloTextViewStateKt.d(uITextAlign));
                    } else {
                        textAlignM7161boximpl = null;
                    }
                    uIFontWeight = state.h;
                    if (uIFontWeight != null) {
                        fontWeightC = ChaloTextViewStateKt.c(uIFontWeight);
                    } else {
                        fontWeightC = null;
                    }
                    num = state.i;
                    if (num != null) {
                        jM6771getFontSizeXSAIIZE = TextUnitKt.getSp(num.intValue());
                    } else {
                        jM6771getFontSizeXSAIIZE = textStyle2.m6771getFontSizeXSAIIZE();
                    }
                    int iB = ChaloTextViewStateKt.b(state.l);
                    TextDecoration textDecorationA = ChaloTextViewStateKt.a(state.k);
                    uIFontStyle = state.m;
                    if (uIFontStyle != null) {
                        i6 = ChaloTextViewStateKt.WhenMappings.e[uIFontStyle.ordinal()];
                        if (i6 == 1) {
                            iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6860getNormal_LCdwA();
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6859getItalic_LCdwA();
                        }
                        fontStyleM6850boximpl = FontStyle.m6850boximpl(iM6860getNormal_LCdwA);
                    } else {
                        fontStyleM6850boximpl = null;
                    }
                    Object obj4 = obj3;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str, modifierC, jM4641getUnspecified0d7_KjU, null, jM6771getFontSizeXSAIIZE, fontStyleM6850boximpl, fontWeightC, null, 0L, textDecorationA, textAlignM7161boximpl, 0L, iB, false, i10, 0, null, textStyle2, composer2, 0, 0, 108936);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                    obj2 = obj4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier4 = modifier2;
                    mutableInteractionSourceB = mutableInteractionSource2;
                    i4 = i3;
                }
                obj3 = obj;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34887825, i4, -1, "app.chalo.compose.components.ChaloTextView (ChaloTextView.kt:25)");
                }
                textStyle = state.c;
                Intrinsics.i(textStyle, "textStyle");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1222094540, 48, -1, "app.chalo.uistate.text.TextStyleMapper.map (TextStyleMapper.kt:8)");
                }
                typographyE = ChaloTheme.e(composerStartRestartGroup, 6);
                switch (TextStyleMapper.WhenMappings.f10087a[textStyle.ordinal()]) {
                    case 1:
                        displayLarge = typographyE.getDisplayLarge();
                        break;
                    case 2:
                        displayLarge = typographyE.getDisplayMedium();
                        break;
                    case 3:
                        displayLarge = typographyE.getDisplaySmall();
                        break;
                    case 4:
                        displayLarge = typographyE.getHeadlineMedium();
                        break;
                    case 5:
                        displayLarge = typographyE.getHeadlineSmall();
                        break;
                    case 6:
                        displayLarge = typographyE.getTitleLarge();
                        break;
                    case 7:
                        displayLarge = typographyE.getBodyLarge();
                        break;
                    case 8:
                        displayLarge = typographyE.getBodyMedium();
                        break;
                    case 9:
                        displayLarge = typographyE.getBodySmall();
                        break;
                    case 10:
                        displayLarge = typographyE.getLabelSmall();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                textStyle2 = displayLarge;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i5 = i4 & 112;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    objRememberedValue = new im(state, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new im(state, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function1 = (Function0) objRememberedValue;
                if (((i4 & 896) ^ 384) <= 256) {
                }
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z5 | (i5 == 32);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4) {
                    objRememberedValue2 = new u(11, mutableInteractionSourceB, obj3, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new u(11, mutableInteractionSourceB, obj3, state);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierC2 = ComposeUtilsKt.c(modifier4, function1, (Function1) objRememberedValue2);
                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSourceB;
                String str2 = state.b;
                chaloColorToken = state.d;
                if (chaloColorToken != null) {
                    jM4641getUnspecified0d7_KjU = ChaloColorTokenKt.c(chaloColorToken);
                } else {
                    jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                }
                int i11 = state.e;
                uITextAlign = state.g;
                if (uITextAlign != null) {
                    textAlignM7161boximpl = TextAlign.m7161boximpl(ChaloTextViewStateKt.d(uITextAlign));
                } else {
                    textAlignM7161boximpl = null;
                }
                uIFontWeight = state.h;
                if (uIFontWeight != null) {
                    fontWeightC = ChaloTextViewStateKt.c(uIFontWeight);
                } else {
                    fontWeightC = null;
                }
                num = state.i;
                if (num != null) {
                    jM6771getFontSizeXSAIIZE = TextUnitKt.getSp(num.intValue());
                } else {
                    jM6771getFontSizeXSAIIZE = textStyle2.m6771getFontSizeXSAIIZE();
                }
                int iB2 = ChaloTextViewStateKt.b(state.l);
                TextDecoration textDecorationA2 = ChaloTextViewStateKt.a(state.k);
                uIFontStyle = state.m;
                if (uIFontStyle != null) {
                    i6 = ChaloTextViewStateKt.WhenMappings.e[uIFontStyle.ordinal()];
                    if (i6 == 1) {
                        iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6860getNormal_LCdwA();
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6859getItalic_LCdwA();
                    }
                    fontStyleM6850boximpl = FontStyle.m6850boximpl(iM6860getNormal_LCdwA);
                } else {
                    fontStyleM6850boximpl = null;
                }
                Object obj5 = obj3;
                composer2 = composerStartRestartGroup;
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, modifierC2, jM4641getUnspecified0d7_KjU, null, jM6771getFontSizeXSAIIZE, fontStyleM6850boximpl, fontWeightC, null, 0L, textDecorationA2, textAlignM7161boximpl, 0L, iB2, false, i11, 0, null, textStyle2, composer2, 0, 0, 108936);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                mutableInteractionSource3 = mutableInteractionSource5;
                obj2 = obj5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                mutableInteractionSource3 = mutableInteractionSource2;
                obj2 = obj;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new uc(modifier3, state, mutableInteractionSource3, obj2, i, i2, 2));
            }
        }
        i3 |= 3072;
        obj = indication;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    i3 &= -897;
                } else {
                    mutableInteractionSourceB = mutableInteractionSource2;
                }
                i4 = i3;
                if (i9 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
            } else {
                if (i7 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
                    i3 &= -897;
                } else {
                    mutableInteractionSourceB = mutableInteractionSource2;
                }
                i4 = i3;
                if (i9 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34887825, i4, -1, "app.chalo.compose.components.ChaloTextView (ChaloTextView.kt:25)");
            }
            textStyle = state.c;
            Intrinsics.i(textStyle, "textStyle");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1222094540, 48, -1, "app.chalo.uistate.text.TextStyleMapper.map (TextStyleMapper.kt:8)");
            }
            typographyE = ChaloTheme.e(composerStartRestartGroup, 6);
            switch (TextStyleMapper.WhenMappings.f10087a[textStyle.ordinal()]) {
                case 1:
                    displayLarge = typographyE.getDisplayLarge();
                    break;
                case 2:
                    displayLarge = typographyE.getDisplayMedium();
                    break;
                case 3:
                    displayLarge = typographyE.getDisplaySmall();
                    break;
                case 4:
                    displayLarge = typographyE.getHeadlineMedium();
                    break;
                case 5:
                    displayLarge = typographyE.getHeadlineSmall();
                    break;
                case 6:
                    displayLarge = typographyE.getTitleLarge();
                    break;
                case 7:
                    displayLarge = typographyE.getBodyLarge();
                    break;
                case 8:
                    displayLarge = typographyE.getBodyMedium();
                    break;
                case 9:
                    displayLarge = typographyE.getBodySmall();
                    break;
                case 10:
                    displayLarge = typographyE.getLabelSmall();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            textStyle2 = displayLarge;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i5 = i4 & 112;
            if (i5 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue = new im(state, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new im(state, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function2 = (Function0) objRememberedValue;
            if (((i4 & 896) ^ 384) <= 256) {
            }
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | z5 | (i5 == 32);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4) {
                objRememberedValue2 = new u(11, mutableInteractionSourceB, obj3, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new u(11, mutableInteractionSourceB, obj3, state);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC3 = ComposeUtilsKt.c(modifier4, function2, (Function1) objRememberedValue2);
            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSourceB;
            String str3 = state.b;
            chaloColorToken = state.d;
            if (chaloColorToken != null) {
                jM4641getUnspecified0d7_KjU = ChaloColorTokenKt.c(chaloColorToken);
            } else {
                jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
            }
            int i12 = state.e;
            uITextAlign = state.g;
            if (uITextAlign != null) {
                textAlignM7161boximpl = TextAlign.m7161boximpl(ChaloTextViewStateKt.d(uITextAlign));
            } else {
                textAlignM7161boximpl = null;
            }
            uIFontWeight = state.h;
            if (uIFontWeight != null) {
                fontWeightC = ChaloTextViewStateKt.c(uIFontWeight);
            } else {
                fontWeightC = null;
            }
            num = state.i;
            if (num != null) {
                jM6771getFontSizeXSAIIZE = TextUnitKt.getSp(num.intValue());
            } else {
                jM6771getFontSizeXSAIIZE = textStyle2.m6771getFontSizeXSAIIZE();
            }
            int iB3 = ChaloTextViewStateKt.b(state.l);
            TextDecoration textDecorationA3 = ChaloTextViewStateKt.a(state.k);
            uIFontStyle = state.m;
            if (uIFontStyle != null) {
                i6 = ChaloTextViewStateKt.WhenMappings.e[uIFontStyle.ordinal()];
                if (i6 == 1) {
                    iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6860getNormal_LCdwA();
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iM6860getNormal_LCdwA = FontStyle.INSTANCE.m6859getItalic_LCdwA();
                }
                fontStyleM6850boximpl = FontStyle.m6850boximpl(iM6860getNormal_LCdwA);
            } else {
                fontStyleM6850boximpl = null;
            }
            Object obj6 = obj3;
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(str3, modifierC3, jM4641getUnspecified0d7_KjU, null, jM6771getFontSizeXSAIIZE, fontStyleM6850boximpl, fontWeightC, null, 0L, textDecorationA3, textAlignM7161boximpl, 0L, iB3, false, i12, 0, null, textStyle2, composer2, 0, 0, 108936);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            mutableInteractionSource3 = mutableInteractionSource6;
            obj2 = obj6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            mutableInteractionSource3 = mutableInteractionSource2;
            obj2 = obj;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(modifier3, state, mutableInteractionSource3, obj2, i, i2, 2));
        }
    }
}
