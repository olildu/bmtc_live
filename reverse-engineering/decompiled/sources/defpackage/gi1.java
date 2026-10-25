package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15736a;
    public final /* synthetic */ Ref.LongRef b;
    public final /* synthetic */ Ref.LongRef c;
    public final /* synthetic */ TextFieldSelectionState d;

    public /* synthetic */ gi1(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2, int i) {
        this.f15736a = i;
        this.b = longRef;
        this.d = textFieldSelectionState;
        this.c = longRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15736a) {
            case 0:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$2(this.b, this.d, this.c);
            case 1:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$1(this.b, this.c, this.d);
            case 2:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$2(this.b, this.c, this.d);
            default:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$1(this.b, this.d, this.c);
        }
    }

    public /* synthetic */ gi1(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState, int i) {
        this.f15736a = i;
        this.b = longRef;
        this.c = longRef2;
        this.d = textFieldSelectionState;
    }
}
