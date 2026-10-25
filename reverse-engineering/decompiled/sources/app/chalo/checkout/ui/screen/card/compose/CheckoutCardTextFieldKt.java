package app.chalo.checkout.ui.screen.card.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.text.TextFieldWithErrorKt;
import app.chalo.uistate.textField.TextFieldWithErrorUiState;
import defpackage.xn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckoutCardTextFieldKt {
    public static final void a(Modifier modifier, TextFieldWithErrorUiState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1813038283);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813038283, i2, -1, "app.chalo.checkout.ui.screen.card.compose.CheckoutCardTextField (CheckoutCardTextField.kt:11)");
            }
            TextFieldWithErrorKt.a(modifier, state, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xn(modifier, state, i, 0));
        }
    }
}
