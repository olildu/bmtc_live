package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.cb0;
import defpackage.e30;
import defpackage.h5;
import defpackage.hw0;
import defpackage.i41;
import defpackage.l61;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TncDialogKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0, Function0 function1) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        hw0 hw0Var;
        ComposeUiNode.Companion companion;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1693694396);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1693694396, i2, -1, "app.chalo.compose.components.dialogs.ButtonContainer (TncDialog.kt:119)");
            }
            if (function0 == null && function1 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    hw0Var = new hw0(function0, function1, modifier, i, 2);
                }
            } else {
                Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), IntrinsicSize.Min);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i4 = 6;
                if (function0 == null) {
                    composerStartRestartGroup.startReplaceGroup(1973836550);
                    composerStartRestartGroup.endReplaceGroup();
                    composer3 = composerStartRestartGroup;
                    companion = companion3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1973836551);
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(SizeKt.m816heightInVpY3zN4$default(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ChaloTheme.b(composerStartRestartGroup, 6).p, 0.0f, 2, null), false, null, null, null, function0, 15, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String strC = StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composerStartRestartGroup, 6);
                    int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
                    TextStyle headlineMedium = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineMedium();
                    long j = ChaloTheme.a(composerStartRestartGroup, 6).g;
                    TextAlign textAlignM7161boximpl = TextAlign.m7161boximpl(iM7168getCentere0LSkKk);
                    companion = companion3;
                    i4 = 6;
                    TextKt.m2623TextNvy7gAk(strC, null, j, null, 0L, null, null, null, 0L, null, textAlignM7161boximpl, 0L, 0, false, 0, 0, null, headlineMedium, composerStartRestartGroup, 0, 0, 130042);
                    composer3 = composerStartRestartGroup;
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                float f = ChaloTheme.b(composer3, i4).b;
                long j2 = ChaloTheme.a(composer3, i4).m;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                DividerKt.m1951VerticalDivider9IZ8Weo(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), f, j2, composer3, 6, 0);
                Composer composer4 = composer3;
                if (function1 == null) {
                    composer4.startReplaceGroup(1974616417);
                    composer4.endReplaceGroup();
                    composer2 = composer4;
                } else {
                    composer4.startReplaceGroup(1974616418);
                    Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(i41.a(rowScopeInstance, companion4, 1.0f, false, 2, null), ChaloTheme.b(composer4, i4).p, 0.0f, 2, null);
                    int i6 = i4;
                    ComposeUiNode.Companion companion5 = companion;
                    Modifier modifierM299clickableoSLSa3U$default2 = ClickableKt.m299clickableoSLSa3U$default(modifierM816heightInVpY3zN4$default, false, null, null, null, function1, 15, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM299clickableoSLSa3U$default2);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion5, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composer2 = composer4;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ACCEPT_CAPS, new Object[0], composer4, i6), null, ChaloTheme.a(composer4, i6).f1915a, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, i6).getHeadlineMedium(), composer2, 0, 0, 130042);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(hw0Var);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            hw0Var = new hw0(function0, function1, modifier, i, 3);
            scopeUpdateScopeEndRestartGroup.updateScope(hw0Var);
        }
    }

    public static final void b(int i, int i2, Composer composer, Modifier modifier, String str) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(210481418);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210481418, i3, -1, "app.chalo.compose.components.dialogs.TermText (TncDialog.kt:94)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(cb0.h(i, CLConstants.DOT_SALT_DELIMETER), null, ChaloTheme.a(composerStartRestartGroup, 6).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 6).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 6).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 6).getBodyMedium(), composer2, (i3 >> 3) & 14, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e30(i, str, modifier, i2));
        }
    }

    public static final void c(List termsList, Function0 function0, Function0 function1, Function0 onDismissRequest, DialogProperties dialogProperties, Composer composer, int i) {
        int i2;
        DialogProperties dialogProperties2;
        Intrinsics.i(termsList, "termsList");
        Intrinsics.i(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-200818282);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(termsList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            DialogProperties dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-200818282, i3, -1, "app.chalo.compose.components.dialogs.TncDialog (TncDialog.kt:37)");
            }
            int i4 = i3 >> 9;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1578120365, true, new h5(11, termsList, function0, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 384 | (i4 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties2 = dialogProperties3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            dialogProperties2 = dialogProperties;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l61(termsList, function0, function1, onDismissRequest, dialogProperties2, i));
        }
    }
}
