package defpackage;

import com.inmobi.media.AbstractC2642rc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ts1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19687a;
    public final /* synthetic */ AbstractC2642rc b;
    public final /* synthetic */ Map c;

    public /* synthetic */ ts1(AbstractC2642rc abstractC2642rc, Map map, int i) {
        this.f19687a = i;
        this.b = abstractC2642rc;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19687a) {
            case 0:
                AbstractC2642rc.b(this.b, this.c);
                break;
            default:
                AbstractC2642rc.a(this.b, this.c);
                break;
        }
    }
}
