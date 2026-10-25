package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUiState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import defpackage.hi;
import defpackage.ms;
import defpackage.pk0;
import defpackage.u50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsFooterKt {
    public static final void a(PremiumBusFareDetailsFooterUiState footer, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        float f2;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(footer, "footer");
        Composer composerStartRestartGroup = composer.startRestartGroup(621251877);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(footer) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(621251877, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsFooter (PremiumBusFareDetailsFooter.kt:28)");
            }
            PremiumBusFareDetailsFooterUISpecs premiumBusFareDetailsFooterUISpecs = footer.d;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CardKt.Card(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ((i3 >> 3) & 14) | (CardDefaults.$stable << 18), 62), null, ComposableLambdaKt.rememberComposableLambda(1223540493, true, new u50(27, premiumBusFareDetailsFooterUISpecs, footer), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 22);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(footer, f, modifier2, i, 4));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, SnackbarUIState snackbar) {
        int i2;
        Intrinsics.i(snackbar, "snackbar");
        Composer composerStartRestartGroup = composer.startRestartGroup(-912102266);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-912102266, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsSnackbar (PremiumBusFareDetailsFooter.kt:76)");
            }
            ChaloSnackbarKt.b(snackbar, modifier, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ms(snackbar, modifier, i));
        }
    }
}
