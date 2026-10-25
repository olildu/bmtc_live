package app.chalo.userprofile.domain;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult;", "", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult$Failure;", "Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult$Success;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountSettingsLogoutResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult$Failure;", "Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure implements AccountSettingsLogoutResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failure f10319a = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 492996309;
        }

        public final String toString() {
            return "Failure";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult$Success;", "Lapp/chalo/userprofile/domain/AccountSettingsLogoutResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements AccountSettingsLogoutResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f10320a = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -287599282;
        }

        public final String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
