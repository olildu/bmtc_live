package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19929a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;
    public final /* synthetic */ int c;

    public /* synthetic */ wh1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2) {
        this.f19929a = i2;
        this.b = textFieldDecoratorModifierNode;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19929a) {
            case 0:
                return TextFieldDecoratorModifierNode.onImeActionPerformed_KlQnJC8$lambda$0(this.b, this.c);
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$6(this.b, this.c));
        }
    }
}
