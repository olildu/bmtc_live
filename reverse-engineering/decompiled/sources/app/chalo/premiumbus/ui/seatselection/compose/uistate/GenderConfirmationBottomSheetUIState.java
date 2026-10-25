package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState;", "", "PreferenceSelectionOptionUIState", "SuccessUIState", "FailureUIState", "LoadingUIState", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$FailureUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$LoadingUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$PreferenceSelectionOptionUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$SuccessUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GenderConfirmationBottomSheetUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$FailureUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailureUIState extends GenderConfirmationBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetUISpecs f7767a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ButtonUIState d;
        public final ButtonUIState e;
        public final ImageUIState f;
        public final GifImageUIState g;

        public FailureUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState subTitleTextViewState, ButtonUIState positiveBtnUIState, ButtonUIState buttonUIState, ImageUIState closeIconUIState, GifImageUIState gifImageUIState) {
            GenderConfirmationBottomSheetUISpecs genderConfirmationBottomSheetUISpecs = new GenderConfirmationBottomSheetUISpecs();
            Intrinsics.i(titleText, "titleText");
            Intrinsics.i(subTitleTextViewState, "subTitleTextViewState");
            Intrinsics.i(positiveBtnUIState, "positiveBtnUIState");
            Intrinsics.i(closeIconUIState, "closeIconUIState");
            Intrinsics.i(gifImageUIState, "gifImageUIState");
            this.f7767a = genderConfirmationBottomSheetUISpecs;
            this.b = titleText;
            this.c = subTitleTextViewState;
            this.d = positiveBtnUIState;
            this.e = buttonUIState;
            this.f = closeIconUIState;
            this.g = gifImageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailureUIState)) {
                return false;
            }
            FailureUIState failureUIState = (FailureUIState) obj;
            return Intrinsics.d(this.f7767a, failureUIState.f7767a) && Intrinsics.d(this.b, failureUIState.b) && Intrinsics.d(this.c, failureUIState.c) && Intrinsics.d(this.d, failureUIState.d) && Intrinsics.d(this.e, failureUIState.e) && Intrinsics.d(this.f, failureUIState.f) && Intrinsics.d(this.g, failureUIState.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + r30.e(this.f, r30.d(this.e, r30.d(this.d, r30.f(this.c, r30.f(this.b, this.f7767a.f7766a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            return "FailureUIState(specs=" + this.f7767a + ", titleText=" + this.b + ", subTitleTextViewState=" + this.c + ", positiveBtnUIState=" + this.d + ", negativeBtnUIState=" + this.e + ", closeIconUIState=" + this.f + ", gifImageUIState=" + this.g + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$LoadingUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingUIState extends GenderConfirmationBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetUISpecs f7768a = new GenderConfirmationBottomSheetUISpecs();
        public final ChaloColorToken b = ChaloColorToken.OrangePrimary.f9835a;
        public final TextUIState.ChaloTextUIState c;

        public LoadingUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.c = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingUIState)) {
                return false;
            }
            LoadingUIState loadingUIState = (LoadingUIState) obj;
            return Intrinsics.d(this.f7768a, loadingUIState.f7768a) && Intrinsics.d(this.b, loadingUIState.b) && Intrinsics.d(this.c, loadingUIState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + z40.b(this.b, this.f7768a.f7766a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingUIState(specs=");
            sb.append(this.f7768a);
            sb.append(", loadingIndicatorColor=");
            sb.append(this.b);
            sb.append(", text=");
            return py.f(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$PreferenceSelectionOptionUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreferenceSelectionOptionUIState extends GenderConfirmationBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetUISpecs f7769a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final List d;
        public final TextUIState.ChaloTextUIState e;
        public final ButtonUIState f;
        public final ButtonUIState g;
        public final ImageUIState h;

        public PreferenceSelectionOptionUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState subTitleTextViewState, List genderSelectionOptions, TextUIState.ChaloTextUIState misuseWarningText, ButtonUIState positiveBtnUIState, ButtonUIState buttonUIState, ImageUIState closeIconUIState) {
            GenderConfirmationBottomSheetUISpecs genderConfirmationBottomSheetUISpecs = new GenderConfirmationBottomSheetUISpecs();
            Intrinsics.i(titleText, "titleText");
            Intrinsics.i(subTitleTextViewState, "subTitleTextViewState");
            Intrinsics.i(genderSelectionOptions, "genderSelectionOptions");
            Intrinsics.i(misuseWarningText, "misuseWarningText");
            Intrinsics.i(positiveBtnUIState, "positiveBtnUIState");
            Intrinsics.i(closeIconUIState, "closeIconUIState");
            this.f7769a = genderConfirmationBottomSheetUISpecs;
            this.b = titleText;
            this.c = subTitleTextViewState;
            this.d = genderSelectionOptions;
            this.e = misuseWarningText;
            this.f = positiveBtnUIState;
            this.g = buttonUIState;
            this.h = closeIconUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreferenceSelectionOptionUIState)) {
                return false;
            }
            PreferenceSelectionOptionUIState preferenceSelectionOptionUIState = (PreferenceSelectionOptionUIState) obj;
            return Intrinsics.d(this.f7769a, preferenceSelectionOptionUIState.f7769a) && Intrinsics.d(this.b, preferenceSelectionOptionUIState.b) && Intrinsics.d(this.c, preferenceSelectionOptionUIState.c) && Intrinsics.d(this.d, preferenceSelectionOptionUIState.d) && Intrinsics.d(this.e, preferenceSelectionOptionUIState.e) && Intrinsics.d(this.f, preferenceSelectionOptionUIState.f) && Intrinsics.d(this.g, preferenceSelectionOptionUIState.g) && Intrinsics.d(this.h, preferenceSelectionOptionUIState.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + r30.d(this.g, r30.d(this.f, r30.f(this.e, r30.b(r30.f(this.c, r30.f(this.b, this.f7769a.f7766a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31);
        }

        public final String toString() {
            return "PreferenceSelectionOptionUIState(specs=" + this.f7769a + ", titleText=" + this.b + ", subTitleTextViewState=" + this.c + ", genderSelectionOptions=" + this.d + ", misuseWarningText=" + this.e + ", positiveBtnUIState=" + this.f + ", negativeBtnUIState=" + this.g + ", closeIconUIState=" + this.h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState$SuccessUIState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderConfirmationBottomSheetUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessUIState extends GenderConfirmationBottomSheetUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenderConfirmationBottomSheetUISpecs f7770a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ImageUIState d;
        public final GifImageUIState e;

        public SuccessUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState closeIconUIState, GifImageUIState gifImageUIState) {
            GenderConfirmationBottomSheetUISpecs genderConfirmationBottomSheetUISpecs = new GenderConfirmationBottomSheetUISpecs();
            Intrinsics.i(titleText, "titleText");
            Intrinsics.i(closeIconUIState, "closeIconUIState");
            this.f7770a = genderConfirmationBottomSheetUISpecs;
            this.b = titleText;
            this.c = chaloTextUIState;
            this.d = closeIconUIState;
            this.e = gifImageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessUIState)) {
                return false;
            }
            SuccessUIState successUIState = (SuccessUIState) obj;
            return Intrinsics.d(this.f7770a, successUIState.f7770a) && Intrinsics.d(this.b, successUIState.b) && Intrinsics.d(this.c, successUIState.c) && Intrinsics.d(this.d, successUIState.d) && Intrinsics.d(this.e, successUIState.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + r30.e(this.d, r30.f(this.c, r30.f(this.b, this.f7770a.f7766a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            return "SuccessUIState(specs=" + this.f7770a + ", titleText=" + this.b + ", subTitleTextViewState=" + this.c + ", closeIconUIState=" + this.d + ", gifImageUIState=" + this.e + ")";
        }
    }
}
