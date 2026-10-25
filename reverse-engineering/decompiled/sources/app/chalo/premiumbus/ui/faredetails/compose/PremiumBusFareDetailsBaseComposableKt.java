package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dd;
import defpackage.pk0;
import defpackage.st0;
import defpackage.t8;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsUiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsBaseComposableKt {
    public static final void a(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1922802901);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusFareDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1922802901, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBaseComposable (PremiumBusFareDetailsBaseComposable.kt:20)");
            }
            ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1901549138, true, new st0(SubscribeAsStateKt.a(premiumBusFareDetailsComponent.t0(), composerStartRestartGroup), 0), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusFareDetailsComponent, i, 11));
        }
    }

    public static final void b(PremiumBusFareDetailsUiState premiumBusFareDetailsUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(59392291);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusFareDetailsUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(59392291, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScreen (PremiumBusFareDetailsBaseComposable.kt:29)");
            }
            PremiumBusFareDetailsContent premiumBusFareDetailsContent = premiumBusFareDetailsUiState.c;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            ChaloToolBarKt.b(premiumBusFareDetailsUiState.f7614a, null, null, composerStartRestartGroup, 0, 14);
            if (Intrinsics.d(premiumBusFareDetailsContent, PremiumBusFareDetailsContent.InitialLoading.f7575a) || (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.Error) || (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.FreshPurchase)) {
                int i4 = i2;
                composerStartRestartGroup.startReplaceGroup(473828931);
                PremiumBusFreshPurchaseFareDetailsScreenKt.f(premiumBusFareDetailsUiState, premiumBusFareDetailsContent, null, composerStartRestartGroup, i4 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.ThroughPass) {
                composerStartRestartGroup.startReplaceGroup(473833761);
                PremiumBusThroughPassFareDetailsScreenKt.b(premiumBusFareDetailsUiState, premiumBusFareDetailsContent, null, composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.PassUpsellNudge)) {
                    throw pk0.p(composerStartRestartGroup, 473823124);
                }
                composerStartRestartGroup.startReplaceGroup(1804100914);
                int i5 = i2;
                PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState = premiumBusFareDetailsUiState.b;
                if (premiumBusFareDetailsTripSummaryUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(1804100913);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1804100914);
                    PremiumBusPassUpsellNudgeScreenKt.a(premiumBusFareDetailsUiState, (PremiumBusFareDetailsContent.PassUpsellNudge) premiumBusFareDetailsContent, premiumBusFareDetailsTripSummaryUiState, null, composerStartRestartGroup, i5 & 14);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.FreshPurchase) {
                composerStartRestartGroup.startReplaceGroup(-169793110);
                PremiumBusFareDetailsContent.FreshPurchase freshPurchase = (PremiumBusFareDetailsContent.FreshPurchase) premiumBusFareDetailsContent;
                LoadingDialogUIState loadingDialogUIState = freshPurchase.g;
                if (loadingDialogUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-169756872);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    t8.m(composerStartRestartGroup, -169756871, loadingDialogUIState, composerStartRestartGroup, 0);
                }
                ConfirmationDialogUiState confirmationDialogUiState = freshPurchase.h;
                if (confirmationDialogUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(-169665391);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    dd.l(composerStartRestartGroup, -169665390, confirmationDialogUiState, composerStartRestartGroup, 0);
                }
                PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState = freshPurchase.i;
                if (premiumBusFareDetailsBottomSheetUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(-169586806);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-169586805);
                    PremiumBusFareDetailsBottomSheetsKt.a(premiumBusFareDetailsBottomSheetUiState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.ThroughPass) {
                composerStartRestartGroup.startReplaceGroup(-169461782);
                PremiumBusFareDetailsContent.ThroughPass throughPass = (PremiumBusFareDetailsContent.ThroughPass) premiumBusFareDetailsContent;
                LoadingDialogUIState loadingDialogUIState2 = throughPass.c;
                if (loadingDialogUIState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-169425544);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    t8.m(composerStartRestartGroup, -169425543, loadingDialogUIState2, composerStartRestartGroup, 0);
                }
                ConfirmationDialogUiState confirmationDialogUiState2 = throughPass.e;
                if (confirmationDialogUiState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-169334063);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    dd.l(composerStartRestartGroup, -169334062, confirmationDialogUiState2, composerStartRestartGroup, 0);
                }
                PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState2 = throughPass.d;
                if (premiumBusFareDetailsBottomSheetUiState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-169255478);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-169255477);
                    PremiumBusFareDetailsBottomSheetsKt.a(premiumBusFareDetailsBottomSheetUiState2, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.PassUpsellNudge) {
                composerStartRestartGroup.startReplaceGroup(-169129555);
                PremiumBusFareDetailsContent.PassUpsellNudge passUpsellNudge = (PremiumBusFareDetailsContent.PassUpsellNudge) premiumBusFareDetailsContent;
                LoadingDialogUIState loadingDialogUIState3 = passUpsellNudge.e;
                if (loadingDialogUIState3 == null) {
                    composerStartRestartGroup.startReplaceGroup(-169090248);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    t8.m(composerStartRestartGroup, -169090247, loadingDialogUIState3, composerStartRestartGroup, 0);
                }
                PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState3 = passUpsellNudge.g;
                if (premiumBusFareDetailsBottomSheetUiState3 == null) {
                    composerStartRestartGroup.startReplaceGroup(-169018390);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-169018389);
                    PremiumBusFareDetailsBottomSheetsKt.a(premiumBusFareDetailsBottomSheetUiState3, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1241476295);
                composerStartRestartGroup.endReplaceGroup();
            }
            LoadingDialogUIState loadingDialogUIState4 = premiumBusFareDetailsUiState.d;
            if (loadingDialogUIState4 == null) {
                composerStartRestartGroup.startReplaceGroup(-168889864);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -168889863, loadingDialogUIState4, composerStartRestartGroup, 0);
            }
            ConfirmationDialogUiState confirmationDialogUiState3 = premiumBusFareDetailsUiState.e;
            if (confirmationDialogUiState3 == null) {
                composerStartRestartGroup.startReplaceGroup(-168815247);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -168815246, confirmationDialogUiState3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusFareDetailsUiState, i, 12));
        }
    }
}
