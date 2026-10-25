package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.SheetState;
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
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import defpackage.c0;
import defpackage.h0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketFareDetailsMainScreenKt {
    public static final void a(SheetState sheetState, FareDetailsViewState fareDetailsViewState, InstantTicketWalletAccessState instantTicketWalletAccessState, Function1 payForTicketWalletAccessIntentHandler, Function1 fareDetailsIntentHandler, Composer composer, int i) {
        int i2;
        Intrinsics.i(fareDetailsViewState, "fareDetailsViewState");
        Intrinsics.i(instantTicketWalletAccessState, "instantTicketWalletAccessState");
        Intrinsics.i(payForTicketWalletAccessIntentHandler, "payForTicketWalletAccessIntentHandler");
        Intrinsics.i(fareDetailsIntentHandler, "fareDetailsIntentHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(1641107426);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fareDetailsViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instantTicketWalletAccessState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(payForTicketWalletAccessIntentHandler) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fareDetailsIntentHandler) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1641107426, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.InstantTicketFareDetailsMainScreen (InstantTicketFareDetailsMainScreen.kt:21)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (sheetState.isVisible()) {
                composerStartRestartGroup.startReplaceGroup(-721136969);
                ChaloRoundedBottomSheetKt.a(sheetState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-2005708933, true, new c0(fareDetailsViewState, instantTicketWalletAccessState, payForTicketWalletAccessIntentHandler, fareDetailsIntentHandler, 9), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            } else {
                composerStartRestartGroup.startReplaceGroup(-722342714);
            }
            composerStartRestartGroup.endReplaceGroup();
            FareDetailsScreenKt.a(fareDetailsViewState, fareDetailsIntentHandler, composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 >> 9) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(sheetState, fareDetailsViewState, instantTicketWalletAccessState, payForTicketWalletAccessIntentHandler, fareDetailsIntentHandler, i, 14));
        }
    }
}
