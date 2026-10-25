package defpackage;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19747a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ uh1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.f19747a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19747a) {
            case 0:
                return TextFieldDecoratorModifierNode.focusableNode$lambda$0(this.b, ((Boolean) obj).booleanValue());
            case 1:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$2(this.b, (DragAndDropEvent) obj);
            case 2:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$3(this.b, (DragAndDropEvent) obj);
            case 3:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$4(this.b, (Offset) obj);
            case 4:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$5(this.b, (DragAndDropEvent) obj);
            case 5:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$6(this.b, (DragAndDropEvent) obj);
            case 6:
                return TextFieldDecoratorModifierNode.clipboardKeyCommandsHandler$lambda$0(this.b, (KeyCommand) obj);
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$2(this.b, (List) obj));
        }
    }
}
