package app.chalo.bookingsuccess.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.bookingsuccess.BookingSuccessViewState;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.GenericSuccessScreenWithImageMsgAndCtaKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.e0;
import defpackage.wb;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookingSuccessScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(BookingSuccessComponent bookingSuccessComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1183500771);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bookingSuccessComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1183500771, i2, -1, "app.chalo.bookingsuccess.compose.BookingSuccessScreen (BookingSuccessScreen.kt:17)");
            }
            StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = ((BookingSuccessViewState) SubscribeAsStateKt.a(bookingSuccessComponent.t0(), composerStartRestartGroup).getValue()).f1153a;
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(LottieType.NEW_PAYMENT_SUCCESS, composerStartRestartGroup, 6);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 384, composerStartRestartGroup, 3);
            LottieAnimationState lottieAnimationStateA = LottieResourceHelperKt.a(lottieCompositionResultImplB, 1, composerStartRestartGroup, 1572864);
            Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateA.h());
            Float fValueOf = Float.valueOf(lottieAnimationStateA.getProgress());
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateA) | composerStartRestartGroup.changedInstance(bookingSuccessComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new BookingSuccessScreenKt$BookingSuccessScreen$2$1(lottieAnimationStateA, bookingSuccessComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, fValueOf, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
            if (successWithGifMsgAndCta != null) {
                composerStartRestartGroup.startReplaceGroup(285638397);
                GenericSuccessScreenWithImageMsgAndCtaKt.a(null, successWithGifMsgAndCta, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(284291199);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(bookingSuccessComponent, i, 7));
        }
    }
}
