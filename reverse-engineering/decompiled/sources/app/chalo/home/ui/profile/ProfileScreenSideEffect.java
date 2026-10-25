package app.chalo.home.ui.profile;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenSideEffect;", "", "ShowBottomSheet", "HideBottomSheet", "Lapp/chalo/home/ui/profile/ProfileScreenSideEffect$HideBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenSideEffect$ShowBottomSheet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileScreenSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenSideEffect$HideBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideBottomSheet extends ProfileScreenSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3601a;

        public HideBottomSheet(boolean z) {
            this.f3601a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HideBottomSheet) && this.f3601a == ((HideBottomSheet) obj).f3601a;
        }

        public final int hashCode() {
            return this.f3601a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("HideBottomSheet(bottomBarVisibility=", ")", this.f3601a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenSideEffect$ShowBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowBottomSheet extends ProfileScreenSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowBottomSheet f3602a = new ShowBottomSheet();
    }
}
