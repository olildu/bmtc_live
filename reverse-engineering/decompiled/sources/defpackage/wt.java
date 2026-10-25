package defpackage;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19959a;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode b;

    public /* synthetic */ wt(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.f19959a = i;
        this.b = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19959a) {
            case 0:
                return CoreTextFieldSemanticsModifierNode.updateNodeSemantics$lambda$0(this.b);
            case 1:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$8(this.b));
            case 2:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$9(this.b));
            case 3:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$10(this.b));
            case 4:
                return CoreTextFieldSemanticsModifierNode._init_$lambda$0(this.b);
            case 5:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$11(this.b));
            case 6:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$6(this.b));
            default:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$7(this.b));
        }
    }
}
