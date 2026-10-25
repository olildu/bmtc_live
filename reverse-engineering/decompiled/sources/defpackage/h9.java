package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h9 implements CodepointTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15802a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9(Object obj, int i) {
        this.f15802a = i;
        this.b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i2) {
        switch (this.f15802a) {
            case 0:
                return BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$3$0((State) this.b, i, i2);
            default:
                return SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) this.b, i, i2);
        }
    }
}
