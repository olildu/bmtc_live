package defpackage;

import androidx.window.SafeWindowExtensionsProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19089a;
    public final /* synthetic */ SafeWindowExtensionsProvider b;

    public /* synthetic */ q41(SafeWindowExtensionsProvider safeWindowExtensionsProvider, int i) {
        this.f19089a = i;
        this.b = safeWindowExtensionsProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19089a) {
            case 0:
                return SafeWindowExtensionsProvider.isWindowExtensionsPresent$lambda$1(this.b);
            default:
                return Boolean.valueOf(SafeWindowExtensionsProvider.isWindowExtensionsValid$lambda$0(this.b));
        }
    }
}
