package app.chalo.premiumbus.ui.stopselection;

import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import defpackage.n21;
import defpackage.nf1;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "", "InitializationIntent", "StopSelectionFieldClickedIntent", "StopSelectionFieldResultIntent", "ProceedBtnClickIntent", "OriginDestinationPointSelectedIntent", "OriginDestinationPointClickedFromRecentIntent", "ReportProblemClickedIntent", "StopSwapButtonClickedIntent", "ViewAllOffersClickedIntent", "PhoneClicked", "OriginDestinationStopDetailsClickedIntent", "PBRouteClicked", "NewRouteSuggestionClickIntent", "NewRouteSuggestionSubmitBtnClickIntent", "NewRouteSuggestionCancelBtnClickIntent", "NewRouteSuggestionSuccessOkayBtnClickIntent", "PBExploreAvailableRoutesClicked", "CloseBottomSheetClickIntent", "OnNotificationIconClicked", "TimePickerContinueBtnClickedIntent", "OnTimeChangeIntent", "BackPressedOnDateAndTimePickerBottomSheet", "OnDatePickerDialogCancelIntent", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$BackPressedOnDateAndTimePickerBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$CloseBottomSheetClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionCancelBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionSubmitBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionSuccessOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnDatePickerDialogCancelIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnNotificationIconClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnTimeChangeIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationPointClickedFromRecentIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationPointSelectedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PBRouteClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PhoneClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ProceedBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSwapButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$TimePickerContinueBtnClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ViewAllOffersClickedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusStopSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$BackPressedOnDateAndTimePickerBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackPressedOnDateAndTimePickerBottomSheet extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedOnDateAndTimePickerBottomSheet f7964a = new BackPressedOnDateAndTimePickerBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$CloseBottomSheetClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseBottomSheetClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseBottomSheetClickIntent f7965a = new CloseBottomSheetClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7966a;
        public final Source b;
        public final boolean c;
        public final boolean d;

        public InitializationIntent(String str, Source previousScreenSource, boolean z, boolean z2) {
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.f7966a = str;
            this.b = previousScreenSource;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7966a, initializationIntent.f7966a) && this.b == initializationIntent.b && this.c == initializationIntent.c && this.d == initializationIntent.d;
        }

        public final int hashCode() {
            String str = this.f7966a;
            return ((nf1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitializationIntent(productConfigIdFromInput=");
            sb.append(this.f7966a);
            sb.append(", previousScreenSource=");
            sb.append(this.b);
            sb.append(", showLandingScreen=");
            return n21.h(sb, this.c, ", isPassPurchaseFromAllProducts=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionCancelBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewRouteSuggestionCancelBtnClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionCancelBtnClickIntent f7967a = new NewRouteSuggestionCancelBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewRouteSuggestionClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionClickIntent f7968a = new NewRouteSuggestionClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionSubmitBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionSubmitBtnClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f7969a;
        public final PBStopPlaceSelectedAppModel b;

        public NewRouteSuggestionSubmitBtnClickIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2) {
            this.f7969a = pBStopPlaceSelectedAppModel;
            this.b = pBStopPlaceSelectedAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewRouteSuggestionSubmitBtnClickIntent)) {
                return false;
            }
            NewRouteSuggestionSubmitBtnClickIntent newRouteSuggestionSubmitBtnClickIntent = (NewRouteSuggestionSubmitBtnClickIntent) obj;
            return Intrinsics.d(this.f7969a, newRouteSuggestionSubmitBtnClickIntent.f7969a) && Intrinsics.d(this.b, newRouteSuggestionSubmitBtnClickIntent.b);
        }

        public final int hashCode() {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.f7969a;
            int iHashCode = (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode()) * 31;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.b;
            return iHashCode + (pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "NewRouteSuggestionSubmitBtnClickIntent(suggestedFromStop=" + this.f7969a + ", suggestedToStop=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$NewRouteSuggestionSuccessOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewRouteSuggestionSuccessOkayBtnClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionSuccessOkayBtnClickIntent f7970a = new NewRouteSuggestionSuccessOkayBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnDatePickerDialogCancelIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDatePickerDialogCancelIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnDatePickerDialogCancelIntent f7971a = new OnDatePickerDialogCancelIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnNotificationIconClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnNotificationIconClicked extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnNotificationIconClicked f7972a = new OnNotificationIconClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OnTimeChangeIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTimeChangeIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7973a;
        public final int b;
        public final String c;

        public OnTimeChangeIntent(int i, int i2, String amOrPM) {
            Intrinsics.i(amOrPM, "amOrPM");
            this.f7973a = i;
            this.b = i2;
            this.c = amOrPM;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTimeChangeIntent)) {
                return false;
            }
            OnTimeChangeIntent onTimeChangeIntent = (OnTimeChangeIntent) obj;
            return this.f7973a == onTimeChangeIntent.f7973a && this.b == onTimeChangeIntent.b && Intrinsics.d(this.c, onTimeChangeIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f7973a * 31) + this.b) * 31);
        }

        public final String toString() {
            return vo1.p(uf0.s(this.f7973a, this.b, "OnTimeChangeIntent(hour=", ", minute=", ", amOrPM="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationPointClickedFromRecentIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationPointClickedFromRecentIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7974a;

        public OriginDestinationPointClickedFromRecentIntent(PBOriginDestinationAppModel selected) {
            Intrinsics.i(selected, "selected");
            this.f7974a = selected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationPointClickedFromRecentIntent) && Intrinsics.d(this.f7974a, ((OriginDestinationPointClickedFromRecentIntent) obj).f7974a);
        }

        public final int hashCode() {
            return this.f7974a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationPointClickedFromRecentIntent(selected=" + this.f7974a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationPointSelectedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationPointSelectedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7975a;

        public OriginDestinationPointSelectedIntent(PBOriginDestinationAppModel selected) {
            Intrinsics.i(selected, "selected");
            this.f7975a = selected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationPointSelectedIntent) && Intrinsics.d(this.f7975a, ((OriginDestinationPointSelectedIntent) obj).f7975a);
        }

        public final int hashCode() {
            return this.f7975a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationPointSelectedIntent(selected=" + this.f7975a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationStopDetailsClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7976a;

        public OriginDestinationStopDetailsClickedIntent(PBOriginDestinationAppModel selected) {
            Intrinsics.i(selected, "selected");
            this.f7976a = selected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationStopDetailsClickedIntent) && Intrinsics.d(this.f7976a, ((OriginDestinationStopDetailsClickedIntent) obj).f7976a);
        }

        public final int hashCode() {
            return this.f7976a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationStopDetailsClickedIntent(selected=" + this.f7976a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PBExploreAvailableRoutesClicked extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PBExploreAvailableRoutesClicked f7977a = new PBExploreAvailableRoutesClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PBRouteClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBRouteClicked extends PremiumBusStopSelectionIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PBRouteClicked);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "PBRouteClicked(routeId=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$PhoneClicked;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PhoneClicked extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneClicked f7978a = new PhoneClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ProceedBtnClickIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedBtnClickIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedBtnClickIntent f7979a = new ProceedBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemClickedIntent f7980a = new ReportProblemClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusStopSearchSource f7981a;

        public StopSelectionFieldClickedIntent(PremiumBusStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f7981a = stopSearchSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSelectionFieldClickedIntent) && this.f7981a == ((StopSelectionFieldClickedIntent) obj).f7981a;
        }

        public final int hashCode() {
            return this.f7981a.hashCode();
        }

        public final String toString() {
            return "StopSelectionFieldClickedIntent(stopSearchSource=" + this.f7981a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldResultIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f7982a;
        public final PremiumBusStopSearchSource b;

        public StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PremiumBusStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f7982a = pBStopPlaceSelectedAppModel;
            this.b = stopSearchSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopSelectionFieldResultIntent)) {
                return false;
            }
            StopSelectionFieldResultIntent stopSelectionFieldResultIntent = (StopSelectionFieldResultIntent) obj;
            return Intrinsics.d(this.f7982a, stopSelectionFieldResultIntent.f7982a) && this.b == stopSelectionFieldResultIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7982a.hashCode() * 31);
        }

        public final String toString() {
            return "StopSelectionFieldResultIntent(result=" + this.f7982a + ", stopSearchSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$StopSwapButtonClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopSwapButtonClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopSwapButtonClickedIntent f7983a = new StopSwapButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$TimePickerContinueBtnClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimePickerContinueBtnClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerContinueBtnClickedIntent f7984a = new TimePickerContinueBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent$ViewAllOffersClickedIntent;", "Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewAllOffersClickedIntent extends PremiumBusStopSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewAllOffersClickedIntent f7985a = new ViewAllOffersClickedIntent();
    }
}
