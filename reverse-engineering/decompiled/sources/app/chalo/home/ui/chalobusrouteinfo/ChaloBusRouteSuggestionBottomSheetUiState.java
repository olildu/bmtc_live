package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState;", "", "Form", InitializationStatus.SUCCESS, "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState$Form;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusRouteSuggestionBottomSheetUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState$Form;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Form extends ChaloBusRouteSuggestionBottomSheetUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f3358a;
        public final ImageUIState b;
        public final ChaloBusRouteSuggestionFieldUiState c;
        public final ChaloBusRouteSuggestionFieldUiState d;
        public final ChaloBusRouteSuggestionFieldUiState e;
        public final ButtonUIState f;
        public final ButtonUIState g;
        public final RouteSuggestionTimePickerUIState h;
        public final ChaloBusRouteSuggestionBottomSheetUiSpec i;

        static {
            UIShape.Rectangle rectangle = UIShape.f1926a;
        }

        public Form(TextUIState.ChaloTextUIState title, ImageUIState closeIcon, ChaloBusRouteSuggestionFieldUiState pickupField, ChaloBusRouteSuggestionFieldUiState dropField, ChaloBusRouteSuggestionFieldUiState reachByField, ButtonUIState submitButton, ButtonUIState cancelButton, RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState) {
            ChaloBusRouteSuggestionBottomSheetUiSpec chaloBusRouteSuggestionBottomSheetUiSpec = new ChaloBusRouteSuggestionBottomSheetUiSpec();
            Intrinsics.i(title, "title");
            Intrinsics.i(closeIcon, "closeIcon");
            Intrinsics.i(pickupField, "pickupField");
            Intrinsics.i(dropField, "dropField");
            Intrinsics.i(reachByField, "reachByField");
            Intrinsics.i(submitButton, "submitButton");
            Intrinsics.i(cancelButton, "cancelButton");
            this.f3358a = title;
            this.b = closeIcon;
            this.c = pickupField;
            this.d = dropField;
            this.e = reachByField;
            this.f = submitButton;
            this.g = cancelButton;
            this.h = routeSuggestionTimePickerUIState;
            this.i = chaloBusRouteSuggestionBottomSheetUiSpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Form)) {
                return false;
            }
            Form form = (Form) obj;
            return Intrinsics.d(this.f3358a, form.f3358a) && Intrinsics.d(this.b, form.b) && Intrinsics.d(this.c, form.c) && Intrinsics.d(this.d, form.d) && Intrinsics.d(this.e, form.e) && Intrinsics.d(this.f, form.f) && Intrinsics.d(this.g, form.g) && Intrinsics.d(this.h, form.h) && Intrinsics.d(this.i, form.i);
        }

        public final int hashCode() {
            int iD = r30.d(this.g, r30.d(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + r30.e(this.b, this.f3358a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31), 31);
            RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState = this.h;
            return this.i.hashCode() + ((iD + (routeSuggestionTimePickerUIState == null ? 0 : routeSuggestionTimePickerUIState.hashCode())) * 31);
        }

        public final String toString() {
            return "Form(title=" + this.f3358a + ", closeIcon=" + this.b + ", pickupField=" + this.c + ", dropField=" + this.d + ", reachByField=" + this.e + ", submitButton=" + this.f + ", cancelButton=" + this.g + ", routeSuggestionTimePickerUIState=" + this.h + ", specs=" + this.i + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState$Success;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionBottomSheetUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends ChaloBusRouteSuggestionBottomSheetUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f3359a;
        public final GifImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ButtonUIState e;
        public final ChaloBusRouteSuggestionSuccessUiSpec f;

        public Success(ImageUIState imageUIState, GifImageUIState gifImageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState) {
            ChaloBusRouteSuggestionSuccessUiSpec chaloBusRouteSuggestionSuccessUiSpec = new ChaloBusRouteSuggestionSuccessUiSpec();
            this.f3359a = imageUIState;
            this.b = gifImageUIState;
            this.c = chaloTextUIState;
            this.d = chaloTextUIState2;
            this.e = buttonUIState;
            this.f = chaloBusRouteSuggestionSuccessUiSpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f3359a, success.f3359a) && Intrinsics.d(this.b, success.b) && Intrinsics.d(this.c, success.c) && Intrinsics.d(this.d, success.d) && Intrinsics.d(this.e, success.e) && Intrinsics.d(this.f, success.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + r30.d(this.e, r30.f(this.d, r30.f(this.c, (this.b.hashCode() + (this.f3359a.hashCode() * 31)) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(closeIcon=");
            sb.append(this.f3359a);
            sb.append(", gifUIState=");
            sb.append(this.b);
            sb.append(", title=");
            r30.p(sb, this.c, ", subtitle=", this.d, ", okayButton=");
            sb.append(this.e);
            sb.append(", specs=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }
}
