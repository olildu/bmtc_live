package app.chalo.models.contactsupport;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/contactsupport/ContactSupportUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContactSupportUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactSupportUISpecs f5614a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ContactSupportCtaUIState d;

    public ContactSupportUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState supportTextUIState, ContactSupportCtaUIState contactSupportCtaUIState, int i) {
        ContactSupportUISpecs contactSupportUISpecs = new ContactSupportUISpecs();
        imageUIState = (i & 2) != 0 ? null : imageUIState;
        Intrinsics.i(supportTextUIState, "supportTextUIState");
        this.f5614a = contactSupportUISpecs;
        this.b = imageUIState;
        this.c = supportTextUIState;
        this.d = contactSupportCtaUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSupportUIState)) {
            return false;
        }
        ContactSupportUIState contactSupportUIState = (ContactSupportUIState) obj;
        return Intrinsics.d(this.f5614a, contactSupportUIState.f5614a) && Intrinsics.d(this.b, contactSupportUIState.b) && Intrinsics.d(this.c, contactSupportUIState.c) && Intrinsics.d(this.d, contactSupportUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5614a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        return this.d.hashCode() + r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ContactSupportUIState(specs=" + this.f5614a + ", supportImageUIState=" + this.b + ", supportTextUIState=" + this.c + ", supportCtaUIState=" + this.d + ")";
    }
}
