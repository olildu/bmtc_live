package app.chalo.ncmc.uvik;

import defpackage.yn1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkManagerProviderImpl;", "Lapp/chalo/ncmc/uvik/UvikSdkManagerProvider;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UvikSdkManagerProviderImpl implements UvikSdkManagerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f6448a;
    public final Lazy b = LazyKt.b(new yn1(2));

    @Override // app.chalo.ncmc.uvik.UvikSdkManagerProvider
    public final void a(Lazy manager) {
        Intrinsics.i(manager, "manager");
        this.f6448a = manager;
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkManagerProvider
    public final UvikSdkManager b() {
        UvikSdkManager uvikSdkManager;
        Lazy lazy = this.f6448a;
        return (lazy == null || (uvikSdkManager = (UvikSdkManager) lazy.getValue()) == null) ? (UvikSdkManagerProviderImpl$defaultManager$2$1) this.b.getValue() : uvikSdkManager;
    }
}
