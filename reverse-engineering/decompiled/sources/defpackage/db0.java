package defpackage;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15444a;
    public final /* synthetic */ InsetsConsumingModifierNode b;

    public /* synthetic */ db0(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.f15444a = i;
        this.b = insetsConsumingModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15444a) {
            case 0:
                return InsetsConsumingModifierNode.invalidateChildConsumedInsets$lambda$0(this.b, (TraversableNode) obj);
            default:
                return Boolean.valueOf(InsetsConsumingModifierNode.onAttach$lambda$0(this.b, (TraversableNode) obj));
        }
    }
}
