package app.chalo.wallet.ui.loadbalancesuccess;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.lottieassetprovider.LottieType;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.fl1;
import defpackage.hn1;
import defpackage.pk0;
import defpackage.un1;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/wallet/ui/loadbalancesuccess/WalletLoadBalanceSuccessViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceSuccessScreenKt {
    public static final void a(WalletLoadBalanceSuccessViewState walletLoadBalanceSuccessViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(649551817);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(walletLoadBalanceSuccessViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(649551817, i3, -1, "app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceScreenContent (WalletLoadBalanceSuccessScreen.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.WALLET_LOAD_BALANCE_SUCCESS, composerStartRestartGroup, 6);
            LottieAnimationState lottieAnimationStateA = LottieResourceHelperKt.a(lottieCompositionResultImplB, 1, composerStartRestartGroup, 1572864);
            float f = 120;
            ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB, 0, false, composerStartRestartGroup, 0, 30), "", SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion, Dp.m7278constructorimpl(f)), Dp.m7278constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 432, 120);
            Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateA.h());
            Float fValueOf = Float.valueOf(lottieAnimationStateA.getProgress());
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateA) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new WalletLoadBalanceSuccessScreenKt$WalletLoadBalanceScreenContent$1$1$1(lottieAnimationStateA, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, fValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(walletLoadBalanceSuccessViewState.f10857a, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplayMedium(), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(walletLoadBalanceSuccessViewState, function1, i, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(WalletLoadBalanceSuccessComponent walletLoadBalanceSuccessComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(866018083);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletLoadBalanceSuccessComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(866018083, i2, -1, "app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessScreen (WalletLoadBalanceSuccessScreen.kt:26)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(walletLoadBalanceSuccessComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(walletLoadBalanceSuccessComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new WalletLoadBalanceSuccessScreenKt$WalletLoadBalanceSuccessScreen$1$1(walletLoadBalanceSuccessComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(walletLoadBalanceSuccessComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            WalletLoadBalanceSuccessViewState walletLoadBalanceSuccessViewState = (WalletLoadBalanceSuccessViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(walletLoadBalanceSuccessComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new un1(walletLoadBalanceSuccessComponent, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            a(walletLoadBalanceSuccessViewState, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(walletLoadBalanceSuccessComponent, i, 27));
        }
    }
}
