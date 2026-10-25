package app.chalo.kyc.min.ui.minkycotp.composables;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.kyc.min.ui.minkycotp.GenericErrorBottomSheetUIState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIState;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fc0;
import defpackage.la0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpUIState;", "viewState", "kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinKycOtpScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(MinKycOtpComponent minKycOtpComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object minKycOtpScreenKt$MinKycOtpScreen$2$1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1321808010);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(minKycOtpComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1321808010, i2, -1, "app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreen (MinKycOtpScreen.kt:21)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(minKycOtpComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SafeFocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SafeFocusRequester safeFocusRequester = (SafeFocusRequester) objRememberedValue;
            composer2 = composerStartRestartGroup;
            SheetState sheetStateA = SheetDefaultsHelperKt.a(true, null, SheetValue.Hidden, false, composer2, 3462, 50);
            MinKycOtpScreenUIKt.c((MinKycOtpUIState) mutableStateA.getValue(), safeFocusRequester, composer2, 48);
            GenericErrorBottomSheetUIState genericErrorBottomSheetUIState = ((MinKycOtpUIState) mutableStateA.getValue()).d;
            if (genericErrorBottomSheetUIState == null) {
                composer2.startReplaceGroup(-1721619627);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1721619626);
                BottomSheetRequestHandler bottomSheetRequestHandler = genericErrorBottomSheetUIState.b.g;
                boolean zChangedInstance = composer2.changedInstance(bottomSheetRequestHandler);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new MinKycOtpScreenKt$MinKycOtpScreen$1$1$1(0, bottomSheetRequestHandler, BottomSheetRequestHandler.class, "onDismissRequest", "onDismissRequest()V", 0);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                ChaloRoundedBottomSheetKt.a(sheetStateA, (Function0) ((KFunction) objRememberedValue2), false, false, false, ComposableLambdaKt.rememberComposableLambda(185786513, true, new la0(genericErrorBottomSheetUIState, 4), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composer2 = composer2;
                composer2.endReplaceGroup();
            }
            boolean zChangedInstance2 = composer2.changedInstance(minKycOtpComponent) | composer2.changedInstance(focusManager) | composer2.changed(softwareKeyboardController);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                minKycOtpScreenKt$MinKycOtpScreen$2$1 = new MinKycOtpScreenKt$MinKycOtpScreen$2$1(minKycOtpComponent, safeFocusRequester, focusManager, softwareKeyboardController, null);
                composer2.updateRememberedValue(minKycOtpScreenKt$MinKycOtpScreen$2$1);
            } else {
                minKycOtpScreenKt$MinKycOtpScreen$2$1 = objRememberedValue3;
            }
            EffectsKt.LaunchedEffect(minKycOtpComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) minKycOtpScreenKt$MinKycOtpScreen$2$1, composer2, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(minKycOtpComponent, i, 22));
        }
    }
}
