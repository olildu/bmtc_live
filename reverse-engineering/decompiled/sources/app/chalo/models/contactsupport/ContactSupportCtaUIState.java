package app.chalo.models.contactsupport;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/contactsupport/ContactSupportCtaUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContactSupportCtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextWithLeftAndRightIconUIState f5612a;
    public final UiEventHandler$Companion$fromLambda$1 b;

    public ContactSupportCtaUIState(TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f5612a = textWithLeftAndRightIconUIState;
        this.b = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSupportCtaUIState)) {
            return false;
        }
        ContactSupportCtaUIState contactSupportCtaUIState = (ContactSupportCtaUIState) obj;
        return this.f5612a.equals(contactSupportCtaUIState.f5612a) && this.b.equals(contactSupportCtaUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5612a.hashCode() * 31);
    }

    public final String toString() {
        return "ContactSupportCtaUIState(textWithLeftAndRightIconUIState=" + this.f5612a + ", eventHandler=" + this.b + ")";
    }
}
