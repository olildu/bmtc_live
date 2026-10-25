package app.chalo.userprofile.domain;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult;", "", InitializationStatus.SUCCESS, "DeleteAccountNotAvailable", "LogoutFailed", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$DeleteAccountNotAvailable;", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$LogoutFailed;", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$Success;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountSettingsDeleteAccountResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$DeleteAccountNotAvailable;", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeleteAccountNotAvailable implements AccountSettingsDeleteAccountResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteAccountNotAvailable f10315a = new DeleteAccountNotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteAccountNotAvailable);
        }

        public final int hashCode() {
            return 1497133559;
        }

        public final String toString() {
            return "DeleteAccountNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$LogoutFailed;", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogoutFailed implements AccountSettingsDeleteAccountResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogoutFailed f10316a = new LogoutFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LogoutFailed);
        }

        public final int hashCode() {
            return -865242520;
        }

        public final String toString() {
            return "LogoutFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult$Success;", "Lapp/chalo/userprofile/domain/AccountSettingsDeleteAccountResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success implements AccountSettingsDeleteAccountResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10317a;

        public Success(String deleteAccountUrl) {
            Intrinsics.i(deleteAccountUrl, "deleteAccountUrl");
            this.f10317a = deleteAccountUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f10317a, ((Success) obj).f10317a);
        }

        public final int hashCode() {
            return this.f10317a.hashCode();
        }

        public final String toString() {
            return vo1.B("Success(deleteAccountUrl=", this.f10317a, ")");
        }
    }
}
