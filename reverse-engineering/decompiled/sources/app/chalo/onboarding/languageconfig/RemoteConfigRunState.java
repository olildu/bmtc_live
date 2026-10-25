package app.chalo.onboarding.languageconfig;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;", "", "NotStarted", "InProgress", "Terminal", "InfraFailure", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$InProgress;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$InfraFailure;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$NotStarted;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$Terminal;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RemoteConfigRunState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$InProgress;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress implements RemoteConfigRunState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InProgress f6639a = new InProgress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InProgress);
        }

        public final int hashCode() {
            return 2042584405;
        }

        public final String toString() {
            return "InProgress";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$InfraFailure;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfraFailure implements RemoteConfigRunState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f6640a;

        public InfraFailure(Throwable th) {
            this.f6640a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfraFailure) && Intrinsics.d(this.f6640a, ((InfraFailure) obj).f6640a);
        }

        public final int hashCode() {
            Throwable th = this.f6640a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return "InfraFailure(cause=" + this.f6640a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$NotStarted;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotStarted implements RemoteConfigRunState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotStarted f6641a = new NotStarted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotStarted);
        }

        public final int hashCode() {
            return 259000593;
        }

        public final String toString() {
            return "NotStarted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState$Terminal;", "Lapp/chalo/onboarding/languageconfig/RemoteConfigRunState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Terminal implements RemoteConfigRunState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloConfigCacheStatus f6642a;
        public final ChaloConfigFetchStatus b;

        public Terminal(ChaloConfigCacheStatus cacheStatus, ChaloConfigFetchStatus fetchStatus) {
            Intrinsics.i(cacheStatus, "cacheStatus");
            Intrinsics.i(fetchStatus, "fetchStatus");
            this.f6642a = cacheStatus;
            this.b = fetchStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Terminal)) {
                return false;
            }
            Terminal terminal = (Terminal) obj;
            return this.f6642a == terminal.f6642a && this.b == terminal.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6642a.hashCode() * 31);
        }

        public final String toString() {
            return "Terminal(cacheStatus=" + this.f6642a + ", fetchStatus=" + this.b + ")";
        }
    }
}
