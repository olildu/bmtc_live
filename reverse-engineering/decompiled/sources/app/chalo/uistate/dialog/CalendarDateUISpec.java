package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/CalendarDateUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarDateUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9968a;
    public final ChaloColorToken b;
    public final BorderUISpec c;
    public final ChaloPadding d;

    public CalendarDateUISpec(ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, BorderUISpec borderUISpec) {
        float f = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        this.f9968a = chaloColorToken;
        this.b = chaloColorToken2;
        this.c = borderUISpec;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDateUISpec)) {
            return false;
        }
        CalendarDateUISpec calendarDateUISpec = (CalendarDateUISpec) obj;
        return Intrinsics.d(this.f9968a, calendarDateUISpec.f9968a) && Intrinsics.d(this.b, calendarDateUISpec.b) && Intrinsics.d(this.c, calendarDateUISpec.c) && Intrinsics.d(this.d, calendarDateUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + z40.b(this.b, this.f9968a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CalendarDateUISpec(backgroundColor=" + this.f9968a + ", textColor=" + this.b + ", borderUISpec=" + this.c + ", padding=" + this.d + ")";
    }
}
