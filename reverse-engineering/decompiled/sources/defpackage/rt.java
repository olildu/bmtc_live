package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19242a;
    public final /* synthetic */ LegacyTextFieldState b;

    public /* synthetic */ rt(LegacyTextFieldState legacyTextFieldState, int i) {
        this.f19242a = i;
        this.b = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19242a) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$16$0(this.b, ((Boolean) obj).booleanValue());
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$25(this.b, (LayoutCoordinates) obj);
            case 2:
                return LegacyTextFieldState.onValueChange$lambda$0(this.b, (TextFieldValue) obj);
            case 3:
                return LegacyTextFieldState.onImeActionPerformed$lambda$0(this.b, (ImeAction) obj);
            default:
                return Boolean.valueOf(LegacyTextFieldState.onImeActionPerformedWithResult$lambda$0(this.b, (ImeAction) obj));
        }
    }
}
