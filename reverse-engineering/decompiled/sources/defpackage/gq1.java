package defpackage;

import com.google.android.material.badge.BadgeUtils;
import so.plotline.insights.FlowViews.BadgeView.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class gq1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15758a;
    public final /* synthetic */ a b;

    public /* synthetic */ gq1(a aVar, int i) {
        this.f15758a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15758a) {
            case 0:
                a aVar = this.b;
                BadgeUtils.b(aVar.f19349a, aVar.e);
                break;
            default:
                a aVar2 = this.b;
                BadgeUtils.a(aVar2.f19349a, aVar2.e);
                break;
        }
    }
}
