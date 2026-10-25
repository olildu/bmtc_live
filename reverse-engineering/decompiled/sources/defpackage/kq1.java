package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.inmobi.media.C2393a0;
import com.inmobi.media.C2599oa;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kq1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18250a;
    public final /* synthetic */ C2393a0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C2599oa e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ kq1(C2393a0 c2393a0, KeyEvent.Callback callback, long j, boolean z, C2599oa c2599oa, int i) {
        this.f18250a = i;
        this.b = c2393a0;
        this.f = callback;
        this.c = j;
        this.d = z;
        this.e = c2599oa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18250a) {
            case 0:
                C2393a0.a(this.b, (Activity) this.f, this.c, this.d, this.e);
                break;
            default:
                C2393a0.a(this.b, (View) this.f, this.c, this.d, this.e);
                break;
        }
    }
}
