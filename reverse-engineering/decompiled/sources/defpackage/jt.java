package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17436a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ jt(Function3 function3, int i) {
        this.f17436a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17436a) {
            case 0:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(this.b, (FlowLayoutOverflowState) obj);
            case 1:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(this.b, (FlowLayoutOverflowState) obj);
            case 2:
                return ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0(this.b, (FlowLayoutOverflowState) obj);
            case 3:
                return ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0(this.b, (FlowLayoutOverflowState) obj);
            case 4:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(this.b, (FlowLayoutOverflowState) obj);
            case 5:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(this.b, (FlowLayoutOverflowState) obj);
            case 6:
                return FlowColumnOverflow.Companion.expandIndicator$lambda$0(this.b, (FlowLayoutOverflowState) obj);
            case 7:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(this.b, (FlowLayoutOverflowState) obj);
            case 8:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(this.b, (FlowLayoutOverflowState) obj);
            case 9:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(this.b, (FlowLayoutOverflowState) obj);
            case 10:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(this.b, (FlowLayoutOverflowState) obj);
            default:
                return FlowRowOverflow.Companion.expandIndicator$lambda$0(this.b, (FlowLayoutOverflowState) obj);
        }
    }
}
