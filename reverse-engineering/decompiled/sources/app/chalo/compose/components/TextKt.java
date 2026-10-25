package app.chalo.compose.components;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import app.chalo.compose.components.textfields.ChaloExpandingTextKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.text.ChaloTextViewStateKt;
import app.chalo.uistate.text.FlowTextUIState;
import app.chalo.uistate.text.StyledTextClickHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.StyledTextUIStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextStyle;
import defpackage.cg1;
import defpackage.mb1;
import defpackage.pg1;
import defpackage.pk0;
import defpackage.sx0;
import defpackage.uc;
import defpackage.xa1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextKt {
    public static final void a(FlowTextUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-161044393);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161044393, i2, -1, "app.chalo.compose.components.FlowText (Text.kt:54)");
            }
            modifier2 = modifier;
            FlowLayoutKt.FlowRow(modifier2, null, null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(803018194, true, new sx0(state, 29), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(state, modifier2, i, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    public static final void b(Modifier modifier, TextUIState.StyledTextUIState styledTextUIState, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        TextStyle textStyle;
        SpanStyle spanStyle;
        FontWeight fontWeight;
        Intrinsics.i(styledTextUIState, "styledTextUIState");
        UITextAlign uITextAlign = styledTextUIState.c;
        List list = styledTextUIState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(1402041026);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(styledTextUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402041026, i3, -1, "app.chalo.compose.components.Text (Text.kt:97)");
            }
            composerStartRestartGroup.startReplaceGroup(-1258299515);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1258296081);
            List<StyledTextDataUIState> list2 = list;
            for (StyledTextDataUIState styledTextDataUIState : list2) {
                UITextStyle uITextStyle = styledTextDataUIState.d;
                if (uITextStyle == null) {
                    composerStartRestartGroup.startReplaceGroup(1940967089);
                    composerStartRestartGroup.endReplaceGroup();
                    textStyle = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1599956144);
                    TextStyle textStyleF = ChaloThemeKt.f(uITextStyle, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    textStyle = textStyleF;
                }
                if (textStyle == null) {
                    spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null);
                } else {
                    ChaloColorToken chaloColorToken = styledTextDataUIState.b;
                    long jC = chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : textStyle.m6770getColor0d7_KjU();
                    UIFontWeight uIFontWeight = styledTextDataUIState.c;
                    if (uIFontWeight == null || (fontWeight = ChaloTextViewStateKt.c(uIFontWeight)) == null) {
                        fontWeight = textStyle.getFontWeight();
                    }
                    TextStyle textStyleM6753copyp1EtxEg$default = TextStyle.m6753copyp1EtxEg$default(textStyle, jC, 0L, fontWeight, null, null, null, null, 0L, textStyle.m6769getBaselineShift5SSeXJ0(), null, null, textStyle.m6768getBackground0d7_KjU(), ChaloTextViewStateKt.a(styledTextDataUIState.e), null, null, textStyle.m6781getTextAligne0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16738042, null);
                    if (textStyleM6753copyp1EtxEg$default == null || (spanStyle = textStyleM6753copyp1EtxEg$default.toSpanStyle()) == null) {
                        spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null);
                    }
                }
                int iPushStyle = builder.pushStyle(spanStyle);
                try {
                    builder.append(styledTextDataUIState.f10086a);
                    builder.pop(iPushStyle);
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            if (StyledTextUIStateKt.a(styledTextUIState)) {
                String strO = CollectionsKt.O(list2, null, null, null, new mb1(24), 31);
                for (StyledTextDataUIState styledTextDataUIState2 : list2) {
                    StyledTextClickHandler styledTextClickHandler = styledTextDataUIState2.g;
                    String str = styledTextDataUIState2.f10086a;
                    if (styledTextClickHandler != null) {
                        int iD = StringsKt.D(strO, str, 0, false, 6);
                        builder.addStringAnnotation(styledTextClickHandler.getF10085a(), styledTextClickHandler.getF10090a(), iD, str.length() + iD);
                    }
                }
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            if (StyledTextUIStateKt.a(styledTextUIState)) {
                composerStartRestartGroup.startReplaceGroup(-350849220);
                TextStyle textStyle2 = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, ChaloTextViewStateKt.d(uITextAlign), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null);
                boolean zChanged = composerStartRestartGroup.changed(annotatedString) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new pg1(8, styledTextUIState, annotatedString);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ClickableTextKt.m1101ClickableText4YKlhWE(annotatedString, modifier2, textStyle2, false, 0, 0, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 << 3) & 112, 120);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-350019753);
                composer2 = composerStartRestartGroup;
                androidx.compose.material3.TextKt.m2624TextZ58ophY(annotatedString, modifier2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, ChaloTextViewStateKt.b(styledTextUIState.e), false, styledTextUIState.d, 0, null, null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, ChaloTextViewStateKt.d(uITextAlign), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null), composer2, (i3 << 3) & 112, 0, 241660);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xa1(modifier3, styledTextUIState, i, i2, 4));
        }
    }

    public static final void c(TextUIState state, Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, Composer composer, int i, int i2) {
        int i3;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        int i4;
        Intrinsics.i(state, "state");
        String str = state.f10088a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-136457150);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(indication) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                mutableInteractionSource = RippleEffectKt.b(composerStartRestartGroup);
                i4 = i3 & (-897);
                if (i6 != 0) {
                    indication = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i4 = i3 & (-897);
            }
            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Indication indication3 = indication;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-136457150, i4, -1, "app.chalo.compose.components.Text (Text.kt:68)");
            }
            if (state instanceof TextUIState.ChaloTextUIState) {
                composerStartRestartGroup.startReplaceGroup(2139333382);
                ChaloTextViewKt.a(PlotlineComposeWidgetKt.b(modifier, str), (TextUIState.ChaloTextUIState) state, mutableInteractionSource3, indication3, composerStartRestartGroup, ((i4 << 3) & 112) | (i4 & 7168), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (state instanceof TextUIState.ExpandingTextUIState) {
                composerStartRestartGroup.startReplaceGroup(2139626022);
                ChaloExpandingTextKt.c((TextUIState.ExpandingTextUIState) state, PlotlineComposeWidgetKt.b(modifier, str), composerStartRestartGroup, i4 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof TextUIState.StyledTextUIState)) {
                    throw pk0.p(composerStartRestartGroup, 2008672047);
                }
                composerStartRestartGroup.startReplaceGroup(2139823523);
                b(PlotlineComposeWidgetKt.b(modifier, str), (TextUIState.StyledTextUIState) state, composerStartRestartGroup, (i4 << 3) & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource2 = mutableInteractionSource3;
            indication2 = indication3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc((Object) state, modifier2, (Object) mutableInteractionSource2, (Object) indication2, i, i2, 10));
        }
    }
}
