package app.chalo.multimodalticket.ui;

import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "", "InitializationIntent", "OnBackNavIconClickedIntent", "OnJourneySelectionModeSelected", "OnDismissBottomSheetIntent", "OnContinueBtnClickedIntent", "OnProceedBtnClickedIntent", "OnTryAgainBtnClickedIntent", "OnBottomSheetCancelBtnClickedIntent", "OnFareInfoToolTipDismissed", "OnIndividualStepSelected", "OnFareInfoClicked", "OnPassengerIncreaseCountClick", "OnPassengerDecreaseCountClick", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$InitializationIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnBackNavIconClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnBottomSheetCancelBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnContinueBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnDismissBottomSheetIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnFareInfoClicked;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnFareInfoToolTipDismissed;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnIndividualStepSelected;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnJourneySelectionModeSelected;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnPassengerDecreaseCountClick;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnPassengerIncreaseCountClick;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnProceedBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnTryAgainBtnClickedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketLegSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$InitializationIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupTicketLegSelectionArgs f5932a;

        static {
            GroupTicketLegSelectionArgs.Companion companion = GroupTicketLegSelectionArgs.INSTANCE;
        }

        public InitializationIntent(GroupTicketLegSelectionArgs groupTicketLegSelectionArgs) {
            this.f5932a = groupTicketLegSelectionArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f5932a, ((InitializationIntent) obj).f5932a);
        }

        public final int hashCode() {
            return this.f5932a.b.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f5932a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnBackNavIconClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackNavIconClickedIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackNavIconClickedIntent f5933a = new OnBackNavIconClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnBottomSheetCancelBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBottomSheetCancelBtnClickedIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBottomSheetCancelBtnClickedIntent f5934a = new OnBottomSheetCancelBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnContinueBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnContinueBtnClickedIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnContinueBtnClickedIntent f5935a = new OnContinueBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnDismissBottomSheetIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDismissBottomSheetIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnDismissBottomSheetIntent f5936a = new OnDismissBottomSheetIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnFareInfoClicked;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFareInfoClicked extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5937a;

        public OnFareInfoClicked(String id) {
            Intrinsics.i(id, "id");
            this.f5937a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFareInfoClicked) && Intrinsics.d(this.f5937a, ((OnFareInfoClicked) obj).f5937a);
        }

        public final int hashCode() {
            return this.f5937a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnFareInfoClicked(id=", this.f5937a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnFareInfoToolTipDismissed;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFareInfoToolTipDismissed extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5938a;

        public OnFareInfoToolTipDismissed(String id) {
            Intrinsics.i(id, "id");
            this.f5938a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFareInfoToolTipDismissed) && Intrinsics.d(this.f5938a, ((OnFareInfoToolTipDismissed) obj).f5938a);
        }

        public final int hashCode() {
            return this.f5938a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnFareInfoToolTipDismissed(id=", this.f5938a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnIndividualStepSelected;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnIndividualStepSelected extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5939a;

        public OnIndividualStepSelected(int i) {
            this.f5939a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnIndividualStepSelected) && this.f5939a == ((OnIndividualStepSelected) obj).f5939a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF5939a() {
            return this.f5939a;
        }

        public final String toString() {
            return b3.d(this.f5939a, "OnIndividualStepSelected(stepSequence=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnJourneySelectionModeSelected;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnJourneySelectionModeSelected extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupTicketJourneySelectionMode f5940a;

        public OnJourneySelectionModeSelected(GroupTicketJourneySelectionMode selectedMode) {
            Intrinsics.i(selectedMode, "selectedMode");
            this.f5940a = selectedMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnJourneySelectionModeSelected) && this.f5940a == ((OnJourneySelectionModeSelected) obj).f5940a;
        }

        public final int hashCode() {
            return this.f5940a.hashCode();
        }

        public final String toString() {
            return "OnJourneySelectionModeSelected(selectedMode=" + this.f5940a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnPassengerDecreaseCountClick;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerDecreaseCountClick extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5941a;

        public OnPassengerDecreaseCountClick(String id) {
            Intrinsics.i(id, "id");
            this.f5941a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerDecreaseCountClick) && Intrinsics.d(this.f5941a, ((OnPassengerDecreaseCountClick) obj).f5941a);
        }

        public final int hashCode() {
            return this.f5941a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerDecreaseCountClick(id=", this.f5941a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnPassengerIncreaseCountClick;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPassengerIncreaseCountClick extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5942a;

        public OnPassengerIncreaseCountClick(String id) {
            Intrinsics.i(id, "id");
            this.f5942a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPassengerIncreaseCountClick) && Intrinsics.d(this.f5942a, ((OnPassengerIncreaseCountClick) obj).f5942a);
        }

        public final int hashCode() {
            return this.f5942a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPassengerIncreaseCountClick(id=", this.f5942a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnProceedBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnProceedBtnClickedIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnProceedBtnClickedIntent f5943a = new OnProceedBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent$OnTryAgainBtnClickedIntent;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTryAgainBtnClickedIntent extends GroupTicketLegSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTryAgainBtnClickedIntent f5944a = new OnTryAgainBtnClickedIntent();
    }
}
