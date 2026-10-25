package app.chalo.compose.resources;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import app.chalo.providers.lottieassetprovider.LottieType;
import io.github.alexzhirkevich.compottie.AnimateLottieCompositionAsStateKt;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import io.github.alexzhirkevich.compottie.LottieCancellationBehavior;
import io.github.alexzhirkevich.compottie.LottieCompositionKt;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import io.github.alexzhirkevich.compottie.LottiePainterKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LottieResourceHelperKt {
    public static final LottieAnimationState a(LottieCompositionResultImpl composition, int i, Composer composer, int i2) {
        Intrinsics.i(composition, "composition");
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.Immediately;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1919578986, i2, -1, "app.chalo.compose.resources.animateLottieCompositionAsState (LottieResourceHelper.kt:46)");
        }
        LottieAnimationState lottieAnimationStateA = AnimateLottieCompositionAsStateKt.a(composition.getValue(), true, true, 1.0f, i, lottieCancellationBehavior, composer, i2 & 268435440);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lottieAnimationStateA;
    }

    public static final LottieCompositionResultImpl b(LottieType lottieType, Composer composer, int i) {
        Intrinsics.i(lottieType, "lottieType");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1833501139, i, -1, "app.chalo.compose.resources.rememberLottieComposition (LottieResourceHelper.kt:17)");
        }
        Object[] objArr = new Object[0];
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lottieType.ordinal())) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LottieResourceHelperKt$rememberLottieComposition$1$1(lottieType, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        LottieCompositionResultImpl lottieCompositionResultImplA = LottieCompositionKt.a(objArr, (Function1) objRememberedValue, composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lottieCompositionResultImplA;
    }

    public static final Painter c(LottieCompositionResultImpl composition, int i, boolean z, Composer composer, int i2, int i3) {
        Intrinsics.i(composition, "composition");
        int i4 = (i3 & 2) != 0 ? 1 : i;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-254760641, i2, -1, "app.chalo.compose.resources.rememberLottiePainter (LottieResourceHelper.kt:80)");
        }
        Painter painterA = LottiePainterKt.a(composition.getValue(), z2, true, 1.0f, i4, composer, ((i2 << 6) & 516096) | ((i2 << 15) & 1879048192), (i2 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painterA;
    }
}
