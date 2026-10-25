package app.chalo.notification.models;

import app.chalo.scenes.args.SceneArgs;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/NotificationDisplayData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NotificationDisplayData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6548a;
    public final AppNotification b;
    public final NotificationNavigationData c;
    public final String d;
    public final String e;

    public NotificationDisplayData(int i, AppNotification notification, NotificationNavigationData notificationNavigationData, String str, String str2) {
        Intrinsics.i(notification, "notification");
        this.f6548a = i;
        this.b = notification;
        this.c = notificationNavigationData;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationDisplayData)) {
            return false;
        }
        NotificationDisplayData notificationDisplayData = (NotificationDisplayData) obj;
        return this.f6548a == notificationDisplayData.f6548a && Intrinsics.d(this.b, notificationDisplayData.b) && Intrinsics.d(this.c, notificationDisplayData.c) && Intrinsics.d(this.d, notificationDisplayData.d) && Intrinsics.d(this.e, notificationDisplayData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f6548a * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationDisplayData(notificationId=");
        sb.append(this.f6548a);
        sb.append(", notification=");
        sb.append(this.b);
        sb.append(", navigationData=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", body=");
        return vo1.p(sb, this.e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationDisplayData(int i, AppNotification notification, List backStack) {
        String f6546a = notification.getF6546a();
        String b = notification.getB();
        Intrinsics.i(notification, "notification");
        Intrinsics.i(backStack, "backStack");
        this(i, notification, new NotificationNavigationData.TaskStack(backStack), f6546a, b);
    }

    public /* synthetic */ NotificationDisplayData(int i, AppNotification appNotification, SceneArgs sceneArgs) {
        this(i, appNotification, sceneArgs, appNotification.getF6546a(), appNotification.getB());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationDisplayData(int i, AppNotification notification, SceneArgs sceneArgs, String str, String str2) {
        this(i, notification, new NotificationNavigationData.TaskStack(CollectionsKt.R(sceneArgs)), str, str2);
        Intrinsics.i(notification, "notification");
    }
}
