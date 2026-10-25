package defpackage;

import android.widget.ImageView;
import so.plotline.insights.FlowViews.d;
import so.plotline.insights.FlowViews.l;
import so.plotline.insights.Models.c0;
import so.plotline.insights.Models.j0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class js1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17435a;
    public final /* synthetic */ l b;

    public /* synthetic */ js1(l lVar, int i) {
        this.f17435a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17435a) {
            case 0:
                l lVar = this.b;
                c0 c0Var = lVar.b;
                int iO = (int) d.o(c0Var.s.p);
                ImageView imageView = lVar.e;
                j0 j0Var = c0Var.s;
                int iO2 = (int) d.o(j0Var.q);
                int i = j0Var.q;
                d.i(imageView, iO, 0, iO2, ((int) d.o(i)) + lVar.i, 0);
                d.i(lVar.f, iO, 0, (int) d.o(i), ((int) d.o(i)) + lVar.i, 0);
                break;
            default:
                this.b.d.setVisibility(8);
                break;
        }
    }
}
