package defpackage;

import java.util.ArrayList;
import so.plotline.insights.FlowViews.Stories.c;
import so.plotline.insights.FlowViews.Stories.e;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.d;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class kr1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18253a;
    public final /* synthetic */ e b;

    public /* synthetic */ kr1(e eVar, int i) {
        this.f18253a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18253a) {
            case 0:
                e eVar = this.b;
                try {
                    eVar.S.setVisibility(8);
                    c cVar = eVar.N;
                    if (cVar != null) {
                        cVar.j();
                    }
                    eVar.j();
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            default:
                e eVar2 = this.b;
                ArrayList arrayList = eVar2.Q.i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    eVar2.X.b((d) obj);
                }
                break;
        }
    }
}
