package app.chalo.livetracking.universalsearch.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen;", "", "NoResultFound", "ApiErrorOccurred", "Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen$ApiErrorOccurred;", "Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen$NoResultFound;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SearchErrorScreen {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen$ApiErrorOccurred;", "Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApiErrorOccurred extends SearchErrorScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5042a;

        public ApiErrorOccurred(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f5042a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiErrorOccurred) && Intrinsics.d(this.f5042a, ((ApiErrorOccurred) obj).f5042a);
        }

        public final int hashCode() {
            return this.f5042a.hashCode();
        }

        public final String toString() {
            return vo1.B("ApiErrorOccurred(errorMsg=", this.f5042a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen$NoResultFound;", "Lapp/chalo/livetracking/universalsearch/ui/SearchErrorScreen;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoResultFound extends SearchErrorScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5043a;

        public NoResultFound(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f5043a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResultFound) && Intrinsics.d(this.f5043a, ((NoResultFound) obj).f5043a);
        }

        public final int hashCode() {
            return this.f5043a.hashCode();
        }

        public final String toString() {
            return vo1.B("NoResultFound(errorMsg=", this.f5043a, ")");
        }
    }
}
