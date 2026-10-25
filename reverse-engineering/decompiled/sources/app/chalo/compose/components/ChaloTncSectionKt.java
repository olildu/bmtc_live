package app.chalo.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.gb;
import defpackage.h0;
import defpackage.jb;
import defpackage.pk0;
import defpackage.wl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTncSectionKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onTncTextClicked) {
        Modifier modifier2;
        Intrinsics.i(onTncTextClicked, "onTncTextClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1644520403);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTncTextClicked) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1644520403, i2, -1, "app.chalo.compose.components.ChaloTncSection (ChaloTncSection.kt:25)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 6).h), composerStartRestartGroup, 0);
            c(composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
            b(StringResourcesHelperKt.c(StringEnum.TNC_PREFIX, new Object[0], composerStartRestartGroup, 6), TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composerStartRestartGroup, 6).getBodyMedium(), ChaloTheme.a(composerStartRestartGroup, 6).i, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), StringResourcesHelperKt.c(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], composerStartRestartGroup, 6), TextStyle.m6753copyp1EtxEg$default(ChaloTheme.e(composerStartRestartGroup, 6).getBodyMedium(), ChaloTheme.a(composerStartRestartGroup, 6).f1915a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773118, null), onTncTextClicked, composerStartRestartGroup, (i2 << 9) & 57344);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, onTncTextClicked, i, 4));
        }
    }

    public static final void b(String prefix, TextStyle textStyle, String clickableText, TextStyle textStyle2, Function0 onActionClicked, Composer composer, int i) {
        int i2;
        TextStyle textStyle3;
        TextStyle textStyle4;
        Intrinsics.i(prefix, "prefix");
        Intrinsics.i(clickableText, "clickableText");
        Intrinsics.i(onActionClicked, "onActionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(538090576);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(prefix) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            textStyle3 = textStyle;
            i2 |= composerStartRestartGroup.changed(textStyle3) ? 32 : 16;
        } else {
            textStyle3 = textStyle;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(clickableText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            textStyle4 = textStyle2;
            i2 |= composerStartRestartGroup.changed(textStyle4) ? 2048 : 1024;
        } else {
            textStyle4 = textStyle2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionClicked) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(538090576, i2, -1, "app.chalo.compose.components.TermsAndConditionsSectionBody (ChaloTncSection.kt:57)");
            }
            String strConcat = prefix.concat(" ");
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(textStyle3.toSpanStyle());
                try {
                    builder.append(strConcat);
                    builder.pop(iPushStyle);
                    int iPushStyle2 = builder.pushStyle(textStyle4.toSpanStyle());
                    try {
                        builder.append(clickableText);
                        builder.pop(iPushStyle2);
                        int iD = StringsKt.D(strConcat + clickableText, clickableText, 0, false, 6);
                        builder.addStringAnnotation("ClickableText", "", iD, clickableText.length() + iD);
                        objRememberedValue = builder.toAnnotatedString();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            }
            AnnotatedString annotatedString = (AnnotatedString) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(annotatedString) | ((i2 & 57344) == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jb(annotatedString, onActionClicked, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ClickableTextKt.m1101ClickableText4YKlhWE(annotatedString, null, null, false, 0, 0, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(prefix, textStyle, clickableText, textStyle2, onActionClicked, i, 9));
        }
    }

    public static final void c(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2130448484);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2130448484, i, -1, "app.chalo.compose.components.TermsAndConditionsSectionHeading (ChaloTncSection.kt:98)");
            }
            composer2 = composerStartRestartGroup;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 6).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 6).getDisplaySmall(), composer2, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 1));
        }
    }
}
