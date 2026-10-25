package app.chalo.permissions.handler;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/permissions/handler/PermissionHandlerProviderImpl;", "Lapp/chalo/permissions/handler/PermissionHandlerSetter;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionHandlerProviderImpl implements PermissionHandlerSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f6831a;

    @Override // app.chalo.permissions.handler.PermissionHandlerSetter
    public final void a() {
        this.f6831a = null;
    }

    @Override // app.chalo.permissions.handler.PermissionHandlerSetter
    public final void b(Lazy permissionHandler) {
        Intrinsics.i(permissionHandler, "permissionHandler");
        this.f6831a = permissionHandler;
    }

    @Override // app.chalo.permissions.handler.PermissionHandlerProvider
    public final PermissionHandler c() {
        Lazy lazy = this.f6831a;
        if (lazy != null) {
            return (PermissionHandler) lazy.getValue();
        }
        return null;
    }
}
