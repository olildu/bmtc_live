package defpackage;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17359a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ j0(Activity activity, int i) {
        this.f17359a = i;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17359a) {
            case 0:
                ActivityCompat.lambda$recreate$0(this.b);
                break;
            default:
                try {
                    Plotline.b().K.b(this.b);
                } catch (Exception e) {
                    DebugHelper.a(e);
                }
                break;
        }
    }
}
