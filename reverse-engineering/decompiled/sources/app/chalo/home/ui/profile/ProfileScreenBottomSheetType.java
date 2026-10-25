package app.chalo.home.ui.profile;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType;", "", "ChaloWalletIntroBottomSheet", "AccountSettingsBottomSheet", "Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType$AccountSettingsBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType$ChaloWalletIntroBottomSheet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType$AccountSettingsBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountSettingsBottomSheet extends ProfileScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3594a;

        public AccountSettingsBottomSheet(List actions) {
            Intrinsics.i(actions, "actions");
            this.f3594a = actions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountSettingsBottomSheet) && Intrinsics.d(this.f3594a, ((AccountSettingsBottomSheet) obj).f3594a);
        }

        public final int hashCode() {
            return this.f3594a.hashCode();
        }

        public final String toString() {
            return r1.d("AccountSettingsBottomSheet(actions=", ")", this.f3594a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType$ChaloWalletIntroBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloWalletIntroBottomSheet extends ProfileScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloWalletIntroBottomSheet f3595a = new ChaloWalletIntroBottomSheet();
    }
}
