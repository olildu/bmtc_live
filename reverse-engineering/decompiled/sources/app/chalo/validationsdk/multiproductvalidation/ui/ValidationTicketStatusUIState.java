package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/ValidationTicketStatusUIState;", "", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationTicketStatusUIState {
    public static final Companion d = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationTicketStatusSpec f10707a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/ValidationTicketStatusUIState$Companion;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ValidationTicketStatusUIState a(String text, IconType iconType, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
            Intrinsics.i(text, "text");
            return new ValidationTicketStatusUIState(new ValidationTicketStatusSpec(chaloColorToken2), new TextUIState.ChaloTextUIState(text, UITextStyle.TitleLarge, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null);
        }
    }

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ValidationTicketStatusUIState(ValidationTicketStatusSpec validationTicketStatusSpec, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState) {
        this.f10707a = validationTicketStatusSpec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationTicketStatusUIState)) {
            return false;
        }
        ValidationTicketStatusUIState validationTicketStatusUIState = (ValidationTicketStatusUIState) obj;
        return this.f10707a.equals(validationTicketStatusUIState.f10707a) && this.b.equals(validationTicketStatusUIState.b) && Intrinsics.d(this.c, validationTicketStatusUIState.c);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f10707a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return iF + (imageUIState == null ? 0 : imageUIState.hashCode());
    }

    public final String toString() {
        return "ValidationTicketStatusUIState(spec=" + this.f10707a + ", statusText=" + this.b + ", statusIcon=" + this.c + ")";
    }
}
