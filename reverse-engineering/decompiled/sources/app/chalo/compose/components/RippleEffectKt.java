package app.chalo.compose.components;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.theme.ChaloTheme;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RippleEffectKt {
    public static final IndicationNodeFactory a(Composer composer) {
        long j = ChaloTheme.a(composer, 6).c;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1499564042, 0, -1, "app.chalo.compose.components.createIndication (RippleEffect.kt:15)");
        }
        IndicationNodeFactory indicationNodeFactoryM2313rippleH2RKhps$default = RippleKt.m2313rippleH2RKhps$default(true, 0.0f, j, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return indicationNodeFactoryM2313rippleH2RKhps$default;
    }

    public static final MutableInteractionSource b(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(397158287, 0, -1, "app.chalo.compose.components.createMutableInteractionSource (RippleEffect.kt:10)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableInteractionSource;
    }
}
