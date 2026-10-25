package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import so.plotline.insights.Database.a;
import so.plotline.insights.Database.d;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.h;
import so.plotline.insights.Tasks.b;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qq1 implements b.a, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f19146a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ qq1(String str, String str2, WeakReference weakReference) {
        this.b = str;
        this.c = str2;
        this.f19146a = weakReference;
    }

    @Override // so.plotline.insights.Database.d.a
    public void b(HashMap map) {
        WeakReference weakReference = this.f19146a;
        try {
            if (((TextView) weakReference.get()) == null) {
                return;
            }
            String str = "dark".equalsIgnoreCase((String) map.get("uiMode")) ? this.b : this.c;
            if (h.f(str)) {
                new Handler(Looper.getMainLooper()).post(new rq1(weakReference, str, 1));
            }
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    @Override // so.plotline.insights.Tasks.b.a
    public void d(HashMap map, List list) {
        WeakReference weakReference = this.f19146a;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if ("uiMode".equals(aVar.f19324a)) {
                    String str = "dark".equalsIgnoreCase(aVar.b) ? this.b : this.c;
                    if (h.f(str)) {
                        new Handler(Looper.getMainLooper()).post(new rq1(weakReference, str, 0));
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    public /* synthetic */ qq1(WeakReference weakReference, String str, String str2) {
        this.f19146a = weakReference;
        this.b = str;
        this.c = str2;
    }
}
