package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19659a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ th1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.f19659a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19659a) {
            case 0:
                return TextFieldDecoratorModifierNode.observeUntransformedTextChanges$lambda$0(this.b);
            case 1:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$9(this.b));
            case 2:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$10(this.b));
            case 3:
                return TextFieldDecoratorModifierNode.updateWindowFocus$lambda$0(this.b);
            case 4:
                return TextFieldDecoratorModifierNode.updateNode$lambda$0(this.b);
            case 5:
                return TextFieldDecoratorModifierNode._init_$lambda$0(this.b);
            case 6:
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.b);
            case 7:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$0(this.b);
            case 8:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.onKeyEvent_ZmokQxo$lambda$0(this.b));
            case 9:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$11(this.b));
            case 10:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$7(this.b));
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$8(this.b));
        }
    }
}
