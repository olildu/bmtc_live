package app.chalo.notification.models;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/notification/models/NotificationNavigationData;", "", "TaskStack", "Deeplink", "Lapp/chalo/notification/models/NotificationNavigationData$Deeplink;", "Lapp/chalo/notification/models/NotificationNavigationData$TaskStack;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NotificationNavigationData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/NotificationNavigationData$Deeplink;", "Lapp/chalo/notification/models/NotificationNavigationData;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Deeplink extends NotificationNavigationData {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Deeplink);
        }

        public final int hashCode() {
            return -298060525;
        }

        public final String toString() {
            return "Deeplink(deeplink=chalo://book/bookPass?source=notification)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/NotificationNavigationData$TaskStack;", "Lapp/chalo/notification/models/NotificationNavigationData;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TaskStack extends NotificationNavigationData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6549a;

        public TaskStack(List args) {
            Intrinsics.i(args, "args");
            this.f6549a = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskStack) && Intrinsics.d(this.f6549a, ((TaskStack) obj).f6549a);
        }

        public final int hashCode() {
            return this.f6549a.hashCode();
        }

        public final String toString() {
            return r1.d("TaskStack(args=", ")", this.f6549a);
        }
    }
}
