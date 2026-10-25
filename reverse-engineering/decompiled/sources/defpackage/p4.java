package defpackage;

import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.LayoutCorners;
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.LayoutCornersKt;
import com.arkivanov.essenty.backhandler.BackEvent;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19002a;
    public final /* synthetic */ LayoutCorners b;

    public /* synthetic */ p4(LayoutCorners layoutCorners, int i) {
        this.f19002a = i;
        this.b = layoutCorners;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19002a;
        float fFloatValue = ((Float) obj).floatValue();
        BackEvent.SwipeEdge swipeEdge = (BackEvent.SwipeEdge) obj2;
        switch (i) {
            case 0:
                Intrinsics.i(swipeEdge, "<unused var>");
                break;
            default:
                Intrinsics.i(swipeEdge, "<unused var>");
                break;
        }
        return LayoutCornersKt.b(this.b, fFloatValue);
    }
}
