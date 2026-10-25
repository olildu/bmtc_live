package app.chalo.home.ui.profile;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenDialogType;", "", "DeleteAccountConfirmation", "LogoutFailed", "Lapp/chalo/home/ui/profile/ProfileScreenDialogType$DeleteAccountConfirmation;", "Lapp/chalo/home/ui/profile/ProfileScreenDialogType$LogoutFailed;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileScreenDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenDialogType$DeleteAccountConfirmation;", "Lapp/chalo/home/ui/profile/ProfileScreenDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteAccountConfirmation extends ProfileScreenDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteAccountConfirmation f3598a = new DeleteAccountConfirmation();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenDialogType$LogoutFailed;", "Lapp/chalo/home/ui/profile/ProfileScreenDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogoutFailed extends ProfileScreenDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3599a;

        public LogoutFailed(String error) {
            Intrinsics.i(error, "error");
            this.f3599a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogoutFailed) && Intrinsics.d(this.f3599a, ((LogoutFailed) obj).f3599a);
        }

        public final int hashCode() {
            return this.f3599a.hashCode();
        }

        public final String toString() {
            return vo1.B("LogoutFailed(error=", this.f3599a, ")");
        }
    }
}
