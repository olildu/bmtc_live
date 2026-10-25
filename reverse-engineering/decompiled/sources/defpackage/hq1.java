package defpackage;

import aaz.b;
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import so.plotline.insights.FlowViews.BottomSheetViews.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class hq1 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15852a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq1(Object obj, int i) {
        this.f15852a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f15852a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                so.plotline.insights.a.f fVar = aVar.m;
                if (fVar != null) {
                    fVar.a(Boolean.FALSE, Boolean.TRUE, aVar.l.b, null, null, null, null);
                    return;
                }
                return;
            case 1:
                so.plotline.insights.FlowViews.FullPageDialog.a aVar2 = (so.plotline.insights.FlowViews.FullPageDialog.a) obj;
                so.plotline.insights.a.f fVar2 = aVar2.b;
                if (fVar2 != null) {
                    fVar2.a(Boolean.FALSE, Boolean.TRUE, aVar2.f19371a.b, null, null, null, null);
                    return;
                }
                return;
            case 2:
                so.plotline.insights.FlowViews.ModalView.a aVar3 = (so.plotline.insights.FlowViews.ModalView.a) obj;
                so.plotline.insights.a.f fVar3 = aVar3.b;
                if (fVar3 != null) {
                    fVar3.a(Boolean.FALSE, Boolean.TRUE, aVar3.f19373a.b, null, null, null, null);
                    return;
                }
                return;
            default:
                b this$0 = (b) obj;
                int i2 = b.g0;
                Intrinsics.i(this$0, "this$0");
                abb.a aVar4 = this$0.c0;
                if (aVar4 != null) {
                    aVar4.f255a.postValue(aaj.b.f211a);
                    return;
                } else {
                    Intrinsics.q("webViewModel");
                    throw null;
                }
        }
    }
}
