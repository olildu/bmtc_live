package app.chalo.instantticket.ui.faredetails.contract;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/UserBillingInfoBottomSheetState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserBillingInfoBottomSheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserBillingDataState f3952a;
    public final UserBillingDataState b;
    public final UserBillingDataState c;
    public final int d;

    public UserBillingInfoBottomSheetState(UserBillingDataState userBillingDataState, UserBillingDataState userBillingDataState2, UserBillingDataState userBillingDataState3, int i) {
        this.f3952a = userBillingDataState;
        this.b = userBillingDataState2;
        this.c = userBillingDataState3;
        this.d = i;
    }

    public static UserBillingInfoBottomSheetState a(UserBillingInfoBottomSheetState userBillingInfoBottomSheetState, UserBillingDataState userBillingDataState, UserBillingDataState userBillingDataState2, int i) {
        if ((i & 1) != 0) {
            userBillingDataState = userBillingInfoBottomSheetState.f3952a;
        }
        if ((i & 2) != 0) {
            userBillingDataState2 = userBillingInfoBottomSheetState.b;
        }
        UserBillingDataState userBillingDataState3 = userBillingInfoBottomSheetState.c;
        int i2 = userBillingInfoBottomSheetState.d;
        userBillingInfoBottomSheetState.getClass();
        return new UserBillingInfoBottomSheetState(userBillingDataState, userBillingDataState2, userBillingDataState3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBillingInfoBottomSheetState)) {
            return false;
        }
        UserBillingInfoBottomSheetState userBillingInfoBottomSheetState = (UserBillingInfoBottomSheetState) obj;
        return Intrinsics.d(this.f3952a, userBillingInfoBottomSheetState.f3952a) && Intrinsics.d(this.b, userBillingInfoBottomSheetState.b) && Intrinsics.d(this.c, userBillingInfoBottomSheetState.c) && this.d == userBillingInfoBottomSheetState.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3952a.hashCode() * 31)) * 31;
        UserBillingDataState userBillingDataState = this.c;
        return ((iHashCode + (userBillingDataState == null ? 0 : userBillingDataState.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        return "UserBillingInfoBottomSheetState(name=" + this.f3952a + ", mobileNumber=" + this.b + ", email=" + this.c + ", mobileNoMaxDigitsAllowed=" + this.d + ")";
    }
}
