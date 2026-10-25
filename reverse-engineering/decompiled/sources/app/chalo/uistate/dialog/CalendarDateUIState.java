package app.chalo.uistate.dialog;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/CalendarDateUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarDateUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9969a;
    public final DotUIState b;
    public final AvailabilityStatusLineUIState c;
    public final CalendarDateUISpec d;
    public final UiEventHandler$Companion$fromLambda$1 e;

    public CalendarDateUIState(TextUIState.ChaloTextUIState chaloTextUIState, DotUIState dotUIState, AvailabilityStatusLineUIState availabilityStatusLineUIState, CalendarDateUISpec calendarDateUISpec, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f9969a = chaloTextUIState;
        this.b = dotUIState;
        this.c = availabilityStatusLineUIState;
        this.d = calendarDateUISpec;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDateUIState)) {
            return false;
        }
        CalendarDateUIState calendarDateUIState = (CalendarDateUIState) obj;
        return this.f9969a.equals(calendarDateUIState.f9969a) && Intrinsics.d(this.b, calendarDateUIState.b) && this.c.equals(calendarDateUIState.c) && this.d.equals(calendarDateUIState.d) && this.e.equals(calendarDateUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f9969a.hashCode() * 31;
        DotUIState dotUIState = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (dotUIState == null ? 0 : dotUIState.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDateUIState(dateTextUIState=");
        sb.append(this.f9969a);
        sb.append(", currentDateDotUIState=");
        sb.append(this.b);
        sb.append(", dateStatusLineUIState=");
        sb.append(this.c);
        sb.append(", specs=");
        sb.append(this.d);
        sb.append(", uiEventHandler=");
        return nf1.n(sb, this.e, ")");
    }
}
