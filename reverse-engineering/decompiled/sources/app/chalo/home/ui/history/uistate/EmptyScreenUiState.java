package app.chalo.home.ui.history.uistate;

import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/EmptyScreenUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EmptyScreenUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmptyScreenSpec f3470a;
    public final ImageUIState b;
    public final ContactSupportUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final EmptyScreenProductBookingOptionsUiState e;

    public EmptyScreenUiState(EmptyScreenSpec emptyScreenSpec, ImageUIState imageUIState, ContactSupportUIState contactSupportUIState, TextUIState.ChaloTextUIState chaloTextUIState, EmptyScreenProductBookingOptionsUiState emptyScreenProductBookingOptionsUiState) {
        this.f3470a = emptyScreenSpec;
        this.b = imageUIState;
        this.c = contactSupportUIState;
        this.d = chaloTextUIState;
        this.e = emptyScreenProductBookingOptionsUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyScreenUiState)) {
            return false;
        }
        EmptyScreenUiState emptyScreenUiState = (EmptyScreenUiState) obj;
        return Intrinsics.d(this.f3470a, emptyScreenUiState.f3470a) && Intrinsics.d(this.b, emptyScreenUiState.b) && Intrinsics.d(this.c, emptyScreenUiState.c) && Intrinsics.d(this.d, emptyScreenUiState.d) && Intrinsics.d(this.e, emptyScreenUiState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + r30.e(this.b, this.f3470a.hashCode() * 31, 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        return this.e.hashCode() + ((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "EmptyScreenUiState(spec=" + this.f3470a + ", image=" + this.b + ", contactSupportUIState=" + this.c + ", productBookingTitle=" + this.d + ", productBookingOptionsUiState=" + this.e + ")";
    }
}
