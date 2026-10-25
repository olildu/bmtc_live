package app.chalo.checkout.paymentprovider.inai;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InaiPlatformContextProvider_androidKt {
    public static final InaiPlatformContext a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(564379314, 0, -1, "app.chalo.checkout.paymentprovider.inai.rememberInaiPlatformContext (InaiPlatformContextProvider.android.kt:6)");
        }
        InaiPlatformContext inaiPlatformContext = new InaiPlatformContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return inaiPlatformContext;
    }
}
