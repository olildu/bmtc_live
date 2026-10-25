package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import so.plotline.insights.Database.a;
import so.plotline.insights.Database.d;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Tasks.b;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class wq1 implements b.a, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f19953a;

    @Override // so.plotline.insights.Database.d.a
    public void b(HashMap map) {
        String str;
        WeakReference weakReference = this.f19953a;
        try {
            so.plotline.insights.FlowViews.Stories.b bVar = (so.plotline.insights.FlowViews.Stories.b) weakReference.get();
            if (bVar == null || (str = (String) map.get("uiMode")) == null || str.equals(bVar.q)) {
                return;
            }
            bVar.q = str;
            new Handler(Looper.getMainLooper()).post(new el0(2, weakReference));
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    @Override // so.plotline.insights.Tasks.b.a
    public void d(HashMap map, List list) {
        WeakReference weakReference = this.f19953a;
        try {
            so.plotline.insights.FlowViews.Stories.b bVar = (so.plotline.insights.FlowViews.Stories.b) weakReference.get();
            if (bVar == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if ("uiMode".equals(aVar.f19324a)) {
                    String str = aVar.b;
                    if (str == null || str.isEmpty() || str.equals(bVar.q)) {
                        return;
                    }
                    bVar.q = str;
                    new Handler(Looper.getMainLooper()).post(new el0(3, weakReference));
                    return;
                }
            }
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }
}
