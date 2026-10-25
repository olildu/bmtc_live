package app.chalo.appsupport.uistate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/appsupport/uistate/FaqItemUiState;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaqItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f994a;
    public final FaqItemSpec b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUIState e;
    public final DividerUIState f;
    public final ButtonUIState g;
    public final boolean h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/appsupport/uistate/FaqItemUiState$Companion;", "", "", "ITEM_ID_PREFIX", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FaqItemUiState(String itemId, FaqItemSpec faqItemSpec, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState, DividerUIState dividerUIState, ButtonUIState buttonUIState, boolean z) {
        Intrinsics.i(itemId, "itemId");
        this.f994a = itemId;
        this.b = faqItemSpec;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = imageUIState;
        this.f = dividerUIState;
        this.g = buttonUIState;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqItemUiState)) {
            return false;
        }
        FaqItemUiState faqItemUiState = (FaqItemUiState) obj;
        return Intrinsics.d(this.f994a, faqItemUiState.f994a) && Intrinsics.d(this.b, faqItemUiState.b) && Intrinsics.d(this.c, faqItemUiState.c) && Intrinsics.d(this.d, faqItemUiState.d) && Intrinsics.d(this.e, faqItemUiState.e) && Intrinsics.d(this.f, faqItemUiState.f) && Intrinsics.d(this.g, faqItemUiState.g) && this.h == faqItemUiState.h;
    }

    public final int hashCode() {
        int iF = r30.f(this.d, r30.f(this.c, (this.b.hashCode() + (this.f994a.hashCode() * 31)) * 31, 31), 31);
        ImageUIState imageUIState = this.e;
        int iHashCode = (iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.f;
        int iHashCode2 = (iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.g;
        return ((iHashCode2 + (buttonUIState != null ? buttonUIState.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaqItemUiState(itemId=");
        sb.append(this.f994a);
        sb.append(", spec=");
        sb.append(this.b);
        sb.append(", question=");
        r30.p(sb, this.c, ", answer=", this.d, ", trailingIcon=");
        sb.append(this.e);
        sb.append(", dividerState=");
        sb.append(this.f);
        sb.append(", buttonUiState=");
        sb.append(this.g);
        sb.append(", isExpanded=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
