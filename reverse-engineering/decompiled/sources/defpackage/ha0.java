package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommandScope;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15806a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ImeEditCommandScope d;

    public /* synthetic */ ha0(int i, int i2, ImeEditCommandScope imeEditCommandScope) {
        this.b = i;
        this.c = i2;
        this.d = imeEditCommandScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15806a) {
            case 0:
                int i = this.b;
                return ImeEditCommand_androidKt.setSelection$lambda$0(this.d, i, this.c, (TextFieldBuffer) obj);
            default:
                return ImeEditCommand_androidKt.deleteSurroundingText$lambda$0(this.b, this.c, this.d, (TextFieldBuffer) obj);
        }
    }

    public /* synthetic */ ha0(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        this.d = imeEditCommandScope;
        this.b = i;
        this.c = i2;
    }
}
