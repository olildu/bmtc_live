package app.chalo.resultstatemanager.booking;

import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/booking/BookingHelpResultState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHelpResultState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingHelpFaqActionType f9053a;
    public final boolean b;
    public final String c;

    public BookingHelpResultState(BookingHelpFaqActionType actionType, boolean z, String str) {
        Intrinsics.i(actionType, "actionType");
        this.f9053a = actionType;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpResultState)) {
            return false;
        }
        BookingHelpResultState bookingHelpResultState = (BookingHelpResultState) obj;
        return this.f9053a == bookingHelpResultState.f9053a && this.b == bookingHelpResultState.b && Intrinsics.d(this.c, bookingHelpResultState.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f9053a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingHelpResultState(actionType=");
        sb.append(this.f9053a);
        sb.append(", isSuccess=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return vo1.p(sb, this.c, ")");
    }
}
