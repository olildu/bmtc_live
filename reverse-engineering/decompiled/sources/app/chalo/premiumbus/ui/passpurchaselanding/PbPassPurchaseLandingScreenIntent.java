package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.scenes.args.PassLandingFlowType;
import defpackage.b3;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "", "InitializationIntent", "ProceedBtnClickIntent", "BuyPassBtnClickIntent", "ReportProblemClickedIntent", "SwapSearchFieldsClickedIntent", "PBExploreAvailableRoutesClicked", "CloseBottomSheetClickIntent", "NewRouteSuggestionSubmitBtnClickIntent", "OriginDestinationStopDetailsClickedIntent", "PBRouteClicked", "NewRouteSuggestionClickIntent", "NewRouteSuggestionCancelBtnClickIntent", "NewRouteSuggestionSuccessOkayBtnClickIntent", "StopSelectionFieldClickedIntent", "StopSelectionFieldResultIntent", "OriginDestinationPointSelectedIntent", "OnBackPressed", "RetryBtnClickIntent", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$BuyPassBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$CloseBottomSheetClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionCancelBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionSubmitBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionSuccessOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OnBackPressed;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OriginDestinationPointSelectedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$PBRouteClicked;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$ProceedBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$RetryBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$SwapSearchFieldsClickedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PbPassPurchaseLandingScreenIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$BuyPassBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuyPassBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BuyPassBtnClickIntent f7653a = new BuyPassBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BuyPassBtnClickIntent);
        }

        public final int hashCode() {
            return 1977222226;
        }

        public final String toString() {
            return "BuyPassBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$CloseBottomSheetClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseBottomSheetClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseBottomSheetClickIntent f7654a = new CloseBottomSheetClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseBottomSheetClickIntent);
        }

        public final int hashCode() {
            return -1884284933;
        }

        public final String toString() {
            return "CloseBottomSheetClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassLandingFlowType f7655a;
        public final Source b;
        public final boolean c;

        static {
            PassLandingFlowType.Companion companion = PassLandingFlowType.INSTANCE;
        }

        public InitializationIntent(PassLandingFlowType flowType, Source source, boolean z) {
            Intrinsics.i(flowType, "flowType");
            Intrinsics.i(source, "source");
            this.f7655a = flowType;
            this.b = source;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7655a, initializationIntent.f7655a) && this.b == initializationIntent.b && this.c == initializationIntent.c;
        }

        public final int hashCode() {
            return nf1.f(this.b, this.f7655a.hashCode() * 31, 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitializationIntent(flowType=");
            sb.append(this.f7655a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", showOdPairSelectionCard=");
            return b3.g(")", sb, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionCancelBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionCancelBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionCancelBtnClickIntent f7656a = new NewRouteSuggestionCancelBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewRouteSuggestionCancelBtnClickIntent);
        }

        public final int hashCode() {
            return -748147620;
        }

        public final String toString() {
            return "NewRouteSuggestionCancelBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionClickIntent f7657a = new NewRouteSuggestionClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewRouteSuggestionClickIntent);
        }

        public final int hashCode() {
            return 1672784906;
        }

        public final String toString() {
            return "NewRouteSuggestionClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionSubmitBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionSubmitBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f7658a;
        public final PBStopPlaceSelectedAppModel b;

        public NewRouteSuggestionSubmitBtnClickIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2) {
            this.f7658a = pBStopPlaceSelectedAppModel;
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
            return Intrinsics.d(this.f7658a, newRouteSuggestionSubmitBtnClickIntent.f7658a) && Intrinsics.d(this.b, newRouteSuggestionSubmitBtnClickIntent.b);
        }

        public final int hashCode() {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.f7658a;
            int iHashCode = (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode()) * 31;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.b;
            return iHashCode + (pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "NewRouteSuggestionSubmitBtnClickIntent(suggestedFromStop=" + this.f7658a + ", suggestedToStop=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$NewRouteSuggestionSuccessOkayBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestionSuccessOkayBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionSuccessOkayBtnClickIntent f7659a = new NewRouteSuggestionSuccessOkayBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewRouteSuggestionSuccessOkayBtnClickIntent);
        }

        public final int hashCode() {
            return -392954075;
        }

        public final String toString() {
            return "NewRouteSuggestionSuccessOkayBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OnBackPressed;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f7660a = new OnBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return 577851215;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OriginDestinationPointSelectedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationPointSelectedIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7661a;

        public OriginDestinationPointSelectedIntent(PBOriginDestinationAppModel selected) {
            Intrinsics.i(selected, "selected");
            this.f7661a = selected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationPointSelectedIntent) && Intrinsics.d(this.f7661a, ((OriginDestinationPointSelectedIntent) obj).f7661a);
        }

        public final int hashCode() {
            return this.f7661a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationPointSelectedIntent(selected=" + this.f7661a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationStopDetailsClickedIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7662a;

        public OriginDestinationStopDetailsClickedIntent(PBOriginDestinationAppModel selected) {
            Intrinsics.i(selected, "selected");
            this.f7662a = selected;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationStopDetailsClickedIntent) && Intrinsics.d(this.f7662a, ((OriginDestinationStopDetailsClickedIntent) obj).f7662a);
        }

        public final int hashCode() {
            return this.f7662a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationStopDetailsClickedIntent(selected=" + this.f7662a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBExploreAvailableRoutesClicked extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PBExploreAvailableRoutesClicked f7663a = new PBExploreAvailableRoutesClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PBExploreAvailableRoutesClicked);
        }

        public final int hashCode() {
            return 846365096;
        }

        public final String toString() {
            return "PBExploreAvailableRoutesClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$PBRouteClicked;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBRouteClicked extends PbPassPurchaseLandingScreenIntent {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$ProceedBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7664a;
        public final String b;

        public ProceedBtnClickIntent(String fromStopSelectedName, String toStopSelectedName) {
            Intrinsics.i(fromStopSelectedName, "fromStopSelectedName");
            Intrinsics.i(toStopSelectedName, "toStopSelectedName");
            this.f7664a = fromStopSelectedName;
            this.b = toStopSelectedName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProceedBtnClickIntent)) {
                return false;
            }
            ProceedBtnClickIntent proceedBtnClickIntent = (ProceedBtnClickIntent) obj;
            return Intrinsics.d(this.f7664a, proceedBtnClickIntent.f7664a) && Intrinsics.d(this.b, proceedBtnClickIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7664a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("ProceedBtnClickIntent(fromStopSelectedName=", this.f7664a, ", toStopSelectedName=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemClickedIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemClickedIntent f7665a = new ReportProblemClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemClickedIntent);
        }

        public final int hashCode() {
            return -1161350651;
        }

        public final String toString() {
            return "ReportProblemClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$RetryBtnClickIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryBtnClickIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassLandingFlowType f7666a;
        public final Source b;
        public final boolean c;

        static {
            PassLandingFlowType.Companion companion = PassLandingFlowType.INSTANCE;
        }

        public RetryBtnClickIntent(PassLandingFlowType flowType, Source source, boolean z) {
            Intrinsics.i(flowType, "flowType");
            Intrinsics.i(source, "source");
            this.f7666a = flowType;
            this.b = source;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryBtnClickIntent)) {
                return false;
            }
            RetryBtnClickIntent retryBtnClickIntent = (RetryBtnClickIntent) obj;
            return Intrinsics.d(this.f7666a, retryBtnClickIntent.f7666a) && this.b == retryBtnClickIntent.b && this.c == retryBtnClickIntent.c;
        }

        public final int hashCode() {
            return nf1.f(this.b, this.f7666a.hashCode() * 31, 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RetryBtnClickIntent(flowType=");
            sb.append(this.f7666a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", showOdPairSelectionCard=");
            return b3.g(")", sb, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldClickedIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusStopSearchSource f7667a;

        public StopSelectionFieldClickedIntent(PremiumBusStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f7667a = stopSearchSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSelectionFieldClickedIntent) && this.f7667a == ((StopSelectionFieldClickedIntent) obj).f7667a;
        }

        public final int hashCode() {
            return this.f7667a.hashCode();
        }

        public final String toString() {
            return "StopSelectionFieldClickedIntent(stopSearchSource=" + this.f7667a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldResultIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f7668a;
        public final PremiumBusStopSearchSource b;

        public StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PremiumBusStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f7668a = pBStopPlaceSelectedAppModel;
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
            return Intrinsics.d(this.f7668a, stopSelectionFieldResultIntent.f7668a) && this.b == stopSelectionFieldResultIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7668a.hashCode() * 31);
        }

        public final String toString() {
            return "StopSelectionFieldResultIntent(result=" + this.f7668a + ", stopSearchSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent$SwapSearchFieldsClickedIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwapSearchFieldsClickedIntent extends PbPassPurchaseLandingScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwapSearchFieldsClickedIntent f7669a = new SwapSearchFieldsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwapSearchFieldsClickedIntent);
        }

        public final int hashCode() {
            return -1692320318;
        }

        public final String toString() {
            return "SwapSearchFieldsClickedIntent";
        }
    }
}
