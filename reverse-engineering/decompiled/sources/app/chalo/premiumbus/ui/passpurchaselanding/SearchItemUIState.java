package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.uistate.text.TextUIState;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/SearchItemUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7678a;
    public final TextUIState.StyledTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final Function0 d;

    public SearchItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, Function0 function0) {
        this.f7678a = chaloTextUIState;
        this.b = styledTextUIState;
        this.c = chaloTextUIState2;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItemUIState)) {
            return false;
        }
        SearchItemUIState searchItemUIState = (SearchItemUIState) obj;
        return Intrinsics.d(this.f7678a, searchItemUIState.f7678a) && Intrinsics.d(this.b, searchItemUIState.b) && Intrinsics.d(this.c, searchItemUIState.c) && Intrinsics.d(this.d, searchItemUIState.d);
    }

    public final int hashCode() {
        TextUIState.ChaloTextUIState chaloTextUIState = this.f7678a;
        int iHashCode = (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode()) * 31;
        TextUIState.StyledTextUIState styledTextUIState = this.b;
        int iHashCode2 = (iHashCode + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (chaloTextUIState2 != null ? chaloTextUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SearchItemUIState(fieldName=" + this.f7678a + ", fieldTag=" + this.b + ", fieldPlaceHolder=" + this.c + ", onStopsFieldEventHandler=" + this.d + ")";
    }

    public /* synthetic */ SearchItemUIState() {
        this(null, null, null, new wb(8));
    }
}
