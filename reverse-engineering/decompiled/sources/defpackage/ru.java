package defpackage;

import com.inmobi.media.D5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ru implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19244a;
    public final /* synthetic */ D5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ru(D5 d5, String str, String str2, int i) {
        this.f19244a = i;
        this.b = d5;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19244a) {
            case 0:
                D5.a(this.b, this.c, this.d);
                break;
            case 1:
                D5.c(this.b, this.c, this.d);
                break;
            case 2:
                D5.d(this.b, this.c, this.d);
                break;
            case 3:
                D5.e(this.b, this.c, this.d);
                break;
            default:
                D5.b(this.b, this.c, this.d);
                break;
        }
    }
}
