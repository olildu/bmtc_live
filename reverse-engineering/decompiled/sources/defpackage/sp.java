package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.ui.node.TraversableNode;
import app.chalo.utils.StopTripDetailsUtils;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19590a;
    public final /* synthetic */ Ref.BooleanRef b;

    public /* synthetic */ sp(Ref.BooleanRef booleanRef, int i) {
        this.f19590a = i;
        this.b = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19590a) {
            case 0:
                return Boolean.valueOf(ClickableKt.hasScrollableContainer$lambda$0(this.b, (TraversableNode) obj));
            case 1:
                List it = (List) obj;
                Intrinsics.i(it, "it");
                return Boolean.valueOf(this.b.element || StopTripDetailsUtils.d(it));
            case 2:
                List it2 = (List) obj;
                Intrinsics.i(it2, "it");
                return Boolean.valueOf(this.b.element || StopTripDetailsUtils.d(it2));
            case 3:
                return SelectionLayoutKt.isCollapsed$lambda$0(this.b, (SelectableInfo) obj);
            default:
                Ref.BooleanRef booleanRef = this.b;
                boolean z = true;
                if (!booleanRef.element && Intrinsics.d(obj, null)) {
                    booleanRef.element = true;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
