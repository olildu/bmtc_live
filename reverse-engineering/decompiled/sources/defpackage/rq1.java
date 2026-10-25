package defpackage;

import android.graphics.Color;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import so.plotline.insights.Helpers.DebugHelper;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class rq1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19235a;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ String c;

    public /* synthetic */ rq1(WeakReference weakReference, String str, int i) {
        this.f19235a = i;
        this.b = weakReference;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19235a) {
            case 0:
                WeakReference weakReference = this.b;
                String str = this.c;
                try {
                    TextView textView = (TextView) weakReference.get();
                    if (textView != null) {
                        textView.setTextColor(Color.parseColor(str));
                    }
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            default:
                WeakReference weakReference2 = this.b;
                String str2 = this.c;
                try {
                    TextView textView2 = (TextView) weakReference2.get();
                    if (textView2 != null) {
                        textView2.setTextColor(Color.parseColor(str2));
                    }
                } catch (Exception e2) {
                    DebugHelper.a(e2);
                }
                break;
        }
    }
}
