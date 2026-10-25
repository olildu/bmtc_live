package app.chalo.permissions.handler;

import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/permissions/handler/PermissionUpdateInfo;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PermissionUpdateInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppPermission f6832a;
    public final PermissionState b;
    public final long c;

    public PermissionUpdateInfo(AppPermission permission, PermissionState permissionState, long j) {
        Intrinsics.i(permission, "permission");
        Intrinsics.i(permissionState, "permissionState");
        this.f6832a = permission;
        this.b = permissionState;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionUpdateInfo)) {
            return false;
        }
        PermissionUpdateInfo permissionUpdateInfo = (PermissionUpdateInfo) obj;
        return this.f6832a == permissionUpdateInfo.f6832a && this.b == permissionUpdateInfo.b && this.c == permissionUpdateInfo.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6832a.hashCode() * 31)) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionUpdateInfo(permission=");
        sb.append(this.f6832a);
        sb.append(", permissionState=");
        sb.append(this.b);
        sb.append(", stateUpdatedAt=");
        return uf0.m(this.c, ")", sb);
    }
}
