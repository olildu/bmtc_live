package app.chalo.wallet.ui.mainbalance;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAccessState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dd;
import defpackage.fl1;
import defpackage.h5;
import defpackage.pk0;
import defpackage.y5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lapp/chalo/wallet/ui/access/WalletAccessState;", "walletAccessState", "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletBalanceMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(WalletBalanceComponent walletBalanceComponent, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1449090472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletBalanceComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1449090472, i2, -1, "app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreen (WalletBalanceMainScreen.kt:24)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(walletBalanceComponent.t0(), composerStartRestartGroup);
            MutableState mutableStateA2 = SubscribeAsStateKt.a(walletBalanceComponent.m, composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y5(mutableStateA, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
            Integer numValueOf = Integer.valueOf(((WalletBalanceViewState) mutableStateA.getValue()).h);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new WalletBalanceMainScreenKt$WalletBalanceMainScreen$1$1(pagerStateRememberPagerState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(walletBalanceComponent) | composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new WalletBalanceMainScreenKt$WalletBalanceMainScreen$2$1(walletBalanceComponent, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i4 = i2 & 14;
            EffectsKt.LaunchedEffect(walletBalanceComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i4);
            boolean zChanged3 = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(walletBalanceComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new WalletBalanceMainScreenKt$WalletBalanceMainScreen$3$1(pagerStateRememberPagerState, walletBalanceComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            ConfirmationDialogUiState confirmationDialogUiState = ((WalletBalanceViewState) mutableStateA.getValue()).l;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1139353482);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, 1139353483, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (((WalletAccessState) mutableStateA2.getValue()).h == null) {
                composerStartRestartGroup.startReplaceGroup(-823158274);
                ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composerStartRestartGroup, 0, 63);
            } else {
                composerStartRestartGroup.startReplaceGroup(-825836860);
            }
            composerStartRestartGroup.endReplaceGroup();
            i3 = 25;
            WalletAccessBaseScreenKt.c(walletBalanceComponent, ComposableLambdaKt.rememberComposableLambda(587134438, true, new h5(walletBalanceComponent, pagerStateRememberPagerState, mutableStateA, false, 12), composerStartRestartGroup, 54), composerStartRestartGroup, i4 | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 25;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(walletBalanceComponent, i, i3));
        }
    }
}
