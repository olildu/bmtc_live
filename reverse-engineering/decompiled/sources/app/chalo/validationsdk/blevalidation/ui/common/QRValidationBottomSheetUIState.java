package app.chalo.validationsdk.blevalidation.ui.common;

import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState;", "", "PostValidationSuccessBottomSheetUIState", "JourneyDetailsBottomSheetUIState", "Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState$JourneyDetailsBottomSheetUIState;", "Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState$PostValidationSuccessBottomSheetUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QRValidationBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f10628a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState$JourneyDetailsBottomSheetUIState;", "Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class JourneyDetailsBottomSheetUIState extends QRValidationBottomSheetUIState {
        public final TripPlannerItineraryUiModel b;
        public final BottomSheetUiState c;

        public JourneyDetailsBottomSheetUIState(TripPlannerItineraryUiModel tripPlannerItineraryUiModel, BottomSheetUiState bottomSheetUiState) {
            super(bottomSheetUiState);
            this.b = tripPlannerItineraryUiModel;
            this.c = bottomSheetUiState;
        }

        @Override // app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF10628a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JourneyDetailsBottomSheetUIState)) {
                return false;
            }
            JourneyDetailsBottomSheetUIState journeyDetailsBottomSheetUIState = (JourneyDetailsBottomSheetUIState) obj;
            return Intrinsics.d(this.b, journeyDetailsBottomSheetUIState.b) && Intrinsics.d(this.c, journeyDetailsBottomSheetUIState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "JourneyDetailsBottomSheetUIState(tripItineraryUiModel=" + this.b + ", sheetUiState=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState$PostValidationSuccessBottomSheetUIState;", "Lapp/chalo/validationsdk/blevalidation/ui/common/QRValidationBottomSheetUIState;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostValidationSuccessBottomSheetUIState extends QRValidationBottomSheetUIState {
        public final PostValidationSuccessBottomSheetUISpecs b;
        public final ImageUIState c;
        public final TextUIState d;
        public final TextUIState e;
        public final ButtonUIState f;
        public final ButtonUIState g;
        public final BottomSheetUiState h;

        public PostValidationSuccessBottomSheetUIState(ImageUIState imageUIState, TextUIState title, TextUIState textUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, BottomSheetUiState bottomSheetUiState) {
            PostValidationSuccessBottomSheetUISpecs postValidationSuccessBottomSheetUISpecs = new PostValidationSuccessBottomSheetUISpecs();
            Intrinsics.i(title, "title");
            super(bottomSheetUiState);
            this.b = postValidationSuccessBottomSheetUISpecs;
            this.c = imageUIState;
            this.d = title;
            this.e = textUIState;
            this.f = buttonUIState;
            this.g = buttonUIState2;
            this.h = bottomSheetUiState;
        }

        @Override // app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetUiState getF10628a() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostValidationSuccessBottomSheetUIState)) {
                return false;
            }
            PostValidationSuccessBottomSheetUIState postValidationSuccessBottomSheetUIState = (PostValidationSuccessBottomSheetUIState) obj;
            return Intrinsics.d(this.b, postValidationSuccessBottomSheetUIState.b) && Intrinsics.d(this.c, postValidationSuccessBottomSheetUIState.c) && Intrinsics.d(this.d, postValidationSuccessBottomSheetUIState.d) && Intrinsics.d(this.e, postValidationSuccessBottomSheetUIState.e) && Intrinsics.d(this.f, postValidationSuccessBottomSheetUIState.f) && Intrinsics.d(this.g, postValidationSuccessBottomSheetUIState.g) && Intrinsics.d(this.h, postValidationSuccessBottomSheetUIState.h);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            ImageUIState imageUIState = this.c;
            int iC = pk0.c(this.d, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
            TextUIState textUIState = this.e;
            int iHashCode2 = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            ButtonUIState buttonUIState = this.f;
            int iHashCode3 = (iHashCode2 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
            ButtonUIState buttonUIState2 = this.g;
            return this.h.hashCode() + ((iHashCode3 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "PostValidationSuccessBottomSheetUIState(specs=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", subTitle=" + this.e + ", positiveBtn=" + this.f + ", negativeBtn=" + this.g + ", sheetUiState=" + this.h + ")";
        }
    }

    public QRValidationBottomSheetUIState(BottomSheetUiState bottomSheetUiState) {
        this.f10628a = bottomSheetUiState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public BottomSheetUiState getF10628a() {
        return this.f10628a;
    }
}
