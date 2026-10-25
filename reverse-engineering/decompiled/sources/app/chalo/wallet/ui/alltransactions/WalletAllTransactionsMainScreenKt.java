package app.chalo.wallet.ui.alltransactions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.wallet.ui.alltransactions.compose.WalletAllTransactionsComposableKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ap1;
import defpackage.fl1;
import defpackage.pk0;
import defpackage.yh1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletAllTransactionsMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(WalletAllTransactionsComponent walletAllTransactionsComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(92976405);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletAllTransactionsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(92976405, i2, -1, "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsMainScreen (WalletAllTransactionsMainScreen.kt:19)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(walletAllTransactionsComponent.t0(), composerStartRestartGroup);
            if (((WalletAllTransactionsState) mutableStateA.getValue()).g) {
                composerStartRestartGroup.startReplaceGroup(-393623063);
                String strC = StringResourcesHelperKt.c(StringEnum.WALLET_TRANSACTIONS_EMAIL_STATEMENT_MESSAGE, new Object[]{2}, composerStartRestartGroup, 6);
                String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(walletAllTransactionsComponent);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new yh1(walletAllTransactionsComponent, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer3 = composerStartRestartGroup;
                ChaloConfirmationDialogKt.b(null, strC, strC2, (Function0) objRememberedValue, null, null, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), null, composer3, 1572864, 177);
            } else {
                composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-394567571);
            }
            composer3.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer composer4 = composer3;
            ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composer4, 0, 63);
            composer2 = composer4;
            WalletAllTransactionsState walletAllTransactionsState = (WalletAllTransactionsState) mutableStateA.getValue();
            boolean zChangedInstance2 = composer2.changedInstance(walletAllTransactionsComponent);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ap1(walletAllTransactionsComponent, 1);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            WalletAllTransactionsComposableKt.b(walletAllTransactionsState, (Function1) objRememberedValue2, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(walletAllTransactionsComponent, i, 22));
        }
    }
}
