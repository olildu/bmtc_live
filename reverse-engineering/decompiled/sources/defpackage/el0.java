package defpackage;

import com.inmobi.media.N7;
import java.lang.ref.WeakReference;
import so.plotline.insights.FlowViews.Stories.b;
import so.plotline.insights.Helpers.DebugHelper;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class el0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15565a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ el0(int i, WeakReference weakReference) {
        this.f15565a = i;
        this.b = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15565a) {
            case 0:
                N7.b(this.b);
                break;
            case 1:
                N7.a(this.b);
                break;
            case 2:
                try {
                    b bVar = (b) this.b.get();
                    if (bVar != null) {
                        bVar.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            default:
                try {
                    b bVar2 = (b) this.b.get();
                    if (bVar2 != null) {
                        bVar2.notifyDataSetChanged();
                    }
                } catch (Exception e2) {
                    DebugHelper.a(e2);
                }
                break;
        }
    }
}
