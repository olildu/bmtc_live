package app.chalo.home.ui.base;

import app.chalo.superpass.data.models.entities.SuperPassApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType;", "", "SuperPassVerificationBottomSheet", "ChaloAppRatingsBottomSheet", "ChaloOnlineCardRechargeTutorialBottomSheet", "CityChangeBottomSheet", "CityNotSupportedBottomSheet", "NotificationPermissionBottomSheet", "RideHailingUserFeedbackBottomSheet", "UserProfilingBottomSheet", "None", "Lapp/chalo/home/ui/base/CommonBottomSheetType$ChaloAppRatingsBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$ChaloOnlineCardRechargeTutorialBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$CityChangeBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$CityNotSupportedBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$None;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$NotificationPermissionBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$RideHailingUserFeedbackBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$SuperPassVerificationBottomSheet$Rejected;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$SuperPassVerificationBottomSheet$Verified;", "Lapp/chalo/home/ui/base/CommonBottomSheetType$UserProfilingBottomSheet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CommonBottomSheetType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3178a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$ChaloAppRatingsBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloAppRatingsBottomSheet extends CommonBottomSheetType {
        public static final ChaloAppRatingsBottomSheet b = new ChaloAppRatingsBottomSheet("ChaloAppRatings");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloAppRatingsBottomSheet);
        }

        public final int hashCode() {
            return 1622479585;
        }

        public final String toString() {
            return "ChaloAppRatingsBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$ChaloOnlineCardRechargeTutorialBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloOnlineCardRechargeTutorialBottomSheet extends CommonBottomSheetType {
        public static final ChaloOnlineCardRechargeTutorialBottomSheet b = new ChaloOnlineCardRechargeTutorialBottomSheet("ChaloOnlineCardRechargeTutorial");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloOnlineCardRechargeTutorialBottomSheet);
        }

        public final int hashCode() {
            return -524169010;
        }

        public final String toString() {
            return "ChaloOnlineCardRechargeTutorialBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$CityChangeBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityChangeBottomSheet extends CommonBottomSheetType {
        public static final CityChangeBottomSheet b = new CityChangeBottomSheet("CityChange");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CityChangeBottomSheet);
        }

        public final int hashCode() {
            return 104151608;
        }

        public final String toString() {
            return "CityChangeBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$CityNotSupportedBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityNotSupportedBottomSheet extends CommonBottomSheetType {
        public static final CityNotSupportedBottomSheet b = new CityNotSupportedBottomSheet("CityNotSupported");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CityNotSupportedBottomSheet);
        }

        public final int hashCode() {
            return 312665837;
        }

        public final String toString() {
            return "CityNotSupportedBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$None;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends CommonBottomSheetType {
        public static final None b = new None("None");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1425373465;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$NotificationPermissionBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationPermissionBottomSheet extends CommonBottomSheetType {
        public static final NotificationPermissionBottomSheet b = new NotificationPermissionBottomSheet("NotificationPermission");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationPermissionBottomSheet);
        }

        public final int hashCode() {
            return -335497671;
        }

        public final String toString() {
            return "NotificationPermissionBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$RideHailingUserFeedbackBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideHailingUserFeedbackBottomSheet extends CommonBottomSheetType {
        public static final RideHailingUserFeedbackBottomSheet b = new RideHailingUserFeedbackBottomSheet("RideHailingUserFeedbackBottomSheet");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RideHailingUserFeedbackBottomSheet);
        }

        public final int hashCode() {
            return 283843383;
        }

        public final String toString() {
            return "RideHailingUserFeedbackBottomSheet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$SuperPassVerificationBottomSheet;", "", "Verified", "Rejected", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SuperPassVerificationBottomSheet {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$SuperPassVerificationBottomSheet$Rejected;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Rejected extends CommonBottomSheetType {
            public final SuperPassApplication b;

            public Rejected(SuperPassApplication superPassApplication) {
                super("SuperPassApplicationRejected");
                this.b = superPassApplication;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Rejected) && Intrinsics.d(this.b, ((Rejected) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Rejected(passApplication=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$SuperPassVerificationBottomSheet$Verified;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Verified extends CommonBottomSheetType {
            public final SuperPassApplication b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Verified(SuperPassApplication passApplication) {
                super("SuperPassApplicationVerified");
                Intrinsics.i(passApplication, "passApplication");
                this.b = passApplication;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Verified) && Intrinsics.d(this.b, ((Verified) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Verified(passApplication=" + this.b + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/CommonBottomSheetType$UserProfilingBottomSheet;", "Lapp/chalo/home/ui/base/CommonBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfilingBottomSheet extends CommonBottomSheetType {
        public static final UserProfilingBottomSheet b = new UserProfilingBottomSheet("UserProfilingBottomSheet");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserProfilingBottomSheet);
        }

        public final int hashCode() {
            return 21308858;
        }

        public final String toString() {
            return "UserProfilingBottomSheet";
        }
    }

    public CommonBottomSheetType(String str) {
        this.f3178a = str;
    }
}
