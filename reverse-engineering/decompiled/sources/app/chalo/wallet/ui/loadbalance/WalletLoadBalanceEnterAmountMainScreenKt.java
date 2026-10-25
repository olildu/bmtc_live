package app.chalo.wallet.ui.loadbalance;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.dialogs.TncDialogKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.cm1;
import defpackage.fl1;
import defpackage.fp1;
import defpackage.h5;
import defpackage.pk0;
import defpackage.y5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceEnterAmountMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(155395251);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155395251, i2, -1, "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreen (WalletLoadBalanceEnterAmountMainScreen.kt:28)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(walletLoadBalanceEnterAmountComponent.t0(), composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y5(mutableStateA, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
            Integer numValueOf = Integer.valueOf(((WalletLoadBalanceEnterAmountViewState) mutableStateA.getValue()).l);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$1$1(pagerStateRememberPagerState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent) | composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$2$1(walletLoadBalanceEnterAmountComponent, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i4 = i2 & 14;
            EffectsKt.LaunchedEffect(walletLoadBalanceEnterAmountComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i4);
            boolean zChanged3 = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new WalletLoadBalanceEnterAmountMainScreenKt$WalletLoadBalanceEnterAmountMainScreen$3$1(pagerStateRememberPagerState, walletLoadBalanceEnterAmountComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            if (((WalletLoadBalanceEnterAmountViewState) mutableStateA.getValue()).f10849a) {
                composerStartRestartGroup.startReplaceGroup(-593336405);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(-595972273);
            }
            composerStartRestartGroup.endReplaceGroup();
            WalletLoadBalanceDialogType walletLoadBalanceDialogType = ((WalletLoadBalanceEnterAmountViewState) mutableStateA.getValue()).i;
            if (walletLoadBalanceDialogType instanceof WalletLoadBalanceDialogType.TncDialog) {
                composerStartRestartGroup.startReplaceGroup(-593186458);
                List list = ((WalletLoadBalanceDialogType.TncDialog) walletLoadBalanceDialogType).f10827a.c;
                if (list == null) {
                    list = EmptyList.f17557a;
                }
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new fp1(walletLoadBalanceEnterAmountComponent, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function0 = (Function0) objRememberedValue5;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent) | composerStartRestartGroup.changed(walletLoadBalanceDialogType);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new cm1(10, walletLoadBalanceEnterAmountComponent, walletLoadBalanceDialogType);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function0 function1 = (Function0) objRememberedValue6;
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new fp1(walletLoadBalanceEnterAmountComponent, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                TncDialogKt.c(list, function0, function1, (Function0) objRememberedValue7, null, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (walletLoadBalanceDialogType != null) {
                    throw pk0.p(composerStartRestartGroup, -988969292);
                }
                composerStartRestartGroup.startReplaceGroup(-592699603);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, 0);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getBottomCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer composer2 = composerStartRestartGroup;
            ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composer2, 0, 63);
            composerStartRestartGroup = composer2;
            i3 = 26;
            WalletAccessBaseScreenKt.c(walletLoadBalanceEnterAmountComponent, ComposableLambdaKt.rememberComposableLambda(-602960913, true, new h5(pagerStateRememberPagerState, walletLoadBalanceEnterAmountComponent, mutableStateA, false, 13), composerStartRestartGroup, 54), composerStartRestartGroup, i4 | 48);
            composerStartRestartGroup.endNode();
            String str = ((WalletLoadBalanceEnterAmountViewState) mutableStateA.getValue()).j;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1985270212);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1985270211);
                String strC = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(walletLoadBalanceEnterAmountComponent);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new fp1(walletLoadBalanceEnterAmountComponent, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                ChaloSnackbarKt.a(null, str, strC, (Function0) objRememberedValue8, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 26;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(walletLoadBalanceEnterAmountComponent, i, i3));
        }
    }
}
