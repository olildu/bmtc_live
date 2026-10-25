package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19814a;
    public final /* synthetic */ TextFieldSelectionState b;
    public final /* synthetic */ int c;

    public /* synthetic */ v9(TextFieldSelectionState textFieldSelectionState, int i, int i2) {
        this.f19814a = i2;
        this.b = textFieldSelectionState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19814a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return BasicTextFieldKt.TextFieldCursorHandle$lambda$4(this.b, this.c, composer, iIntValue);
            default:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$8(this.b, this.c, composer, iIntValue);
        }
    }
}
