package app.chalo.compose.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import defpackage.z21;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SafeFocusRequesterKt {
    public static final Modifier a(Modifier modifier, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(safeFocusRequester, "safeFocusRequester");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-311723609, i, -1, "app.chalo.compose.utils.focusRequester (SafeFocusRequester.kt:49)");
        }
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(safeFocusRequester)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new z21(safeFocusRequester, 18);
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.DisposableEffect(Unit.f17538a, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 6);
        Modifier modifierThen = modifier.then(FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, safeFocusRequester.d));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }
}
