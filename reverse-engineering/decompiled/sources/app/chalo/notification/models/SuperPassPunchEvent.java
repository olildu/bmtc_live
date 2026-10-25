package app.chalo.notification.models;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/SuperPassPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassPunchEvent implements AppNotification.PunchNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6550a;
    public final String b;
    public final String c;

    public SuperPassPunchEvent(String str, String str2, String str3) {
        this.f6550a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPunchEvent)) {
            return false;
        }
        SuperPassPunchEvent superPassPunchEvent = (SuperPassPunchEvent) obj;
        return Intrinsics.d(this.f6550a, superPassPunchEvent.f6550a) && Intrinsics.d(this.b, superPassPunchEvent.b) && Intrinsics.d(this.c, superPassPunchEvent.c);
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF6552a() {
        return this.f6550a;
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f6550a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("SuperPassPunchEvent(title=", this.f6550a, ", body=", this.b, ", payload="), this.c, ")");
    }
}
