package app.chalo.kyc.min.ui.minkycdetails.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fc0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsUIState;", "viewState", "kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinKycDetailsScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(MinKycDetailsComponent minKycDetailsComponent, Composer composer, int i) {
        int i2;
        MinKycDetailsComponent minKycDetailsComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1864567656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(minKycDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864567656, i2, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreen (MinKycDetailsScreen.kt:16)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(minKycDetailsComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SafeFocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SafeFocusRequester safeFocusRequester = (SafeFocusRequester) objRememberedValue;
            MinKycDetailsScreenUIKt.c((MinKycDetailsUIState) mutableStateA.getValue(), safeFocusRequester, composerStartRestartGroup, 48);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(minKycDetailsComponent) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                minKycDetailsComponent2 = minKycDetailsComponent;
                MinKycDetailsScreenKt$MinKycDetailsScreen$1$1 minKycDetailsScreenKt$MinKycDetailsScreen$1$1 = new MinKycDetailsScreenKt$MinKycDetailsScreen$1$1(minKycDetailsComponent2, softwareKeyboardController, focusManager, safeFocusRequester, null);
                composerStartRestartGroup.updateRememberedValue(minKycDetailsScreenKt$MinKycDetailsScreen$1$1);
                objRememberedValue2 = minKycDetailsScreenKt$MinKycDetailsScreen$1$1;
            } else {
                minKycDetailsComponent2 = minKycDetailsComponent;
            }
            EffectsKt.LaunchedEffect(minKycDetailsComponent2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            minKycDetailsComponent2 = minKycDetailsComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(minKycDetailsComponent2, i, 19));
        }
    }
}
