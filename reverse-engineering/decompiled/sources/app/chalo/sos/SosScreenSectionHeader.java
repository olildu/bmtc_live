package app.chalo.sos;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenSectionHeader;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SosScreenSectionHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9418a;
    public final TextUIState b;
    public final ChaloPadding c;
    public final ChaloPadding d;

    public SosScreenSectionHeader(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d, 2);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f, f, f2);
        this.f9418a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = chaloPadding;
        this.d = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosScreenSectionHeader)) {
            return false;
        }
        SosScreenSectionHeader sosScreenSectionHeader = (SosScreenSectionHeader) obj;
        return Intrinsics.d(this.f9418a, sosScreenSectionHeader.f9418a) && Intrinsics.d(this.b, sosScreenSectionHeader.b) && Intrinsics.d(this.c, sosScreenSectionHeader.c) && Intrinsics.d(this.d, sosScreenSectionHeader.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9418a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return this.d.hashCode() + r30.c(this.c, (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "SosScreenSectionHeader(title=" + this.f9418a + ", actionText=" + this.b + ", actionTextPadding=" + this.c + ", internalPadding=" + this.d + ")";
    }
}
